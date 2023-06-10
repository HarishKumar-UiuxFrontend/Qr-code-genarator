<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<style>
body {
background-color:#f5d1d0
}
</style>
</head>
<body>
<br>
<br>
<br>
<center><h1 style="color:Blue;">Student Credentials</h1></center>
<form action="ReadPage" method="post">
<center><h4 style="color:Blue;">Enter the RollNo</h4></center>
<center><input type="text" name=rollNo><br></center>
<center><h4 style="color:Blue;">Enter the Name</h4></center>
<center><input type="password " name=name><br><br></center>
<center><input type="submit" value=Login><br><br></center>
<center><a style="color:MediumSeaGreen;" href="Register.jsp">New Registration</a><p></center>
<center><a style="color:Red;" href="Invalid.jsp">forget Password ?</a></center>
</form>
</body>
</html>