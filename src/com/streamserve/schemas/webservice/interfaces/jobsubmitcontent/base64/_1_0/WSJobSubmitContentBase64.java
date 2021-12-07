/**
 * WSJobSubmitContentBase64.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0;

public interface WSJobSubmitContentBase64 extends javax.xml.rpc.Service {

/**
 * This web service provides methods for submitting jobs. The binary
 * content will be transfered using BASE64.
 */
    public java.lang.String getJobSubmitContentBase64PortAddress();

    public com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64PortType getJobSubmitContentBase64Port() throws javax.xml.rpc.ServiceException;

    public com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64PortType getJobSubmitContentBase64Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
