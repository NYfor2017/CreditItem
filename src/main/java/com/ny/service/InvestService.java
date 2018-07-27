package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Invest;
/**
 * Invest的业务接口类
 * @author N.Y
 *
 */
public interface InvestService {
	/**
	 * 获取用户的投资项目列表
	 * @param user_id
	 * @return
	 */
	List<Invest> getOwnInvest(@RequestParam("user_id")int user_id);
	
	/**
	 * 添加投资项目信息
	 * @param invest_itemName
	 * @param invest_amount
	 * @param user_id
	 * @return
	 */
	int addInvest(@RequestParam("invest_itemName")String invest_itemName, @RequestParam("invest_amount")int invest_amount, @RequestParam("user_id")int user_id);
	
	/**
	 * 更新投资项目信息
	 * @param invest_id
	 * @param invest_itemName
	 * @param invest_amount
	 * @return
	 */
	int updateInvest(@RequestParam("invest_id")int invest_id,@RequestParam("invest_itemName")String invest_itemName, @RequestParam("invest_amount")int invest_amount);
	
	/**
	 * 删除投资项目信息
	 * @param invest_id
	 * @return
	 */
	int deleteInvest(@RequestParam("invest_id")int invest_id);

}
