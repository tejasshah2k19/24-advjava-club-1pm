package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculateAgeServlet")
public class CalculateAgeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String birthYearStr = request.getParameter("birthYear");

		// validation
		if (birthYearStr == null || birthYearStr.trim().length() == 0) {

			// send error to jsp
			request.setAttribute("error", "Please Enter BirthYear");
			// go back
			RequestDispatcher rd = request.getRequestDispatcher("InputBirthYear.jsp");
			rd.forward(request, response);
		} else {
			int currentYear = 2024;
			int birthYear = Integer.parseInt(birthYearStr);
			int age  = currentYear - birthYear;
			request.setAttribute("age", age);
			RequestDispatcher rd = request.getRequestDispatcher("AgeResult.jsp");
			rd.forward(request, response);
		}
	}
	
	
}

