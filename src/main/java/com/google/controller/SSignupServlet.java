package com.google.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.bean.UserBean;

@WebServlet("/SSignupServlet")
public class SSignupServlet extends HttpServlet {

	public static ArrayList<UserBean> list = new ArrayList<UserBean>();//instance variable ->object 

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// that object / variable allocates memory every time -> each request 

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// validation -> requried ->
		boolean isError = false; // no error
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}

		if (isError == true) {
			// go back
			RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
			rd.forward(request, response);
		} else {
			// go ahead

			UserBean user = new UserBean();
			user.setFirstName(firstName);
			user.setEmail(email);
			user.setPassword(password);

			list.add(user);

			// print ->print all users from the list here in console
			System.out.println("****************************");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getFirstName());
			}
			System.out.println("****************************");

			request.setAttribute("users",list);//send my data to next jsp 
			RequestDispatcher rd = request.getRequestDispatcher("ListUsers.jsp");
			rd.forward(request, response);

		}

	}
}
