<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login App</title>

<style type="text/css">
#login-frm {
	background-color: #efefef;
	padding: 20px;
}

.container {
	width: 500px;
	margin-left: auto;
	margin-right: auto;
}

.container table td {
	padding: 10px;
}

#user-data {
	background-color: #A2F587;
	padding: 20px;
	text-align: center;
	text-transform: uppercase;
}
</style>

</head>
<body>
	<div class="container">

		<form:form action="submit" modelAttribute="user" method="post"
			id="login-frm">
			<table>
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" id="fname"></form:input></td>
				</tr>

				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" id="lname"></form:input></td>
				</tr>

				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" id="submit" value="submit" /></td>
				</tr>

			</table>
		</form:form>

		<!-- Outpt -->
		<c:if test="${userData != '' && userData != null}">
			<div id="user-data">${userData}</div>
		</c:if>

	</div>
</body>
</html>
