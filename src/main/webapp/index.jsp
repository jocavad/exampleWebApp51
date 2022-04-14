<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>dobro dosli na nasu demo aplikaciju</h2>

<div>
<c:url value="/application/login" var="urllogin"/>
	<a href="${urllogin}">Prijavi se</a>
</div>

</body>
</html>
