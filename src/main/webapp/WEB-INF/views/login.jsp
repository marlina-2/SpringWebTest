<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form:form action="/welcome" method="post" modelAttribute="newUser">
    <form:label path="username">Username</form:label>
    <form:input path="username"/>
    <form:label path="password">Password</form:label>
    <form:input path="password"/>
    <button type="submit">Login</button>
</form:form>

</body>
</html>
