package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputNameServlet")
public class InputNameServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		// validation

		String error = "";
		boolean isError = false;

		if (firstName == null || firstName.trim().length() == 0) {
			error = "<br>Please Enter FirstName";
			isError = true;
		}
		if (lastName == null || lastName.trim().length() == 0) {
			error = error + "<bR>Please Enter LastName";
			isError = true;
		}

		PrintWriter out = response.getWriter();
		if (isError == true) {
			// error
			//send user's request to InputName.html 
			//go back 
			
			request.setAttribute("error", error);
			RequestDispatcher rd = request.getRequestDispatcher("InputName.jsp");
			rd.forward(request, response);
		} else {
			// success
			out.print("Form submitted");
		}

	}
}
