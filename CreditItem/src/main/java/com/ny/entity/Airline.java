package com.ny.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 航班信息的实体类
 * @author N.Y
 *
 */
public class Airline {
	private int airline_id;
	private int airline_level;
	private String airline_date;
	private String airline_num;
	private double airline_fee;
	private List us = new ArrayList();
	
	
	
	public List getUs() {
		return us;
	}
	public void setUs(List us) {
		this.us = us;
	}
	public int getAirline_id() {
		return airline_id;
	}
	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}
	public int getAirline_level() {
		return airline_level;
	}
	public void setAirline_level(int airline_level) {
		this.airline_level = airline_level;
	}
	public String getAirline_freq() {
		return airline_date;
	}
	public void setAirline_freq(String airline_date) {
		this.airline_date = airline_date;
	}
	public String getAirline_num() {
		return airline_num;
	}
	public void setAirline_num(String airline_num) {
		this.airline_num = airline_num;
	}
	public double getAirline_fee() {
		return airline_fee;
	}
	public void setAirline_fee(double airline_fee) {
		this.airline_fee = airline_fee;
	}

	
}
