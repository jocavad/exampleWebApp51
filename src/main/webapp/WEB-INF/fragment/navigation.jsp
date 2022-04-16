<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


<c:url value="/application/proizvodjac/add" var="proizvAdd"/>
<%-- <c:url value="/application/proizvodjac/edit" var="proizvEdit"/> --%>
<%-- <c:url value="/application/proizvodjac/del" var="proizvDelete"/> --%>
<c:url value="/application/proizvodjac" var="proizvViewAll"/>
<c:url value="/application/mesto" var="mestoViewAll"/>
<c:url value="/application/mesto/add" var="mestoAdd"/>

  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
          	<a class="nav-link active" aria-current="page" href="${proizvAdd}">dodaj proizvodjaca</a>
          </li>
          <li class="nav-item">
          	<a class="nav-link" href="${proizvViewAll}">pregled svih proizvodjaca</a>
          </li>
          <li class="nav-item">
			<a class="nav-link" href="${mestoViewAll}">pregled svih mesta</a>
          </li>
          <li class="nav-item">
			<a class="nav-link" href="${mestoAdd}">dodaj mesto</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>


<!-- <div> -->
<!-- 	<nav> -->
<%-- 		<a href="${proizvAdd}">dodaj proizvodjaca</a> --%>
<%-- <%-- 		<a href="${proizvEdit}">promeni proizvodjaca</a> --%>
<%-- 		<a href="${proizvViewAll}">pregled svih proizvodjaca</a> --%>
<%-- <%-- 		<a href="${proizvEdit}">obrisi proizvodjaca</a> --%>
<%-- 		<a href="${mestoViewAll}">pregled svih mesta</a> --%>
<%-- 		<a href="${mestoAdd}">dodaj mesto</a> --%>
<!-- 	</nav> -->
<!-- </div> -->
