package com.ny.entity;
/**
 * ����Ա��ʵ����
 * @author N.Y
 *
 */
public class Admin {
	
	private String username;
	private String password;
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
	@Override
	public String toString() {
		return "username:"+username+",password:"+password;
	}
	
}
