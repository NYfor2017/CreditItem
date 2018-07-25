package com.ny.entity;


/**
 * 车的实体类
 * @author N.Y
 *
 */
public class Car {
	private int car_id;
	private String car_number;
	private String car_brand;
	private String car_model;
	private String car_buy_date;
	private String car_type_year;
	private String car_hit_market;
	private String car_type;
	private String car_size;
	private String car_pro_country;
	private boolean car_pro_type;
	private User u;
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCar_number() {
		return car_number;
	}
	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}
	public String getCar_brand() {
		return car_brand;
	}
	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}
	public String getCar_model() {
		return car_model;
	}
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	
	public String getCar_buy_date() {
		return car_buy_date;
	}
	public String getCar_type_year() {
		return car_type_year;
	}
	public String getCar_hit_market() {
		return car_hit_market;
	}
	public void setCar_buy_date(String car_buy_date) {
		this.car_buy_date = car_buy_date;
	}
	public void setCar_type_year(String car_type_year) {
		this.car_type_year = car_type_year;
	}
	public void setCar_hit_market(String car_hit_market) {
		this.car_hit_market = car_hit_market;
	}

	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getCar_size() {
		return car_size;
	}
	public void setCar_size(String car_size) {
		this.car_size = car_size;
	}
	public String getCar_pro_country() {
		return car_pro_country;
	}
	public void setCar_pro_country(String car_pro_country) {
		this.car_pro_country = car_pro_country;
	}
	public boolean getCar_pro_type() {
		return car_pro_type;
	}
	public void setCar_pro_type(boolean car_pro_type) {
		this.car_pro_type = car_pro_type;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "car_number"+car_number+",car_brand:"+car_brand;
	}
	
}
