<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First J2EE App</title>
</head>
<body>
	${errormessage}
	<h3>Welcome to J2EE Application</h3>
	<form action="LoginController" method="post">
		Email : <input Type="Email" name="Email" /> <br>
		<br> Password : <input Type="Password" name="Password" /> <br>
		<input type="submit" value="Login" />

	</form>
</body>
</html>