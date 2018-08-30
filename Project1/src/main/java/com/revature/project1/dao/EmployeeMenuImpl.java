package com.revature.project1.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.project1.pojo.Employee;
import com.revature.project1.pojo.Reimbursement;
import com.revature.project1.utl.ConnectionUtil;

public class EmployeeMenuImpl implements EmployeeMenuDAO {

	final String filename = "connection.properties";

	public Employee getUserInfo(int id) {
		Employee emp = null;

		try {
			Connection connection = ConnectionUtil.getConnectionFromFile(filename);
			String sql = "SELECT * FROM EMPLOYEE WHERE ID = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();

			// do something with result
			if (rs.next()) {
				int colUserName = rs.findColumn("USERNAME");
				int colPassword = rs.findColumn("PASSWORD");
				int colFName = rs.findColumn("FIRST_NAME");
				int colLName = rs.findColumn("LAST_NAME");
				int colMan = rs.findColumn("ISMANAGER");
				int colManID = rs.findColumn("MANAGERID");
				int colTitle = rs.findColumn("TITLE");

				String firstName = rs.getString(colFName);
				String lastName = rs.getString(colLName);
				String username = rs.getString(colUserName);
				String isManager = rs.getString(colMan);
				String title = rs.getString(colTitle);
				String password = rs.getString(colPassword);
				int managerID = rs.getInt(colManID);

				emp = new Employee(firstName, lastName, username, id, isManager, title, password, managerID);
			}

			rs.close();
			connection.close();
			return emp;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Reimbursement> getReimbursements(int id) {
		ArrayList<Reimbursement> rList = new ArrayList<Reimbursement>();

		try {
			Connection connection = ConnectionUtil.getConnectionFromFile(filename);
			String sql = "SELECT * FROM REIMBURSEMENT WHERE EMP_ID = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();

			// do something with result
			while (rs.next()) {
				int colAmount = rs.findColumn("AMOUNT");
				int colDate = rs.findColumn("DATE_ISSUED");
				int colComment = rs.findColumn("COMMENTS");
				int colLink = rs.findColumn("PHOTO_LINK");
				int colEID = rs.findColumn("EMP_ID");
				int colMID = rs.findColumn("MANAGER_ID");

				double amount = rs.getDouble(colAmount);
				Date date = rs.getDate(colDate);
				String comment = rs.getString(colComment);
				String photoLink = rs.getString(colLink);
				int eID = rs.getInt(colEID);
				int mID = rs.getInt(colMID);
				
				Reimbursement form = new 
						Reimbursement(amount,id,date,comment,photoLink,eID,mID);
				rList.add(form);
			}
			rs.close();
			connection.close();
			return rList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	

}
