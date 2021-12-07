/**
 * AttributeEnumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas._public._1_0;

public class AttributeEnumType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AttributeEnumType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ID = "ID";
    public static final java.lang.String _Type = "Type";
    public static final java.lang.String _Name = "Name";
    public static final java.lang.String _Description = "Description";
    public static final java.lang.String _Version = "Version";
    public static final java.lang.String _Revision = "Revision";
    public static final java.lang.String _CreationTime = "CreationTime";
    public static final java.lang.String _ModifyTime = "ModifyTime";
    public static final java.lang.String _ExpiringTime = "ExpiringTime";
    public static final java.lang.String _State = "State";
    public static final java.lang.String _ServiceName = "ServiceName";
    public static final java.lang.String _RuleName = "RuleName";
    public static final java.lang.String _RuleID = "RuleID";
    public static final java.lang.String _Comment = "Comment";
    public static final java.lang.String _ErrorCode = "ErrorCode";
    public static final java.lang.String _ErrorMessage = "ErrorMessage";
    public static final java.lang.String _Error = "Error";
    public static final java.lang.String _Shared = "Shared";
    public static final java.lang.String _AdhocEnabled = "AdhocEnabled";
    public static final java.lang.String _TypeName = "TypeName";
    public static final java.lang.String _ExternalID = "ExternalID";
    public static final java.lang.String _TemplateName = "TemplateName";
    public static final java.lang.String _DocumentTypeID = "DocumentTypeID";
    public static final AttributeEnumType ID = new AttributeEnumType(_ID);
    public static final AttributeEnumType Type = new AttributeEnumType(_Type);
    public static final AttributeEnumType Name = new AttributeEnumType(_Name);
    public static final AttributeEnumType Description = new AttributeEnumType(_Description);
    public static final AttributeEnumType Version = new AttributeEnumType(_Version);
    public static final AttributeEnumType Revision = new AttributeEnumType(_Revision);
    public static final AttributeEnumType CreationTime = new AttributeEnumType(_CreationTime);
    public static final AttributeEnumType ModifyTime = new AttributeEnumType(_ModifyTime);
    public static final AttributeEnumType ExpiringTime = new AttributeEnumType(_ExpiringTime);
    public static final AttributeEnumType State = new AttributeEnumType(_State);
    public static final AttributeEnumType ServiceName = new AttributeEnumType(_ServiceName);
    public static final AttributeEnumType RuleName = new AttributeEnumType(_RuleName);
    public static final AttributeEnumType RuleID = new AttributeEnumType(_RuleID);
    public static final AttributeEnumType Comment = new AttributeEnumType(_Comment);
    public static final AttributeEnumType ErrorCode = new AttributeEnumType(_ErrorCode);
    public static final AttributeEnumType ErrorMessage = new AttributeEnumType(_ErrorMessage);
    public static final AttributeEnumType Error = new AttributeEnumType(_Error);
    public static final AttributeEnumType Shared = new AttributeEnumType(_Shared);
    public static final AttributeEnumType AdhocEnabled = new AttributeEnumType(_AdhocEnabled);
    public static final AttributeEnumType TypeName = new AttributeEnumType(_TypeName);
    public static final AttributeEnumType ExternalID = new AttributeEnumType(_ExternalID);
    public static final AttributeEnumType TemplateName = new AttributeEnumType(_TemplateName);
    public static final AttributeEnumType DocumentTypeID = new AttributeEnumType(_DocumentTypeID);
    public java.lang.String getValue() { return _value_;}
    public static AttributeEnumType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AttributeEnumType enumeration = (AttributeEnumType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AttributeEnumType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeEnumType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "AttributeEnumType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
