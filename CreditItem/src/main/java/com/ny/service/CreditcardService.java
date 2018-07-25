package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Creditcard;

public interface CreditcardService {
	/**
	 * ��ȡ�û����������ÿ���Ϣ
	 * @param user_id
	 * @return
	 */
	List<Creditcard> getOwnCreditcard(@RequestParam("user_id")int user_id);
	
	/**
	 * ������ÿ�
	 * @param creditcard_number
	 * @param creditcard_pro
	 * @param creditcard_status
	 * @param user_id
	 * @return
	 */
	int addCreditcard(@RequestParam("creditcard_number")String creditcard_number, @RequestParam("creditcard_pro")String creditcard_pro,
			@RequestParam("creditcard_status")String creditcard_status, @RequestParam("user_id")int user_id);
	
	/**
	 * �������ÿ�
	 * @param creditcard_id
	 * @param creditcard_number
	 * @param creditcard_pro
	 * @param creditcard_status
	 * @return
	 */
	int updateCreditcard(@RequestParam("creditcard_id")int creditcard_id, @RequestParam("creditcard_number")String creditcard_number,
			@RequestParam("creditcard_pro")String creditcard_pro, @RequestParam("creditcard_status")String creditcard_status);
	
	/**
	 * ɾ�����ÿ�
	 * @param creditcard_id
	 * @return
	 */
	int deleteCreditcard(@RequestParam("creditcard_id")int creditcard_id);
	
}
