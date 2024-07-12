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
	String error = (String)request.getAttribute("error");
	%>

	<form action="InputNameServlet" method="post">

		FirstName : <input type="text" name="firstName" /><br> <br>
		LastName : <input type="text" name="lastName" /><br> <Br> <input
			type="submit" value="Add Name" />


	</form>
	<%=error %>
</body>
</html>