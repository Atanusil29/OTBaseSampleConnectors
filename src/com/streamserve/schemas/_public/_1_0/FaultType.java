/**
 * FaultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas._public._1_0;

public class FaultType  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.streamserve.schemas._public._1_0.ErrorType error;

    private com.streamserve.schemas._public._1_0.ErrorDetailType detail;

    public FaultType() {
    }

    public FaultType(
           com.streamserve.schemas._public._1_0.ErrorType error,
           com.streamserve.schemas._public._1_0.ErrorDetailType detail) {
        this.error = error;
        this.detail = detail;
    }


    /**
     * Gets the error value for this FaultType.
     * 
     * @return error
     */
    public com.streamserve.schemas._public._1_0.ErrorType getError() {
        return error;
    }


    /**
     * Sets the error value for this FaultType.
     * 
     * @param error
     */
    public void setError(com.streamserve.schemas._public._1_0.ErrorType error) {
        this.error = error;
    }


    /**
     * Gets the detail value for this FaultType.
     * 
     * @return detail
     */
    public com.streamserve.schemas._public._1_0.ErrorDetailType getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this FaultType.
     * 
     * @param detail
     */
    public void setDetail(com.streamserve.schemas._public._1_0.ErrorDetailType detail) {
        this.detail = detail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultType)) return false;
        FaultType other = (FaultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail())));
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FaultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", ">FaultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "ErrorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "ErrorDetailType"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
