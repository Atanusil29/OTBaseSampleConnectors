/**
 * RevisionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.types.object._1_0;


/**
 * Revision type containing a revision value and a boolean to ignore.
 */
public class RevisionType  implements java.io.Serializable {
    /* The revision value. */
    private int value;

    /* Set to true will ignore the revision and overwrite any previous
     * modifications. */
    private java.lang.Boolean ignore;

    public RevisionType() {
    }

    public RevisionType(
           int value,
           java.lang.Boolean ignore) {
           this.value = value;
           this.ignore = ignore;
    }


    /**
     * Gets the value value for this RevisionType.
     * 
     * @return value   * The revision value.
     */
    public int getValue() {
        return value;
    }


    /**
     * Sets the value value for this RevisionType.
     * 
     * @param value   * The revision value.
     */
    public void setValue(int value) {
        this.value = value;
    }


    /**
     * Gets the ignore value for this RevisionType.
     * 
     * @return ignore   * Set to true will ignore the revision and overwrite any previous
     * modifications.
     */
    public java.lang.Boolean getIgnore() {
        return ignore;
    }


    /**
     * Sets the ignore value for this RevisionType.
     * 
     * @param ignore   * Set to true will ignore the revision and overwrite any previous
     * modifications.
     */
    public void setIgnore(java.lang.Boolean ignore) {
        this.ignore = ignore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevisionType)) return false;
        RevisionType other = (RevisionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.value == other.getValue() &&
            ((this.ignore==null && other.getIgnore()==null) || 
             (this.ignore!=null &&
              this.ignore.equals(other.getIgnore())));
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
        _hashCode += getValue();
        if (getIgnore() != null) {
            _hashCode += getIgnore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RevisionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "RevisionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ignore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
