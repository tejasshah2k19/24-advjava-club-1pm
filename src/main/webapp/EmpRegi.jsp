<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EmpRegiServlet" method="post">
	EmpName: <input type="text" name="empName"/>${empNameError }<br><Br> 
	Department: <input type="text" name="department"/>${departmentError}<br><Br>  
	Salary : <input type="text" name="salary"/>${salaryError }<br><Br> 
	<input type="submit" value="Add Emp"/>
</form>
</body>
</html>