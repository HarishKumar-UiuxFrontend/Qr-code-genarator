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
<center><h2>Updated Successfully</h2></center>
<center><% String m = (String) session.getAttribute("name");
out.print("Your Input Updated Mr."+m);
%></center>
<center><a href="LoginHere.jsp">Go to Login</a></center>
</body>
</html>