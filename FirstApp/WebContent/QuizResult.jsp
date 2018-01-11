<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Quiz Result</h1>
<div align="center">
	<%=application.getInitParameter("headstr") %><br/>
	<a href="<%=application.getInitParameter("homepg") %>">Home</a>
</div>
<hr/>
	<table cellpadding="10" bgcolor="wheat" style="margin:0 auto">
	<tr>
		<td>No of questions answered correct</td>
		<td><%=request.getAttribute("score") %></td>
	</tr>
	<tr>
		<td>Percentage</td>
		<td><%=request.getAttribute("per") %>
		<span style="font-weight: bold;">%</span></td>
	</tr>
	<tr>
		<td>Result</td>
		<td><%=request.getAttribute("result") %></td>
	</tr>
	</table>
</body>
</html>