package com.flm.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.flm.dao.EmployeeDao;
import com.flm.model.Employee;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empId = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		double salary = Double.parseDouble(request.getParameter("salary"));
		Employee emp = new Employee(empId, name, age, email, phoneNumber, salary);
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.updateEmployee(emp);
		
		response.sendRedirect("employees");
	}

}
