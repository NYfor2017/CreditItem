package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.BlacklistCreditWorkunit;
/**
 * BlacklistCreditWorkunit的Dao层
 * @author N.Y
 *
 */
public interface BlacklistCreditWorkunitDao {
	/**
	 * 获得企业的信用黑名单
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistCreditWorkunit> getOwnBlacklistCreditWorkunit(@Param("workunit_id")int workunit_id);
	
	/**
	 * 添加企业信用黑名单
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistCreditWorkunit(@Param("workunit_id")int workunit_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * 更新企业信用黑名单
	 * @param blacklist_credit_w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistCreditWorkunit(@Param("blacklist_credit_w_id")int blacklist_credit_w_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * 删除企业信用黑名单
	 * @param blacklist_credit_w_id
	 * @return
	 */
	int deleteBlacklistCreditWorkunit(@Param("blacklist_credit_w_id")int blacklist_credit_w_id);
	
}
