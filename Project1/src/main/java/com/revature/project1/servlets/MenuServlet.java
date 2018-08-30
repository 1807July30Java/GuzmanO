package com.revature.project1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project1.dao.EmployeeMenuDAO;
import com.revature.project1.dao.EmployeeMenuImpl;
import com.revature.project1.pojo.Employee;
import com.revature.project1.pojo.Reimbursement;

/**
 * Servlet implementation class MenuServlet
 */
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MenuServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		response.setContentType("text/html");
		
		// grab params from request

		if (session != null && session.getAttribute("emp") != null) {
			EmployeeMenuDAO emdao = new EmployeeMenuImpl();
			Employee emp = (Employee) session.getAttribute("emp");
			emp = emdao.getUserInfo(emp.getId());
			if(emp.isManager()) {
				request.getRequestDispatcher("managerProfile.html").forward(request, response);
			}
			else {
				request.getRequestDispatcher("menu.html").forward(request, response);
			}
		} 
		else {
			if (session != null) {
				session.invalidate();
			}
			response.sendRedirect("login.html");
		}
	}

}
