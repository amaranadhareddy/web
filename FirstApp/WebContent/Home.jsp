<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
    a{
		background-color:blue;
		color:white;
		text-decoration:none;
		padding:5px;
		border-radius:5px;
		box-shadow:5px 5px 5px grey;
	}
	a:hover{
		background-color:yellow;
		color:black;
		text-decoration:underline;
	}
</style>
</head>
<body>
<h1 align="center">Home Page</h1>
<div align="center">
	<%=application.getInitParameter("headstr") %><br/>
</div>
<hr/>
<table cellpadding="10" style="margin:0 auto">
	<tr>
		<td><a href="TaxFrm.jsp">Tax Calculation</a></td>
	</tr>
	<tr>
		<td><a href="SkillFrm.jsp">Update profile</a></td>
	</tr>
	<tr>
		<td><a href="QuizFrm.jsp">Play quiz</a></td>
	</tr>
	<tr>
		<td><a href="EligibleFrm.jsp">Eligible for JAVA developer</a></td>
	</tr>
</table>
</body>
</html>