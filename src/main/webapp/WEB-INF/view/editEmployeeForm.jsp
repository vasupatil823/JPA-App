<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee Form</title>
</head>
<body>
<h><b><center>Edit the Employee details Here</center></b></h>
<form:form action="/CurdApp/editEmployee" modelAttribute="employee">
<table>
<tr>
<td></td>
<td><form:hidden path="id"/></td>
</tr>
<tr>
<td>Name:</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Designation</td>
<td><form:input path="designation"/></td>
</tr>
<tr>
<td>Salary:</td>
<td><form:input path="salary"/></td>
</tr>
<tr>
<td><input type="submit" value="Update"></td>
</tr>
</table>
</form:form>
</body>
</html>