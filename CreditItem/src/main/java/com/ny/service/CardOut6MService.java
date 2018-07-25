package com.ny.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.CardOut6M;
/**
 * CardOut6M��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface CardOut6MService {
	/**
	 * ��ȡ�û�6���µ�֧����Ϣ
	 * @param user_id
	 * @return
	 */
	List<CardOut6M> getOwnCardOut6M(@Param("user_id")int user_id);
	
	/**
	 * ���֧����Ϣ
	 * @param out_6m_time
	 * @param out_6m_amount
	 * @param user_id
	 * @return
	 */
	int addCardOut6M(@Param("out_6m_time")int out_6m_time, @Param("out_6m_amount")int out_6m_amount, @Param("user_id")int user_id);
	
	/**
	 * ����֧����Ϣ
	 * @param out_6m_id
	 * @param out_6m_time
	 * @param out_6m_amount
	 * @return
	 */
	int updateCardOut6M(@Param("out_6m_id")int out_6m_id,@Param("out_6m_time")int out_6m_time, @Param("out_6m_amount")int out_6m_amount);
	
	/**
	 * ɾ��֧����Ϣ
	 * @param out_6m_id
	 * @return
	 */
	int deleteCardOut6M(@Param("out_6m_id")int out_6m_id);
}
