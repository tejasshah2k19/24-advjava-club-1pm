package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String n1 = request.getParameter("n1");//null "" " " "   " 
		String n2 = request.getParameter("n2");

		//validation -
		//required 
		
		PrintWriter out = response.getWriter();
		if (n1 == null || n1.trim().length() == 0 || n2 == null || n2.trim().length() == 0) {
			out.print("Please Enter all values ");
		} else {
			int a = Integer.parseInt(n1);
			int b = Integer.parseInt(n2);
			int c = a + b;
			out.print(c);
		}

	}
}
