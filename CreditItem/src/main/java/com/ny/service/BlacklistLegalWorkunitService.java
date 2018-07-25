package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.BlacklistLegalWorkunit;
/**
 * BlacklistLegalWorkunit的业务接口类
 * @author N.Y
 *
 */
public interface BlacklistLegalWorkunitService {
	/**
	 * 获取企业的刑事列表
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistLegalWorkunit> getOwnBlacklistLegalWorkunit(@RequestParam("workunit_id")int workunit_id);
	
	/**
	 * 添加企业的刑事信息
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistLegalWorkunit(@RequestParam("workunit_id")int workunit_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * 更新企业的刑事信息
	 * @param blacklist_legal_w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistLegalWorkunit(@RequestParam("blacklist_legal_w_id")int blacklist_legal_w_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * 删除企业的刑事信息
	 * @param blacklist_legal_w_id
	 * @return
	 */
	int deleteBlacklistLegalWorkunit(@RequestParam("blacklist_legal_w_id")int blacklist_legal_w_id);
}
