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

	<form action="CalculateAgeServlet" method="post">

		BirthYear : <input type="text" name="birthYear" /><%=error==null?"":error %>
		
		<br>
		<br> <input type="submit" value="Calculage Age" />
	</form>
</body>
</html>