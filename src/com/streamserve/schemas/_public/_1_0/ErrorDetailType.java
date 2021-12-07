/**
 * ErrorDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas._public._1_0;

public class ErrorDetailType  implements java.io.Serializable {
    /* Thread ID */
    private java.lang.String threadID;

    /* Source location */
    private java.lang.String location;

    /* Error time stamp */
    private java.util.Calendar timeStamp;

    /* Call stack */
    private java.lang.String callStack;

    public ErrorDetailType() {
    }

    public ErrorDetailType(
           java.lang.String threadID,
           java.lang.String location,
           java.util.Calendar timeStamp,
           java.lang.String callStack) {
           this.threadID = threadID;
           this.location = location;
           this.timeStamp = timeStamp;
           this.callStack = callStack;
    }


    /**
     * Gets the threadID value for this ErrorDetailType.
     * 
     * @return threadID   * Thread ID
     */
    public java.lang.String getThreadID() {
        return threadID;
    }


    /**
     * Sets the threadID value for this ErrorDetailType.
     * 
     * @param threadID   * Thread ID
     */
    public void setThreadID(java.lang.String threadID) {
        this.threadID = threadID;
    }


    /**
     * Gets the location value for this ErrorDetailType.
     * 
     * @return location   * Source location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ErrorDetailType.
     * 
     * @param location   * Source location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the timeStamp value for this ErrorDetailType.
     * 
     * @return timeStamp   * Error time stamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this ErrorDetailType.
     * 
     * @param timeStamp   * Error time stamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the callStack value for this ErrorDetailType.
     * 
     * @return callStack   * Call stack
     */
    public java.lang.String getCallStack() {
        return callStack;
    }


    /**
     * Sets the callStack value for this ErrorDetailType.
     * 
     * @param callStack   * Call stack
     */
    public void setCallStack(java.lang.String callStack) {
        this.callStack = callStack;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorDetailType)) return false;
        ErrorDetailType other = (ErrorDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.threadID==null && other.getThreadID()==null) || 
             (this.threadID!=null &&
              this.threadID.equals(other.getThreadID()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.callStack==null && other.getCallStack()==null) || 
             (this.callStack!=null &&
              this.callStack.equals(other.getCallStack())));
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
        if (getThreadID() != null) {
            _hashCode += getThreadID().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getCallStack() != null) {
            _hashCode += getCallStack().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "ErrorDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threadID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "threadID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callStack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "callStack"));
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
