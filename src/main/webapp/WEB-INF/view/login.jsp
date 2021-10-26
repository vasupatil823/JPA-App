<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h><center><b>Please Login Here</b></center></h><br><br>
<form:form action="login" modelAttribute="login" method="POST">
<table align="center">
<tr>
<td>Username:</td>
<td><form:input path="username"/></td>
</tr>
<tr>
<td>Password:</td>
<td><form:password path="password"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Login"></td>
</tr>
</table>
</form:form>
</body>
</html>