/**
 * AttributeIDType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas._public._1_0;


/**
 * Attribute ID (can be either enumValue or value).
 */
public class AttributeIDType  implements java.io.Serializable {
    /* Attribute ID as enumValue or value. */
    private com.streamserve.schemas._public._1_0.ExtendedAttributeEnumType id;

    public AttributeIDType() {
    }

    public AttributeIDType(
           com.streamserve.schemas._public._1_0.ExtendedAttributeEnumType id) {
           this.id = id;
    }


    /**
     * Gets the id value for this AttributeIDType.
     * 
     * @return id   * Attribute ID as enumValue or value.
     */
    public com.streamserve.schemas._public._1_0.ExtendedAttributeEnumType getId() {
        return id;
    }


    /**
     * Sets the id value for this AttributeIDType.
     * 
     * @param id   * Attribute ID as enumValue or value.
     */
    public void setId(com.streamserve.schemas._public._1_0.ExtendedAttributeEnumType id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeIDType)) return false;
        AttributeIDType other = (AttributeIDType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeIDType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "AttributeIDType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "ExtendedAttributeEnumType"));
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
