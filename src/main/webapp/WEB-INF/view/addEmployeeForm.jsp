<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Employee Form</title>
<style>  
.error{color:red}
</style> 
</head>
<body>
<h2><b><center>Employee Registration Form</center></b></h2><br><br>
<form:form action="addEmployee" modelAttribute="employee">
<table align="center">
<tr>
<td>Enter Name:</td>
<td><form:input path="name"/>
<form:errors path="name" cssClass="error"/></td>
</tr>
<tr>
<td>Enter Department Name:</td>
<td><form:input path="dept_name"/>
</tr>
<td>Enter CTC:</td>
<td><form:input path="ctc"/>
</tr>
<tr>
<td>Enter Designation:</td>
<td><form:input path="designation"/></td>
</tr>
<tr>
<td>Enter Address:</td>
<td><form:input path="address"/></td>
</tr>
<tr>
<td>Enter Education:</td>
<td><form:input path="education"/></td>
</tr>
<tr>
<td>Enter Mobile Number:</td>
<td><form:input path="phone"/></td>
</tr>
<tr>
<td>Age:</td>
<td><form:input path="age"/></td>
</tr>
<tr>
<td>Select Gender:</td>   
       <td> Male <form:radiobutton path="gender" value="Male"/> Female <form:radiobutton path="gender" value="Female"/>   
</tr>
<tr>
<td></td>
<td><input type="submit" value="Add"></td>
</tr>
</table>
</form:form>
</body>
</html>