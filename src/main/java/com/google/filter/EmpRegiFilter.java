package com.google.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/EmpRegiServlet") // this url will check and server will call this filter on this url
public class EmpRegiFilter implements Filter {
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("EmpRegiFilter::init()");
	}

	public void destroy() {
		System.out.println("EmpRegiFilter::destroy()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("EmpRegiFilter::doFilter()");
		String empName = request.getParameter("empName");
		String department = request.getParameter("department");
		String salary = request.getParameter("salary");

		boolean isError = false;

		if (empName == null || empName.trim().length() == 0) {
			isError = true;
			request.setAttribute("empNameError", "Please Enter Employee name");
		}
		if (department == null || department.trim().length() == 0) {
			isError = true;
			request.setAttribute("departmentError", "Please Enter Department name");
		}
		if (salary == null || salary.trim().length() == 0) {
			isError = true;
			request.setAttribute("salaryError", "Please Enter Salary");
		}

		if (isError == true) {
			// back
			request.getRequestDispatcher("EmpRegi.jsp").forward(request, response);
		} else {
			// go ahead
			chain.doFilter(request, response);

		}

	}
}
