/**
 * ZuoraService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zuora.api;

public interface ZuoraService extends javax.xml.rpc.Service {
    public java.lang.String getSoapAddress();

    public com.zuora.api.Soap getSoap() throws javax.xml.rpc.ServiceException;

    public com.zuora.api.Soap getSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
