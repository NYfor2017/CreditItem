package com.ny.entity;
/**
 * 投资项目的实体类
 * @author N.Y
 *
 */
public class Invest {
	private int invest_id;
	private String invest_itemName;
	private int invest_amount;
	private User u;
	public int getInvest_id() {
		return invest_id;
	}
	public void setInvest_id(int invest_id) {
		this.invest_id = invest_id;
	}
	public String getInvest_itemName() {
		return invest_itemName;
	}
	public void setInvest_itemName(String invest_itemName) {
		this.invest_itemName = invest_itemName;
	}
	public int getInvest_amount() {
		return invest_amount;
	}
	public void setInvest_amount(int invest_amount) {
		this.invest_amount = invest_amount;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "invest_itemName"+invest_itemName;
		
	}
	
}
