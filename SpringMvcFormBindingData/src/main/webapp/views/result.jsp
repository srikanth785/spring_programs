<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<center>
		<h1 style='color:blue;text-align: center;'>Student Data which just now regitered</h1>
		<h1 style='color:red;text-align: center;'>${student.sid}</h1>
		<h1 style='color:green;text-align: center;'>${student.sname}</h1>
		<h1 style='color:cyan;text-align: center;'>${student.city}</h1>
		<h1 style='color:indigo;text-align: center;'>${student.avgmarks}</h1>
	</center>
</body>
</html>