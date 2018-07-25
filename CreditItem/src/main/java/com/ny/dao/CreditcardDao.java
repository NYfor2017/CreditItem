package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Creditcard;

public interface CreditcardDao {
	
	/**
	 * 获取用户的所有信用卡信息
	 * @param user_id
	 * @return
	 */
	List<Creditcard> getOwnCreditcard(@Param("user_id")int user_id);
	
	/**
	 * 添加信用卡
	 * @param creditcard_number
	 * @param creditcard_pro
	 * @param creditcard_status
	 * @param user_id
	 * @return
	 */
	int addCreditcard(@Param("creditcard_number")String creditcard_number, @Param("creditcard_pro")String creditcard_pro,
			@Param("creditcard_status")String creditcard_status, @Param("user_id")int user_id);
	
	/**
	 * 更新信用卡
	 * @param creditcard_id
	 * @param creditcard_number
	 * @param creditcard_pro
	 * @param creditcard_status
	 * @return
	 */
	int updateCreditcard(@Param("creditcard_id")int creditcard_id, @Param("creditcard_number")String creditcard_number,
			@Param("creditcard_pro")String creditcard_pro, @Param("creditcard_status")String creditcard_status);
	
	/**
	 * 删除信用卡
	 * @param creditcard_id
	 * @return
	 */
	int deleteCreditcard(@Param("creditcard_id")int creditcard_id);
	
}
