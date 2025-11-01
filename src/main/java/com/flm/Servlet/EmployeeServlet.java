package com.flm.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.flm.dao.EmployeeDao;
import com.flm.model.Employee;


@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao employeeDao = new EmployeeDao();
		
		List<Employee> allEmployees = employeeDao.getAllEmployees();
		request.setAttribute("empList", allEmployees);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees.jsp");
		requestDispatcher.forward(request, response);
	}

}
