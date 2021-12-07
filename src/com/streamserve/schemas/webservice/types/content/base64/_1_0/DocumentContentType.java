/**
 * DocumentContentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.types.content.base64._1_0;


/**
 * Document content type containing ID, result code and description
 * (on error).
 */
public class DocumentContentType  extends com.streamserve.schemas.webservice.types.object._1_0.ObjectResultType  implements java.io.Serializable {
    /* Binary content (as Base64) and content type. */
    private com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType data;

    public DocumentContentType() {
    }

    public DocumentContentType(
           java.lang.String id,
           int resultCode,
           java.lang.String description,
           com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType data) {
        super(
            id,
            resultCode,
            description);
        this.data = data;
    }


    /**
     * Gets the data value for this DocumentContentType.
     * 
     * @return data   * Binary content (as Base64) and content type.
     */
    public com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType getData() {
        return data;
    }


    /**
     * Sets the data value for this DocumentContentType.
     * 
     * @param data   * Binary content (as Base64) and content type.
     */
    public void setData(com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentContentType)) return false;
        DocumentContentType other = (DocumentContentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentContentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "DocumentContentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ContentType"));
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
