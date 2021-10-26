package com.vasu.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Login {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String moNo;
	@Size(min=2, max=8, message="Please enter Username")
	private String username;
	@Pattern(regexp="^[a-zA-Z0-9]{8}", message="password size must be 8 ")
	private String password;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMoNo() {
		return moNo;
	}
	public void setMoNo(String moNo) {
		this.moNo = moNo;
	}
	@Override
	public String toString() {
		return "Login [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", moNo=" + moNo + ", username=" + username + ", password=" + password + "]";
	}
}
