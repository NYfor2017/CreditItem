package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.RiskInvestUserDao;
import com.ny.entity.RiskInvestUser;
import com.ny.service.RiskInvestUserService;

@Service
public class RiskInvestUserServiceImpl implements RiskInvestUserService{

	@Autowired
	RiskInvestUserDao riskInvestUserDao;
	/**
	 * 获取用户的风险排查信息
	 * @param user_id
	 * @return
	 */
	public List<RiskInvestUser> getOwnRiskInvestUser(int user_id) {
		return riskInvestUserDao.getOwnRiskInvestUser(user_id);
	}

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
	public int addRiskInvestUser(int user_id, boolean live_iden_if, boolean cont_loan_match_if, boolean sms_highrisk_if,
			boolean equ_risk_if, boolean phone_num_if, boolean many_wifi_if, boolean many_gps_if,
			boolean gps_addr_mat_if, boolean pho_addr_mat_if, boolean work_addr_mat_if, boolean card_outtime_if) {
		return riskInvestUserDao.addRiskInvestUser(user_id, live_iden_if, cont_loan_match_if, sms_highrisk_if, equ_risk_if, phone_num_if, many_wifi_if, many_gps_if, gps_addr_mat_if, pho_addr_mat_if, work_addr_mat_if, card_outtime_if);
	}

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
	public int updateInvestUser(int risk_inv_id, boolean live_iden_if, boolean cont_loan_match_if,
			boolean sms_highrisk_if, boolean equ_risk_if, boolean phone_num_if, boolean many_wifi_if,
			boolean many_gps_if, boolean gps_addr_mat_if, boolean pho_addr_mat_if, boolean work_addr_mat_if,
			boolean card_outtime_if) {
		return riskInvestUserDao.updateInvestUser(risk_inv_id, live_iden_if, cont_loan_match_if, sms_highrisk_if, equ_risk_if, phone_num_if, many_wifi_if, many_gps_if, gps_addr_mat_if, pho_addr_mat_if, work_addr_mat_if, card_outtime_if);
	}

	/**
	 * 删除风险排查信息
	 * @param risk_inv_id
	 * @return
	 */
	public int deleteInvestUser(int risk_inv_id) {
		return riskInvestUserDao.deleteInvestUser(risk_inv_id);
	}

}
