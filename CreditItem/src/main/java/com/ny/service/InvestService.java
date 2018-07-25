package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Invest;
/**
 * Invest��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface InvestService {
	/**
	 * ��ȡ�û���Ͷ����Ŀ�б�
	 * @param user_id
	 * @return
	 */
	List<Invest> getOwnInvest(@RequestParam("user_id")int user_id);
	
	/**
	 * ���Ͷ����Ŀ��Ϣ
	 * @param invest_itemName
	 * @param invest_amount
	 * @param user_id
	 * @return
	 */
	int addInvest(@RequestParam("invest_itemName")String invest_itemName, @RequestParam("invest_amount")int invest_amount, @RequestParam("user_id")int user_id);
	
	/**
	 * ����Ͷ����Ŀ��Ϣ
	 * @param invest_id
	 * @param invest_itemName
	 * @param invest_amount
	 * @return
	 */
	int updateInvest(@RequestParam("invest_id")int invest_id,@RequestParam("invest_itemName")String invest_itemName, @RequestParam("invest_amount")int invest_amount);
	
	/**
	 * ɾ��Ͷ����Ŀ��Ϣ
	 * @param invest_id
	 * @return
	 */
	int deleteInvest(@RequestParam("invest_id")int invest_id);

}
