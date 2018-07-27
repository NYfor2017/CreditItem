package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.BlacklistCreditUser;
/**
 * BlacklistCreditUser的业务接口类
 * @author N.Y
 *
 */
public interface BlacklistCreditUserService {
	/**
	 * 获取用户的信贷逾期黑名单
	 * @param user_id
	 * @return
	 */
	List<BlacklistCreditUser> getOwnBlacklistCreditUser(@RequestParam("user_id")int user_id);
	
	/**
	 * 添加信贷逾期黑名单
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistCreditUser(@RequestParam("user_id")int user_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * 更新信贷逾期黑名单
	 * @param blacklist_credit_u_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistCreditUser(@RequestParam("blacklist_credit_u_id")int blacklist_credit_u_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * 删除信贷逾期黑名单
	 * @param blacklist_credit_u_id
	 * @return
	 */
	int deleteBlacklistCreditUser(@RequestParam("blacklist_credit_u_id")int blacklist_credit_u_id);
	
}
