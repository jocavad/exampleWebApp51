<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>proizvodjac</title>
</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true" />
		<jsp:include page="/WEB-INF/fragment/navigation.jsp" flush="true" />
	</header>
	<div class="row d-flex justify-content-center">
		<div class="col-md-6">
		<form action="/exampleWebApp51/application/proizvodjac/edit">
			<div class="form-group w-50 text-center">
			<label>pib</label>
			<input class="form-control" type="text" name="pib" value="${przv.pib}" readonly="readonly" />
			</div>
			<div class="form-group w-50 text-center">
			<label>maticni broj</label>
			<input class="form-control" type="text" name="matBroj" value="${przv.matBroj}" readonly="readonly" />
			</div>
			<div class="form-group w-50 text-center">
			<label>naziv</label>
			<input class="form-control" type="text" name="naziv" value="${przv.naziv}" readonly="readonly" />
			</div>
			<div class="form-group w-50 text-center">
			<label>adresa</label>
			<input class="form-control" type="text" name="adresa" value="${przv.adresa}" readonly="readonly" />
			</div>
			<div class="form-group w-50 text-center">
			<label>mesto</label>
			<input class="form-control" type="text" name="mesto" value="${przv.mesto.naziv}" readonly="readonly" />
			</div>
			<div class="d-flex justify-content-left mb-3">
			<div class="p-2 col-example">
				<input type="submit" name="action" value="cancel">
			</div>
			<div class="p-2 col-example">
				<input type="submit" name="action" value="edit">
			</div>
			</div>
		</form>
		</div>
	</div>
</body>
</html>