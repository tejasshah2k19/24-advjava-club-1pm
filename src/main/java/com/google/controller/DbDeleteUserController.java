package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.dao.UserDao;

@WebServlet("/DbDeleteUserController")
public class DbDeleteUserController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//int -> new 
		Integer userId = Integer.parseInt(request.getParameter("userId"));
		
		UserDao userDao = new UserDao();
		userDao.deleteUserById(userId);
		
		//
		request.getRequestDispatcher("DbListUserController").forward(request, response);
	}
}
