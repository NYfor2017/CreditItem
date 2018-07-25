package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.BlacklistWorkunit;
/**
 * BlacklistWorkunit��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface BlacklistWorkunitService {
	/**
	 * ��ȡ��ҵ�ĺ�������Ϣ
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistWorkunit> getOwnBlacklistWorkunit(@RequestParam("workunit_id")int workunit_id);
	
	/**
	 * �����ҵ�ĺ�����
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistWorkunit(@RequestParam("workunit_id")int workunit_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * ������ҵ�ĺ�����
	 * @param blacklist__w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistWorkunit(@RequestParam("blacklist_workunit_id")int blacklist__w_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * ɾ����ҵ�ĺ�����
	 * @param blacklist__w_id
	 * @return
	 */
	int deleteBlacklistWorkunit(@RequestParam("blacklist_workunit_id")int blacklist__w_id);
	
}
