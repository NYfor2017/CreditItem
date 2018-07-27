package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Invest;
/**
 * Invest的Dao类
 * @author N.Y
 *
 */
public interface InvestDao {
	/**
	 * 获取用户的投资项目列表
	 * @param user_id
	 * @return
	 */
	List<Invest> getOwnInvest(@Param("user_id")int user_id);
	
	/**
	 * 添加投资项目信息
	 * @param invest_itemName
	 * @param invest_amount
	 * @param user_id
	 * @return
	 */
	int addInvest(@Param("invest_itemName")String invest_itemName, @Param("invest_amount")int invest_amount, @Param("user_id")int user_id);
	
	/**
	 * 更新投资项目信息
	 * @param invest_id
	 * @param invest_itemName
	 * @param invest_amount
	 * @return
	 */
	int updateInvest(@Param("invest_id")int invest_id,@Param("invest_itemName")String invest_itemName, @Param("invest_amount")int invest_amount);
	
	/**
	 * 删除投资项目信息
	 * @param invest_id
	 * @return
	 */
	int deleteInvest(@Param("invest_id")int invest_id);

}
