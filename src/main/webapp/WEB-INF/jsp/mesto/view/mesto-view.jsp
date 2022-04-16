<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pregled svih mesta</title>
</head>
<body>
<header>
	<jsp:include page="/WEB-INF/fragment/login-user.jsp" flush="true"/>
	<jsp:include page="/WEB-INF/fragment/navigation.jsp" flush="true"/>
</header>
	<div class="row justify-content-center">
		<div class="col-auto">
		<table border="1">
			<thead>
				<tr>
					<th>ptt</th>
					<th>naziv</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${mesta}" var="mes">
					<tr>
						<th>${mes.ptt}</th>
						<th>${mes.naziv}</th>
						<th><c:url var="urlview" value="/application/mesto/edit">
								<c:param name="ptt" value="${mes.ptt}"/>
							</c:url> <a href="${urlview}">izmena</a>
						</th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
</body>
</html>