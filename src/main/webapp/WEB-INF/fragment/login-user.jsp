<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<c:url value="/application/logout" var="urllogout"></c:url>
<div>
	
	prijavljeni ster kao: ${loginUser.username}, <a href="${urllogout}">odjavite se</a>
	<br/>
<!-- <!-- sa session scope varijablom -->
	prijavljeni ster kao: ${sessionScope.loginUser.username}

</div>
