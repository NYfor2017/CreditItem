package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.RiskInvestUser;
/**
 * RiskInvestUser的Dao类
 * @author N.Y
 *
 */
public interface RiskInvestUserDao {
	/**
	 * 获取用户的风险排查信息
	 * @param user_id
	 * @return
	 */
	List<RiskInvestUser> getOwnRiskInvestUser(@Param("user_id")int user_id);
	
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
	int addRiskInvestUser( @Param("user_id")int user_id,
	  @Param("live_iden_if")boolean live_iden_if,
	  @Param("cont_loan_match_if")boolean cont_loan_match_if,
	  @Param("sms_highrisks_if")boolean sms_highrisk_if,
	  @Param("equ_risk_if")boolean equ_risk_if,
	  @Param("phone_num_if")boolean phone_num_if,
	  @Param("many_wifi_if")boolean many_wifi_if,
	  @Param("many_gps_if")boolean many_gps_if,
	  @Param("gps_addr_mat_if")boolean gps_addr_mat_if,
	  @Param("pho_addr_mat_if")boolean pho_addr_mat_if,
	  @Param("work_addr_mat_if")boolean work_addr_mat_if,
	  @Param("card_outtime_if")boolean card_outtime_if);
	
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
	int updateInvestUser(@Param("risk_inv_id")int risk_inv_id,
	  @Param("live_iden_if")boolean live_iden_if,
	  @Param("cont_loan_match_if")boolean cont_loan_match_if,
	  @Param("sms_highrisks_if")boolean sms_highrisk_if,
	  @Param("equ_risk_if")boolean equ_risk_if,
	  @Param("phone_num_if")boolean phone_num_if,
	  @Param("many_wifi_if")boolean many_wifi_if,
	  @Param("many_gps_if")boolean many_gps_if,
	  @Param("gps_addr_mat_if")boolean gps_addr_mat_if,
	  @Param("pho_addr_mat_if")boolean pho_addr_mat_if,
	  @Param("work_addr_mat_if")boolean work_addr_mat_if,
	  @Param("card_outtime_if")boolean card_outtime_if);
	
	/**
	 * 删除风险排查信息
	 * @param risk_inv_id
	 * @return
	 */
	int deleteInvestUser(@Param("risk_inv_id")int risk_inv_id);
}
