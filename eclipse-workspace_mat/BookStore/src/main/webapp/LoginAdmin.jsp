<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
background-color:Pink
}
</style>
</head>
<body>
<br><br>
<br><br>
<center><h1 style="color:Indigo;">Admin Access Area</h1></center>
<form action="ReadAdmin" method="post">
<center><h2 style="color:Blue;">UserId</h2></center>
<center><input type ="text" name=adminId></center><br>
<center><h2 style="color:Blue;">Password</h2></center>
<center><input type ="password" name=password></center><br><br>
<center><input type="submit" value=Login><br><br></center>
</body>
</html>