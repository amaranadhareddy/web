<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Tax Calculation</h1>
<div align="center">
	${initParam.headstr}<br/>
	<a href="${initParam.homepg}">Home</a>
</div>
<form action="TaxResult.jsp">
	<table cellpadding="10" bgcolor="wheat" style="margin:0 auto">
	<tr>
		<td>Employee Name</td>
		<td><input type="text" name="txtname"/></td>
	</tr>
	<tr>
		<td>Annual income</td>
		<td><input type="text" name="txtincome"/></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="submit" value="submit" name="cal tax"/>
		</td>
		
	</tr>
	</table>
</form>
</body>
</html>