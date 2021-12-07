package com.streamserve.javaconnectors;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.rmi.RemoteException;

import streamserve.connector.StrsConfigVals;
import streamserve.connector.StrsInConnectable;
import streamserve.connector.StrsInDataQueueable;
import streamserve.connector.StrsServiceable;

/**
 *  Implementation of DirScan input connector that waits for a "signal file" to appear and then reads
 *  all "data files" in a directory. The signal file is deleted when all data files has been read.
 */
public class InputConnectorDirScanSignalFile implements StrsInConnectable {

	static final String CONNECTOR_NAME = "Dirscan signal input connector";

	static final String PROPERTYNAME_DIRECTORY = "Directory";
	static final String PROPERTYNAME_PATTERN = "Pattern";
	static final String PROPERTYNAME_SIGNALFILE = "Signal File";

	String m_path;
	String m_pattern;
	String m_signalFile;
	DirScanFilter m_filter;

	StrsServiceable m_service;

	public InputConnectorDirScanSignalFile() {

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
			File signalFile = new File(m_path, m_signalFile);
			if (!signalFile.exists()) {
				return true;
			}

			// signal file exists, process all files
			File files = new File(m_path);
			String fileNames[] = files.list(m_filter);

			if ((fileNames != null) && (fileNames.length > 0)) // we have
																// something
																// other than
																// signal file
																// in input
																// directory
			{

				for (int i = 0; i < fileNames.length; i++) {

					File file = new File(m_path, fileNames[i]);
					if (file.isFile() && fileNames[i] != m_signalFile) {

						long size = file.length();
						if (size > 0) { // what if file size = 0?
							InputStream in = new FileInputStream(
									file.getAbsolutePath());
							int bufsize = 1024;
							byte[] tempData = new byte[bufsize];
							int readBytes = 0;
							do {
								// read input file
								readBytes = in.read(tempData);
								if (readBytes == bufsize) {
									inData.putArray(tempData);
								}
							} while (readBytes == bufsize);

							if (readBytes > 0) // last part of the input file
							{
								byte[] tempDataLast = new byte[readBytes];
								for (int j = 0; j < readBytes; j++) {
									tempDataLast[j] = tempData[j];
								}
								inData.putArray(tempDataLast);
							}

							in.close();

							file.delete();

							inData.signalEvent(StrsInDataQueueable.INEVENT_EOF);
						}
					}
				}
			}
			signalFile.delete();

			return true;

		} catch (Exception e) {
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
			m_signalFile = configVals.getValue(PROPERTYNAME_SIGNALFILE);
			
			m_service = configVals.getStrsService();

			// init filter
			m_filter = new DirScanFilter();
			m_filter.setPattern(m_pattern);

			return true;
		} catch (Exception e) {
			log(StrsServiceable.MSG_ERROR, 1, e.getLocalizedMessage());
			return false;
		}
	}

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
