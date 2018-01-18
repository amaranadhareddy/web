<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="sapient.css" rel="stylesheet">
</head>
<body>
<%@include file="Header.jsp" %>
<section>
<h2>Login Form</h2>
<div>
<%--Include additional code for login validation --%>
	<fieldset>
		<pre>
			User Id<input type="text" name="txtid"/>
			Password<input type="password" name="txtpass"/>
				<input type="submit" value="login"/>
		</pre> 
	</fieldset>
</div>
</section>
<%@include file="Footer.jsp" %>
</body>
</html>