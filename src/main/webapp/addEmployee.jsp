<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Add New Employee</h1>
<form action="addEmployee" method="post">
Name: <input type="text" name="name"> <br> <br>
Age: <input type="number" name="age"> <br> <br>
Email: <input type="email" name="email"> <br> <br>
Phone Number: <input type="number" name="phoneNumber"> <br> <br>
Salary: <input type="number" name="salary"> <br> <br>
<input type="submit" value="Add"> 
</form>

</body>
</html>