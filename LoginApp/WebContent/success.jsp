<%@page import="org.audi.loginapp.service.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

<%
//  User user = (User) session.getAttribute("user");
User user = (User) request.getAttribute("user");
%>
<h1>login successfully </h1>
hello <%=user.getUserId() %>
welcome  to <%=user.getUserName() %>
</body>
</html>