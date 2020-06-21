<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users List</title>
</head>
<body>
<h2>Users List</h2>

<c:forEach var="user" items="${requestScope.userList}">
	<p>${user.name} : ${user.age}</p>
</c:forEach>
</body>
</html>