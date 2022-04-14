<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:url value="/application/city/add" var="cityAdd"/>
<c:url value="/application/city" var="cities"/>

<c:url value="/application/company/add" var="companyAdd"/>
<c:url value="/application/company" var="companies"/>


<div>
	<nav>
		<a href="${cityAdd}">add city</a>
		<a href="${cities}">view cities</a>
		
		<a href="${companyAdd}">add company</a>
		<a href="${companies}">view companies</a>
	</nav>
</div>
