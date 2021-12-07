package com.streamserve.javaconnectors;

import java.rmi.RemoteException;

import streamserve.connector.StrsConfigVals;
import streamserve.connector.StrsConnectable;
import streamserve.connector.StrsServiceable;

/**
 * Implementation of stub output connector. At the end of the job writes message to the StreamServer log. 
 */
public class OutputConnectorStub implements StrsConnectable {

	/**
	 * StrsConnectable implementation
	 * 
	 *  The StreamServer calls this method at the end of the Process, Document or Job. 
	 *  use this method to performed the final delivery.
	 *  If the connector supports runtime properties, these are passed in the ConfigVals object. 
	 */
	public boolean strsoClose(StrsConfigVals configVals) throws RemoteException {
		if ( configVals.getStrsService() != null )		
		{
			configVals.getStrsService().writeMsg(StrsServiceable.MSG_INFO, 4, "Java stub connector job finished");
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
	public boolean strsoOpen(StrsConfigVals arg0) throws RemoteException {
		return true;
	}

	/**
	 * StrsConnectable implementation
	 * 
	 * 	The StreamServer calls this method directly after the connector has been created.
	 *  Use this method to initialize resources according to the connector properties set in Design Center.
	 *  The properties are passed in the ConfigVals object and can be accessed with getValue method.
	*/
	public boolean strsoStartJob(StrsConfigVals arg0) throws RemoteException {
		return true;
	}

	/**
	 * StrsConnectable implementation
	 * 
	 *  This method is called between a pair of strsoOpen() and strsoClose() calls. It can be called several times or only once,
	 *  depending on the amount of data to be written. Each strsoWrite() call provides buffered output data.
	 */
	public boolean strsoWrite(byte[] arg0) throws RemoteException {
		return true;
	}

}
