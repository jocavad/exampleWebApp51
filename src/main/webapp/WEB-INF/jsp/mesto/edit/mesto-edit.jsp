<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>promena mesta</title>
</head>
<body>
	<div>
	${error}
		<form action="/exampleWebApp51/application/mesto/edit-store">
			<label>ptt</label>
			<input type="text" name="ptt" value="${mes.ptt}" readonly="readonly" />
			<br>
			<label>naziv</label>
			<input type="text" name="naziv" value="${mes.naziv}" />
			<br>
			<div>
				<input type="submit" name="action" value="cancel">
			</div>
			<div>
				<input type="submit" name="action" value="edit">
			</div>
		</form>
	</div>
</body>
</html>