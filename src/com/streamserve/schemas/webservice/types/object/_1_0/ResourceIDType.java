/**
 * ResourceIDType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.types.object._1_0;


/**
 * Resource ID.
 */
public class ResourceIDType  implements java.io.Serializable {
    /* Resource ID of type xsd:string. */
    private java.lang.String id;

    /* Resource revision. */
    private com.streamserve.schemas.webservice.types.object._1_0.RevisionType revision;

    public ResourceIDType() {
    }

    public ResourceIDType(
           java.lang.String id,
           com.streamserve.schemas.webservice.types.object._1_0.RevisionType revision) {
           this.id = id;
           this.revision = revision;
    }


    /**
     * Gets the id value for this ResourceIDType.
     * 
     * @return id   * Resource ID of type xsd:string.
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ResourceIDType.
     * 
     * @param id   * Resource ID of type xsd:string.
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the revision value for this ResourceIDType.
     * 
     * @return revision   * Resource revision.
     */
    public com.streamserve.schemas.webservice.types.object._1_0.RevisionType getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this ResourceIDType.
     * 
     * @param revision   * Resource revision.
     */
    public void setRevision(com.streamserve.schemas.webservice.types.object._1_0.RevisionType revision) {
        this.revision = revision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceIDType)) return false;
        ResourceIDType other = (ResourceIDType) obj;
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
              this.id.equals(other.getId()))) &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision())));
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
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceIDType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ResourceIDType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "RevisionType"));
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
