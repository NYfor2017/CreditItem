package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.CardOut3M;
/**
 * CardOut3M��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface CardOut3MService {
	/**
	 * ��ȡ�û������µ�֧����Ϣ
	 * @param user_id
	 * @return
	 */
	List<CardOut3M> getOwnCardOut3M(@RequestParam("user_id")int user_id);
	
	/**
	 * ���֧����Ϣ
	 * @param out_3m_time
	 * @param out_3m_amount
	 * @param user_id
	 * @return
	 */
	int addCardOut3M(@RequestParam("out_3m_time")int out_3m_time, @RequestParam("out_3m_amount")int out_3m_amount, @RequestParam("user_id")int user_id);
	
	/**
	 * ����֧����Ϣ
	 * @param out_3m_id
	 * @param out_3m_time
	 * @param out_3m_amount
	 * @return
	 */
	int updateCardOut3M(@RequestParam("out_3m_id")int out_3m_id,@RequestParam("out_3m_time")int out_3m_time, @RequestParam("out_3m_amount")int out_3m_amount);
	
	/**
	 * ɾ��֧����Ϣ
	 * @param out_3m_id
	 * @return
	 */
	int deleteCardOut3M(@RequestParam("out_3m_id")int out_3m_id);
}
