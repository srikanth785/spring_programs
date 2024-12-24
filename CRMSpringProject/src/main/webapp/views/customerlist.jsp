<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Data</title>
<link type="text/css" rel="stylesheet" href="./css/style.css"/>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1>Customer Relationship Management App</h1>
		</div>
	</div>
	
	<div id="container">
	
	<div id="content">
	
	<input type="button" value="Register Customer" onClick="window.location.href='/CRM/showform';return false;" class="add-button"/>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>City</th>
			<th>Update Data</th>
			<th>Delete Data</th>
		</tr>
		<c:forEach var="customer" items="${customers}">
		<c:url var="UpdateLink" value="/updateform">
			<c:param name="customerId" value="${customer.id}"></c:param>
		</c:url>
		<c:url var="DeleteLink" value="/deleteform">
			<c:param name="customerId" value="${customer.id}"></c:param>
		</c:url>
		<tr>
		<td>${customer.firstName}</td>
		<td>${customer.lastName}</td>
		<td>${customer.city}</td>
		<td><a href="${UpdateLink}">Update Data</a></td>
		<td><a href="${DeleteLink}">Delete Data</a></td>
		</tr>
		</c:forEach>
	</table>
	</div>
	</div>
</body>
</html>