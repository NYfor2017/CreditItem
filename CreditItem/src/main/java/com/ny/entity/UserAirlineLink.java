package com.ny.entity;

public class UserAirlineLink {
	private int user_airline_id;
	private User user;
	private Airline airline;
	public int getUser_airline_id() {
		return user_airline_id;
	}
	public void setUser_airline_id(int user_airline_id) {
		this.user_airline_id = user_airline_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	@Override
	public String toString() {
		return "user:"+user+",airline:"+airline;
	}
	
}
