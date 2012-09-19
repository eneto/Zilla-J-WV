<%@page import="java.util.Random"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.security.MessageDigest"%>
<%@page import="com.zuora.zilla.util.ZuoraUtility" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<link href="css/structure.css" rel="stylesheet" type="text/css"/>
<script>
function callback() {
<%
	//################################################# CHANGE THESE INFORMATION ACCORDINGLY #####################################
	String apiSecurityKey = new ZuoraUtility().getPropertyValue("apiSecurityKey");

	//get query string 
	String queryString = "id=" + request.getParameter("id") + "&" +
				"tenantId=" + request.getParameter("tenantId") + "&" +
				"timestamp=" + request.getParameter("timestamp") + "&" +
				"token=" + request.getParameter("token");

	//concatenate API security key with query string
	String queryStringToHash = queryString + apiSecurityKey;
	try {
		//get UTF8 bytes
		byte[] queryStringToSignInBytes = queryStringToHash.getBytes("UTF-8");
		//create MD5 hash
		MessageDigest md5Digester = MessageDigest.getInstance("MD5");
		byte[] hashedQueryString = md5Digester.digest(queryStringToSignInBytes);

		//convert to hex
		String hashedStringInHex = new java.math.BigInteger(1,hashedQueryString).toString(16);
		while(hashedStringInHex.length() < 32) hashedStringInHex = "0" + hashedStringInHex;

		//encode to Base64
	    String hashedQueryStringBase64ed = new sun.misc.BASE64Encoder().encode(hashedStringInHex.getBytes());
	    //url safe the signature
	    hashedQueryStringBase64ed = hashedQueryStringBase64ed.replace('+','-');
	    hashedQueryStringBase64ed = hashedQueryStringBase64ed.replace('/','_');

	    //signature clear?
		boolean signatureClear = hashedQueryStringBase64ed.equals(request.getParameter("responseSignature"));
		boolean timestampClear = (new java.util.Date().getTime() - Long.parseLong(request.getParameter("timestamp"))) <= 300*1000;
		
		boolean securityClear = signatureClear && timestampClear;
		if (securityClear) {
				if (request.getParameter("success") != null && request.getParameter("success").equals("true")) {%>
					parent.hostedpagecallback_success('<%=request.getParameter("refId")%>');
			<%	}
				else {%>
					parent.hostedpagecallback_failure(
							<%=request.getParameter("errorCode")!=null ? "'"+request.getParameter("errorCode")+"'" : "''"%>, 
							<%=request.getParameter("errorMessage")!=null ? "'"+request.getParameter("errorMessage")+"'" : "''"%>,
							<%=request.getParameter("errorField_creditCardType")!=null ? "'"+request.getParameter("errorField_creditCardType")+"'" : "''"%>, 
							<%=request.getParameter("errorField_creditCardNumber")!=null ? "'"+request.getParameter("errorField_creditCardNumber")+"'" : "''"%>, 
							<%=request.getParameter("errorField_creditCardExpirationMonth")!=null ? "'"+request.getParameter("errorField_creditCardExpirationMonth")+"'" : "''"%>, 
							<%=request.getParameter("errorField_creditCardExpirationYear")!=null ? "'"+request.getParameter("errorField_creditCardExpirationYear")+"'" : "''"%>, 
							<%=request.getParameter("errorField_cardSecurityCode")!=null ? "'"+request.getParameter("errorField_cardSecurityCode")+"'" : "''"%>, 
							<%=request.getParameter("errorField_creditCardHolderName")!=null ? "'"+request.getParameter("errorField_creditCardHolderName")+"'" : "''"%>
					);
			<%	}
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}

%>
}
</script>

<body onload="callback();"/>
<div align="center">
<br/><br/><br/>
<% if (request.getParameter("success") == null || request.getParameter("success").equalsIgnoreCase("false")) { %>
	<div class='error_message'>
		There was an error while processing your card.
		You will be redirected shortly.
	</div>
<% } else { %>
	<div class='success_message'>
		Credit Card validated.
		You will be redirected shortly.
	</div>
<% } %>
</div>
