package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.BlacklistLegalUser;

/**
 * BlacklistLegalUser的Dao类
 * @author N.Y
 *
 */
public interface BlacklistLegalUserDao {
	/**
	 * 用户的人事刑事案件列表
	 * @param user_id
	 * @return
	 */
	List<BlacklistLegalUser> getOwnBlacklistLegalUser(@Param("user_id")int user_id);
	
	/**
	 * 添加人事刑事案件
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistLegalUser(@Param("user_id")int user_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * 更新人事刑事案件
	 * @param blacklist_legal_u_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistLegalUser(@Param("blacklist_legal_u_id")int blacklist_legal_u_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * 删除人事刑事案件
	 * @param blacklist_legal_u_id
	 * @return
	 */
	int deleteBlacklistLeaglUser(@Param("blacklist_legal_u_id")int blacklist_legal_u_id);
}
