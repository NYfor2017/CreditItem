package com.ny.entity;
/**
 * 职业资格证书的实体类
 * @author N.Y
 *
 */
public class Quali {
	private int quali_id;
	private String quali_num;
	private String quali_name;
	private String quali_date;
	private String quali_insti;
	private User u;
	public int getQuali_id() {
		return quali_id;
	}
	public void setQuali_id(int quali_id) {
		this.quali_id = quali_id;
	}
	public String getQuali_num() {
		return quali_num;
	}
	public void setQuali_num(String quali_num) {
		this.quali_num = quali_num;
	}
	public String getQuali_name() {
		return quali_name;
	}
	public void setQuali_name(String quali_name) {
		this.quali_name = quali_name;
	}
	public String getQuali_date() {
		return quali_date;
	}
	public void setQuali_date(String quali_date) {
		this.quali_date = quali_date;
	}
	public String getQuali_insti() {
		return quali_insti;
	}
	public void setQuali_insti(String quali_insti) {
		this.quali_insti = quali_insti;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "quali_name"+quali_name+",quali_num"+quali_num+",user_id"+u.getUser_id();
	}
	
}
