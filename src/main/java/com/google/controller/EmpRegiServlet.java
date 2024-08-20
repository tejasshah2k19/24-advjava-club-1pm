package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpRegiServlet")
public class EmpRegiServlet extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EmpRegiServlet::service()");
		
		//read 
		
		//db save 
		
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
}
