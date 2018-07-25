package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.BlacklistWorkunit;
/**
 * BlacklistWorkunit的业务接口类
 * @author N.Y
 *
 */
public interface BlacklistWorkunitService {
	/**
	 * 获取企业的黑名单信息
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistWorkunit> getOwnBlacklistWorkunit(@RequestParam("workunit_id")int workunit_id);
	
	/**
	 * 添加企业的黑名单
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistWorkunit(@RequestParam("workunit_id")int workunit_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * 更新企业的黑名单
	 * @param blacklist__w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistWorkunit(@RequestParam("blacklist_workunit_id")int blacklist__w_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * 删除企业的黑名单
	 * @param blacklist__w_id
	 * @return
	 */
	int deleteBlacklistWorkunit(@RequestParam("blacklist_workunit_id")int blacklist__w_id);
	
}
