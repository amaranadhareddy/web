<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:import url="Header.jsp"/>
<c:set var="data" value="456789.34678"/>
<jsp:useBean id="dt" class="java.util.Date"/>
<c:set var="name" value="akbar"/>
<table cellpadding="10" cellspacing="0" border="1" style="margin: 0 auto">
		<tr>
			<td>Format Number</td>
			<td><fmt:formatNumber value="${data}" minFractionDigits="2" maxFractionDigits="2"/></td>
			<td><fmt:formatNumber value="${data}" pattern="##,###.##" /></td>
		</tr>
		<tr>
			<td>Format date</td>
			<td><fmt:formatDate value="${dt}" pattern="dd-MMM-yyyy"/></td>
			<td><fmt:formatDate value="${dt}" pattern="dd-MM-yyyy"/></td>
		</tr>
		<tr>
			<td>UpperCase</td>
			<td>${name }</td>
			<td>${fn:toUpperCase(name)}</td>
		</tr>
		<tr>
			<td>Lowercase</td>
			<td>${name }</td>
			<td>${fn:toLowerCase(name)}</td>
		</tr>
		<tr>
			<td>length</td>
			<td>${name }</td>
			<td>${fn:length(name)}</td>
		</tr>
		<tr>
			<td>length</td>
			<td>${name }</td>
			<td>${fn:substring(name, 1, 3)}</td>
		</tr>
		<tr>
			<td>First alphabet is Caps</td>
			<td>${name }</td>
			<td>${fn:toUpperCase(fn:substring(name, 0,1))}${fn:substring(name,1,fn:length(name))} </td>
		</tr>
	</table>


<c:import url="Footer.jsp"/>
</body>
</html>







