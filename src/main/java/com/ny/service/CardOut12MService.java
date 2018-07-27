package com.ny.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.CardOut12M;
/**
 * CardOut12M的业务接口类
 * @author N.Y
 *
 */
public interface CardOut12MService {
	/**
	 * 获取用户12个月的支出信息
	 * @param user_id
	 * @return
	 */
	List<CardOut12M> getOwnCardOut12M(@Param("user_id")int user_id);
	
	/**
	 * 添加支出信息
	 * @param out_12m_time
	 * @param out_12m_amount
	 * @param user_id
	 * @return
	 */
	int addCardOut12M(@Param("out_12m_time")int out_12m_time, @Param("out_12m_amount")int out_12m_amount, @Param("user_id")int user_id);
	
	/**
	 * 更新支出信息
	 * @param out_12m_id
	 * @param out_12m_time
	 * @param out_12m_amount
	 * @return
	 */
	int updateCardOut12M(@Param("out_12m_id")int out_12m_id,@Param("out_12m_time")int out_12m_time, @Param("out_12m_amount")int out_12m_amount);
	
	/**
	 * 删除支出信息
	 * @param out_12m_id
	 * @return
	 */
	int deleteCardOut12M(@Param("out_12m_id")int out_12m_id);
}
