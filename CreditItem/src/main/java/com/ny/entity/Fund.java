package com.ny.entity;
/**
 * 公积金的实体类
 * @author N.Y
 *
 */
public class Fund {
	private int fund_id;
	private String fund_account;
	private double fund_deposit_base;
	private String fund_payment_unit_cur;
	private int fund_payment_month;
	private String fund_city;
	private double fund_balance;
	private String fund_last_entry_time;
	private String fund_idcard;
	private int fund_num_cons_month;
	private User u;
	public int getFund_id() {
		return fund_id;
	}
	public void setFund_id(int fund_id) {
		this.fund_id = fund_id;
	}
	public String getFund_account() {
		return fund_account;
	}
	public void setFund_account(String fund_account) {
		this.fund_account = fund_account;
	}
	public double getFund_deposit_base() {
		return fund_deposit_base;
	}
	public void setFund_deposit_base(double fund_deposit_base) {
		this.fund_deposit_base = fund_deposit_base;
	}
	public String getFund_payment_unit_cur() {
		return fund_payment_unit_cur;
	}
	public void setFund_payment_unit_cur(String fund_payment_unit_cur) {
		this.fund_payment_unit_cur = fund_payment_unit_cur;
	}
	public int getFund_payment_month() {
		return fund_payment_month;
	}
	public void setFund_payment_month(int fund_payment_month) {
		this.fund_payment_month = fund_payment_month;
	}
	public String getFund_city() {
		return fund_city;
	}
	public void setFund_city(String fund_city) {
		this.fund_city = fund_city;
	}
	public double getFund_balance() {
		return fund_balance;
	}
	public void setFund_balance(double fund_balance) {
		this.fund_balance = fund_balance;
	}
	public String getFund_last_entry_time() {
		return fund_last_entry_time;
	}
	public void setFund_last_entry_time(String fund_last_entry_time) {
		this.fund_last_entry_time = fund_last_entry_time;
	}
	public String getFund_idcard() {
		return fund_idcard;
	}
	public void setFund_idcard(String fund_idcard) {
		this.fund_idcard = fund_idcard;
	}
	public int getFund_num_cons_month() {
		return fund_num_cons_month;
	}
	public void setFund_num_cons_month(int fund_num_cons_month) {
		this.fund_num_cons_month = fund_num_cons_month;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "fund_account"+fund_account+",user_id"+u.getUser_id();
	}
	
	
}
