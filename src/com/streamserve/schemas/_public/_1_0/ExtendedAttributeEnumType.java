/**
 * ExtendedAttributeEnumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas._public._1_0;


/**
 * Choice of a enumeration value (wsto:AttributeEnumType) or a string
 * (xsd:string) value.
 */
public class ExtendedAttributeEnumType  implements java.io.Serializable {
    /* Enumeration value (wsto:AttributeEnumType). */
    private com.streamserve.schemas._public._1_0.AttributeEnumType enumValue;

    /* Any value (as xsd:string). */
    private java.lang.String value;

    public ExtendedAttributeEnumType() {
    }

    public ExtendedAttributeEnumType(
           com.streamserve.schemas._public._1_0.AttributeEnumType enumValue,
           java.lang.String value) {
           this.enumValue = enumValue;
           this.value = value;
    }


    /**
     * Gets the enumValue value for this ExtendedAttributeEnumType.
     * 
     * @return enumValue   * Enumeration value (wsto:AttributeEnumType).
     */
    public com.streamserve.schemas._public._1_0.AttributeEnumType getEnumValue() {
        return enumValue;
    }


    /**
     * Sets the enumValue value for this ExtendedAttributeEnumType.
     * 
     * @param enumValue   * Enumeration value (wsto:AttributeEnumType).
     */
    public void setEnumValue(com.streamserve.schemas._public._1_0.AttributeEnumType enumValue) {
        this.enumValue = enumValue;
    }


    /**
     * Gets the value value for this ExtendedAttributeEnumType.
     * 
     * @return value   * Any value (as xsd:string).
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ExtendedAttributeEnumType.
     * 
     * @param value   * Any value (as xsd:string).
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendedAttributeEnumType)) return false;
        ExtendedAttributeEnumType other = (ExtendedAttributeEnumType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enumValue==null && other.getEnumValue()==null) || 
             (this.enumValue!=null &&
              this.enumValue.equals(other.getEnumValue()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getEnumValue() != null) {
            _hashCode += getEnumValue().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtendedAttributeEnumType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "ExtendedAttributeEnumType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "enumValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "AttributeEnumType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
