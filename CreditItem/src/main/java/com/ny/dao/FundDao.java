package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Fund;
/**
 * Fund��Dao��
 * @author N.Y
 *
 */
public interface FundDao {
	
	/**
	 * ��ȡ�û��Ĺ�������Ϣ
	 * @param user_id
	 * @return
	 */
	List<Fund> getOwnFund(@Param("user_id")int user_id);
	
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
	int addFund(@Param("fund_account")String fund_account,@Param("fund_deposit_base")double fund_deposit_base,
			@Param("fund_payment_unit_cur")String fund_payment_unit_cur, @Param("fund_payment_month")int fund_payment_month,
			@Param("fund_city")String fund_city, @Param("fund_balance")double fund_balance, @Param("fund_last_entry_time")String fund_last_entry_time,
			@Param("fund_idcard")String fund_idcard, @Param("fund_num_cons_month")String fund_num_cons_month, @Param("user_id")int user_id);
	
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
	int update(@Param("fund_id")int fund_id,@Param("fund_account")String fund_account,@Param("fund_deposit_base")double fund_deposit_base,
			@Param("fund_payment_unit_cur")String fund_payment_unit_cur, @Param("fund_payment_month")int fund_payment_month,
			@Param("fund_city")String fund_city, @Param("fund_balance")double fund_balance, @Param("fund_last_entry_time")String fund_last_entry_time,
			@Param("fund_idcard")String fund_idcard, @Param("fund_num_cons_month")String fund_num_cons_month);

	/**
	 * ɾ����������Ϣ
	 * @param fund_id
	 * @return
	 */
	int delete(@Param("fund_id")int fund_id);
}
