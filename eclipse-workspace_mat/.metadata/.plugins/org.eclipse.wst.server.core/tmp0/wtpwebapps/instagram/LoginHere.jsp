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
<script>
function validate(){
	var name=document.f.name.value;
	var password=document.f.password.value;
	if(name=="" || name=="null"){
		alert("Please fill the Name")
		return false;
	}
	else if(name.length<2 || name.length>50) {
		alert("Name must between 2 to 30")
		return false;
	}
	else if(password.length<2 || password.length>50) {
		alert("Name must between 2 to 30")
		return false;
	}
	else if(password=="" || password=="null"){
		alert("please fill the password");
		return false;
	}
	else {
		return true;
	}
}
</script>
</head>
<body>
	<br>
<br>
<br>
<center><h1 style="color:Indigo;">INSTAGRAM</h1></center>
<form name="f" action="ReadPage" method="post" onsubmit="return validate()">
<center><h2 style="color:Blue;">Name</h2></center>
<center><input id="name" type ="text" name="name"><span id="sp"></span></center><br>

<center><h2 style="color:Blue;">Password</h2></center>
<center><input type ="password" name="password"></center><br><br>
<center><input type="submit" value=Login><br><br></center>
<center><h3><a style ="color:Green;" href ="Register.jsp">New Registration</a></h3><p></center>
<center><h3><a style ="color:Tomato;" href ="Invalid.jsp">Forget Password ?</a></h3><p></center>
<center><h3><a style ="color:Red;" href ="Deactivate.jsp">Deactivate Account</a></h3></center>
</form>
</body>
</html>



