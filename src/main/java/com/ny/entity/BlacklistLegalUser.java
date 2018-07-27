package com.ny.entity;
/**
 * 人事刑事案件的实体类
 * @author N.Y
 *
 */
public class BlacklistLegalUser {
	private int blacklist_legal_u_id;
	private User u;
	private String blacklist_detail;
	public int getBlacklist_legal_u_id() {
		return blacklist_legal_u_id;
	}
	public void setBlacklist_legal_u_id(int blacklist_legal_u_id) {
		this.blacklist_legal_u_id = blacklist_legal_u_id;
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
	
}
