<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<style>  
.error{color:red}
</style> 
<title>User Registration Page</title>
</head>
<body>
<center><h><b>Please Fill The Below Details To Register</b></h></center><br><br>
<form:form action="register" modelAttribute="register" method="post">
<table align="center">
<tr>
<td>Enter First Name:</td>
<td><form:input path="firstName"/></td>
</tr>
<tr>
<td>Enter last Name:</td>
<td><form:input path="lastName"/></td>
</tr>
<tr>
<td>Enter Email:</td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td>Enter Phone:</td>
<td><form:input path="moNo"/></td>
</tr>
<tr>
<td>Enter Username:</td>
<td><form:input path="username"/>
<form:errors path="username" cssClass="error"/></td>
</tr>
<tr>
<td>Enter Password:</td>
<td><form:password path="password"/>
<form:errors path="password" cssClass="error"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Register"></td>
</tr>
</table>
</form:form>
</body>
</html>