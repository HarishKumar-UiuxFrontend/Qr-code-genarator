<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Instagram</title>
<style>
body {
	background-color: pink
}
</style>
</head>
<body>
<center><h2 style="color:Green;">Registration Success</h2></center>
<center><% String m = (String) session.getAttribute("name");
out.print("Welcome Mr."+m);
%></center>
<center><a href="LoginHere.jsp">Login</a></center>
</body>
</html>