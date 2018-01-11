<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Are u eligible for java fresher</h1>
<div align="center">
	<%=application.getInitParameter("headstr") %><br/>
	<a href="<%=application.getInitParameter("homepg") %>">Home</a>
</div>
<form action="eligible">
	<table cellpadding="10" bgcolor="wheat" style="margin:0 auto">
	<tr>
		<td>Employee Name</td>
		<td><input type="text" name="txtname"/></td>
	</tr>
	<tr>
		<td>Age</td>
		<td><input type="text" name="txtage"/></td>
	</tr>
	<tr>
		<td>Qualification</td>
		<td>
			<select name="txtqual">
				<option value="bca">bca</option>
				<option value="mca">mca</option>
				<option value="bsc">bsc</option>
				<option value="be">be</option>
				<option value="btech">btech</option>
				<option value="pg">pg</option>
			</select>
		</td>
	</tr>
	
	<tr>
		<td colspan="2" align="center">
		<input type="submit" value="submit" name="check eligible"/>
		</td>
		
	</tr>
	</table>
</form>
</body>
</html>