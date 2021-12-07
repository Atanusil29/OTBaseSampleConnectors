package com.streamserve.javaconnectors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.rmi.RemoteException;

import javax.xml.rpc.Stub;

import com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64BindingStub;
import com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobsContentType;
import com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentRequestType;
import com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentResponseType;
import com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType;
import com.streamserve.schemas.webservice.types.object._1_0.SubmitEnumType;

import streamserve.connector.StrsConfigVals;
import streamserve.connector.StrsConnectable;
import streamserve.connector.StrsServiceable;

/**
 * Implementation of output connector that posts the output to (another) StreamServer service via JobSubmitContent web service 
 *  of StreamServe Service Gateway.
 *  Please see JobSubmitContent web service and Service Request input connector documentation for details.
 */
public class OutputConnectorJobSubmit implements StrsConnectable {

	static final String CONNECTOR_NAME = "JobSubmit output connector";

	static final String PROPERTYNAME_ENDPOINT = "Endpoint";
	static final String PROPERTYNAME_SERVICEURI = "Service URI";

	String m_endpoint;
	String m_serviceURI;
	File m_tempFile;
	OutputStream m_tempOutStream;

	StrsServiceable m_service;

	public OutputConnectorJobSubmit() {
		m_service = null;

	}

	public void readConfigVals(StrsConfigVals configVals) {
		String endpoint = configVals.getValue(PROPERTYNAME_ENDPOINT);
		if (endpoint.length() > 0) {
			m_endpoint = endpoint;
		}
		String serviceURI = configVals.getValue(PROPERTYNAME_SERVICEURI);
		if (serviceURI.length() > 0) {
			m_serviceURI = serviceURI;
		}
		if (m_service == null) {
			m_service = configVals.getStrsService();
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
	 * StrsConnectable implementation
	 * 
	 *  The StreamServer calls this method at the end of the Process, Document or Job. 
	 *  use this method to performed the final delivery.
	 *  If the connector supports runtime properties, these are passed in the ConfigVals object. 
	 */
	public boolean strsoClose(StrsConfigVals configVals) throws RemoteException {
		try {
			readConfigVals(configVals);

			m_tempOutStream.close();
			byte[] bytes = new byte[(int) m_tempFile.length()];
			InputStream in = new FileInputStream(m_tempFile);
			in.read(bytes, 0, (int) m_tempFile.length());

			SubmitJobsContentRequestType request = new SubmitJobsContentRequestType();

			String path = "/uid/service/externalqueuing/1.0/" + m_serviceURI;
			URI uri = new URI("http", "schemas.streamserve.com", path, null);
			String serviceURI = uri.toString();
			request.setServiceURI(serviceURI);

			JobsContentType jobs[] = new JobsContentType[1]; // one job to
																// submit

			jobs[0] = new JobsContentType();
			jobs[0].setSubmitType(SubmitEnumType.FireAndWaitNoResult);

			ContentType content = new ContentType();

			content.setContent(bytes);

			content.setContentType("application/octet-stream");

			jobs[0].setContent(content);
			request.setJobs(jobs);

			JobSubmitContentBase64BindingStub stub = new JobSubmitContentBase64BindingStub();
			stub._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY, m_endpoint);

			stub.setTimeout(10000);
			SubmitJobsContentResponseType response = stub
					.submitJobsContent(request);

			int result = response.getJobs()[0].getResultCode();

			if (result == 0) {
				log(StrsServiceable.MSG_INFO, 3,
						"Job successfully submitted to " + m_serviceURI
								+ " service");
				return true;
			} else {
				log(StrsServiceable.MSG_ERROR,
						0,
						"Failed to submit job to " + m_serviceURI
								+ " service: error code "
								+ String.valueOf(result));
			}

		} catch (Exception e) {
			log(StrsServiceable.MSG_ERROR, 0, "Failed to submit job to "
					+ m_serviceURI + " service, " + e.getLocalizedMessage());
		}

		return false;
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

			m_tempFile = File.createTempFile("strs", "out");
			m_tempOutStream = new FileOutputStream(m_tempFile);
		} catch (Exception e) {
			log(StrsServiceable.MSG_ERROR, 0, "Failed to submit job to  "
					+ m_serviceURI + " service, " + e.getLocalizedMessage());
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
		readConfigVals(configVals);
		return true;
	}

	/**
	 * StrsConnectable implementation
	 * 
	 *  This method is called between a pair of strsoOpen() and strsoClose() calls. It can be called several times or only once,
	 *  depending on the amount of data to be written. Each strsoWrite() call provides buffered output data.
	 */
	public boolean strsoWrite(byte[] bytes) throws RemoteException {
		try {
			m_tempOutStream.write(bytes);
		} catch (IOException e) {
			log(StrsServiceable.MSG_ERROR, 0, "Failed to write data to submit to  "
					+ m_serviceURI + " service, " + e.getLocalizedMessage());
			return false;
		}
		return true;
	}

}
