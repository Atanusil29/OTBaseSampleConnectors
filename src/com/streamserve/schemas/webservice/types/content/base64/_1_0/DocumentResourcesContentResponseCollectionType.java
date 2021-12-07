/**
 * DocumentResourcesContentResponseCollectionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.types.content.base64._1_0;


/**
 * Collection of document resources content response.
 */
public class DocumentResourcesContentResponseCollectionType  extends com.streamserve.schemas.webservice.types.object._1_0.ObjectIDType  implements java.io.Serializable {
    /* Resource content collection containing resource ID and binary
     * content. */
    private com.streamserve.schemas.webservice.types.content.base64._1_0.ResourceContentType[] resources;

    public DocumentResourcesContentResponseCollectionType() {
    }

    public DocumentResourcesContentResponseCollectionType(
           java.lang.String id,
           com.streamserve.schemas.webservice.types.content.base64._1_0.ResourceContentType[] resources) {
        super(
            id);
        this.resources = resources;
    }


    /**
     * Gets the resources value for this DocumentResourcesContentResponseCollectionType.
     * 
     * @return resources   * Resource content collection containing resource ID and binary
     * content.
     */
    public com.streamserve.schemas.webservice.types.content.base64._1_0.ResourceContentType[] getResources() {
        return resources;
    }


    /**
     * Sets the resources value for this DocumentResourcesContentResponseCollectionType.
     * 
     * @param resources   * Resource content collection containing resource ID and binary
     * content.
     */
    public void setResources(com.streamserve.schemas.webservice.types.content.base64._1_0.ResourceContentType[] resources) {
        this.resources = resources;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentResourcesContentResponseCollectionType)) return false;
        DocumentResourcesContentResponseCollectionType other = (DocumentResourcesContentResponseCollectionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.resources==null && other.getResources()==null) || 
             (this.resources!=null &&
              java.util.Arrays.equals(this.resources, other.getResources())));
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
        if (getResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResources(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentResourcesContentResponseCollectionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "DocumentResourcesContentResponseCollectionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ResourceContentType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "resource"));
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
