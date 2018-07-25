package com.ny.entity;
/**
 * 通讯条目的实体类
 * @author N.Y
 *
 */
public class Contact {
	private int contact_id;
	private String contact_number;
	private boolean contact_status;  //打进1或者打出0
	private String contact_time;
	private String contact_name;
	private User u;
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public boolean getContact_status() {
		return contact_status;
	}
	public void setContact_status(boolean contact_status) {
		this.contact_status = contact_status;
	}
	public String getContact_time() {
		return contact_time;
	}
	public void setContact_time(String contact_time) {
		this.contact_time = contact_time;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "contact_number"+contact_number+",user_id"+u.getUser_id();
	}
	
}
