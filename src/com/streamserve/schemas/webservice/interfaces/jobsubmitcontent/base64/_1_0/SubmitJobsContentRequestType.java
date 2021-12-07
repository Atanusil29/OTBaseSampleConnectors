/**
 * SubmitJobsContentRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0;

public class SubmitJobsContentRequestType  implements java.io.Serializable {
    /* Collection of jobs. */
    private com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobsContentType[] jobs;

    /* URI of the remote service to invoke. */
    private java.lang.String serviceURI;

    public SubmitJobsContentRequestType() {
    }

    public SubmitJobsContentRequestType(
           com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobsContentType[] jobs,
           java.lang.String serviceURI) {
           this.jobs = jobs;
           this.serviceURI = serviceURI;
    }


    /**
     * Gets the jobs value for this SubmitJobsContentRequestType.
     * 
     * @return jobs   * Collection of jobs.
     */
    public com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobsContentType[] getJobs() {
        return jobs;
    }


    /**
     * Sets the jobs value for this SubmitJobsContentRequestType.
     * 
     * @param jobs   * Collection of jobs.
     */
    public void setJobs(com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobsContentType[] jobs) {
        this.jobs = jobs;
    }


    /**
     * Gets the serviceURI value for this SubmitJobsContentRequestType.
     * 
     * @return serviceURI   * URI of the remote service to invoke.
     */
    public java.lang.String getServiceURI() {
        return serviceURI;
    }


    /**
     * Sets the serviceURI value for this SubmitJobsContentRequestType.
     * 
     * @param serviceURI   * URI of the remote service to invoke.
     */
    public void setServiceURI(java.lang.String serviceURI) {
        this.serviceURI = serviceURI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitJobsContentRequestType)) return false;
        SubmitJobsContentRequestType other = (SubmitJobsContentRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobs==null && other.getJobs()==null) || 
             (this.jobs!=null &&
              java.util.Arrays.equals(this.jobs, other.getJobs()))) &&
            ((this.serviceURI==null && other.getServiceURI()==null) || 
             (this.serviceURI!=null &&
              this.serviceURI.equals(other.getServiceURI())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getJobs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceURI() != null) {
            _hashCode += getServiceURI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitJobsContentRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", ">SubmitJobsContentRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", "JobsContentType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "job"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceURI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
