package com.google.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.bean.UserBean;
import com.google.dao.UserDao;

@WebServlet("/DbListUserController")
public class DbListUserController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// user -> select ->
		UserDao userDao = new UserDao();
		ArrayList<UserBean> users = userDao.getAllUsers();

		for (UserBean user : users) {
			System.out.println(user.getEmail());
		}

	}
}
