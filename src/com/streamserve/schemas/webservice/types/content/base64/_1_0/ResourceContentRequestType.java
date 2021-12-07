/**
 * ResourceContentRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.types.content.base64._1_0;


/**
 * Resource content request containing ID, revision and expected content
 * type.
 */
public class ResourceContentRequestType  extends com.streamserve.schemas.webservice.types.object._1_0.ResourceIDType  implements java.io.Serializable {
    private java.lang.String expectedContentTypes;  // attribute

    public ResourceContentRequestType() {
    }

    public ResourceContentRequestType(
           java.lang.String id,
           com.streamserve.schemas.webservice.types.object._1_0.RevisionType revision,
           java.lang.String expectedContentTypes) {
        super(
            id,
            revision);
        this.expectedContentTypes = expectedContentTypes;
    }


    /**
     * Gets the expectedContentTypes value for this ResourceContentRequestType.
     * 
     * @return expectedContentTypes
     */
    public java.lang.String getExpectedContentTypes() {
        return expectedContentTypes;
    }


    /**
     * Sets the expectedContentTypes value for this ResourceContentRequestType.
     * 
     * @param expectedContentTypes
     */
    public void setExpectedContentTypes(java.lang.String expectedContentTypes) {
        this.expectedContentTypes = expectedContentTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceContentRequestType)) return false;
        ResourceContentRequestType other = (ResourceContentRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expectedContentTypes==null && other.getExpectedContentTypes()==null) || 
             (this.expectedContentTypes!=null &&
              this.expectedContentTypes.equals(other.getExpectedContentTypes())));
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
        if (getExpectedContentTypes() != null) {
            _hashCode += getExpectedContentTypes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceContentRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ResourceContentRequestType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("expectedContentTypes");
        attrField.setXmlName(new javax.xml.namespace.QName("", "expectedContentTypes"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
