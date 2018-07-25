package com.ny.entity;

public class House {
	private int house_id;
	private String house_address;
	private int house_value;
	private int house_payall_if;
	private User u;
	
	public int getHouse_id() {
		return house_id;
	}
	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}
	public String getHouse_address() {
		return house_address;
	}
	public void setHouse_address(String house_address) {
		this.house_address = house_address;
	}
	public int getHouse_value() {
		return house_value;
	}
	public void setHouse_value(int house_value) {
		this.house_value = house_value;
	}
	public int getHouse_payall_if() {
		return house_payall_if;
	}
	public void setHouse_payall_if(int house_payall_if) {
		this.house_payall_if = house_payall_if;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}

	@Override
	public String toString() {
		return "house_address"+house_address+"user:"+u.getUser_id();
	}
	
}
