<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h3>Message : ${message}</h3>	
	<h3>Logged In User : ${username}</h3>	
	<h3>Roles : ${role}</h3>
	<a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
	
</body>
</html>