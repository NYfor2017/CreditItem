package com.ny.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * 六个月支出信息的实体类
 * @author N.Y
 *
 */
public class CardOut6M {
	private int out_6m_id;
	private int out_6m_time;
	private int out_6m_amount;
	private User u;
	public int getOut_6m_id() {
		return out_6m_id;
	}
	public void setOut_6m_id(int out_6m_id) {
		this.out_6m_id = out_6m_id;
	}
	public int getOut_6m_time() {
		return out_6m_time;
	}
	public void setOut_6m_time(int out_6m_time) {
		this.out_6m_time = out_6m_time;
	}
	public int getOut_6m_amount() {
		return out_6m_amount;
	}
	public void setOut_6m_amount(int out_6m_amount) {
		this.out_6m_amount = out_6m_amount;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "cardout6M:"+out_6m_amount;
	}
}
