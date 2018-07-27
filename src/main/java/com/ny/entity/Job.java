package com.ny.entity;

public class Job {
	private int job_id;
	private String job_title;
	private String job_begin;
	private String job_end;
	private String job_workunit;
	private User u;
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getJob_begin() {
		return job_begin;
	}
	public void setJob_begin(String job_begin) {
		this.job_begin = job_begin;
	}
	public String getJob_end() {
		return job_end;
	}
	public void setJob_end(String job_end) {
		this.job_end = job_end;
	}
	public String getJob_workunit() {
		return job_workunit;
	}
	public void setJob_workunit(String job_workunit) {
		this.job_workunit = job_workunit;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "job_title"+job_title+",user_info"+u.getUser_id();
	}
	
}
