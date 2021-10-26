<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login SuccessFull</title>
</head>
<body>
<b>Today:<font color="#FF0000"><%= new java.util.Date() %>
</font></b><br><br>
<a href="index.jsp">Home</a>
<center><h2 style="color:orange;text-align:center">You Are Welcome</h2></center><br><br>
<center><input type=button onClick="location.href='viewEmployeeList'" value='View Employees' autofocus style="color:blue"/>&nbsp;&nbsp;<input type=button onClick="location.href='addEmployeeForm'" value='Add Employee' autofocus autofocus style="color:blue"></center>

</body>
</html>