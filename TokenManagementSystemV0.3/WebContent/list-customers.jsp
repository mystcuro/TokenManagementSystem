<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.tm.web.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Token Lists </title>



</head>
<%
	List<Customer> showCustomers = (List<Customer>) request.getAttribute("CUSTOMERS_LIST"); 



%>
<body>
<p> customers </p>
<%= showCustomers %>
</body>
</html>