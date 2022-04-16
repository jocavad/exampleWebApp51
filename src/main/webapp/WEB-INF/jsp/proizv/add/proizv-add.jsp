<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dodavanje proizvodjaca</title>
</head>
<body>
	<div>
	${error}
		<form action="/exampleWebApp51/application/proizvodjac/add-store">
			<label>pib</label>
			<input type="text" name="pib" value="${przv.pib}"/>
			<br>
			<label>maticni broj</label>
			<input type="text" name="matBroj" value="${przv.matBroj}" />
			<br>
			<label>naziv</label>
			<input type="text" name="naziv" value="${przv.naziv}" />
			<br>
			<label>adresa</label>
			<input type="text" name="adresa" value="${przv.adresa}" />
			<br>
			<label>mesto</label>
			<select name="mesto" id="mesto">
				<c:forEach items="${mesta}" var="mes">
    				<option value="${mes.ptt}">${mes.naziv}</option>
    			</c:forEach>
  			</select>
<%-- 			<input type="text" name="mesto" value="${przv.mesto.ptt}" /> --%>
			<br>
			<div>
				<input type="submit" name="action" value="cancel">
			</div>
			<div>
				<input type="submit" name="action" value="add">
			</div>
		</form>
	</div>
</body>
</html>