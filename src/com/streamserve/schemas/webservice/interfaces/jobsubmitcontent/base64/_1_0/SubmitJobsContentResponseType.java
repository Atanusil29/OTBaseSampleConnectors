/**
 * SubmitJobsContentResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0;

public class SubmitJobsContentResponseType  implements java.io.Serializable {
    /* Collection of jobs. */
    private com.streamserve.schemas.webservice.types.content.base64._1_0.JobSubmitContentResponseType[] jobs;

    public SubmitJobsContentResponseType() {
    }

    public SubmitJobsContentResponseType(
           com.streamserve.schemas.webservice.types.content.base64._1_0.JobSubmitContentResponseType[] jobs) {
           this.jobs = jobs;
    }


    /**
     * Gets the jobs value for this SubmitJobsContentResponseType.
     * 
     * @return jobs   * Collection of jobs.
     */
    public com.streamserve.schemas.webservice.types.content.base64._1_0.JobSubmitContentResponseType[] getJobs() {
        return jobs;
    }


    /**
     * Sets the jobs value for this SubmitJobsContentResponseType.
     * 
     * @param jobs   * Collection of jobs.
     */
    public void setJobs(com.streamserve.schemas.webservice.types.content.base64._1_0.JobSubmitContentResponseType[] jobs) {
        this.jobs = jobs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitJobsContentResponseType)) return false;
        SubmitJobsContentResponseType other = (SubmitJobsContentResponseType) obj;
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
              java.util.Arrays.equals(this.jobs, other.getJobs())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitJobsContentResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", ">SubmitJobsContentResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "JobSubmitContentResponseType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "job"));
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
