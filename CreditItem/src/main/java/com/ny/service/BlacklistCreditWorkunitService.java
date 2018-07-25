package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.BlacklistCreditWorkunit;
/**
 * BlacklistCreditWorkunit��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface BlacklistCreditWorkunitService {
	/**
	 * �����ҵ�����ú�����
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistCreditWorkunit> getOwnBlacklistCreditWorkunit(@RequestParam("workunit_id")int workunit_id);
	
	/**
	 * �����ҵ���ú�����
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistCreditWorkunit(@RequestParam("workunit_id")int workunit_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * ������ҵ���ú�����
	 * @param blacklist_credit_w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistCreditWorkunit(@RequestParam("blacklist_credit_w_id")int blacklist_credit_w_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * ɾ����ҵ���ú�����
	 * @param blacklist_credit_w_id
	 * @return
	 */
	int deleteBlacklistCreditWorkunit(@RequestParam("blacklist_credit_w_id")int blacklist_credit_w_id);
}
