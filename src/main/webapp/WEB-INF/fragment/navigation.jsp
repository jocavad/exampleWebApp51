<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:url value="/application/proizvodjac/add" var="proizvAdd"/>
<%-- <c:url value="/application/proizvodjac/edit" var="proizvEdit"/> --%>
<%-- <c:url value="/application/proizvodjac/del" var="proizvDelete"/> --%>
<c:url value="/application/proizvodjac" var="proizvViewAll"/>
<c:url value="/application/mesto" var="mestoViewAll"/>
<c:url value="/application/mesto/add" var="mestoAdd"/>

<div>
	<nav>
		<a href="${proizvAdd}">dodaj proizvodjaca</a>
<%-- 		<a href="${proizvEdit}">promeni proizvodjaca</a> --%>
		<a href="${proizvViewAll}">pregled svih proizvodjaca</a>
<%-- 		<a href="${proizvEdit}">obrisi proizvodjaca</a> --%>
		<a href="${mestoViewAll}">pregled svih mesta</a>
		<a href="${mestoAdd}">dodaj mesto</a>
	</nav>
</div>
