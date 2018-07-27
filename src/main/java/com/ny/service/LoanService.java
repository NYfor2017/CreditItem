package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Loan;
/**
 * Loan的业务接口类
 * @author N.Y
 *
 */
public interface LoanService {
	/**
	 * 获得用户的所有贷款项目
	 * @param user_id
	 * @return
	 */
	List<Loan> getOwnLoan(@RequestParam("user_id")int user_id);
	
	/**
	 * 添加贷款项目
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
	int addLoan(@RequestParam("loaner_type")String loaner_type, @RequestParam("loan_instruction")String loan_instruction, @RequestParam("loan_amount")int loan_amount,
			@RequestParam("loan_type")String loan_type, @RequestParam("loan_result")String loan_result, @RequestParam("loan_pub")int loan_pub, @RequestParam("loan_pub_date")String loan_pub_date,
			@RequestParam("loan_end_date")String loan_end_date, @RequestParam("loan_balance")int loan_balance, @RequestParam("loan_repay_month")int loan_repay_month,
			@RequestParam("loan_account_status")String loan_account_status, @RequestParam("loan_guar_method")String loan_guar_method, @RequestParam("loan_cur_overdue_peri")int loan_cur_overdue_peri,
			@RequestParam("loan_cur_overdue_amo")int loan_cur_overdue_amo, @RequestParam("loan_sum_overdue_amo")int loan_sum_overdue_amo, @RequestParam("loan_repay_status_24")String loan_repay_status_24,
			@RequestParam("loan_cur_overdue_12_time")int loan_cur_overdue_12_time, @RequestParam("user_id")int user_id);
	
	/**
	 * 更新贷款项目
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
	int updateLoan(@RequestParam("loan_id")int loan_id, @RequestParam("loaner_type")String loaner_type, @RequestParam("loan_instruction")String loan_instruction, @RequestParam("loan_amount")int loan_amount,
			@RequestParam("loan_type")String loan_type, @RequestParam("loan_result")String loan_result, @RequestParam("loan_pub")int loan_pub, @RequestParam("loan_pub_date")String loan_pub_date,
			@RequestParam("loan_end_date")String loan_end_date, @RequestParam("loan_balance")int loan_balance, @RequestParam("loan_repay_month")int loan_repay_month,
			@RequestParam("loan_account_status")String loan_account_status, @RequestParam("loan_guar_method")String loan_guar_method, @RequestParam("loan_cur_overdue_peri")int loan_cur_overdue_peri,
			@RequestParam("loan_cur_overdue_amo")int loan_cur_overdue_amo, @RequestParam("loan_sum_overdue_amo")int loan_sum_overdue_amo, @RequestParam("loan_repay_status_24")String loan_repay_status_24,
			@RequestParam("loan_cur_overdue_12_time")int loan_cur_overdue_12_time);
	
	/**
	 * 删除贷款项目
	 * @param loan_id
	 * @return
	 */
	int deleteLoan(@RequestParam("loan_id")int loan_id);
}
