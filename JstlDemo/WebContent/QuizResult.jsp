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
	<c:set var="score" value="0"/>
	<c:set var="result" value="fail"/>
	<c:if test="${param.ques1 eq '4'}">
		<c:set var="score" value="${score+1}"/>
	</c:if>
	<c:if test="${param.ques1 eq '1'}">
		<c:set var="score" value="${score+1}"/>
	</c:if>
	<c:if test="${param.ques1 eq 'list'}">
		<c:set var="score" value="${score+1}"/>
	</c:if>
	<c:if test="${param.ques1 eq 'set'}">
		<c:set var="score" value="${score+1}"/>
	</c:if>
	<c:set var="per" value="${score /4.0 *100 }"/>

<h1 align="center">Quiz Result</h1>
<div align="center">
	${initParam.headstr}<br/>
	<a href="${initParam.homepg}">Home</a>
</div>
<hr/>
	<table cellpadding="10" bgcolor="wheat" style="margin:0 auto">
	<tr>
		<td>No of questions answered correct</td>
		<td>${score}</td>
	</tr>
	<tr>
		<td>Percentage</td>
		<td>${per}
		<span style="font-weight: bold;">%</span></td>
	</tr>
	<tr>
		<td>Result</td>
		<td>
		<c:choose>
			<c:when test="${per >=75}">
				<span class="pass">pass</span>
			</c:when>
			<c:otherwise>
				<span class="fail">fail</span>
			</c:otherwise>
		</c:choose>
		</td>
	</tr>
	</table>
</body>
</html>