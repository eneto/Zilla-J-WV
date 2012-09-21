package com.zuora.zilla.util;

import com.sforce.soap.enterprise.Connector;
import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.Error;
import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import com.zuora.zilla.model.ResponseAction;

public class SApi {

	/** The Constant PROPERTY_ENDPOINT. */
	private static final String PROPERTY_ENDPOINT = "SfdcEndpoint";
	/** The Constant PROPERTY_USERNAME. */
	private static final String PROPERTY_USERNAME = "SfdcUsername";
	/** The Constant PROPERTY_PASSWORD. */
	private static final String PROPERTY_PASSWORD = "SfdcPassword";
	/** The Constant PROPERTY_TOKEN. */
	private static final String PROPERTY_TOKEN = "SfdcSecurityToken";
	
	
	public static EnterpriseConnection makeConnection() throws Exception{
		ZuoraUtility utility = new ZuoraUtility();
		String username = utility.getPropertyValue(PROPERTY_USERNAME);
		String password = utility.getPropertyValue(PROPERTY_PASSWORD);
		String securityToken = utility.getPropertyValue(PROPERTY_TOKEN);
		String endpoint = utility.getPropertyValue(PROPERTY_ENDPOINT);

		ConnectorConfig config = new ConnectorConfig();
	    config.setUsername(username);
	    config.setPassword(password + securityToken);
	    
	    config.setAuthEndpoint(endpoint);
	    
	    try {
		      EnterpriseConnection connection = Connector.newConnection(config);

		      return connection;
	    } catch (ConnectionException e) {
	    	throw e;
	    } catch (Exception e){
	    	throw e;
	    }
	}
	
	public ResponseAction makeSfdcAccount(String accountName) {
		String accountId = null;
		ResponseAction resp = new ResponseAction();
		EnterpriseConnection connection = null;
		try{
			connection = SApi.makeConnection();
		} catch (Exception e){
			
		}
		if(connection==null){
			resp.setSuccess(false);
			resp.setError("Could not establish a connection.");
			return resp;
		}

		try{
			//Create account.
			Account a = new Account();
			a.setName(accountName);
			Account[] accts = new Account[] {a};
			SaveResult[] saveResultsAcct = connection.create(accts);
			if (saveResultsAcct[0].isSuccess()) {
				System.out.println("Successfully created record - Id: "
					+ saveResultsAcct[0].getId());
				accountId = saveResultsAcct[0].getId();
			} else {
				Error[] errors = saveResultsAcct[0].getErrors();
				resp.setSuccess(false);
				resp.setError(errors[0].getMessage());
				return resp;
			}
		} catch (Exception e) {
			resp.setSuccess(false);
			resp.setError(e.getMessage());
			return resp;
		}
		resp.setSuccess(true);
		resp.setData(accountId);
		return resp;
	}
	
	public static void main(String[] args){
		SApi sapi = new SApi();
		String name = "test acct";
		ResponseAction resp = sapi.makeSfdcAccount(name);
		System.out.println(name);
		System.out.println(resp.isSuccess());
	}
}
