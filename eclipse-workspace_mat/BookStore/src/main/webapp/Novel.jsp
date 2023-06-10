<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Book Store</title>
</head>
<body>
<center><h1><%= session.getAttribute("Book")%></h1>
<center><h1>Rs.<%= session.getAttribute("price")%></h1>
<h3><a href="Buy.jsp">Buy</a></h3>
</center>

</body>
</html>