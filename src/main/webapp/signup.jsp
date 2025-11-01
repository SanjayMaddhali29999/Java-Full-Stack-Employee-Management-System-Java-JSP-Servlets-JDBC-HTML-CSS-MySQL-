<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Signup</h1>
<form action="signup" method="post">
	<label for="email">Email : </label>
	<input type="email" name="email" placeholder="Enter email"><br><br>
	<label for="password">Password : </label>
	<input type="text" name="password" placeholder="Enter Password"><br><br>
	<label for="confirm-password">Confirm Password : </label>
	<input type="password" name="confirm-password" placeholder="Enter Password again"><br><br>
	<input type="submit" value="Signup">
</form>
<p>Are you an existing user? <a href="index.html">Login</a></p>
</body>
</html>