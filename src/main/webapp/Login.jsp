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
	String emailError = (String) request.getAttribute("emailError");
	String passwordError = (String) request.getAttribute("passwordError");
	%>


	<h2>Login</h2>

	<form action="LoginServlet" method="post">
		Email :<input type="text" name="email" />
		<%=emailError == null ? "" : emailError%>
		<br> <br> Password : <input type="text" name="password" />
		<%=passwordError != null ? passwordError : ""%>
		<br> <br> <input type="submit" value="Login" />
	</form>
	<br>
	<br>
	<a href="Signup.jsp">Signup</a>
	<br>
	
	${error}
</body>
</html>