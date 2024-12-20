<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Application</title>
</head>
<body>
	<center>
	<h1 style='color:red;text-align: center;'>Student Registration Application</h1>
		<form:form method="post" modelAttribute="s">
			<table>
				<tr>
				<th>Student ID</th>
				<td><form:input path="sid"/></td>
				</tr>
				
				<tr>
				<th>Student Name</th>
				<td><form:input path="sname"/></td>
				</tr>
				
				<tr>
				<th>Student City</th>
				<td><form:input path="city"/></td>
				</tr>
				
				<tr>
				<th>Student AvgMarks</th>
				<td><form:input path="avgmarks"/></td>
				</tr>
				
				<tr>
				<td><input type="submit" value="register"></td>
				</tr>
			</table>
	</form:form>
	</center>
</body>
</html>