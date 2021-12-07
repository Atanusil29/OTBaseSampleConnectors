/**
 * JobSubmitContentResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.types.content.base64._1_0;


/**
 * Job submit content response containing ID, attachments, result
 * code and description (on error).
 */
public class JobSubmitContentResponseType  extends com.streamserve.schemas.webservice.types.object._1_0.ObjectResultType  implements java.io.Serializable {
    /* Binary content (as Base64) and content type. */
    private com.streamserve.schemas.webservice.types.content.base64._1_0.JobContentType[] attachments;

    public JobSubmitContentResponseType() {
    }

    public JobSubmitContentResponseType(
           java.lang.String id,
           int resultCode,
           java.lang.String description,
           com.streamserve.schemas.webservice.types.content.base64._1_0.JobContentType[] attachments) {
        super(
            id,
            resultCode,
            description);
        this.attachments = attachments;
    }


    /**
     * Gets the attachments value for this JobSubmitContentResponseType.
     * 
     * @return attachments   * Binary content (as Base64) and content type.
     */
    public com.streamserve.schemas.webservice.types.content.base64._1_0.JobContentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this JobSubmitContentResponseType.
     * 
     * @param attachments   * Binary content (as Base64) and content type.
     */
    public void setAttachments(com.streamserve.schemas.webservice.types.content.base64._1_0.JobContentType[] attachments) {
        this.attachments = attachments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobSubmitContentResponseType)) return false;
        JobSubmitContentResponseType other = (JobSubmitContentResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
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
        new org.apache.axis.description.TypeDesc(JobSubmitContentResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "JobSubmitContentResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "JobContentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attachment"));
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
