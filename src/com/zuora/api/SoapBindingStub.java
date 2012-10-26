/**
 * SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class SoapBindingStub extends org.apache.axis.client.Stub implements com.zuora.api.Soap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.zuora.com/", "LoginResult"));
        oper.setReturnClass(com.zuora.api.LoginResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.zuora.com/", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"),
                      "com.zuora.api.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "LoginFault"),
                      "com.zuora.api.fault.LoginFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "LoginFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscribe");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "subscribes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeRequest"), com.zuora.api.SubscribeRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeResult"));
        oper.setReturnClass(com.zuora.api.SubscribeResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.zuora.com/", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"),
                      "com.zuora.api.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "zObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://object.api.zuora.com/", "zObject"), com.zuora.api.object.ZObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.zuora.com/", "SaveResult"));
        oper.setReturnClass(com.zuora.api.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.zuora.com/", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"),
                      "com.zuora.api.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault"),
                      "com.zuora.api.fault.InvalidTypeFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "zObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://object.api.zuora.com/", "zObject"), com.zuora.api.object.ZObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.zuora.com/", "SaveResult"));
        oper.setReturnClass(com.zuora.api.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.zuora.com/", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"),
                      "com.zuora.api.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault"),
                      "com.zuora.api.fault.InvalidTypeFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "zObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://object.api.zuora.com/", "zObject"), com.zuora.api.object.ZObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.zuora.com/", "SaveResult"));
        oper.setReturnClass(com.zuora.api.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.zuora.com/", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"),
                      "com.zuora.api.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault"),
                      "com.zuora.api.fault.InvalidTypeFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.zuora.com/", "QueryResult"));
        oper.setReturnClass(com.zuora.api.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.zuora.com/", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "MalformedQueryFault"),
                      "com.zuora.api.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"),
                      "com.zuora.api.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidQueryLocatorFault"),
                      "com.zuora.api.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidQueryLocatorFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.zuora.com/", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.zuora.com/", "DeleteResult"));
        oper.setReturnClass(com.zuora.api.DeleteResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.zuora.com/", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidValueFault"),
                      "com.zuora.api.fault.InvalidValueFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidValueFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"),
                      "com.zuora.api.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault"),
                      "com.zuora.api.fault.InvalidTypeFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "TenantId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "TenantName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "UserEmail"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "UserFullName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "UserId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "Username"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"),
                      "com.zuora.api.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("amend");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "requests"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.zuora.com/", "AmendRequest"), com.zuora.api.AmendRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.zuora.com/", "AmendResult"));
        oper.setReturnClass(com.zuora.api.AmendResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.zuora.com/", "results"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"),
                      "com.zuora.api.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("execute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "synchronous"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.zuora.com/", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.zuora.com/", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.zuora.com/", "ExecuteResult"));
        oper.setReturnClass(com.zuora.api.ExecuteResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.zuora.com/", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidValueFault"),
                      "com.zuora.api.fault.InvalidValueFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidValueFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"),
                      "com.zuora.api.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault"),
                      "com.zuora.api.fault.InvalidTypeFault",
                      new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    public SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "AmendOptions");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.AmendOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "AmendRequest");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.AmendRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "AmendResult");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.AmendResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "DeleteResult");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.DeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "Error");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "ErrorCode");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.ErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "ExecuteResult");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.ExecuteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "GatewayOptionData");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.GatewayOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayOption");
            qName2 = new javax.xml.namespace.QName("http://api.zuora.com/", "GatewayOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "ID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceData");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.InvoiceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceProcessingOptions");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.InvoiceProcessingOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "InvoiceResult");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Invoice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Invoice");
            qName2 = new javax.xml.namespace.QName("http://api.zuora.com/", "Invoice");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "LoginResult");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.LoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "PreviewOptions");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.PreviewOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "ProductRatePlanChargeTierData");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.ProductRatePlanChargeTier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlanChargeTier");
            qName2 = new javax.xml.namespace.QName("http://api.zuora.com/", "ProductRatePlanChargeTier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "QueryLocator");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "QueryResult");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.QueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanChargeData");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.RatePlanChargeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "RatePlanData");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.RatePlanData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "SaveResult");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.SaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeInvoiceProcessingOptions");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.SubscribeInvoiceProcessingOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeOptions");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.SubscribeOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeRequest");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.SubscribeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "SubscribeResult");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.SubscribeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.zuora.com/", "SubscriptionData");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.SubscriptionData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.api.zuora.com/", "ApiFault");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.fault.ApiFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidQueryLocatorFault");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.fault.InvalidQueryLocatorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidTypeFault");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.fault.InvalidTypeFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.api.zuora.com/", "InvalidValueFault");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.fault.InvalidValueFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.api.zuora.com/", "LoginFault");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.fault.LoginFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.api.zuora.com/", "MalformedQueryFault");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.fault.MalformedQueryFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fault.api.zuora.com/", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.fault.UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Account");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Account.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Amendment");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Amendment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "CommunicationProfile");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.CommunicationProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Contact");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "CreditBalanceAdjustment");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.CreditBalanceAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Export");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Export.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "GatewayOption");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.GatewayOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Import");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object._import.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Invoice");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Invoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceAdjustment");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.InvoiceAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceItem");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.InvoiceItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoiceItemAdjustment");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.InvoiceItemAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "InvoicePayment");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.InvoicePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Payment");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentMethod");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.PaymentMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "PaymentTransactionLog");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.PaymentTransactionLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Product");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlan");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.ProductRatePlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlanCharge");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.ProductRatePlanCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "ProductRatePlanChargeTier");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.ProductRatePlanChargeTier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlan");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.RatePlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlanCharge");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.RatePlanCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "RatePlanChargeTier");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.RatePlanChargeTier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Refund");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Refund.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "RefundInvoicePayment");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.RefundInvoicePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "RefundTransactionLog");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.RefundTransactionLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Subscription");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Subscription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "TaxationItem");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.TaxationItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "Usage");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.Usage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://object.api.zuora.com/", "zObject");
            cachedSerQNames.add(qName);
            cls = com.zuora.api.object.ZObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

    public com.zuora.api.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.LoginFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.zuora.com/", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zuora.api.LoginResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zuora.api.LoginResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.zuora.api.LoginResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.UnexpectedErrorFault) {
              throw (com.zuora.api.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.LoginFault) {
              throw (com.zuora.api.fault.LoginFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.zuora.api.SubscribeResult[] subscribe(com.zuora.api.SubscribeRequest[] subscribes) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.zuora.com/", "subscribe"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subscribes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zuora.api.SubscribeResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zuora.api.SubscribeResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zuora.api.SubscribeResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.UnexpectedErrorFault) {
              throw (com.zuora.api.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.zuora.api.SaveResult[] create(com.zuora.api.object.ZObject[] zObjects) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.zuora.com/", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zuora.api.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zuora.api.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zuora.api.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.UnexpectedErrorFault) {
              throw (com.zuora.api.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.InvalidTypeFault) {
              throw (com.zuora.api.fault.InvalidTypeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.zuora.api.SaveResult[] generate(com.zuora.api.object.ZObject[] zObjects) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.zuora.com/", "generate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zuora.api.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zuora.api.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zuora.api.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.UnexpectedErrorFault) {
              throw (com.zuora.api.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.InvalidTypeFault) {
              throw (com.zuora.api.fault.InvalidTypeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.zuora.api.SaveResult[] update(com.zuora.api.object.ZObject[] zObjects) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.zuora.com/", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zuora.api.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zuora.api.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zuora.api.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.UnexpectedErrorFault) {
              throw (com.zuora.api.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.InvalidTypeFault) {
              throw (com.zuora.api.fault.InvalidTypeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.zuora.api.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.zuora.api.fault.MalformedQueryFault, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidQueryLocatorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.zuora.com/", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zuora.api.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zuora.api.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.zuora.api.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.MalformedQueryFault) {
              throw (com.zuora.api.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.UnexpectedErrorFault) {
              throw (com.zuora.api.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.InvalidQueryLocatorFault) {
              throw (com.zuora.api.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.zuora.api.DeleteResult[] delete(java.lang.String type, java.lang.String[] ids) throws java.rmi.RemoteException, com.zuora.api.fault.InvalidValueFault, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.zuora.com/", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {type, ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zuora.api.DeleteResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zuora.api.DeleteResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zuora.api.DeleteResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.InvalidValueFault) {
              throw (com.zuora.api.fault.InvalidValueFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.UnexpectedErrorFault) {
              throw (com.zuora.api.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.InvalidTypeFault) {
              throw (com.zuora.api.fault.InvalidTypeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void getUserInfo(javax.xml.rpc.holders.StringHolder tenantId, javax.xml.rpc.holders.StringHolder tenantName, javax.xml.rpc.holders.StringHolder userEmail, javax.xml.rpc.holders.StringHolder userFullName, javax.xml.rpc.holders.StringHolder userId, javax.xml.rpc.holders.StringHolder username) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.zuora.com/", "getUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                tenantId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "TenantId"));
            } catch (java.lang.Exception _exception) {
                tenantId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "TenantId")), java.lang.String.class);
            }
            try {
                tenantName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "TenantName"));
            } catch (java.lang.Exception _exception) {
                tenantName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "TenantName")), java.lang.String.class);
            }
            try {
                userEmail.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "UserEmail"));
            } catch (java.lang.Exception _exception) {
                userEmail.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "UserEmail")), java.lang.String.class);
            }
            try {
                userFullName.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "UserFullName"));
            } catch (java.lang.Exception _exception) {
                userFullName.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "UserFullName")), java.lang.String.class);
            }
            try {
                userId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "UserId"));
            } catch (java.lang.Exception _exception) {
                userId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "UserId")), java.lang.String.class);
            }
            try {
                username.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "Username"));
            } catch (java.lang.Exception _exception) {
                username.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://api.zuora.com/", "Username")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.UnexpectedErrorFault) {
              throw (com.zuora.api.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.zuora.api.AmendResult[] amend(com.zuora.api.AmendRequest[] requests) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.zuora.com/", "amend"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requests});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zuora.api.AmendResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zuora.api.AmendResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zuora.api.AmendResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.UnexpectedErrorFault) {
              throw (com.zuora.api.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.zuora.api.ExecuteResult[] execute(java.lang.String type, boolean synchronous, java.lang.String[] ids) throws java.rmi.RemoteException, com.zuora.api.fault.InvalidValueFault, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.zuora.com/", "execute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {type, new java.lang.Boolean(synchronous), ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.zuora.api.ExecuteResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.zuora.api.ExecuteResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.zuora.api.ExecuteResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.InvalidValueFault) {
              throw (com.zuora.api.fault.InvalidValueFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.UnexpectedErrorFault) {
              throw (com.zuora.api.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.zuora.api.fault.InvalidTypeFault) {
              throw (com.zuora.api.fault.InvalidTypeFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
