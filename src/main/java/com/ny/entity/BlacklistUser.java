package com.ny.entity;
/**
 * 黑名单之用户的实体类
 * @author N.Y
 *
 */
public class BlacklistUser {
	private int blacklist_user_id;
	private User u;
	private String blacklist_detail;
	public int getBlacklist_user_id() {
		return blacklist_user_id;
	}
	public void setBlacklist_user_id(int blacklist_user_id) {
		this.blacklist_user_id = blacklist_user_id;
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
