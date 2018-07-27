package com.ny.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ny.entity.RiskInvestUser;
import com.ny.service.RiskInvestUserService;
/**
 * RiskInvestUser的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class RiskInvestUserController {
	
	@Autowired
	RiskInvestUserService riskInvestUserService;
	
	/**
	 * 列表功能，获取user_id的列表
	 * @param user_id
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/riskInvestUser",method=RequestMethod.GET)
	private List<RiskInvestUser> list(@RequestBody int user_id,Model model){
		List<RiskInvestUser> li = riskInvestUserService.getOwnRiskInvestUser(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
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
	@RequestMapping(value="/riskInvestUser",method=RequestMethod.PUT)
	private String add(@RequestParam("user_id")int user_id,
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
	  @RequestParam("card_outtime_if")boolean card_outtime_if) {
		int a = riskInvestUserService.addRiskInvestUser(user_id, live_iden_if, cont_loan_match_if, sms_highrisk_if, equ_risk_if, phone_num_if, many_wifi_if, many_gps_if, gps_addr_mat_if, pho_addr_mat_if, work_addr_mat_if, card_outtime_if);
		if(a>-1)
			return "/riskInvestUser";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为risk_inv_id
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
	@RequestMapping(value="/riskInvestUser/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("risk_inv_id")int risk_inv_id,
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
	  @RequestParam("card_outtime_if")boolean card_outtime_if) {
		int u  = riskInvestUserService.updateInvestUser(risk_inv_id, live_iden_if, cont_loan_match_if, sms_highrisk_if, equ_risk_if, phone_num_if, many_wifi_if, many_gps_if, gps_addr_mat_if, pho_addr_mat_if, work_addr_mat_if, card_outtime_if);
		if(u>-1)
			return "/riskInvestUser";
		return "failure";
	}
	
	/**
	 * 删除功能，id为risk_inv_id
	 * @param risk_inv_id
	 * @return
	 */
	@RequestMapping(value="/riskInvestUser/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("risk_inv_id")int risk_inv_id) {
		int d = riskInvestUserService.deleteInvestUser(risk_inv_id);
		if(d>-1)
			return "/riskInvestUser";
		return "/failure";
	}
}
