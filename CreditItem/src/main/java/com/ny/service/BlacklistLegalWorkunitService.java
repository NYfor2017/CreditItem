package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.BlacklistLegalWorkunit;
/**
 * BlacklistLegalWorkunit��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface BlacklistLegalWorkunitService {
	/**
	 * ��ȡ��ҵ�������б�
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistLegalWorkunit> getOwnBlacklistLegalWorkunit(@RequestParam("workunit_id")int workunit_id);
	
	/**
	 * �����ҵ��������Ϣ
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistLegalWorkunit(@RequestParam("workunit_id")int workunit_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * ������ҵ��������Ϣ
	 * @param blacklist_legal_w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistLegalWorkunit(@RequestParam("blacklist_legal_w_id")int blacklist_legal_w_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * ɾ����ҵ��������Ϣ
	 * @param blacklist_legal_w_id
	 * @return
	 */
	int deleteBlacklistLegalWorkunit(@RequestParam("blacklist_legal_w_id")int blacklist_legal_w_id);
}
