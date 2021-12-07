/**
 * JobSubmitContentBase64BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0;

public class JobSubmitContentBase64BindingStub extends org.apache.axis.client.Stub implements com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobSubmitContentBase64PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitJobsContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", "SubmitJobsContentRequestType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", ">SubmitJobsContentRequestType"), com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", ">SubmitJobsContentResponseType"));
        oper.setReturnClass(com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", "SubmitJobsContentResponseType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "FaultType"),
                      "com.streamserve.schemas._public._1_0.FaultType",
                      new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", ">FaultType"), 
                      true
                     ));
        _operations[0] = oper;

    }

    public JobSubmitContentBase64BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public JobSubmitContentBase64BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public JobSubmitContentBase64BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", ">FaultType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.FaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "AttributeCollectionType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.AttributeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "AttributeType");
            qName2 = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "AttributeEnumType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.AttributeEnumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "AttributeIDType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.AttributeIDType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "AttributeType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.AttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "CustomAttributeCollectionType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.CustomAttributeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "CustomAttributeType");
            qName2 = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "CustomAttributeIDType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.CustomAttributeIDType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "CustomAttributeType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.CustomAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "ErrorDetailType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.ErrorDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "ErrorType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.ErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "ExtendedAttributeEnumType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas._public._1_0.ExtendedAttributeEnumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "ValueCollectionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://schemas.streamserve.com/public/1.0", "value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", ">SubmitJobsContentRequestType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", ">SubmitJobsContentResponseType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", "JobsContentCollectionType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobsContentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", "JobsContentType");
            qName2 = new javax.xml.namespace.QName("", "job");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/interfaces/jobsubmitcontent/base64/1.0", "JobsContentType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.JobsContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ContentCollectionType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ContentType");
            qName2 = new javax.xml.namespace.QName("", "data");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ContentType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.ContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "DocumentContentType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.DocumentContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "DocumentResourcesContentResponseCollectionType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.DocumentResourcesContentResponseCollectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "JobContentCollectionType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.JobContentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "JobContentType");
            qName2 = new javax.xml.namespace.QName("", "attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "JobContentType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.JobContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "JobSubmitContentResponseCollectionType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.JobSubmitContentResponseType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "JobSubmitContentResponseType");
            qName2 = new javax.xml.namespace.QName("", "job");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "JobSubmitContentResponseType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.JobSubmitContentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ResourceContentCollectionType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.ResourceContentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ResourceContentType");
            qName2 = new javax.xml.namespace.QName("", "resource");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ResourceContentRequestType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.ResourceContentRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ResourceContentResponseType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.ResourceContentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/content/base64/1.0", "ResourceContentType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.content.base64._1_0.ResourceContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ExtendedResourceEnumType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.object._1_0.ExtendedResourceEnumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ObjectIDType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.object._1_0.ObjectIDType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ObjectResultType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.object._1_0.ObjectResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ObjectType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.object._1_0.ObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ResourceEnumType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.object._1_0.ResourceEnumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ResourceIDType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.object._1_0.ResourceIDType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ResourceObjectType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.object._1_0.ResourceObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "ResourceResultType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.object._1_0.ResourceResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "RevisionType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.object._1_0.RevisionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.streamserve.com/webservice/types/object/1.0", "SubmitEnumType");
            cachedSerQNames.add(qName);
            cls = com.streamserve.schemas.webservice.types.object._1_0.SubmitEnumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentResponseType submitJobsContent(com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentRequestType submitJobsContentRequest) throws java.rmi.RemoteException, com.streamserve.schemas._public._1_0.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://schemas.streamserve.com/webservice/jobsubmitcontent/base64/1.0/submitjobscontent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "submitJobsContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {submitJobsContentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.streamserve.schemas.webservice.interfaces.jobsubmitcontent.base64._1_0.SubmitJobsContentResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.streamserve.schemas._public._1_0.FaultType) {
              throw (com.streamserve.schemas._public._1_0.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
