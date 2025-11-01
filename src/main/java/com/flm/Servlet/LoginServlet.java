package com.flm.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.flm.dao.UserDao;
import com.flm.model.User;
import com.flm.utils.Constants;
import com.flm.utils.DBConnection;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = new User(email,password);
		UserDao userDao = new UserDao();
		boolean isValid = userDao.validateUser(user);
		if(isValid) {
			HttpSession session = request.getSession();
			String[] split = user.getEmail().split("@");
			String name = split[0];
			session.setAttribute("email", name);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees");
			requestDispatcher.forward(request, response);
		}else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.forward(request, response);
		}
		
	}

}
