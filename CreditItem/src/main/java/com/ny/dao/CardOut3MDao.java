package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.CardOut3M;

/**
 * CardOut3��Dao��
 * @author N.Y
 *
 */
public interface CardOut3MDao {
	/**
	 * ��ȡ�û������µ�֧����Ϣ
	 * @param user_id
	 * @return
	 */
	List<CardOut3M> getOwnCardOut3M(@Param("user_id")int user_id);
	
	/**
	 * ���֧����Ϣ
	 * @param out_3m_time
	 * @param out_3m_amount
	 * @param user_id
	 * @return
	 */
	int addCardOut3M(@Param("out_3m_time")int out_3m_time, @Param("out_3m_amount")int out_3m_amount, @Param("user_id")int user_id);
	
	/**
	 * ����֧����Ϣ
	 * @param out_3m_id
	 * @param out_3m_time
	 * @param out_3m_amount
	 * @return
	 */
	int updateCardOut3M(@Param("out_3m_id")int out_3m_id,@Param("out_3m_time")int out_3m_time, @Param("out_3m_amount")int out_3m_amount);
	
	/**
	 * ɾ��֧����Ϣ
	 * @param out_3m_id
	 * @return
	 */
	int deleteCardOut3M(@Param("out_3m_id")int out_3m_id);
}
