package com.ny.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * 十二个月支出信息的实体类
 * @author N.Y
 *
 */
public class CardOut12M {
	private int out_12m_id;
	private int out_12m_time;
	private int out_12m_amount;
	private User u;
	
	
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public int getOut_12m_id() {
		return out_12m_id;
	}
	public void setOut_12m_id(int out_12m_id) {
		this.out_12m_id = out_12m_id;
	}
	public int getOut_12m_time() {
		return out_12m_time;
	}
	public void setOut_12m_time(int out_12m_time) {
		this.out_12m_time = out_12m_time;
	}
	public int getOut_12m_amount() {
		return out_12m_amount;
	}
	public void setOut_12m_amount(int out_12m_amount) {
		this.out_12m_amount = out_12m_amount;
	}
	@Override
	public String toString() {
		return "cardout12M:"+out_12m_amount;
	}
	
}
