<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<center>
	<h1 style='color:red;text-align: center;'>Customer Registration Form</h1>
		
		<form:form  action="registerCustomer" method="get" modelAttribute="customer">
			<table>
			<form:hidden path="id"/>
				<tr>
				<th>Customer First Name</th>
				<td><form:input path="firstName"/></td>
				</tr>
				
				<tr>
				<th>Customer Last Name</th>
				<td><form:input path="lastName"/></td>
				</tr>
				
				<tr>
				<th>Customer City</th>
				<td><form:input path="city"/></td>
				</tr>
				
				<tr>
				<td><input type="submit" value="register"></td>
				</tr>
			</table>
	</form:form>
	</center>
</body>
</html>