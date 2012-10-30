package com.zuora.api;

public class SoapProxy implements com.zuora.api.Soap {
  private String _endpoint = null;
  private com.zuora.api.Soap soap = null;
  
  public SoapProxy() {
    _initSoapProxy();
  }
  
  public SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapProxy();
  }
  
  private void _initSoapProxy() {
    try {
      soap = (new com.zuora.api.ZuoraServiceLocator()).getSoap();
      if (soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soap != null)
      ((javax.xml.rpc.Stub)soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.zuora.api.Soap getSoap() {
    if (soap == null)
      _initSoapProxy();
    return soap;
  }
  
  public com.zuora.api.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.LoginFault{
    if (soap == null)
      _initSoapProxy();
    return soap.login(username, password);
  }
  
  public com.zuora.api.SubscribeResult[] subscribe(com.zuora.api.SubscribeRequest[] subscribes) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.subscribe(subscribes);
  }
  
  public com.zuora.api.SaveResult[] create(com.zuora.api.object.ZObject[] zObjects) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault{
    if (soap == null)
      _initSoapProxy();
    return soap.create(zObjects);
  }
  
  public com.zuora.api.SaveResult[] generate(com.zuora.api.object.ZObject[] zObjects) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault{
    if (soap == null)
      _initSoapProxy();
    return soap.generate(zObjects);
  }
  
  public com.zuora.api.SaveResult[] update(com.zuora.api.object.ZObject[] zObjects) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault{
    if (soap == null)
      _initSoapProxy();
    return soap.update(zObjects);
  }
  
  public com.zuora.api.DeleteResult[] delete(java.lang.String type, java.lang.String[] ids) throws java.rmi.RemoteException, com.zuora.api.fault.InvalidValueFault, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault{
    if (soap == null)
      _initSoapProxy();
    return soap.delete(type, ids);
  }
  
  public com.zuora.api.ExecuteResult[] execute(java.lang.String type, boolean synchronous, java.lang.String[] ids) throws java.rmi.RemoteException, com.zuora.api.fault.InvalidValueFault, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidTypeFault{
    if (soap == null)
      _initSoapProxy();
    return soap.execute(type, synchronous, ids);
  }
  
  public com.zuora.api.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.zuora.api.fault.MalformedQueryFault, com.zuora.api.fault.UnexpectedErrorFault, com.zuora.api.fault.InvalidQueryLocatorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.query(queryString);
  }
  
  public void getUserInfo(javax.xml.rpc.holders.StringHolder tenantId, javax.xml.rpc.holders.StringHolder tenantName, javax.xml.rpc.holders.StringHolder userEmail, javax.xml.rpc.holders.StringHolder userFullName, javax.xml.rpc.holders.StringHolder userId, javax.xml.rpc.holders.StringHolder username) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    soap.getUserInfo(tenantId, tenantName, userEmail, userFullName, userId, username);
  }
  
  public com.zuora.api.AmendResult[] amend(com.zuora.api.AmendRequest[] requests) throws java.rmi.RemoteException, com.zuora.api.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.amend(requests);
  }
  
  
}