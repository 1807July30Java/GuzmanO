package com.revature.project1.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.project1.dao.EmployeeMenuDAO;
import com.revature.project1.dao.EmployeeMenuImpl;
import com.revature.project1.pojo.Employee;
import com.revature.project1.pojo.Reimbursement;

/**
 * Servlet implementation class SessionServlet
 */
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if (session != null) {
			EmployeeMenuDAO emd = new EmployeeMenuImpl();
			ObjectMapper mapper = new ObjectMapper();
			Employee emp = (Employee) session.getAttribute("emp");
			response.setContentType("application/json");
			
			if(request.getParameter("entity").equals("user")) {
				String empJSON = mapper.writeValueAsString(emp);
				response.getWriter().write(empJSON);
			}
			else if(request.getParameter("entity").equals("reimbursements")) {
				ArrayList<Reimbursement> rList = emd.getReimbursements(emp.getId());
				String rJSON = mapper.writeValueAsString(rList);
				response.getWriter().write(rJSON);
			}
			else {
				System.out.println("Error");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
