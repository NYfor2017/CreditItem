package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.BlacklistWorkunit;
/**
 * BlacklistWorkunit的Dao层
 * @author N.Y
 *
 */
public interface BlacklistWorkunitDao {
	/**
	 * 获取企业的黑名单信息
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistWorkunit> getOwnBlacklistWorkunit(@Param("workunit_id")int workunit_id);
	
	/**
	 * 添加企业的黑名单
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistWorkunit(@Param("workunit_id")int workunit_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * 更新企业的黑名单
	 * @param blacklist__w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistWorkunit(@Param("blacklist_workunit_id")int blacklist__w_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * 删除企业的黑名单
	 * @param blacklist__w_id
	 * @return
	 */
	int deleteBlacklistWorkunit(@Param("blacklist_workunit_id")int blacklist__w_id);
	
}
