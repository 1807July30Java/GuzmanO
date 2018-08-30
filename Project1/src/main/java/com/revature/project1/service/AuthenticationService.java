package com.revature.project1.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.revature.project1.utl.ConnectionUtil;

public class AuthenticationService {
	public AuthenticationService() {
	}

	public static int isValidUser(String username, String password) {
		String filename = "connection.properties";
		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnectionFromFile(filename);
			// use a prepared statement
			String sql = "SELECT * FROM EMPLOYEE WHERE USERNAME = ? AND PASSWORD = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();

			// do something with result
			if (rs.next()) {
				int colID = rs.findColumn("ID");
				int id = rs.getInt(colID);
				//System.out.println(id);
				return id;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
