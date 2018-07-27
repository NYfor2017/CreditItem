package com.ny.entity;
/**
 * 社保的实体类
 * @author N.Y
 *
 */
public class Security {
	private int secu_id;
	private boolean secu_if;
	private String secu_name;
	private int secu_pay_base;
	private String secu_pay_unit;
	private String secu_parti_status;
	private String secu_city;
	private int secu_paid_cons_month;
	private String secu_idcard;
	private String secu_pay_recent;
	private User u;
	public int getSecu_id() {
		return secu_id;
	}
	public void setSecu_id(int secu_id) {
		this.secu_id = secu_id;
	}
	public boolean isSecu_if() {
		return secu_if;
	}
	public void setSecu_if(boolean secu_if) {
		this.secu_if = secu_if;
	}
	public String getSecu_name() {
		return secu_name;
	}
	public void setSecu_name(String secu_name) {
		this.secu_name = secu_name;
	}
	public int getSecu_pay_base() {
		return secu_pay_base;
	}
	public void setSecu_pay_base(int secu_pay_base) {
		this.secu_pay_base = secu_pay_base;
	}
	public String getSecu_pay_unit() {
		return secu_pay_unit;
	}
	public void setSecu_pay_unit(String secu_pay_unit) {
		this.secu_pay_unit = secu_pay_unit;
	}
	public String getSecu_parti_status() {
		return secu_parti_status;
	}
	public void setSecu_parti_status(String secu_parti_status) {
		this.secu_parti_status = secu_parti_status;
	}
	public String getSecu_city() {
		return secu_city;
	}
	public void setSecu_city(String secu_city) {
		this.secu_city = secu_city;
	}
	public int getSecu_paid_cons_month() {
		return secu_paid_cons_month;
	}
	public void setSecu_paid_cons_month(int secu_paid_cons_month) {
		this.secu_paid_cons_month = secu_paid_cons_month;
	}
	public String getSecu_idcard() {
		return secu_idcard;
	}
	public void setSecu_idcard(String secu_idcard) {
		this.secu_idcard = secu_idcard;
	}
	public String getSecu_pay_recent() {
		return secu_pay_recent;
	}
	public void setSecu_pay_recent(String secu_pay_recent) {
		this.secu_pay_recent = secu_pay_recent;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "secu_name"+secu_name+",user_id"+u.getUser_id();
	}
	
}
