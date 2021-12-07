/**
 * WSJobSubmitContentBase64Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0;

public class WSJobSubmitContentBase64Locator extends org.apache.axis.client.Service implements com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.WSJobSubmitContentBase64 {

/**
 * This web service provides methods for submitting jobs. The binary
 * content will be transfered using BASE64.
 */

    public WSJobSubmitContentBase64Locator() {
    }


    public WSJobSubmitContentBase64Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSJobSubmitContentBase64Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JobSubmitContentBase64Port
    private java.lang.String JobSubmitContentBase64Port_address = "http://localhost:2718";

    public java.lang.String getJobSubmitContentBase64PortAddress() {
        return JobSubmitContentBase64Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JobSubmitContentBase64PortWSDDServiceName = "JobSubmitContentBase64Port";

    public java.lang.String getJobSubmitContentBase64PortWSDDServiceName() {
        return JobSubmitContentBase64PortWSDDServiceName;
    }

    public void setJobSubmitContentBase64PortWSDDServiceName(java.lang.String name) {
        JobSubmitContentBase64PortWSDDServiceName = name;
    }

    public com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64PortType getJobSubmitContentBase64Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JobSubmitContentBase64Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJobSubmitContentBase64Port(endpoint);
    }

    public com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64PortType getJobSubmitContentBase64Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64BindingStub _stub = new com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64BindingStub(portAddress, this);
            _stub.setPortName(getJobSubmitContentBase64PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJobSubmitContentBase64PortEndpointAddress(java.lang.String address) {
        JobSubmitContentBase64Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64BindingStub _stub = new com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64BindingStub(new java.net.URL(JobSubmitContentBase64Port_address), this);
                _stub.setPortName(getJobSubmitContentBase64PortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("JobSubmitContentBase64Port".equals(inputPortName)) {
            return getJobSubmitContentBase64Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", "WSJobSubmitContentBase64");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", "JobSubmitContentBase64Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JobSubmitContentBase64Port".equals(portName)) {
            setJobSubmitContentBase64PortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
