package com.streamserve.javaconnectors;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.rmi.RemoteException;

import streamserve.connector.StrsConfigVals;
import streamserve.connector.StrsConnectable;
import streamserve.connector.StrsServiceable;

/**
 * Implementation of file output connector where the file path is set via a static path or variable, and the connector
 * moves/renames the file upon completion using another static path or variable. 
 */
public class OutputConnectorFileMover implements StrsConnectable {

	static final String CONNECTOR_NAME = "File mover output connector";

	static final String PROPERTYNAME_FILE = "Output file";
	static final String PROPERTYNAME_MOVETO = "Move on completion to";

	String m_fileName;
	String m_moveToName;
	File m_outFile;
	OutputStream m_outStream;

	StrsServiceable m_service;

	public OutputConnectorFileMover() {
	}

	public void readConfigVals(StrsConfigVals configVals) {
		String fileName = configVals.getValue(PROPERTYNAME_FILE);
		if (fileName.length() > 0) {
			m_fileName = fileName;
		}
		String moveToName = configVals.getValue(PROPERTYNAME_MOVETO);
		if (moveToName.length() > 0) {
			m_moveToName = moveToName;
		}
		if (m_service == null) {
			m_service = configVals.getStrsService();
		}
	}

	/**
	 * StrsConnectable implementation
	 * 
	 *  The StreamServer calls this method at the end of the Process, Document or Job. 
	 *  use this method to performed the final delivery.
	 *  If the connector supports runtime properties, these are passed in the ConfigVals object. 
	 */
	public boolean strsoClose(StrsConfigVals configVals) throws RemoteException {
		try {
			readConfigVals(configVals);

			m_outStream.close();
			File destFile = new File(m_moveToName);
			if (destFile.exists()) {
				destFile.delete();
			}
			destFile.getParentFile().mkdirs();
			m_outFile.renameTo(destFile);
			log(StrsServiceable.MSG_INFO, 3, "File " + m_fileName + " saved as " + m_moveToName );

		} catch (Exception e) {
			log(StrsServiceable.MSG_ERROR, 1, e.getLocalizedMessage());
		}
		return true;
	}

	/**
	 * StrsConnectable implementation
	 * 
	 *  The StreamServer calls this method when all data has been delivered by the output connector and before
	 *  the connector is removed. Use this method to release the resources used by the connector.
	 */
	public boolean strsoEndJob() throws RemoteException {
		return true;
	}

	/**
	 * StrsConnectable implementation
	 * 
	 * 	The StreamServer calls this method each time it starts processing output data.
	 *  can be used to initialize resources according to connector properties set in Design Center.
	 *  The properties are passed in the ConfigVals object and can be accessed with getValue method.
	*/
	public boolean strsoOpen(StrsConfigVals configVals) throws RemoteException {
		try {
			readConfigVals(configVals);
			m_outFile = new File(m_fileName);
			if (m_outFile.getParentFile() != null) {
				m_outFile.getParentFile().mkdirs();
			}
			m_outStream = new FileOutputStream(m_outFile.getAbsolutePath());
		} catch (Exception e) {
			log(StrsServiceable.MSG_ERROR, 1, e.getLocalizedMessage());
			return false;
		}
		return true;
	}

	/**
	 * StrsConnectable implementation
	 * 
	 * 	The StreamServer calls this method directly after the connector has been created.
	 *  Use this method to initialize resources according to the connector properties set in Design Center.
	 *  The properties are passed in the ConfigVals object and can be accessed with getValue method.
	*/
	public boolean strsoStartJob(StrsConfigVals configVals)
			throws RemoteException {
		try {
			readConfigVals(configVals);
		} catch (Exception e) {
			log(StrsServiceable.MSG_ERROR, 1, e.getLocalizedMessage());
			return false;
		}
		return true;
	}

	protected void log(int msgType, int loglevel, String message)
			throws RemoteException {
		if (m_service != null) {
			m_service.writeMsg(msgType, loglevel, CONNECTOR_NAME + ": "
					+ message);
		}
	}

	/**
	 * StrsConnectable implementation
	 * 
	 *  This method is called between a pair of strsoOpen() and strsoClose() calls. It can be called several times or only once,
	 *  depending on the amount of data to be written. Each strsoWrite() call provides buffered output data.
	 */
	public boolean strsoWrite(byte[] bytes) throws RemoteException {
		try {
			m_outStream.write(bytes);
		} catch (IOException e) {

			return false;
		}
		return true;
	}

}
