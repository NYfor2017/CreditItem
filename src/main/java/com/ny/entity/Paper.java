package com.ny.entity;
/**
 * ���ĵ�ʵ����
 * @author N.Y
 *
 */
public class Paper {
	private int paper_id;
	private String paper_num;  //���ı���
	private String paper_title;  //���ı���
	private String paper_detail;  //��������
	private User u;
	public int getPaper_id() {
		return paper_id;
	}
	public void setPaper_id(int paper_id) {
		this.paper_id = paper_id;
	}
	public String getPaper_num() {
		return paper_num;
	}
	public void setPaper_num(String paper_num) {
		this.paper_num = paper_num;
	}
	public String getPaper_title() {
		return paper_title;
	}
	public void setPaper_title(String paper_title) {
		this.paper_title = paper_title;
	}
	public String getPaper_detail() {
		return paper_detail;
	}
	public void setPaper_detail(String paper_detail) {
		this.paper_detail = paper_detail;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "paper_title:"+paper_title;
	}
	
}
