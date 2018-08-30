package com.revature.project1.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.dao.EmployeeMenuDAO;
import com.revature.project1.dao.EmployeeMenuImpl;
import com.revature.project1.pojo.Employee;
import com.revature.project1.service.AuthenticationService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
 	@Override
 	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 		req.getRequestDispatcher("login.html").forward(req, resp);
 	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	// perform authentication for POST request
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		resp.setContentType("text/html");
		//grab params from request
		String username = req.getParameter("username").trim();
		String password = req.getParameter("password").trim();
		int id = 0;
		try {
			id = AuthenticationService.isValidUser(username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (id != 0) {
			EmployeeMenuDAO emd = new EmployeeMenuImpl();
			Employee emp = new Employee(id);
			emp = emd.getUserInfo(emp.getId());
			session.setAttribute("emp", emp);
			session.setAttribute("problem", null);
			resp.sendRedirect("menu");
		} else {
			session.setAttribute("problem", "Incorrect Credentials");
			resp.sendRedirect("login");
			System.out.println("Reached problem");
		}
	}

}
