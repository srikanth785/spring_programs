<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Application</title>
</head>
<body>
	<center>
	<h1 style='color:red;text-align: center;'>Student Registration Application</h1>
		<form method="post">
			<table>
				<tr>
				<th>Student ID</th>
				<td><input type="text" name="sid" ></td>
				</tr>
				
				<tr>
				<th>Student Name</th>
				<td><input type="text" name="sname" ></td>
				</tr>
				
				<tr>
				<th>Student City</th>
				<td><input type="text" name="city" ></td>
				</tr>
				
				<tr>
				<th>Student AvgMarks</th>
				<td><input type="text" name="avgmarks" ></td>
				</tr>
				
				<tr>
				<td><input type="submit" value="register" ></td>
				</tr>
			</table>
	</form>
	</center>
</body>
</html>