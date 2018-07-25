package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Fund;

/**
 * Fund��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface FundService {
	
	/**
	 * ��ȡ�û������й�������Ϣ
	 * @param user_id
	 * @return
	 */
	List<Fund> getOwnFund(@RequestParam("user_id")int user_id);
	
	/**
	 * ��ӹ�������Ϣ
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
	int addFund(@RequestParam("fund_account")String fund_account,@RequestParam("fund_deposit_base")double fund_deposit_base,
			@RequestParam("fund_payment_unit_cur")String fund_payment_unit_cur, @RequestParam("fund_payment_month")int fund_payment_month,
			@RequestParam("fund_city")String fund_city, @RequestParam("fund_balance")double fund_balance, @RequestParam("fund_last_entry_time")String fund_last_entry_time,
			@RequestParam("fund_idcard")String fund_idcard, @RequestParam("fund_num_cons_month")String fund_num_cons_month, @RequestParam("user_id")int user_id);
	
	/**
	 * ���¹�������Ϣ
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
	int updateFund(@RequestParam("fund_id")int fund_id,@RequestParam("fund_account")String fund_account,@RequestParam("fund_deposit_base")double fund_deposit_base,
			@RequestParam("fund_payment_unit_cur")String fund_payment_unit_cur, @RequestParam("fund_payment_month")int fund_payment_month,
			@RequestParam("fund_city")String fund_city, @RequestParam("fund_balance")double fund_balance, @RequestParam("fund_last_entry_time")String fund_last_entry_time,
			@RequestParam("fund_idcard")String fund_idcard, @RequestParam("fund_num_cons_month")String fund_num_cons_month);
	
	/**
	 * ɾ����������Ϣ
	 * @param fund_id
	 * @return
	 */
	int deleteFund(@RequestParam("fund_id")int fund_id);
}
