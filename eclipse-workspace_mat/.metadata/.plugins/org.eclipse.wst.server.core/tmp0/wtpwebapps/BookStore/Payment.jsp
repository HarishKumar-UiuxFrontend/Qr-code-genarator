<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center><br><br>
	<h2>Select payment Method for</h2><p>
	<h2><%= session.getAttribute("Book")%></h2>
	</center>
	<center><h4><a style ="color:Green;" href ="Gpay.jsp">Online Payment</a></h4><p></center>
	<center><h4><a style ="color:Green;" href ="Cod.jsp">Cash On Delivery</a></h4><p></center>
	
</body>
</html>