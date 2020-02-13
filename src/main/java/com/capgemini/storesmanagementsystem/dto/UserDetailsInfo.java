package com.capgemini.storesmanagementsystem.dto;

public class UserDetailsInfo {
	private String userId;
	private String userName;
	private String email;
	private String password;
	private String address;
	private String userRole;

	public UserDetailsInfo(String s, String s1, String s2, String s3, String s4, String s5) {
		userId = s;
		userName = s1;
		email = s2;
		password = s3;
		address = s4;
		userRole = s5;
	}

	public UserDetailsInfo() {
	}

	// Getter and Setter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", address=" + address + ", userRole=" + userRole + "]";
	}

}
