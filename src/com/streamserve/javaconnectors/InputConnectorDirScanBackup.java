package com.streamserve.javaconnectors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import streamserve.connector.StrsConfigVals;
import streamserve.connector.StrsInConnectable;
import streamserve.connector.StrsInDataQueueable;
import streamserve.connector.StrsServiceable;

import com.streamserve.javaconnectors.DirScanFilter;

/**
 * Implementation of DirScan input connector that makes a backup of each file to a configurable directory.
 */
public class InputConnectorDirScanBackup implements StrsInConnectable {

	static final String CONNECTOR_NAME = "Dirscan backup input connector";

	static final String PROPERTYNAME_DIRECTORY = "Directory";
	static final String PROPERTYNAME_BACKUPDIRECTORY = "Backup Directory";
	static final String PROPERTYNAME_PATTERN = "Pattern";

	String m_path;
	String m_pattern;
	String m_backupPath;
	DirScanFilter m_filter;

	StrsServiceable m_service;

	public InputConnectorDirScanBackup() {
	}

	/**
	 * StrsInConnectable implementation
	 * 
	 *  While the input connector is running, the StreamServer calls this method to retrieve data
	 *  at the interval specified in the connector settings in Design Center.
	 *  The data should be written to StrsInDataQueueable object by calling one of following methods:
	 *  put
	 *  putArray
	 *  putString   
	 * */
	public boolean strsiPoll(StrsInDataQueueable inData) throws RemoteException {
		try {
			File files = new File(m_path);
			String fileNames[] = files.list(m_filter);

			if (fileNames == null) {
				return true;
			}

			if ((fileNames != null) && (fileNames.length != 0)) // we have
																// something in
																// input
																// directory
			{
				for (int i = 0; i < fileNames.length; i++) {
					File file = new File(m_path, fileNames[i]);
					if (file.isFile()) {
						// use current date time for naming backup file
						DateFormat dateFormat = new SimpleDateFormat(
								"yyyyMMddHHmmss");
						Date date = new Date();
						String backupFileName = dateFormat.format(date) + "_"
								+ fileNames[i];

						File fileBackup = new File(m_backupPath, backupFileName);
						if (fileBackup.exists()) {
							fileBackup.delete();
						}
						fileBackup.createNewFile();
						// think of better way of copying file

						long size = file.length();
						if (size > 0) {
							InputStream in = new FileInputStream(
									file.getAbsolutePath());
							OutputStream out = new FileOutputStream(
									fileBackup.getAbsolutePath());
							int bufsize = 1024;
							byte[] tempData = new byte[bufsize];
							int readBytes = 0;
							do {
								// read input file
								readBytes = in.read(tempData);
								if (readBytes == bufsize) {
									inData.putArray(tempData);
									out.write(tempData);
								}
							} while (readBytes == bufsize);

							if (readBytes > 0) // last part of the input file
							{
								byte[] tempDataLast = new byte[readBytes];
								for (int j = 0; j < readBytes; j++) {
									tempDataLast[j] = tempData[j];
								}
								inData.putArray(tempDataLast);
								out.write(tempDataLast);
							}

							in.close();
							out.close();

							file.delete();

							inData.signalEvent(StrsInDataQueueable.INEVENT_EOF);
						}
					}
				}
			}

			return true;
		}

		catch (Exception e) {
			log(StrsServiceable.MSG_ERROR, 1, e.getLocalizedMessage());
			return false;
		}

	}

	/**
	 * StrsInConnectable implementation
	 * 
	 *  When the StreamServer is started and the connector has been created, the StreamServer calls this method. 
	 *  Use this method to initialize resources according to the connector properties set in Design Center.
	 *  The properties are passed in the StrsConfigVals object and can be accessed with getValue method.
	 * */
	public boolean strsiStart(StrsConfigVals configVals) throws RemoteException {
		try {
			m_path = configVals.getValue(PROPERTYNAME_DIRECTORY);
			m_pattern = configVals.getValue(PROPERTYNAME_PATTERN);
			m_backupPath = configVals.getValue(PROPERTYNAME_BACKUPDIRECTORY);

			m_service = configVals.getStrsService();

			// create backup directory if not exists
			File backupDir = new File(m_backupPath);
			if (!backupDir.exists()) {
				backupDir.mkdir();
			}
			// TODO: notify if a dir cannot be created

			// init filter
			m_filter = new DirScanFilter();
			m_filter.setPattern(m_pattern);
		} catch (Exception e) {
			log(StrsServiceable.MSG_ERROR, 1, e.getLocalizedMessage());
			return false;
		}
		return true;
	}

	/**
	 * Helper function to write a log message to StreamServer log 
	 */
	protected void log(int msgType, int loglevel, String message)
			throws RemoteException {
		if (m_service != null) {
			m_service.writeMsg(msgType, loglevel, CONNECTOR_NAME + ": "
					+ message);
		}
	}

	/**
	 * StrsInConnectable implementation
	 * 
	 *  When the StreamServer is stopped, it calls this method to stop the connector before it is removed. 
	 *  Use this method for releasing the resources that the connector has used (if any).
	 * */
	public boolean strsiStop() throws RemoteException {
		return true;
	}
}
