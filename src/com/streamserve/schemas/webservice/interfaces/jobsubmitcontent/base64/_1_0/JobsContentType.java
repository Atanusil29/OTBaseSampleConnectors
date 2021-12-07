/**
 * JobsContentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0;


/**
 * Job submit type.
 */
public class JobsContentType  implements java.io.Serializable {
    /* Job data. */
    private com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType content;

    /* Type of submit. Defaults to FireAndForget. */
    private com.streamserve.schemas.webservice.types.object._1_0.SubmitEnumType submitType;

    /* Service request timeout (optional). */
    private org.apache.axis.types.Duration timeOut;

    /* External job ID which will be used in IPP-header (optional). */
    private java.lang.String externalJobID;

    /* List of attributes which will be used in HTTP-header (on the
     * IPP-header) (optional). */
    private com.streamserve.schemas._public._1_0.CustomAttributeType[] attributes;

    /* List of configurations (optional). */
    private com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType[] configurations;

    public JobsContentType() {
    }

    public JobsContentType(
           com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType content,
           com.streamserve.schemas.webservice.types.object._1_0.SubmitEnumType submitType,
           org.apache.axis.types.Duration timeOut,
           java.lang.String externalJobID,
           com.streamserve.schemas._public._1_0.CustomAttributeType[] attributes,
           com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType[] configurations) {
           this.content = content;
           this.submitType = submitType;
           this.timeOut = timeOut;
           this.externalJobID = externalJobID;
           this.attributes = attributes;
           this.configurations = configurations;
    }


    /**
     * Gets the content value for this JobsContentType.
     * 
     * @return content   * Job data.
     */
    public com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType getContent() {
        return content;
    }


    /**
     * Sets the content value for this JobsContentType.
     * 
     * @param content   * Job data.
     */
    public void setContent(com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType content) {
        this.content = content;
    }


    /**
     * Gets the submitType value for this JobsContentType.
     * 
     * @return submitType   * Type of submit. Defaults to FireAndForget.
     */
    public com.streamserve.schemas.webservice.types.object._1_0.SubmitEnumType getSubmitType() {
        return submitType;
    }


    /**
     * Sets the submitType value for this JobsContentType.
     * 
     * @param submitType   * Type of submit. Defaults to FireAndForget.
     */
    public void setSubmitType(com.streamserve.schemas.webservice.types.object._1_0.SubmitEnumType submitType) {
        this.submitType = submitType;
    }


    /**
     * Gets the timeOut value for this JobsContentType.
     * 
     * @return timeOut   * Service request timeout (optional).
     */
    public org.apache.axis.types.Duration getTimeOut() {
        return timeOut;
    }


    /**
     * Sets the timeOut value for this JobsContentType.
     * 
     * @param timeOut   * Service request timeout (optional).
     */
    public void setTimeOut(org.apache.axis.types.Duration timeOut) {
        this.timeOut = timeOut;
    }


    /**
     * Gets the externalJobID value for this JobsContentType.
     * 
     * @return externalJobID   * External job ID which will be used in IPP-header (optional).
     */
    public java.lang.String getExternalJobID() {
        return externalJobID;
    }


    /**
     * Sets the externalJobID value for this JobsContentType.
     * 
     * @param externalJobID   * External job ID which will be used in IPP-header (optional).
     */
    public void setExternalJobID(java.lang.String externalJobID) {
        this.externalJobID = externalJobID;
    }


    /**
     * Gets the attributes value for this JobsContentType.
     * 
     * @return attributes   * List of attributes which will be used in HTTP-header (on the
     * IPP-header) (optional).
     */
    public com.streamserve.schemas._public._1_0.CustomAttributeType[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this JobsContentType.
     * 
     * @param attributes   * List of attributes which will be used in HTTP-header (on the
     * IPP-header) (optional).
     */
    public void setAttributes(com.streamserve.schemas._public._1_0.CustomAttributeType[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the configurations value for this JobsContentType.
     * 
     * @return configurations   * List of configurations (optional).
     */
    public com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType[] getConfigurations() {
        return configurations;
    }


    /**
     * Sets the configurations value for this JobsContentType.
     * 
     * @param configurations   * List of configurations (optional).
     */
    public void setConfigurations(com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType[] configurations) {
        this.configurations = configurations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobsContentType)) return false;
        JobsContentType other = (JobsContentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.submitType==null && other.getSubmitType()==null) || 
             (this.submitType!=null &&
              this.submitType.equals(other.getSubmitType()))) &&
            ((this.timeOut==null && other.getTimeOut()==null) || 
             (this.timeOut!=null &&
              this.timeOut.equals(other.getTimeOut()))) &&
            ((this.externalJobID==null && other.getExternalJobID()==null) || 
             (this.externalJobID!=null &&
              this.externalJobID.equals(other.getExternalJobID()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.configurations==null && other.getConfigurations()==null) || 
             (this.configurations!=null &&
              java.util.Arrays.equals(this.configurations, other.getConfigurations())));
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
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getSubmitType() != null) {
            _hashCode += getSubmitType().hashCode();
        }
        if (getTimeOut() != null) {
            _hashCode += getTimeOut().hashCode();
        }
        if (getExternalJobID() != null) {
            _hashCode += getExternalJobID().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfigurations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigurations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigurations(), i);
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
        new org.apache.axis.description.TypeDesc(JobsContentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", "JobsContentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ContentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "SubmitEnumType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalJobID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalJobID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "CustomAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "attribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configurations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ContentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "data"));
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
