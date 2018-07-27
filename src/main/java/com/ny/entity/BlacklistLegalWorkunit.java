package com.ny.entity;
/**
 * 企业刑事案件的实体类
 * @author N.Y
 *
 */
public class BlacklistLegalWorkunit {
	private int blacklist_legal_w_id;
	private Workunit w;
	private String blacklist_detail;
	public int getBlacklist_legal_w_id() {
		return blacklist_legal_w_id;
	}
	public void setBlacklist_legal_w_id(int blacklist_legal_w_id) {
		this.blacklist_legal_w_id = blacklist_legal_w_id;
	}
	public Workunit getW() {
		return w;
	}
	public void setW(Workunit w) {
		this.w = w;
	}
	public String getBlacklist_detail() {
		return blacklist_detail;
	}
	public void setBlacklist_detail(String blacklist_detail) {
		this.blacklist_detail = blacklist_detail;
	}
	@Override
	public String toString() {
		return "blacklist_legal_w_id:"+blacklist_legal_w_id+",workunit_id"+w.getWorkunit_id();
	}
	
}
