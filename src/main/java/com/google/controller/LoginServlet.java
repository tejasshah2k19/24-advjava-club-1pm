package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.bean.UserBean;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false;

		if (email == null || email.trim().length() == 0) {
			request.setAttribute("emailError", "Please Enter Email");
			isError = true;
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}

		if (isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		} else {
			boolean isFound = false;
			for (UserBean user : SSignupServlet.list) {
				if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
					isFound = true;
					break;
				}
			}

			if (isFound == true) {
				// home
				request.getRequestDispatcher("Home.jsp").forward(request, response);

			} else {
				// login
				request.setAttribute("error", "Invalid Credentials");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}

		}

	}
}
