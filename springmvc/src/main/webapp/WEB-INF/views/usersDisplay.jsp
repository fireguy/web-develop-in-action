<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Spring MVC</title>
</head>

<body>
<h2>All Users in System</h2>

<table border="1">
    <tr>
        <th>Name</th>
        <th>Type</th>
        <th>UserId</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.userName}</td>
            <td>${user.userType}</td>
            <td>${user.userId}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>