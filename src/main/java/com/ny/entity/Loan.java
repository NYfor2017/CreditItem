package com.ny.entity;
/**
 * 贷款项目的实体类
 * @author N.Y
 *
 */
public class Loan {
	private int loan_id;
	private String loaner_type;
	private String loan_instruction;
	private int loan_amount;
	private String loan_type;
	private String loan_result;
	private int loan_pub;
	private String loan_pub_date;
	private String loan_end_date;
	private int loan_balance;
	private int loan_repay_month;
	private String loan_account_status;
	private String loan_guar_method;
	private int loan_cur_overdue_peri;
	private int loan_cur_overdue_amo;
	private int loan_sum_overdue_amo;
	private String loan_repay_status_24;
	private int loan_cur_overdue_12_time;
	private User u;
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public String getLoaner_type() {
		return loaner_type;
	}
	public void setLoaner_type(String loaner_type) {
		this.loaner_type = loaner_type;
	}
	public String getLoan_instruction() {
		return loan_instruction;
	}
	public void setLoan_instruction(String loan_instruction) {
		this.loan_instruction = loan_instruction;
	}
	public int getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public String getLoan_result() {
		return loan_result;
	}
	public void setLoan_result(String loan_result) {
		this.loan_result = loan_result;
	}
	public int getLoan_pub() {
		return loan_pub;
	}
	public void setLoan_pub(int loan_pub) {
		this.loan_pub = loan_pub;
	}
	public String getLoan_pub_date() {
		return loan_pub_date;
	}
	public void setLoan_pub_date(String loan_pub_date) {
		this.loan_pub_date = loan_pub_date;
	}
	public String getLoan_end_date() {
		return loan_end_date;
	}
	public void setLoan_end_date(String loan_end_date) {
		this.loan_end_date = loan_end_date;
	}
	public int getLoan_balance() {
		return loan_balance;
	}
	public void setLoan_balance(int loan_balance) {
		this.loan_balance = loan_balance;
	}
	public int getLoan_repay_month() {
		return loan_repay_month;
	}
	public void setLoan_repay_month(int loan_repay_month) {
		this.loan_repay_month = loan_repay_month;
	}
	public String getLoan_account_status() {
		return loan_account_status;
	}
	public void setLoan_account_status(String loan_account_status) {
		this.loan_account_status = loan_account_status;
	}
	public String getLoan_guar_method() {
		return loan_guar_method;
	}
	public void setLoan_guar_method(String loan_guar_method) {
		this.loan_guar_method = loan_guar_method;
	}
	public int getLoan_cur_overdue_peri() {
		return loan_cur_overdue_peri;
	}
	public void setLoan_cur_overdue_peri(int loan_cur_overdue_peri) {
		this.loan_cur_overdue_peri = loan_cur_overdue_peri;
	}
	public int getLoan_cur_overdue_amo() {
		return loan_cur_overdue_amo;
	}
	public void setLoan_cur_overdue_amo(int loan_cur_overdue_amo) {
		this.loan_cur_overdue_amo = loan_cur_overdue_amo;
	}
	public int getLoan_sum_overdue_amo() {
		return loan_sum_overdue_amo;
	}
	public void setLoan_sum_overdue_amo(int loan_sum_overdue_amo) {
		this.loan_sum_overdue_amo = loan_sum_overdue_amo;
	}
	public String getLoan_repay_status_24() {
		return loan_repay_status_24;
	}
	public void setLoan_repay_status_24(String loan_repay_status_24) {
		this.loan_repay_status_24 = loan_repay_status_24;
	}
	public int getLoan_cur_overdue_12_time() {
		return loan_cur_overdue_12_time;
	}
	public void setLoan_cur_overdue_12_time(int loan_cur_overdue_12_time) {
		this.loan_cur_overdue_12_time = loan_cur_overdue_12_time;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "loan_instruction"+loan_instruction+",user_id"+u.getUser_id();
	}
	
}
