<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Header.jsp" %>
	<table cellpadding="10" bgcolor="wheat" style="margin:0 auto">
		<tr>
			<td>Boldface</td>
			<td><c:out value="<b>Sapient</b>" escapeXml="false"/></td>
			<td><c:out value="<b>Sapient</b>" escapeXml="true"/></td>
		</tr>
		<tr>
			<td>Italics</td>
			<td><c:out value="<i>Sapient</i>" escapeXml="false"/></td>
			<td><c:out value="<i>Sapient</i>" escapeXml="true"/></td>
		</tr>
		<tr>
			<td>Underline</td>
			<td><c:out value="<u>Sapient</u>" escapeXml="false"/></td>
			<td><c:out value="<u>Sapient</u>" escapeXml="true"/></td>
		</tr>
		<tr>
			<td>SuperScript</td>
			<td><c:out value="a<sup>2</sup>" escapeXml="false"/></td>
			<td><c:out value="a<sup>2</sup>" escapeXml="true"/></td>
		</tr>
		<tr>
			<td>SubScript</td>
			<td><c:out value="b<sub>2</sub>" escapeXml="false"/></td>
			<td><c:out value="b<sub>2</sub>" escapeXml="true"/></td>
		</tr>
		<tr>
			<td>Font</td>
			<td><c:out value="<font color='red' face='arial' size='7'>Sapient</font>" escapeXml="false"/></td>
			<td><c:out value="<font color='red' face='arial' size='7'>Sapient</font>" escapeXml="true"/></td>
		</tr>
	</table>
</body>
</html>