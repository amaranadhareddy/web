<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="quiz.css" rel="stylesheet">
</head>
<body>
	<%@include file="Header.jsp"%>
	<section>
	<div>
		<h3>You have answered ${score} answers right</h3>
		<h3>and your percentage is ${score/applicationScope.size *100}%</h3>

		<table>
			<tr>
				<th>Q.no</th>
				<th>Question</th>
				<th>Correct Answer</th>
				<th>Your Answer</th>
			</tr>
			<tbody>
				<c:forEach items="${requestScope.queslist}" var="q" varStatus="i">
					<tr>
						<td>${i.count}</td>
						<td>${q.qdesc}</td>
						<td>${q.answer}</td>
						
						<td><c:if test="${requestScope.ansmap[q.qid].answer eq q.answer}">
								<span style="color:blue;">${requestScope.ansmap[q.qid].answer}</span>
							</c:if>
							<c:if test="${requestScope.ansmap[q.qid].answer ne q.answer}">
								<span style="color:red;">${requestScope.ansmap[q.qid].answer}</span>
							</c:if>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	</section>
	<%@include file="Footer.jsp"%>
</body>
</html>