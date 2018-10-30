<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.util.Date" %>  
  
  <%
	Date d = new Date();
	String currdate = d.toString();
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TimeJSP</title>
</head>
<body>

<h1>The Time is <%=currdate %></h1>

</body>
</html>