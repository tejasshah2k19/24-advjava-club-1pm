package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet") // annotation -> url -> web.xml 7 line code
public class SignupServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("SignupServlet::service()");

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		// email
		// password
		System.out.println(firstName);
		System.out.println(lastName);
	}
}

//project->rightclick=>properties->
//java build path -> libraries -> add external jar -> browse->
//tomcat path -> lib -> servlet-api.jar -> open ->
//click on order and exports -> select all -> apply and close 

//1) class extends HttpServlet
//2) override service()
//3) url pattern 

//jar -> servlet-api.jar 
//HttpServlet 

//paypal-api.jar 

//aws-api.jar 

//tomcat->lib ,   internet 

//servlet is a java class

//class -> thread ? 
//class -> exception? 
//class -> applet ? 
