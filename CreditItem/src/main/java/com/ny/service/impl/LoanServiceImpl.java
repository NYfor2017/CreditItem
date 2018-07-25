package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.LoanDao;
import com.ny.entity.Loan;
import com.ny.service.LoanService;
/**
 * Loan的业务实现类
 * @author N.Y
 *
 */
@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanDao loanDao;
	
	public List<Loan> getOwnLoan(int user_id) {
		return loanDao.getOwnLoan(user_id);
	}

	public int addLoan(String loaner_type, String loan_instruction, int loan_amount, String loan_type,
			String loan_result, int loan_pub, String loan_pub_date, String loan_end_date, int loan_balance,
			int loan_repay_month, String loan_account_status, String loan_guar_method, int loan_cur_overdue_peri,
			int loan_cur_overdue_amo, int loan_sum_overdue_amo, String loan_repay_status_24,
			int loan_cur_overdue_12_time, int user_id) {
		return loanDao.addLoan(loaner_type, loan_instruction, loan_amount, loan_type, loan_result, loan_pub, loan_pub_date, loan_end_date, loan_balance, loan_repay_month, loan_account_status, loan_guar_method, loan_cur_overdue_peri, loan_cur_overdue_amo, loan_sum_overdue_amo, loan_repay_status_24, loan_cur_overdue_12_time, user_id);
	}

	public int updateLoan(int loan_id, String loaner_type, String loan_instruction, int loan_amount, String loan_type,
			String loan_result, int loan_pub, String loan_pub_date, String loan_end_date, int loan_balance,
			int loan_repay_month, String loan_account_status, String loan_guar_method, int loan_cur_overdue_peri,
			int loan_cur_overdue_amo, int loan_sum_overdue_amo, String loan_repay_status_24,
			int loan_cur_overdue_12_time) {
		return loanDao.updateLoan(loan_id, loaner_type, loan_instruction, loan_amount, loan_type, loan_result, loan_pub, loan_pub_date, loan_end_date, loan_balance, loan_repay_month, loan_account_status, loan_guar_method, loan_cur_overdue_peri, loan_cur_overdue_amo, loan_sum_overdue_amo, loan_repay_status_24, loan_cur_overdue_12_time);
				
	}

	public int deleteLoan(int loan_id) {
		return loanDao.deleteLoan(loan_id);
	}

}
