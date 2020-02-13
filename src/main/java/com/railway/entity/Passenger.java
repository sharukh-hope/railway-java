package com.railway.entity;

public class Passenger{
	
	private int id;
	private String fname;
	private String lname;
	private String dob;
	private String email;
	private String password;	
	private String phoneNumber;
	private String alternateNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAlternateNumber() {
		return alternateNumber;
	}
	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", email=" + email
				+ ", password=" + password + ", phoneNumber=" + phoneNumber + ", alternateNumber=" + alternateNumber
				+ "]";
	}
	

}
