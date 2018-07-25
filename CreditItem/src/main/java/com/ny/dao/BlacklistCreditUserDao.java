package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.BlacklistCreditUser;

/**
 * BlacklistCreditUser的Dao类
 * @author N.Y
 *
 */
public interface BlacklistCreditUserDao {
	
	/**
	 * 获取用户的信贷逾期黑名单
	 * @param user_id
	 * @return
	 */
	List<BlacklistCreditUser> getOwnBlacklistCreditUser(@Param("user_id")int user_id);
	
	/**
	 * 添加信贷逾期黑名单
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistCreditUser(@Param("user_id")int user_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * 更新信贷逾期黑名单
	 * @param blacklist_credit_u_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistCreditUser(@Param("blacklist_credit_u_id")int blacklist_credit_u_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * 删除信贷逾期黑名单
	 * @param blacklist_credit_u_id
	 * @return
	 */
	int deleteBlacklistCreditUser(@Param("blacklist_credit_u_id")int blacklist_credit_u_id);
	
}
