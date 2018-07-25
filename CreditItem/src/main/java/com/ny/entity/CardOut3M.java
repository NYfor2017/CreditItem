package com.ny.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 三个月支出信息的实体类
 * @author N.Y
 *
 */
public class CardOut3M {
	private int out_3m_id;
	private int out_3m_time;
	private int out_3m_amount;
	private User u;
	
	public int getOut_3m_id() {
		return out_3m_id;
	}
	public void setOut_3m_id(int out_3m_id) {
		this.out_3m_id = out_3m_id;
	}
	public int getOut_3m_time() {
		return out_3m_time;
	}
	public void setOut_3m_time(int out_3m_time) {
		this.out_3m_time = out_3m_time;
	}
	public int getOut_3m_amount() {
		return out_3m_amount;
	}
	public void setOut_3m_amount(int out_3m_amount) {
		this.out_3m_amount = out_3m_amount;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "cardout3M:"+out_3m_amount;
	}
}
