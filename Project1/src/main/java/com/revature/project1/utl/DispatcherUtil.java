package com.revature.project1.utl;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.project1.dao.EmployeeMenuDAO;
import com.revature.project1.dao.EmployeeMenuImpl;
import com.revature.project1.pojo.Reimbursement;

public class DispatcherUtil {
	EmployeeMenuDAO emd = new EmployeeMenuImpl();
	//ArrayList<Reimbursement> rList = emd.getReimbursements(emp.getId());
	private ObjectMapper om = new ObjectMapper();
}
