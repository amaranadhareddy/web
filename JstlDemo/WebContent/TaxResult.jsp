<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var ="income" value="${param.txtincome}"/>
	<c:choose>
		<c:when test="${income >= 1000000 }">
			<c:set var="result" value="${750000 * 0.1 + (income-750000) * 0.15}"/>
		</c:when>
		<c:when test="${income >= 250000 }">
			<c:set var="result" value="${(income-250000) * 0.1}"/>
		</c:when>
		<c:otherwise>
			<c:set var="result" value="0"/>
		</c:otherwise>
	</c:choose>
	
	<h1 align="center">Tax Result</h1>
	<%@include file="Header.jsp" %>

	<table cellpadding="10" bgcolor="wheat" style="margin: 0 auto">
		<tr>
			<td>Employee Name</td>
			<td>${param.txtname}</td>
		</tr>
		<tr>
			<td>Annual income</td>
			<td>${param.txtincome}</td>
		</tr>
		<tr>
			<td>Tax</td>
			<td>${pageScope.result}</td>
		</tr>
	</table>

</body>
</html>