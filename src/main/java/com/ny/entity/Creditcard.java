package com.ny.entity;
/**
 * 信用卡的实体类
 * @author N.Y
 *
 */
public class Creditcard {
	private int creditcard_id;
	private String creditcard_number;
	private String creditcard_pro;
	private String creditcard_status;
	private User u;
	public int getCreditcard_id() {
		return creditcard_id;
	}
	public void setCreditcard_id(int creditcard_id) {
		this.creditcard_id = creditcard_id;
	}
	public String getCreditcard_number() {
		return creditcard_number;
	}
	public void setCreditcard_number(String creditcard_number) {
		this.creditcard_number = creditcard_number;
	}
	public String getCreditcard_pro() {
		return creditcard_pro;
	}
	public void setCreditcard_pro(String creditcard_pro) {
		this.creditcard_pro = creditcard_pro;
	}
	public String getCreditcard_status() {
		return creditcard_status;
	}
	public void setCreditcard_status(String creditcard_status) {
		this.creditcard_status = creditcard_status;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "creditcard_number"+creditcard_number+",user_id"+u.getUser_id();
	}
	
	
}
