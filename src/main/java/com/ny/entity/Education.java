package com.ny.entity;
/**
 * 学历的实体类
 * @author N.Y
 *
 */
public class Education {
	private int edu_id;
	private String edu_school;
	private String edu_location;
	private String edu_gra_time;
	private String edu_pro;
	private String edu_conclusion;
	private int user_id;
	private User u;
	public int getEdu_id() {
		return edu_id;
	}
	public void setEdu_id(int edu_id) {
		this.edu_id = edu_id;
	}
	public String getEdu_school() {
		return edu_school;
	}
	public void setEdu_school(String edu_school) {
		this.edu_school = edu_school;
	}
	public String getEdu_location() {
		return edu_location;
	}
	public void setEdu_location(String edu_location) {
		this.edu_location = edu_location;
	}
	public String getEdu_gra_time() {
		return edu_gra_time;
	}
	public void setEdu_gra_time(String edu_gra_time) {
		this.edu_gra_time = edu_gra_time;
	}
	public String getEdu_pro() {
		return edu_pro;
	}
	public void setEdu_pro(String edu_pro) {
		this.edu_pro = edu_pro;
	}
	public String getEdu_conclusion() {
		return edu_conclusion;
	}
	public void setEdu_conclusion(String edu_conclusion) {
		this.edu_conclusion = edu_conclusion;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "edu_school"+edu_school+",user_id"+u.getUser_id();
	}
	
}
