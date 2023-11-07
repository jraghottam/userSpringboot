package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Users {
	@Id  
	@Column  
	private int userid;  
	@Column  
	private String username;  
	@Column  
	private String passwd;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
