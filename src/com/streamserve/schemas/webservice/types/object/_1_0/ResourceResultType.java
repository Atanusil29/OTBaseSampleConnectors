/**
 * ResourceResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.types.object._1_0;


/**
 * Resource result containing ID, new revision, type, resultcode and
 * description (on error).
 *         The id matches a resource in the request. The new revision
 * is the updated revision number
 *         that should be used in future calls for this resource. The
 * type is the type of targeted
 *         resource. The result code describes the result of the request
 * and the description includes
 *         more detailed information in case of error. If the requests
 * works ok the result code will
 *         always be 0. If a resource failed requested operation the
 * result code will be the error code.
 */
public class ResourceResultType  extends com.streamserve.schemas.webservice.types.object._1_0.ResourceIDType  implements java.io.Serializable {
    /* Resource type. */
    private com.streamserve.schemas.webservice.types.object._1_0.ExtendedResourceEnumType type;

    /* Result code (0 = success). */
    private int resultCode;

    /* More detailed information in case of error. */
    private java.lang.String description;

    public ResourceResultType() {
    }

    public ResourceResultType(
           java.lang.String id,
           com.streamserve.schemas.webservice.types.object._1_0.RevisionType revision,
           com.streamserve.schemas.webservice.types.object._1_0.ExtendedResourceEnumType type,
           int resultCode,
           java.lang.String description) {
        super(
            id,
            revision);
        this.type = type;
        this.resultCode = resultCode;
        this.description = description;
    }


    /**
     * Gets the type value for this ResourceResultType.
     * 
     * @return type   * Resource type.
     */
    public com.streamserve.schemas.webservice.types.object._1_0.ExtendedResourceEnumType getType() {
        return type;
    }


    /**
     * Sets the type value for this ResourceResultType.
     * 
     * @param type   * Resource type.
     */
    public void setType(com.streamserve.schemas.webservice.types.object._1_0.ExtendedResourceEnumType type) {
        this.type = type;
    }


    /**
     * Gets the resultCode value for this ResourceResultType.
     * 
     * @return resultCode   * Result code (0 = success).
     */
    public int getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this ResourceResultType.
     * 
     * @param resultCode   * Result code (0 = success).
     */
    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the description value for this ResourceResultType.
     * 
     * @return description   * More detailed information in case of error.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResourceResultType.
     * 
     * @param description   * More detailed information in case of error.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceResultType)) return false;
        ResourceResultType other = (ResourceResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.resultCode == other.getResultCode() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += getResultCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ResourceResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ExtendedResourceEnumType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
