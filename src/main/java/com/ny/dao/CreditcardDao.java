package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Creditcard;

public interface CreditcardDao {
	
	/**
	 * ��ȡ�û����������ÿ���Ϣ
	 * @param user_id
	 * @return
	 */
	List<Creditcard> getOwnCreditcard(@Param("user_id")int user_id);
	
	/**
	 * ������ÿ�
	 * @param creditcard_number
	 * @param creditcard_pro
	 * @param creditcard_status
	 * @param user_id
	 * @return
	 */
	int addCreditcard(@Param("creditcard_number")String creditcard_number, @Param("creditcard_pro")String creditcard_pro,
			@Param("creditcard_status")String creditcard_status, @Param("user_id")int user_id);
	
	/**
	 * �������ÿ�
	 * @param creditcard_id
	 * @param creditcard_number
	 * @param creditcard_pro
	 * @param creditcard_status
	 * @return
	 */
	int updateCreditcard(@Param("creditcard_id")int creditcard_id, @Param("creditcard_number")String creditcard_number,
			@Param("creditcard_pro")String creditcard_pro, @Param("creditcard_status")String creditcard_status);
	
	/**
	 * ɾ�����ÿ�
	 * @param creditcard_id
	 * @return
	 */
	int deleteCreditcard(@Param("creditcard_id")int creditcard_id);
	
}
