<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
	<span>Employee management</span>
	<c:if test="${sessionScope.semp != null}">
		${sessionScope.semp.empName}
		<a href="Logout">logout</a>
	</c:if>
	
	<c:if test="$(sessionScope.semp == null)">
		<a href="LoginFrm.jsp">login</a>
	</c:if>
</header>