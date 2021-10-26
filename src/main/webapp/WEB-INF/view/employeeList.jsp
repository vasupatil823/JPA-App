<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List OF Employees</title>
<link type="text/css"
            rel="stylesheet"
            href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<h2><center><b>Complete List Of Employees in Company</b></center></h2>
<table border="2" width="70%" cellpadding="2" align="center">
<tr><th>Id</th><th>Name</th><th>Department</th><th>Salary</th><th>Edit</th><th>Delete</th><th>More</th></tr>  
<c:forEach var="emp" items="${employeeList}">
<tr>  
   <td>${emp.id}</td>  
   <td>${emp.name}</td>  
   <td>${emp.dept_name}</td>  
   <td>${emp.salary}</td>  
   <td><a href="editemp/${emp.id}">Edit</a></td>
   <td><a href="delete/${emp.id}" onclick="if (!(confirm('Are You Sure?'))) return false">Delete</a></td>
   <td><a href="getEmpDetails/${emp.id}">Get More Details</a></td>
   </tr>  
   </c:forEach>  
   </table>  
   <br/> 
   <a href="addEmployeeForm">Add New Employee</a><br><br>
   <a href="index.jsp">Home</a>
   <%-- <a href="${pageContext.request.contextPath}/viewEmployeeList/1">1</a>     
   <a href="${pageContext.request.contextPath}/viewEmployeeList/2">2</a>     
   <a href="${pageContext.request.contextPath}/viewEmployeeList/3">3</a> --%>    
</body>
</html>