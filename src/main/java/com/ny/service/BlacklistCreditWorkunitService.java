package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.BlacklistCreditWorkunit;
/**
 * BlacklistCreditWorkunit的业务接口类
 * @author N.Y
 *
 */
public interface BlacklistCreditWorkunitService {
	/**
	 * 获得企业的信用黑名单
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistCreditWorkunit> getOwnBlacklistCreditWorkunit(@RequestParam("workunit_id")int workunit_id);
	
	/**
	 * 添加企业信用黑名单
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistCreditWorkunit(@RequestParam("workunit_id")int workunit_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * 更新企业信用黑名单
	 * @param blacklist_credit_w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistCreditWorkunit(@RequestParam("blacklist_credit_w_id")int blacklist_credit_w_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * 删除企业信用黑名单
	 * @param blacklist_credit_w_id
	 * @return
	 */
	int deleteBlacklistCreditWorkunit(@RequestParam("blacklist_credit_w_id")int blacklist_credit_w_id);
}
