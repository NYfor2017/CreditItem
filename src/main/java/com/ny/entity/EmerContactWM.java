package com.ny.entity;
/**
 * 工作证明紧急联系人的实体类
 * @author N.Y
 *
 */
public class EmerContactWM {
	private int emercontact_wm_id;
	private String emercontact_wm_name;
	private String emercontact_wm_number;
	private User u;
	public int getEmercontact_wm_id() {
		return emercontact_wm_id;
	}
	public void setEmercontact_wm_id(int emercontact_wm_id) {
		this.emercontact_wm_id = emercontact_wm_id;
	}
	public String getEmercontact_wm_name() {
		return emercontact_wm_name;
	}
	public void setEmercontact_wm_name(String emercontact_wm_name) {
		this.emercontact_wm_name = emercontact_wm_name;
	}
	public String getEmercontact_wm_number() {
		return emercontact_wm_number;
	}
	public void setEmercontact_wm_number(String emercontact_wm_number) {
		this.emercontact_wm_number = emercontact_wm_number;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "emercontact_wm_name"+emercontact_wm_name+",user_id"+u.getUser_id();
		
	}
	
}
