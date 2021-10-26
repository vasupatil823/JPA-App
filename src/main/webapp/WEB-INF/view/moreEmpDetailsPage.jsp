<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>More Employee Details</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2" align="center">
<tr><th>Id</th><th>Name</th><th>Department</th><th>Salary</th><th>CTC</th><th>Designation</th><th>Address</th><th>Education</th><th>Phone</th><th>Age</th><th>Gender</th></tr>  
<c:forEach var="emp" items="${moreEmployeeDetail}">
<tr>  
   <td>${emp.id}</td>  
   <td>${emp.name}</td>  
   <td>${emp.dept_name}</td>  
   <td>${emp.salary}</td>
   <td>${emp.ctc}</td>  
   <td>${emp.designation}</td>  
   <td>${emp.address}</td>  
   <td>${emp.education}</td>
   <td>${emp.phone}</td>
   <td>${emp.age}</td>
   <td>${emp.gender}</td>
</tr>  
   </c:forEach>  
   </table>  
<a href="/CurdApp/viewEmployeeList">Go Back</a>
</body>
</html>