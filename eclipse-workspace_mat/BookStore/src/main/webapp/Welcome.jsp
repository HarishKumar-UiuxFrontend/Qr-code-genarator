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
	<h1>Welcome</h1>
	<h2><%String m = (String)session.getAttribute("name");
	out.print(m);%></h2><br><br>
	<h2> Welcome to My Book Store</h2>
	<h2>Make the Book as your friend click the Below Link</h2>
	<form action="LoginSuccess.jsp" method="post">
	<input type="submit" value ="Purchase Books">
	</form>
	</center>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<form action="Deactivate.jsp" method="post">
	<input type="submit" value="Deactivate My Account">
	</form>
</body>
</html>