/**
 * ZuoraServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public class ZuoraServiceLocator extends org.apache.axis.client.Service implements com.zuora.api.ZuoraService {

    public ZuoraServiceLocator() {
    }


    public ZuoraServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ZuoraServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Soap
    private java.lang.String Soap_address = "https://apisandbox.zuora.com/apps/services/a/41.0";

    public java.lang.String getSoapAddress() {
        return Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SoapWSDDServiceName = "Soap";

    public java.lang.String getSoapWSDDServiceName() {
        return SoapWSDDServiceName;
    }

    public void setSoapWSDDServiceName(java.lang.String name) {
        SoapWSDDServiceName = name;
    }

    public com.zuora.api.Soap getSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoap(endpoint);
    }

    public com.zuora.api.Soap getSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zuora.api.SoapBindingStub _stub = new com.zuora.api.SoapBindingStub(portAddress, this);
            _stub.setPortName(getSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoapEndpointAddress(java.lang.String address) {
        Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zuora.api.Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zuora.api.SoapBindingStub _stub = new com.zuora.api.SoapBindingStub(new java.net.URL(Soap_address), this);
                _stub.setPortName(getSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Soap".equals(inputPortName)) {
            return getSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.zuora.com/", "ZuoraService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.zuora.com/", "Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Soap".equals(portName)) {
            setSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
