

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Update your skills</h1>
	<%@include file="Header.jsp" %>
	<form action="SkillResult.jsp">
		<table cellpadding="10" bgcolor="wheat" style="margin: 0 auto">
			<tr>
				<td>Name</td>
				<td><input type="text" name="txtname"/></td>
			</tr>
			<tr>
				<td>team</td>
				<td><input type="radio" name="team" value="gm"/>gm
					<input type="radio" name="team" value="nitro"/>nitro
					<input type="radio" name="team" value="razorfish"/>razorfish
				</td>
			</tr>
			<tr>
				<td>skills</td>
				<td><input type="checkbox" name="chkskills" value="java"/>java<br/>
				<input type="checkbox" name="chkskills" value="jee"/>jee<br/>
				<input type="checkbox" name="chkskills" value="spring"/>spring<br/>
				<input type="checkbox" name="chkskills" value="hibernate"/>hibernate<br/>
				<input type="checkbox" name="chkskills" value="angular"/>angular<br/>
				<input type="checkbox" name="chkskills" value="react"/>react<br/>
				<input type="checkbox" name="chkskills" value="mockito"/>mockito<br/>
				
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="submit"/>
			     </td>
				
			</tr>
		</table>
		
		
	</form>


</body>
</html>