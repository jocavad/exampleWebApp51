<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>svi proizvodjaci</title>
</head>
<body>
<header>
	<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true"/>
	<jsp:include page="/WEB-INF/fragment/navigation.jsp" flush="true"/>
</header>
	<div>
		<table>
			<thead>
				<tr>
					<th>pib</th>
					<th>naziv</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${proizvodjaci}" var="przv">
					<tr>
						<th>${przv.pib}</th>
						<th>${przv.naziv}</th>
						<th><c:url var="urlview" value="/application/proizvodjac/view">
								<c:param name="pib" value="${przv.pib}"/>
							</c:url> <a href="${urlview }">pregled proizvodjaca</a></th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>