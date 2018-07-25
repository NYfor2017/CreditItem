package com.ny.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.CardOut6M;
/**
 * CardOut6M的业务接口类
 * @author N.Y
 *
 */
public interface CardOut6MService {
	/**
	 * 获取用户6个月的支出信息
	 * @param user_id
	 * @return
	 */
	List<CardOut6M> getOwnCardOut6M(@Param("user_id")int user_id);
	
	/**
	 * 添加支出信息
	 * @param out_6m_time
	 * @param out_6m_amount
	 * @param user_id
	 * @return
	 */
	int addCardOut6M(@Param("out_6m_time")int out_6m_time, @Param("out_6m_amount")int out_6m_amount, @Param("user_id")int user_id);
	
	/**
	 * 更新支出信息
	 * @param out_6m_id
	 * @param out_6m_time
	 * @param out_6m_amount
	 * @return
	 */
	int updateCardOut6M(@Param("out_6m_id")int out_6m_id,@Param("out_6m_time")int out_6m_time, @Param("out_6m_amount")int out_6m_amount);
	
	/**
	 * 删除支出信息
	 * @param out_6m_id
	 * @return
	 */
	int deleteCardOut6M(@Param("out_6m_id")int out_6m_id);
}
