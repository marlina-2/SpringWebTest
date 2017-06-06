<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ann
  Date: 30.05.17
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>


<form:form action="/registration" method="post" modelAttribute="newUser">
        <form:label path="username">Username</form:label>
        <form:input path="username"/>
        <form:label path="email">Email</form:label>
        <form:input path="email"/>
        <form:label path="password">Password</form:label>
        <form:input path="password"/>
        <button type="submit">Registration</button>
</form:form>
</body>
</html>
