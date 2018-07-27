package com.ny.entity;
/**
 * 风险排查的实体类
 * @author N.Y
 *
 */
public class RiskInvestUser {
	private int risk_inv_id;
	private User u;
	private boolean live_iden_if;
	private boolean cont_loan_match_if;
	private boolean sms_highrisk_if;
	private boolean equ_risk_if;
	private boolean phone_num_if;
	private boolean many_wifi_if;
	private boolean many_gps_if;
	private boolean gps_addr_mat_if;
	private boolean pho_addr_mat_if;
	private boolean work_addr_mat_if;
	private boolean card_outtime_if;
	public int getRisk_inv_id() {
		return risk_inv_id;
	}
	public void setRisk_inv_id(int risk_inv_id) {
		this.risk_inv_id = risk_inv_id;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public boolean isLive_iden_if() {
		return live_iden_if;
	}
	public void setLive_iden_if(boolean live_iden_if) {
		this.live_iden_if = live_iden_if;
	}
	public boolean isCont_loan_match_if() {
		return cont_loan_match_if;
	}
	public void setCont_loan_match_if(boolean cont_loan_match_if) {
		this.cont_loan_match_if = cont_loan_match_if;
	}
	public boolean isSms_highrisk_if() {
		return sms_highrisk_if;
	}
	public void setSms_highrisk_if(boolean sms_highrisk_if) {
		this.sms_highrisk_if = sms_highrisk_if;
	}
	public boolean isEqu_risk_if() {
		return equ_risk_if;
	}
	public void setEqu_risk_if(boolean equ_risk_if) {
		this.equ_risk_if = equ_risk_if;
	}
	public boolean isPhone_num_if() {
		return phone_num_if;
	}
	public void setPhone_num_if(boolean phone_num_if) {
		this.phone_num_if = phone_num_if;
	}
	public boolean isMany_wifi_if() {
		return many_wifi_if;
	}
	public void setMany_wifi_if(boolean many_wifi_if) {
		this.many_wifi_if = many_wifi_if;
	}
	public boolean isMany_gps_if() {
		return many_gps_if;
	}
	public void setMany_gps_if(boolean many_gps_if) {
		this.many_gps_if = many_gps_if;
	}
	public boolean isGps_addr_mat_if() {
		return gps_addr_mat_if;
	}
	public void setGps_addr_mat_if(boolean gps_addr_mat_if) {
		this.gps_addr_mat_if = gps_addr_mat_if;
	}
	public boolean isPho_addr_mat_if() {
		return pho_addr_mat_if;
	}
	public void setPho_addr_mat_if(boolean pho_addr_mat_if) {
		this.pho_addr_mat_if = pho_addr_mat_if;
	}
	public boolean isWork_addr_mat_if() {
		return work_addr_mat_if;
	}
	public void setWork_addr_mat_if(boolean work_addr_mat_if) {
		this.work_addr_mat_if = work_addr_mat_if;
	}
	public boolean isCard_outtime_if() {
		return card_outtime_if;
	}
	public void setCard_outtime_if(boolean card_outtime_if) {
		this.card_outtime_if = card_outtime_if;
	}
	@Override
	public String toString() {
		return "risk_inv_id:"+risk_inv_id+",user_id"+u.getUser_id();
	}
	
}
