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
	
	<a href="Login.jsp">Login</a>

	<table border="1">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<%for(int i=0;i<users.size();i++){ %>
			<tr>
				<td><%=users.get(i).getFirstName() %></td>
				<td><%=users.get(i).getEmail() %></td>
				<td><%=users.get(i).getPassword() %></td>
			</tr>
		<%} %>
	
	</table>


</body>
</html>