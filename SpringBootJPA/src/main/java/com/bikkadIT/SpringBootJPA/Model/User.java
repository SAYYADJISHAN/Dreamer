package com.bikkadIT.SpringBootJPA.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	
	
	@Id
	private int userId;
	
	private String userName;
	
	private int userAge;
	
	private String useraddress;
	
	private int password;


	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", useraddress="
				+ useraddress + ", password=" + password + "]";
	}

	
	
}
