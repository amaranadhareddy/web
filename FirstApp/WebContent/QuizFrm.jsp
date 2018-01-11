<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Play Java Quiz</h1>
	<div align="center">
	<%=application.getInitParameter("headstr") %><br/>
	<a href="<%=application.getInitParameter("homepg") %>">Home</a>
</div>
	<hr />
	<form action="quiz" method="post">
		<div style="width: 40%; background-color: aqua; margin: 0 auto;">
			1.size of int type<br />
			 <input type="radio" name="ques1" value="1">1<br />
			 <input type="radio" name="ques1" value="2">2<br />
			 <input type="radio" name="ques1" value="4">4<br />
			<hr />

			2.size of byte type<br />
			 <input type="radio" name="ques2" value="1">1<br />
			 <input type="radio" name="ques2" value="2">2<br /> 
			 <input type="radio" name="ques2" value="4">4<br />
			<hr />
			
			3.which collection allow duplicates<br /> 
			 <input type="radio" name="ques3" value="list">list<br />
			 <input type="radio" name="ques3" value="set">set<br /> 
			 <input type="radio" name="ques3" value="map">map<br />
			<hr />
			
		    4.which collection allow unique elements<br /> 
			 <input type="radio" name="ques4" value="map">map<br />
			 <input type="radio" name="ques4" value="set">set<br /> 
			 <input type="radio" name="ques4" value="array">array<br />
			<hr />
			<input type="submit" value="finish"/>

		</div>
	</form>
</body>
</html>