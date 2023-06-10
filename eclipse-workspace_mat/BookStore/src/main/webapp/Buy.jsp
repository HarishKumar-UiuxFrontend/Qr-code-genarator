<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>This Below Books are in your cart list</h2>
		<h1><%=session.getAttribute("Book")%></h1>
		<h1>Rs.<%=session.getAttribute("price")%></h1>
		<h3>
			<a href="Payment.jsp">Make Payment</a>
		</h3>
	</center>
</body>
</html>