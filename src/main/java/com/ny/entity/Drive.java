package com.ny.entity;
/**
 * 驾照的实体类
 * @author N.Y
 *
 */
public class Drive {
	private int drive_id;
	private String drive_card;
	private String drive_status;
	private String drive_quasi_type;
	private int drive_year;
	private User u;
	public int getDrive_id() {
		return drive_id;
	}
	public void setDrive_id(int drive_id) {
		this.drive_id = drive_id;
	}
	public String getDrive_card() {
		return drive_card;
	}
	public void setDrive_card(String drive_card) {
		this.drive_card = drive_card;
	}
	public String getDrive_status() {
		return drive_status;
	}
	public void setDrive_status(String drive_status) {
		this.drive_status = drive_status;
	}
	public String getDrive_quasi_type() {
		return drive_quasi_type;
	}
	public void setDrive_quasi_type(String drive_quasi_type) {
		this.drive_quasi_type = drive_quasi_type;
	}
	public int getDrive_year() {
		return drive_year;
	}
	public void setDrive_year(int drive_year) {
		this.drive_year = drive_year;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "drive_card"+drive_card+",user_id"+u.getUser_id();
	}
	
	
}
