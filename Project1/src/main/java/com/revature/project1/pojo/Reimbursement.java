package com.revature.project1.pojo;

import java.sql.Date;

public class Reimbursement {
	private double amount;
	private int id;
	private Date date;
	private String comment;
	private String photoLink;
	private int empID;
	private int managerID;
	
	public Reimbursement(double amount, int id, Date date, String comment, String photoLink, int empID, int managerID) {
		super();
		this.amount = amount;
		this.id = id;
		this.date = date;
		this.comment = comment;
		this.photoLink = photoLink;
		this.empID = empID;
		this.managerID = managerID;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getPhotoLink() {
		return photoLink;
	}



	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}



	public int getEmpID() {
		return empID;
	}



	public void setEmpID(int empID) {
		this.empID = empID;
	}


	@Override
	public String toString() {
		return "Reimbursement [amount=" + amount + ", id=" + id + ", date=" + date + ", comment=" + comment
				+ ", photoLink=" + photoLink + ", empID=" + empID + ", managerID=" + managerID + "]";
	}
	
	
}
