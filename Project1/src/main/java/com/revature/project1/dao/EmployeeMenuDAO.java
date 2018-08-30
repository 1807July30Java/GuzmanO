package com.revature.project1.dao;

import java.util.ArrayList;

import com.revature.project1.pojo.Employee;
import com.revature.project1.pojo.Reimbursement;

public interface EmployeeMenuDAO {
	public Employee getUserInfo(int id);
	public ArrayList<Reimbursement> getReimbursements(int id);
	
}
