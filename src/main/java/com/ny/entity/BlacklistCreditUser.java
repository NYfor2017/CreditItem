package com.ny.entity;
/**
 * �Ŵ����ں�����֮�û���ʵ����
 * @author N.Y
 *
 */
public class BlacklistCreditUser {
	private int blacklist_credit_u_id;
	private User u;
	private String blacklist_detail;
	public int getBlacklist_credit_u_id() {
		return blacklist_credit_u_id;
	}
	public void setBlacklist_credit_u_id(int blacklist_credit_u_id) {
		this.blacklist_credit_u_id = blacklist_credit_u_id;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public String getBlacklist_detail() {
		return blacklist_detail;
	}
	public void setBlacklist_detail(String blacklist_detail) {
		this.blacklist_detail = blacklist_detail;
	}
	@Override
	public String toString() {
		return "blacklist_credit_u_id"+blacklist_credit_u_id+",user_id"+u.getUser_id();
	}
	
}
