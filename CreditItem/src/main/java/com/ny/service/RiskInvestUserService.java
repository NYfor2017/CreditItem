package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.RiskInvestUser;
/**
 * RiskInvestUser的业务接口类
 * @author N.Y
 *
 */
public interface RiskInvestUserService {
	/**
	 * 获取用户的风险排查信息
	 * @param user_id
	 * @return
	 */
	List<RiskInvestUser> getOwnRiskInvestUser(@RequestParam("user_id")int user_id);
	
	/**
	 * 增加风险排查信息
	 * @param user_id
	 * @param live_iden_if
	 * @param cont_loan_match_if
	 * @param sms_highrisk_if
	 * @param equ_risk_if
	 * @param phone_num_if
	 * @param many_wifi_if
	 * @param many_gps_if
	 * @param gps_addr_mat_if
	 * @param pho_addr_mat_if
	 * @param work_addr_mat_if
	 * @param card_outtime_if
	 * @return
	 */
	int addRiskInvestUser( @RequestParam("user_id")int user_id,
	  @RequestParam("live_iden_if")boolean live_iden_if,
	  @RequestParam("cont_loan_match_if")boolean cont_loan_match_if,
	  @RequestParam("sms_highrisks_if")boolean sms_highrisk_if,
	  @RequestParam("equ_risk_if")boolean equ_risk_if,
	  @RequestParam("phone_num_if")boolean phone_num_if,
	  @RequestParam("many_wifi_if")boolean many_wifi_if,
	  @RequestParam("many_gps_if")boolean many_gps_if,
	  @RequestParam("gps_addr_mat_if")boolean gps_addr_mat_if,
	  @RequestParam("pho_addr_mat_if")boolean pho_addr_mat_if,
	  @RequestParam("work_addr_mat_if")boolean work_addr_mat_if,
	  @RequestParam("card_outtime_if")boolean card_outtime_if);
	
	/**
	 * 更新风险排查信息
	 * @param risk_inv_id
	 * @param live_iden_if
	 * @param cont_loan_match_if
	 * @param sms_highrisk_if
	 * @param equ_risk_if
	 * @param phone_num_if
	 * @param many_wifi_if
	 * @param many_gps_if
	 * @param gps_addr_mat_if
	 * @param pho_addr_mat_if
	 * @param work_addr_mat_if
	 * @param card_outtime_if
	 * @return
	 */
	int updateInvestUser(@RequestParam("risk_inv_id")int risk_inv_id,
	  @RequestParam("live_iden_if")boolean live_iden_if,
	  @RequestParam("cont_loan_match_if")boolean cont_loan_match_if,
	  @RequestParam("sms_highrisks_if")boolean sms_highrisk_if,
	  @RequestParam("equ_risk_if")boolean equ_risk_if,
	  @RequestParam("phone_num_if")boolean phone_num_if,
	  @RequestParam("many_wifi_if")boolean many_wifi_if,
	  @RequestParam("many_gps_if")boolean many_gps_if,
	  @RequestParam("gps_addr_mat_if")boolean gps_addr_mat_if,
	  @RequestParam("pho_addr_mat_if")boolean pho_addr_mat_if,
	  @RequestParam("work_addr_mat_if")boolean work_addr_mat_if,
	  @RequestParam("card_outtime_if")boolean card_outtime_if);
	
	/**
	 * 删除风险排查信息
	 * @param risk_inv_id
	 * @return
	 */
	int deleteInvestUser(@RequestParam("risk_inv_id")int risk_inv_id);
}
