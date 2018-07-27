package com.ny.entity;
/**
 * 直系亲属紧急联系人的实体类
 * @author N.Y
 *
 */
public class EmerContactFM {
	private int emercontact_fm_id;
	private String emercontact_fm_name;
	private String emercontact_fm_number;
	private User u;
	public int getEmercontact_fm_id() {
		return emercontact_fm_id;
	}
	public void setEmercontact_fm_id(int emercontact_fm_id) {
		this.emercontact_fm_id = emercontact_fm_id;
	}
	public String getEmercontact_fm_name() {
		return emercontact_fm_name;
	}
	public void setEmercontact_fm_name(String emercontact_fm_name) {
		this.emercontact_fm_name = emercontact_fm_name;
	}
	public String getEmercontact_fm_number() {
		return emercontact_fm_number;
	}
	public void setEmercontact_fm_number(String emercontact_fm_number) {
		this.emercontact_fm_number = emercontact_fm_number;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "emercontact_fm_name"+emercontact_fm_name+",user_id"+u.getUser_id();
	}
	
}
