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

import com.ny.entity.Fund;
import com.ny.service.FundService;
/**
 * Fund的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class FundController {
	@Autowired
	FundService fundService;
	
	/**
	 * 列表功能，根据user_id获取列表功能
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/fund",method=RequestMethod.GET)
	private List<Fund> list(@RequestBody int user_id,Model model){
		List<Fund> li = fundService.getOwnFund(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param fund_account
	 * @param fund_deposit_base
	 * @param fund_payment_unit_cur
	 * @param fund_payment_month
	 * @param fund_city
	 * @param fund_balance
	 * @param fund_last_entry_time
	 * @param fund_idcard
	 * @param fund_num_cons_month
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/fund",method=RequestMethod.PUT)
	private String add(@RequestParam("fund_account")String fund_account,@RequestParam("fund_deposit_base")double fund_deposit_base,
			@RequestParam("fund_payment_unit_cur")String fund_payment_unit_cur, @RequestParam("fund_payment_month")int fund_payment_month,
			@RequestParam("fund_city")String fund_city, @RequestParam("fund_balance")double fund_balance, @RequestParam("fund_last_entry_time")String fund_last_entry_time,
			@RequestParam("fund_idcard")String fund_idcard, @RequestParam("fund_num_cons_month")String fund_num_cons_month, @RequestParam("user_id")int user_id) {
		int a = fundService.addFund(fund_account, fund_deposit_base, fund_payment_unit_cur, fund_payment_month, fund_city, fund_balance, fund_last_entry_time, fund_idcard, fund_num_cons_month, user_id);
		if(a>-1)
			return "/fund";
		return "failure";
	}
	
	/**
	 * 更新功能，id为fund_id
	 * @param fund_id
	 * @param fund_account
	 * @param fund_deposit_base
	 * @param fund_payment_unit_cur
	 * @param fund_payment_month
	 * @param fund_city
	 * @param fund_balance
	 * @param fund_last_entry_time
	 * @param fund_idcard
	 * @param fund_num_cons_month
	 * @return
	 */
	@RequestMapping(value="/fund/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("fund_id")int fund_id,@RequestParam("fund_account")String fund_account,@RequestParam("fund_deposit_base")double fund_deposit_base,
			@RequestParam("fund_payment_unit_cur")String fund_payment_unit_cur, @RequestParam("fund_payment_month")int fund_payment_month,
			@RequestParam("fund_city")String fund_city, @RequestParam("fund_balance")double fund_balance, @RequestParam("fund_last_entry_time")String fund_last_entry_time,
			@RequestParam("fund_idcard")String fund_idcard, @RequestParam("fund_num_cons_month")String fund_num_cons_month) {
		int u = fundService.updateFund(fund_id, fund_account, fund_deposit_base, fund_payment_unit_cur, fund_payment_month, fund_city, fund_balance, fund_last_entry_time, fund_idcard, fund_num_cons_month);
		if(u>-1)
			return "/fund";
		return "failure";
	}
	
	/**
	 * 删除功能，id为fund_id
	 * @param fund_id
	 * @return
	 */
	@RequestMapping(value="/fund/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("fund_id")int fund_id) {
		int d = fundService.deleteFund(fund_id);
		if(d>-1)
			return "/fund";
		return "/failure";
	}
}
