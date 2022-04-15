<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>brisanje proizvodjaca</title>
</head>
<body>
	<div>
		<form action="/exampleWebApp51/application/proizvodjac/del-store">
			<label>pib</label>
			<input type="text" name="pib" value="${przv.pib}" readonly="readonly" />
			<br>
			<label>maticni broj</label>
			<input type="text" name="matBroj" value="${przv.matBroj}" readonly="readonly" />
			<br>
			<label>naziv</label>
			<input type="text" name="naziv" value="${przv.naziv}" readonly="readonly"/>
			<br>
			<label>adresa</label>
			<input type="text" name="adresa" value="${przv.adresa}" readonly="readonly"/>
			<br>
			<label>mesto</label>
			<input type="text" name="mesto" value="${przv.mesto.ptt}" readonly="readonly"/>
			<br>
			<div>
				<input type="submit" name="action" value="cancel">
			</div>
			<div>
				<input type="submit" name="action" value="delete">
			</div>
		</form>
	</div>
</body>
</html>