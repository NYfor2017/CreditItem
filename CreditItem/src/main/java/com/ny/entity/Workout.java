package com.ny.entity;

import java.util.List;

/**
 * 在外任职的实体类
 * @author N.Y
 *
 */
public class Workout {
	private int workout_id;
	private String workout_signin;
	private String workout_type;
	private String workout_capital;
	private String workout_job;
	private User u;
	
	
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public int getWorkout_id() {
		return workout_id;
	}
	public void setWorkout_id(int workout_id) {
		this.workout_id = workout_id;
	}
	public String getWorkout_signin() {
		return workout_signin;
	}
	public void setWorkout_signin(String workout_signin) {
		this.workout_signin = workout_signin;
	}
	public String getWorkout_type() {
		return workout_type;
	}
	public void setWorkout_type(String workout_type) {
		this.workout_type = workout_type;
	}
	public String getWorkout_capital() {
		return workout_capital;
	}
	public void setWorkout_capital(String workout_capital) {
		this.workout_capital = workout_capital;
	}
	public String getWorkout_job() {
		return workout_job;
	}
	public void setWorkout_job(String workout_job) {
		this.workout_job = workout_job;
	}

	@Override
	public String toString() {
		return "workout_signin"+workout_signin;
	}
}