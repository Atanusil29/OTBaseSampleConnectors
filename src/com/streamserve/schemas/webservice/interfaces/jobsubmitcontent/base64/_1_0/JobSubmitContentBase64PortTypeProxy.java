package com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0;

public class JobSubmitContentBase64PortTypeProxy implements com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64PortType {
  private String _endpoint = null;
  private com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64PortType jobSubmitContentBase64PortType = null;
  
  public JobSubmitContentBase64PortTypeProxy() {
    _initJobSubmitContentBase64PortTypeProxy();
  }
  
  public JobSubmitContentBase64PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initJobSubmitContentBase64PortTypeProxy();
  }
  
  private void _initJobSubmitContentBase64PortTypeProxy() {
    try {
      jobSubmitContentBase64PortType = (new com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.WSJobSubmitContentBase64Locator()).getJobSubmitContentBase64Port();
      if (jobSubmitContentBase64PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jobSubmitContentBase64PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jobSubmitContentBase64PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jobSubmitContentBase64PortType != null)
      ((javax.xml.rpc.Stub)jobSubmitContentBase64PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64PortType getJobSubmitContentBase64PortType() {
    if (jobSubmitContentBase64PortType == null)
      _initJobSubmitContentBase64PortTypeProxy();
    return jobSubmitContentBase64PortType;
  }
  
  public com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentResponseType submitJobsContent(com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentRequestType submitJobsContentRequest) throws java.rmi.RemoteException, com.streamserve.schemas._public._1_0.FaultType{
    if (jobSubmitContentBase64PortType == null)
      _initJobSubmitContentBase64PortTypeProxy();
    return jobSubmitContentBase64PortType.submitJobsContent(submitJobsContentRequest);
  }
  
  
}