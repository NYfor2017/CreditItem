package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.BlacklistLegalWorkunit;
/**
 * BlacklistLegalWorkunit的Dao层
 * @author N.Y
 *
 */
public interface BlacklistLegalWorkunitDao {
	/**
	 * 获取企业的刑事列表
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistLegalWorkunit> getOwnBlacklistLegalWorkunit(@Param("workunit_id")int workunit_id);
	
	/**
	 * 添加企业的刑事信息
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistLegalWorkunit(@Param("workunit_id")int workunit_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * 更新企业的刑事信息
	 * @param blacklist_legal_w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistLegalWorkunit(@Param("blacklist_legal_w_id")int blacklist_legal_w_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * 删除企业的刑事信息
	 * @param blacklist_legal_w_id
	 * @return
	 */
	int deleteBlacklistLegalWorkunit(@Param("blacklist_legal_w_id")int blacklist_legal_w_id);
	
}
