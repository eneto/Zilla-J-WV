package com.zuora.api.util;

import java.rmi.RemoteException;

import org.apache.axis.message.SOAPHeaderElement;

import com.zuora.api.*;
import com.zuora.api.object.*;

public class ZApi {

	/** The Constant PROPERTY_ENDPOINT. */
	private static final String PROPERTY_ENDPOINT = "endpoint";

	/** The Constant PROPERTY_USERNAME. */
	private static final String PROPERTY_USERNAME = "username";

	/** The Constant PROPERTY_PASSWORD. */
	private static final String PROPERTY_PASSWORD = "password";

	/** The Stub to query from Zuora. */
	private SoapBindingStub stub;

	
	/** True upon a successful login. */
	public boolean isLoggedIn;

	/**
	 * Creating a new zApi instance will log in using a SOAP login call, and will generate a session header which can be used for subsequent API calls. If the credentials set up in config.php are invalid, the instantiation of the class will throw an exception.
	 */
	public ZApi (){
		try {		
			//Get the user's credentials
			ZuoraUtility utility = new ZuoraUtility();
			String username = utility.getPropertyValue(PROPERTY_USERNAME);
			String password = utility.getPropertyValue(PROPERTY_PASSWORD);
			String endpoint = utility.getPropertyValue(PROPERTY_ENDPOINT);
	
			// get the stub
			stub = new SoapBindingStub(new java.net.URL(endpoint), null);
			LoginResult logRes = stub.login(username, password);
			SOAPHeaderElement sessionHeader = new SOAPHeaderElement("SessionHeader", "SessionHeader");
			sessionHeader.addChildElement("session").addTextNode(logRes.getSession());
			stub.setHeader(sessionHeader);
			isLoggedIn=true;
		} catch (Exception e) {
			isLoggedIn=false;
			Logger.Log(e.getMessage());
		}
	}

	/**
	 * Query() call
	 * @param $q Query string
	 * @return QueryResultW
	 * @throws Exception 
	 * @throws InvalidQueryLocatorFault 
	 * @throws UnexpectedErrorFault 
	 * @throws MalformedQueryFault 
	 * @throws RemoteException 
	 */
 	public QueryResult zQuery(String queryString) throws Exception {
 		QueryResult qres ;
 		try{
 			qres = stub.query(queryString);
 		} catch (Exception e){
			Logger.Log("Exception on zQuery [" + queryString + "]: " + e.getMessage());
 			throw e;
 		}
		
		return qres;
	}
	
	/**
	 * zCreate() Create(). 
	 * @param $objs A list of 'zobject' arrays with all fields defined for the objects to be inserted
	 * @return SaveResults
	 * @throws InvalidTypeFault 
	 * @throws UnexpectedErrorFault 
	 * @throws RemoteException 
	 */
	public SaveResult[] zCreate(ZObject[] objs) throws Exception {
 		SaveResult[] cres ;
 		try{
 			cres = stub.create(objs);
 		} catch (Exception e){
			Logger.Log("Exception on zCreate : " + e.getMessage());
 			throw e;
 		}
		
		return cres;
	}	
	
	/**
	 * zUpdate() Update()
	 * @param $objs A list of 'zobject' arrays with all fields defined for the objects to be updated
	 * @return SaveResults
	 * @throws InvalidTypeFault 
	 * @throws UnexpectedErrorFault 
	 * @throws RemoteException 
	 */
	public SaveResult[] zUpdate(ZObject[] objs) throws Exception {
 		SaveResult[] ures ;
 		try{
 			ures = stub.update(objs);
 		} catch (Exception e){
			Logger.Log("Exception on zUpdate : " + e.getMessage());
 			throw e;
 		}
		
		return ures;
	}

	/**
	 * Delete() call
	 * @param $ids Zuora IDs of records to be deleted
	 * @param $ztype Object Type: Account, Product, etc.
	 * @return DeleteResults
	 * @throws InvalidTypeFault 
	 * @throws UnexpectedErrorFault 
	 * @throws InvalidValueFault 
	 * @throws RemoteException 
	 */
	public DeleteResult[] zDelete(String[] ids, String type) throws Exception {
 		DeleteResult[] dres ;
 		try{
 			dres = stub.delete(type, ids);
 		} catch (Exception e){
			Logger.Log("Exception on zDelete : " + e.getMessage());
 			throw e;
 		}
		
		return dres;
	}
	
	/**
	 * Subscribe() call
	 * @param $zSubReq a SubscriptionRequest object that has been populated with all required fields
	 * @return SubscribeResult
	 * @throws UnexpectedErrorFault 
	 * @throws RemoteException 
	 */
	public SubscribeResult[] zSubscribe(SubscribeRequest[] subReqs) throws Exception {
 		SubscribeResult[] sres ;
 		try{
 			sres = stub.subscribe(subReqs);
 		} catch (Exception e){
			Logger.Log("Exception on zSubscribe : " + e.getMessage());
 			throw e;
 		}
		
		return sres;
	}
	
	/**
	 * Amend() call
	 * @param $zAmendment Amendment to be created
	 * @param $zAmendOptions Override of default amendment options
	 * @param $zPreviewOptions Override of default preview options
	 * @return AmendResults
	 * @throws UnexpectedErrorFault 
	 * @throws RemoteException 
	 */
	public AmendResult[] zAmend(AmendRequest[] amendReqs) throws Exception {
 		AmendResult[] ares ;
 		try{
 			ares = stub.amend(amendReqs);
 		} catch (Exception e){
			Logger.Log("Exception on zSubscribe : " + e.getMessage());
 			throw e;
 		}
		
		return ares;
	}
}
