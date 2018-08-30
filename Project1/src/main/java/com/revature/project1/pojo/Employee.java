package com.revature.project1.pojo;

public class Employee {
	private String firstName;
	private String lastName;
	private String username;
	private int id;
	private boolean isManager;
	private String title;
	private String password;
	private int managerID;
	
	
	public Employee(int id) {
		this.username = null;
		this.id = id;
		this.firstName = null;
		this.lastName = null;
		this.isManager = false;
		this.title = null;
		this.password = null;
		this.managerID = 0;
	}

	public Employee(String firstName, String lastName, String username, int id, String isManager, String title,
			String password, int managerID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.id = id;
		this.title = title;
		this.password = password;
		this.managerID = managerID;
		
		if(isManager.equals("N"))
			this.isManager = false;
		else
			this.isManager = true;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", id=" + id
				+ ", isManager=" + isManager + ", title=" + title + ", password=" + password + ", managerID="
				+ managerID + "]";
	}

}
