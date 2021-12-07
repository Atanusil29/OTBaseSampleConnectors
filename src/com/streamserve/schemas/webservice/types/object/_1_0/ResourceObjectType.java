/**
 * ResourceObjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.types.object._1_0;


/**
 * Resource object containing ID, type and attributes.
 */
public class ResourceObjectType  extends com.streamserve.schemas.webservice.types.object._1_0.ResourceIDType  implements java.io.Serializable {
    /* Resource type. */
    private com.streamserve.schemas.webservice.types.object._1_0.ExtendedResourceEnumType type;

    /* Collection of resource attributes. */
    private com.streamserve.schemas._public._1_0.AttributeType[] attributes;

    public ResourceObjectType() {
    }

    public ResourceObjectType(
           java.lang.String id,
           com.streamserve.schemas.webservice.types.object._1_0.RevisionType revision,
           com.streamserve.schemas.webservice.types.object._1_0.ExtendedResourceEnumType type,
           com.streamserve.schemas._public._1_0.AttributeType[] attributes) {
        super(
            id,
            revision);
        this.type = type;
        this.attributes = attributes;
    }


    /**
     * Gets the type value for this ResourceObjectType.
     * 
     * @return type   * Resource type.
     */
    public com.streamserve.schemas.webservice.types.object._1_0.ExtendedResourceEnumType getType() {
        return type;
    }


    /**
     * Sets the type value for this ResourceObjectType.
     * 
     * @param type   * Resource type.
     */
    public void setType(com.streamserve.schemas.webservice.types.object._1_0.ExtendedResourceEnumType type) {
        this.type = type;
    }


    /**
     * Gets the attributes value for this ResourceObjectType.
     * 
     * @return attributes   * Collection of resource attributes.
     */
    public com.streamserve.schemas._public._1_0.AttributeType[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this ResourceObjectType.
     * 
     * @param attributes   * Collection of resource attributes.
     */
    public void setAttributes(com.streamserve.schemas._public._1_0.AttributeType[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceObjectType)) return false;
        ResourceObjectType other = (ResourceObjectType) obj;
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
        int _hashCode = super.hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
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
        new org.apache.axis.description.TypeDesc(ResourceObjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ResourceObjectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ExtendedResourceEnumType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "AttributeType"));
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
