package com.ny.entity;
/**
 * 黑名单之企业的实体类
 * @author N.Y
 *
 */
public class BlacklistWorkunit {
	private int blacklist_workunit_id;
	private Workunit w;
	private String blacklist_detail;
	public int getBlacklist_workunit_id() {
		return blacklist_workunit_id;
	}
	public void setBlacklist_workunit_id(int blacklist_workunit_id) {
		this.blacklist_workunit_id = blacklist_workunit_id;
	}
	public Workunit getW() {
		return w;
	}
	public void setWorkunit(Workunit w) {
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
		return "blacklist_workunit_id:"+blacklist_workunit_id+",workunit_id"+w.getWorkunit_id();
	}
	
}
