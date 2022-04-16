<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<c:url value="/application/logout" var="urllogout"></c:url>
<div class="container-l bg-light vh-50">
	<div class="d-flex justify-content-between bg-light mb-3">
		<div class="p-2 col-example">prijavljeni ste kao: ${loginUser.username}</div>
		<div class="p-2 col-example"><a href="${urllogout}">odjavite se</a></div>
	</div>
<!-- <!-- sa session scope varijablom -->
<%-- 	prijavljeni ster kao: ${sessionScope.loginUser.username} --%>

</div>
