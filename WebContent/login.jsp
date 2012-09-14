<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<%@ page import="com.zuora.zilla.dispatcher.DefaultLogin" %>
<%@ page import="com.zuora.zilla.model.*" %>
</head>


<body>
<%
	String username = request.getParameter("username");
	String passwd = request.getParameter("passwd");

	ResultUserLogin ures = DefaultLogin.login(username, passwd);
	if(ures.isSuccess()){
		session.setAttribute("username", ures.getUserName());
		response.sendRedirect("./account_view.html");
	} else {
		out.print(ures.getError());
	}

%>
</body>
</html>