package com.ny.entity;

import java.util.ArrayList;
import java.util.List;

public class Workunit {
	private int workunit_id;
	private String workunit_name;
	private String workunit_type;
	private String workunit_reg_number;
	private int workunit_reg_capital;
	private String workunit_phone_num1;
	private String workunit_phone_num2;
	private List<BlacklistCreditWorkunit> bcws;  //关联BlacklistCreditWorkunit的属性集合
	private List<BlacklistLegalWorkunit> blws;  //关联BlacklistLegalWorkunit的属性集合
	private List<BlacklistWorkunit> bws;  //关联BlacklistWorkunit的属性集合
	private List us = new ArrayList<Object>();  //关联User
	
	
	public List getUs() {
		return us;
	}
	public void setUs(List us) {
		this.us = us;
	}
	public List<BlacklistLegalWorkunit> getBlws() {
		return blws;
	}
	public void setBlws(List<BlacklistLegalWorkunit> blws) {
		this.blws = blws;
	}
	public List<BlacklistWorkunit> getBws() {
		return bws;
	}
	public void setBws(List<BlacklistWorkunit> bws) {
		this.bws = bws;
	}
	public List<BlacklistCreditWorkunit> getBcws() {
		return bcws;
	}
	public void setBcws(List<BlacklistCreditWorkunit> bcws) {
		this.bcws = bcws;
	}
	
	public int getWorkunit_id() {
		return workunit_id;
	}
	public void setWorkunit_id(int workunit_id) {
		this.workunit_id = workunit_id;
	}
	public String getWorkunit_name() {
		return workunit_name;
	}
	public void setWorkunit_name(String workunit_name) {
		this.workunit_name = workunit_name;
	}
	public String getWorkunit_type() {
		return workunit_type;
	}
	public void setWorkunit_type(String workunit_type) {
		this.workunit_type = workunit_type;
	}
	public String getWorkunit_reg_number() {
		return workunit_reg_number;
	}
	public void setWorkunit_reg_number(String workunit_reg_number) {
		this.workunit_reg_number = workunit_reg_number;
	}
	public int getWorkunit_reg_capital() {
		return workunit_reg_capital;
	}
	public void setWorkunit_reg_capital(int workunit_reg_capital) {
		this.workunit_reg_capital = workunit_reg_capital;
	}
	public String getWorkunit_phone_num1() {
		return workunit_phone_num1;
	}
	public void setWorkunit_phone_num1(String workunit_phone_num1) {
		this.workunit_phone_num1 = workunit_phone_num1;
	}
	public String getWorkunit_phone_num2() {
		return workunit_phone_num2;
	}
	public void setWorkunit_phone_num2(String workunit_phone_num2) {
		this.workunit_phone_num2 = workunit_phone_num2;
	}
	@Override
	public String toString() {
		return "workunit_name"+workunit_name;
	}
	
	
}
