<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.pass{
  color:blue;
}
.fail{
  color:red;

</style>
</head>
<body>

	<c:if test="${param.txtage ge 20 && param.txtage le 22 && (param.txtqual eq 'be' || param.txtqual eq 'btech')}">
		<c:set var="result" value="<span class='pass'>Eligible for Java fresher</span>"/>
	</c:if>
	
	<c:if test="${param.txtage < 20 || param.txtage > 22 || (param.txtqual != 'be' && param.txtqual != 'btech')}">
		<c:set var="result" value="<span class='fail'>Not Eligible for Java fresher</span>"/>
	</c:if>

<h1 align="center">Eligible result</h1>
<%@include file="Header.jsp" %>
	<table cellpadding="10" bgcolor="wheat" style="margin:0 auto">
	<tr>
		<td>Employee Name</td>
		<td>${param.txtname}</td>
	</tr>
	<tr>
		<td>Age</td>
		<td>${param.txtage}</td>
	</tr>
	<tr>
		<td>Qualification</td>
		<td>${param.txtqual}</td>
	</tr>
	
	<tr>
		<td>Eligible/Not Eligible</td>
		<td>${result}</td>
	</tr>
	</table>

</body>
</html>