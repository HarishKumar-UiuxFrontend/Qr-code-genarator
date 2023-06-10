<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1 style="color:Indigo;">Register Here</h1></center>
<form action ="InsertPage" method="post">
<center><h3>Enter User ID</h3></center>
<center><input type="text" name=userId><br></center>
<center><h3>Enter Strong Password</h3></center>
<center><input type="text" name=password><br></center>
<center><h3>Enter Your Name</h3></center>
<center><input type="text" name=name><br></center>
<center><h3>Enter your Gender</h3></center>
<center><input type="radio" name="gender" value="male"> Male</center>
<center><input type="radio" name="gender" value="female"> Female</center>
<br>
<br>
<center><input type="submit" value=Register><br></center>
</body>
</html>