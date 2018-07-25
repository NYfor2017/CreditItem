package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.BlacklistWorkunit;
/**
 * BlacklistWorkunit��Dao��
 * @author N.Y
 *
 */
public interface BlacklistWorkunitDao {
	/**
	 * ��ȡ��ҵ�ĺ�������Ϣ
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistWorkunit> getOwnBlacklistWorkunit(@Param("workunit_id")int workunit_id);
	
	/**
	 * �����ҵ�ĺ�����
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistWorkunit(@Param("workunit_id")int workunit_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * ������ҵ�ĺ�����
	 * @param blacklist__w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistWorkunit(@Param("blacklist_workunit_id")int blacklist__w_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * ɾ����ҵ�ĺ�����
	 * @param blacklist__w_id
	 * @return
	 */
	int deleteBlacklistWorkunit(@Param("blacklist_workunit_id")int blacklist__w_id);
	
}
