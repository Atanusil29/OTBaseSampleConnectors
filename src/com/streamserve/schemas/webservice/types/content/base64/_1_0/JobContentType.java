/**
 * JobContentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.types.content.base64._1_0;


/**
 * Binary content (as Base64) and content type.
 */
public class JobContentType  implements java.io.Serializable {
    /* Binary content (as Base64). */
    private com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType data;

    /* Document ID (optional). */
    private java.lang.String id;

    /* List of attributes related to the formatted document (optional) */
    private com.streamserve.schemas._public._1_0.CustomAttributeType[] attributes;

    public JobContentType() {
    }

    public JobContentType(
           com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType data,
           java.lang.String id,
           com.streamserve.schemas._public._1_0.CustomAttributeType[] attributes) {
           this.data = data;
           this.id = id;
           this.attributes = attributes;
    }


    /**
     * Gets the data value for this JobContentType.
     * 
     * @return data   * Binary content (as Base64).
     */
    public com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType getData() {
        return data;
    }


    /**
     * Sets the data value for this JobContentType.
     * 
     * @param data   * Binary content (as Base64).
     */
    public void setData(com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType data) {
        this.data = data;
    }


    /**
     * Gets the id value for this JobContentType.
     * 
     * @return id   * Document ID (optional).
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this JobContentType.
     * 
     * @param id   * Document ID (optional).
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the attributes value for this JobContentType.
     * 
     * @return attributes   * List of attributes related to the formatted document (optional)
     */
    public com.streamserve.schemas._public._1_0.CustomAttributeType[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this JobContentType.
     * 
     * @param attributes   * List of attributes related to the formatted document (optional)
     */
    public void setAttributes(com.streamserve.schemas._public._1_0.CustomAttributeType[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobContentType)) return false;
        JobContentType other = (JobContentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobContentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "JobContentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ContentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
