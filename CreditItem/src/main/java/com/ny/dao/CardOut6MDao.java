package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.CardOut6M;

public interface CardOut6MDao {
	List<CardOut6M> getOwnCardOut6M(@Param("user_id")int user_id);
	
	
	int addCardOut6M(@Param("out_6m_time")int out_6m_time, @Param("out_6m_amount")int out_6m_amount, @Param("user_id")int user_id);
	
	
	int updateCardOut6M(@Param("out_6m_id")int out_6m_id,@Param("out_6m_time")int out_6m_time, @Param("out_6m_amount")int out_6m_amount);
	
	
	int deleteCardOut6M(@Param("out_6m_id")int out_6m_id);
}
