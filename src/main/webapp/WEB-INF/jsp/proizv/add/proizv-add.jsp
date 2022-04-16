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
	<header>
		<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true" />
		<jsp:include page="/WEB-INF/fragment/navigation.jsp" flush="true" />
	</header>

	<div class="row d-flex justify-content-center">
		${error}
		<div class="col-md-6">
			<form action="/exampleWebApp51/application/proizvodjac/add-store">
				<div class="form-group w-50 text-center">
					<label>pib</label>
					<input class="form-control" type="text"
						name="pib" value="${przv.pib}"/>
				</div>
				<div class="form-group w-50 text-center">
					<label>maticni broj</label>
					<input class="form-control" type="text"
						name="matBroj" value="${przv.matBroj}"/>
				</div>
				<div class="form-group w-50 text-center">
					<label>naziv</label>
					<input class="form-control" type="text"
						name="naziv" value="${przv.naziv}"/>
				</div>
				<div class="form-group w-50 text-center">
					<label>adresa</label>
					<input class="form-control" type="text"
						name="adresa" value="${przv.adresa}"/>
				</div>
				<div class="combobox w-50 text-center">
					<label>mesto</label> 
					<select class="form-control" name="mesto" id="mesto">
						<c:forEach items="${mesta}" var="mes">
							<option value="${mes.ptt}">${mes.naziv}</option>
						</c:forEach>
					</select>
					<%-- 			<input type="text" name="mesto" value="${przv.mesto.ptt}" /> --%>
				</div>
				<div class="d-flex justify-content-left mb-3">
					<div class="p-2 col-example">
						<input type="submit" name="action" value="cancel">
					</div>
					<div class="p-2 col-example">
						<input type="submit" name="action" value="add">
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>