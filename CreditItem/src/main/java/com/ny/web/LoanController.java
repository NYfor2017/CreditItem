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

import com.ny.entity.Loan;
import com.ny.service.LoanService;
/**
 * Loan的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class LoanController {
	@Autowired
	LoanService loanService;
	
	/**
	 * 列表功能，根据user_id获取列表
	 * @param user_id
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/loan",method=RequestMethod.GET)
	private List<Loan> list(@RequestBody int user_id,Model model){
		List<Loan> li= loanService.getOwnLoan(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param loaner_type
	 * @param loan_instruction
	 * @param loan_amount
	 * @param loan_type
	 * @param loan_result
	 * @param loan_pub
	 * @param loan_pub_date
	 * @param loan_end_date
	 * @param loan_balance
	 * @param loan_repay_month
	 * @param loan_account_status
	 * @param loan_guar_method
	 * @param loan_cur_overdue_peri
	 * @param loan_cur_overdue_amo
	 * @param loan_sum_overdue_amo
	 * @param loan_repay_status_24
	 * @param loan_cur_overdue_12_time
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/loan",method=RequestMethod.PUT)
	private String add(@RequestParam("loaner_type")String loaner_type, @RequestParam("loan_instruction")String loan_instruction, @RequestParam("loan_amount")int loan_amount,
			@RequestParam("loan_type")String loan_type, @RequestParam("loan_result")String loan_result, @RequestParam("loan_pub")int loan_pub, @RequestParam("loan_pub_date")String loan_pub_date,
			@RequestParam("loan_end_date")String loan_end_date, @RequestParam("loan_balance")int loan_balance, @RequestParam("loan_repay_month")int loan_repay_month,
			@RequestParam("loan_account_status")String loan_account_status, @RequestParam("loan_guar_method")String loan_guar_method, @RequestParam("loan_cur_overdue_peri")int loan_cur_overdue_peri,
			@RequestParam("loan_cur_overdue_amo")int loan_cur_overdue_amo, @RequestParam("loan_sum_overdue_amo")int loan_sum_overdue_amo, @RequestParam("loan_repay_status_24")String loan_repay_status_24,
			@RequestParam("loan_cur_overdue_12_time")int loan_cur_overdue_12_time, @RequestParam("user_id")int user_id) {
		int a = loanService.addLoan(loaner_type, loan_instruction, loan_amount, loan_type, loan_result, loan_pub, loan_pub_date, loan_end_date, loan_balance, loan_repay_month, loan_account_status, loan_guar_method, loan_cur_overdue_peri, loan_cur_overdue_amo, loan_sum_overdue_amo, loan_repay_status_24, loan_cur_overdue_12_time, user_id);
		if(a>-1)
			return "/loan";
		return "failure";
	}
	
	/**
	 * 更新功能，id为loan_id
	 * @param loan_id
	 * @param loaner_type
	 * @param loan_instruction
	 * @param loan_amount
	 * @param loan_type
	 * @param loan_result
	 * @param loan_pub
	 * @param loan_pub_date
	 * @param loan_end_date
	 * @param loan_balance
	 * @param loan_repay_month
	 * @param loan_account_status
	 * @param loan_guar_method
	 * @param loan_cur_overdue_peri
	 * @param loan_cur_overdue_amo
	 * @param loan_sum_overdue_amo
	 * @param loan_repay_status_24
	 * @param loan_cur_overdue_12_time
	 * @return
	 */
	@RequestMapping(value="/loan/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("loan_id")int loan_id, @RequestParam("loaner_type")String loaner_type, @RequestParam("loan_instruction")String loan_instruction, @RequestParam("loan_amount")int loan_amount,
			@RequestParam("loan_type")String loan_type, @RequestParam("loan_result")String loan_result, @RequestParam("loan_pub")int loan_pub, @RequestParam("loan_pub_date")String loan_pub_date,
			@RequestParam("loan_end_date")String loan_end_date, @RequestParam("loan_balance")int loan_balance, @RequestParam("loan_repay_month")int loan_repay_month,
			@RequestParam("loan_account_status")String loan_account_status, @RequestParam("loan_guar_method")String loan_guar_method, @RequestParam("loan_cur_overdue_peri")int loan_cur_overdue_peri,
			@RequestParam("loan_cur_overdue_amo")int loan_cur_overdue_amo, @RequestParam("loan_sum_overdue_amo")int loan_sum_overdue_amo, @RequestParam("loan_repay_status_24")String loan_repay_status_24,
			@RequestParam("loan_cur_overdue_12_time")int loan_cur_overdue_12_time) {
		int u = loanService.updateLoan(loan_id, loaner_type, loan_instruction, loan_amount, loan_type, loan_result, loan_pub, loan_pub_date, loan_end_date, loan_balance, loan_repay_month, loan_account_status, loan_guar_method, loan_cur_overdue_peri, loan_cur_overdue_amo, loan_sum_overdue_amo, loan_repay_status_24, loan_cur_overdue_12_time);
		if(u>-1)
			return "/loan";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为loan_id
	 * @param loan_id
	 * @return
	 */
	@RequestMapping(value="/loan/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("loan_id")int loan_id) {
		int d = loanService.deleteLoan(loan_id);
		if(d>-1)
			return "/loan";
		return "failure";
	}
}
