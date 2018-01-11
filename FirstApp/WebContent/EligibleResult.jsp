<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Eligible result</h1>
<div align="center">
	<%=application.getInitParameter("headstr") %><br/>
	<a href="<%=application.getInitParameter("homepg") %>">Home</a>
</div>
<hr/>
	<table cellpadding="10" bgcolor="wheat" style="margin:0 auto">
	<tr>
		<td>Employee Name</td>
		<td><%=request.getParameter("txtname") %></td>
	</tr>
	<tr>
		<td>Age</td>
		<td><%=request.getParameter("txtage") %></td>
	</tr>
	<tr>
		<td>Qualification</td>
		<td><%=request.getParameter("txtqual") %></td>
	</tr>
	
	<tr>
		<td>Eligible/Not Eligible</td>
		<td><%=request.getAttribute("result") %></td>
	</tr>
	</table>

</body>
</html>