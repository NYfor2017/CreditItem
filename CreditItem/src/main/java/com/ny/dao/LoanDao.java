package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Loan;
/**
 * Loan的Dao类
 * @author N.Y
 *
 */
public interface LoanDao {
	
	/**
	 * 获得用户的所有贷款项目
	 * @param user_id
	 * @return
	 */
	List<Loan> getOwnLoan(@Param("user_id")int user_id);
	
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
	int addLoan(@Param("loaner_type")String loaner_type, @Param("loan_instruction")String loan_instruction, @Param("loan_amount")int loan_amount,
			@Param("loan_type")String loan_type, @Param("loan_result")String loan_result, @Param("loan_pub")int loan_pub, @Param("loan_pub_date")String loan_pub_date,
			@Param("loan_end_date")String loan_end_date, @Param("loan_balance")int loan_balance, @Param("loan_repay_month")int loan_repay_month,
			@Param("loan_account_status")String loan_account_status, @Param("loan_guar_method")String loan_guar_method, @Param("loan_cur_overdue_peri")int loan_cur_overdue_peri,
			@Param("loan_cur_overdue_amo")int loan_cur_overdue_amo, @Param("loan_sum_overdue_amo")int loan_sum_overdue_amo, @Param("loan_repay_status_24")String loan_repay_status_24,
			@Param("loan_cur_overdue_12_time")int loan_cur_overdue_12_time, @Param("user_id")int user_id);
	
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
	int updateLoan(@Param("loan_id")int loan_id, @Param("loaner_type")String loaner_type, @Param("loan_instruction")String loan_instruction, @Param("loan_amount")int loan_amount,
			@Param("loan_type")String loan_type, @Param("loan_result")String loan_result, @Param("loan_pub")int loan_pub, @Param("loan_pub_date")String loan_pub_date,
			@Param("loan_end_date")String loan_end_date, @Param("loan_balance")int loan_balance, @Param("loan_repay_month")int loan_repay_month,
			@Param("loan_account_status")String loan_account_status, @Param("loan_guar_method")String loan_guar_method, @Param("loan_cur_overdue_peri")int loan_cur_overdue_peri,
			@Param("loan_cur_overdue_amo")int loan_cur_overdue_amo, @Param("loan_sum_overdue_amo")int loan_sum_overdue_amo, @Param("loan_repay_status_24")String loan_repay_status_24,
			@Param("loan_cur_overdue_12_time")int loan_cur_overdue_12_time);
	
	/**
	 * 删除贷款项目
	 * @param loan_id
	 * @return
	 */
	int deleteLoan(@Param("loan_id")int loan_id);
}
