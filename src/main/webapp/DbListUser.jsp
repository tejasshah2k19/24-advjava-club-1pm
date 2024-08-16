<%@page import="com.google.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<UserBean> users = (ArrayList<UserBean>) request.getAttribute("users");
	%>


	<a href="DbSignup.jsp">Add New</a>
	<br>
	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Action</th>
		</tr>

		<%
		for (UserBean user : users) {
	
			out.print("<tr>");
			out.print("<td>"+user.getUserId()+"</td>");
			out.print("<td>"+user.getFirstName()+"</td>");
			out.print("<td>"+user.getEmail()+"</td>");
			out.print("<td><a href='DbDeleteUserController?userId="+user.getUserId()+"'>Delete</a>");
			out.print(" | <a href='DbViewUserController?userId="+user.getUserId()+"'>View</a></td>");
			out.print("</tr>");
			
			
		}
		%>


	</table>

</body>
</html>