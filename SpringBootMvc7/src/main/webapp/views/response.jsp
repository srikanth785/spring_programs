<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<center>
		<h1 style='color:red; text-align: center'>Displaying Data from Array</h1>
		<b>Books Name</b>
			<c:forEach var="books" items="${books}">
				${books}
			</c:forEach>
	</center>
</body>
</html>