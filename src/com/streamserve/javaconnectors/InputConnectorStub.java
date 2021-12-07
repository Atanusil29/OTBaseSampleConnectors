package com.streamserve.javaconnectors;

import java.rmi.RemoteException;

import streamserve.connector.StrsConfigVals;
import streamserve.connector.StrsInConnectable;
import streamserve.connector.StrsInDataQueueable;

/**
 * Implementation of stub input connector. Sends static text to the StreamServer. 
 */
public class InputConnectorStub implements StrsInConnectable {

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
	public boolean strsiPoll(StrsInDataQueueable inDataQueue) throws RemoteException {
		if (inDataQueue != null)
        {
            inDataQueue.putString("Java stub connector job");
            inDataQueue.signalEvent(StrsInDataQueueable.INEVENT_EOF);
            return true;
        }
		return false;
	}

	/**
	 * StrsInConnectable implementation
	 * 
	 *  When the StreamServer is started and the connector has been created, the StreamServer calls this method. 
	 *  Use this method to initialize resources according to the connector properties set in Design Center.
	 *  The properties are passed in the StrsConfigVals object and can be accessed with getValue method.
	 * */
	public boolean strsiStart(StrsConfigVals arg0) throws RemoteException {
		return true;
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
