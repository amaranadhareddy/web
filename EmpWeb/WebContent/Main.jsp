<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="sapient.css" rel="stylesheet">
</head>
<body>
<%@include file="Header.jsp" %>
<c:if test="${sessionScope.semp == null}">
	<jsp:forward page="LoginFrm.jsp">
		<jsp:param value="please login" name="login"/>
	</jsp:forward>

</c:if>
<section id="home">
	<h2>Home Page</h2>
	<h3>${msg}</h3>
	<div>
		<nav>
		<table>
			<tr>
				<td><a href="viewall">View All Employees</a></td>
				<td><a href="DeptView.jsp">View Department</a></td>
			</tr>
			<tr>
				<td><a href="addEmpFrm.jsp">Add Employee</a></td>
			</tr>
		</table>
		</nav>
	</div>
</section>

<%@include file="Footer.jsp" %>
</body>
</html>