package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.FundDao;
import com.ny.entity.Fund;
import com.ny.service.FundService;

@Service
public class FundServiceImpl implements FundService{

	@Autowired
	FundDao fundDao;
	
	public List<Fund> getOwnFund(int user_id) {
		return fundDao.getOwnFund(user_id);
	}

	public int addFund(String fund_account, double fund_deposit_base, String fund_payment_unit_cur,
			int fund_payment_month, String fund_city, double fund_balance, String fund_last_entry_time,
			String fund_idcard, String fund_num_cons_month, int user_id) {
		return fundDao.addFund(fund_account, fund_deposit_base, fund_payment_unit_cur, fund_payment_month, fund_city, fund_balance, fund_last_entry_time, fund_idcard, fund_num_cons_month, user_id);
	}

	public int updateFund(int fund_id, String fund_account, double fund_deposit_base, String fund_payment_unit_cur,
			int fund_payment_month, String fund_city, double fund_balance, String fund_last_entry_time,
			String fund_idcard, String fund_num_cons_month) {
		return fundDao.update(fund_id, fund_account, fund_deposit_base, fund_payment_unit_cur, fund_payment_month, fund_city, fund_balance, fund_last_entry_time, fund_idcard, fund_num_cons_month);
	}

	public int deleteFund(int fund_id) {
		return fundDao.delete(fund_id);
	}
	
}
