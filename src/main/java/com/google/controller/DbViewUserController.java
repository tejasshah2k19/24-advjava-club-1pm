package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.bean.UserBean;
import com.google.dao.UserDao;

@WebServlet("/DbViewUserController")
public class DbViewUserController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// select * from users where userId = ?
			//input 
		Integer userId = Integer.parseInt(request.getParameter("userId"));

		//process 
		UserDao userDao = new UserDao();
		UserBean userBean = userDao.getUserByUserId(userId);

		
		//output 
		request.setAttribute("userBean", userBean);
		request.getRequestDispatcher("DbViewUser.jsp").forward(request, response);
		
		
	}
}
