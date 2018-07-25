package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Creditcard;

public interface CreditcardService {
	/**
	 * 获取用户的所有信用卡信息
	 * @param user_id
	 * @return
	 */
	List<Creditcard> getOwnCreditcard(@RequestParam("user_id")int user_id);
	
	/**
	 * 添加信用卡
	 * @param creditcard_number
	 * @param creditcard_pro
	 * @param creditcard_status
	 * @param user_id
	 * @return
	 */
	int addCreditcard(@RequestParam("creditcard_number")String creditcard_number, @RequestParam("creditcard_pro")String creditcard_pro,
			@RequestParam("creditcard_status")String creditcard_status, @RequestParam("user_id")int user_id);
	
	/**
	 * 更新信用卡
	 * @param creditcard_id
	 * @param creditcard_number
	 * @param creditcard_pro
	 * @param creditcard_status
	 * @return
	 */
	int updateCreditcard(@RequestParam("creditcard_id")int creditcard_id, @RequestParam("creditcard_number")String creditcard_number,
			@RequestParam("creditcard_pro")String creditcard_pro, @RequestParam("creditcard_status")String creditcard_status);
	
	/**
	 * 删除信用卡
	 * @param creditcard_id
	 * @return
	 */
	int deleteCreditcard(@RequestParam("creditcard_id")int creditcard_id);
	
}
