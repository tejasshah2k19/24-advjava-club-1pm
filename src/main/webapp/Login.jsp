<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet" />

<link href="css/style.css" rel="stylesheet" />


</head>
<body>

	<%
	String emailError = (String) request.getAttribute("emailError");
	String passwordError = (String) request.getAttribute("passwordError");
	%>

	<div class="container mt-5">
		<div class="row d-flex justify-content-center">
			<div class="col-md-6">
				<form action="LoginServlet" method="post">

					<div class="card px-5 py-7" id="form1">

						<div class="form-data" v-if="!submitted">
							 
							<div class="mb-4">
								${error}
							</div>
							<div class="forms-inputs mb-4">
								<span>Email or username</span> <input autocomplete="off"
									type="text" name="email">
								<div class="text-danger"><%=emailError == null ? "" : emailError%></div>
							</div>

							<div class="forms-inputs mb-4">
								<span>Password</span> <input autocomplete="off" type="password"
									name="password" />

								<div class="text-danger">
									<%=passwordError != null ? passwordError : ""%>
								</div>
							</div>
							<div class="mb-3">
								<button type="submit" class="btn btn-dark w-100">Login</button>
							</div>
						</div>
						<div class="success-data" v-else>
							<div class="text-center d-flex flex-column">
								<i class='bx bxs-badge-check'></i> <span
									class="text-center fs-1">You have been logged in <br>
									Successfully
								</span>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>


</html>