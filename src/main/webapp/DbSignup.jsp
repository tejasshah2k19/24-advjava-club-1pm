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
	String firstNameError = (String) request.getAttribute("firstNameError");
	%>
	<form action="DbSignupServlet" method="post">

		FirstName : <input type="text" name="firstName" />
		<%=firstNameError==null?"":firstNameError %>
		<br>
		<br> Email :<input type="text" name="email" /><br>
		<br> Password : <input type="text" name="password" /><br>
		<br> <input type="submit" value="Signup" />
	</form>
	<br><Br>
		<a href="Login.jsp">Login</a>
	
</body>
</html>


