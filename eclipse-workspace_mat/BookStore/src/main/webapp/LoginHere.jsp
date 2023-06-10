<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Store</title>
<style>
body {
background-color:pink
}
</style>
</head>
<body>
<br><br>
<center><h1 style="color:Indigo;">My Book Store</h1></center>
<form action="ReadPage" method="post">
<center><h2 style="color:Blue;">Name</h2></center>
<center><input type ="text" name="name"></center><br>
<center><h2 style="color:Blue;">Password</h2></center>
<center><input type ="password" name="password"></center><br><br>
<center><input type="submit" value=Login><br><br></center>
<center><h3><a style ="color:Green;" href ="Register.jsp">New Registration</a></h3><p></center>
<center><h3><a style ="color:Tomato;" href ="Invalid.jsp">Forget Password ?</a></h3><p></center>
<br><br><br><br><br><br><br>
<h2><a style ="color:Black;" href ="LoginAdmin.jsp">Admin Login</a></h2>
</form>
</body>
</html>