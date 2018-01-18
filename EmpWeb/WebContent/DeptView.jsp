
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="sapient.css" rel="stylesheet">
</head>
<body>
	<header>
		<span>Employee Management</span>
		<hr />
	</header>

	<section>
		<div>
			<form action="viewbydept">
				Choose Department <select name="txtdid">
				
					<c:forEach items="${applicationScope.dlist}" var="d">
						<option value="${d.deptId}">${d.deptName}</option>

					</c:forEach>

				</select> <input type="submit" value="view" />
			</form>

		</div>

	</section>


	<footer>
		<hr />
		&copy;copyrights reserved 2018 &amp; powered by Sapiebnt Technologies<br />
		<a href="Main.jsp;"><img src="images/home.jpg" /></a>
	</footer>
</body>
</html>