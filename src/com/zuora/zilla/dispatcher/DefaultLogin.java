package com.zuora.zilla.dispatcher;

import com.zuora.zilla.controller.AccountManager;
import com.zuora.zilla.model.ResultUserLogin;

public class DefaultLogin {
	
	public static ResultUserLogin login(String username, String passwd){
		ResultUserLogin logres = new ResultUserLogin();
		if (username==null || username.equals("")) {
			logres.setSuccess(false);
			logres.setError("Must enter Username");
			return logres;
		}
//		if (passwd==null || passwd.equals("")) {
//			logres.setSuccess(false);
//			logres.setError("Must enter Password");
//			return logres;
//		}
		boolean success = validateLogin(username, passwd);
		
		if(success){
			logres.setSuccess(true);
			logres.setUserName(username);
		} else {
			logres.setSuccess(false);
			logres.setError("Invalid Username/Password");
		}
		return logres;
	}

	public static boolean validateLogin(String username, String passwd) {
		// TODO Authentication needs to be implemented by client

		//Skeleton login: If account exists, validate regardless of password.
		AccountManager am = null;
		try{
			am = new AccountManager();
		} catch (Exception e){
			return false;
		}
		if (!am.checkEmailAvailability(username)) {
			return true;
		} else {
			return false;
		}		
	}

}
