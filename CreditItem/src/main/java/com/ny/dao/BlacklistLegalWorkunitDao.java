package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.BlacklistLegalWorkunit;
/**
 * BlacklistLegalWorkunit��Dao��
 * @author N.Y
 *
 */
public interface BlacklistLegalWorkunitDao {
	/**
	 * ��ȡ��ҵ�������б�
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistLegalWorkunit> getOwnBlacklistLegalWorkunit(@Param("workunit_id")int workunit_id);
	
	/**
	 * �����ҵ��������Ϣ
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistLegalWorkunit(@Param("workunit_id")int workunit_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * ������ҵ��������Ϣ
	 * @param blacklist_legal_w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistLegalWorkunit(@Param("blacklist_legal_w_id")int blacklist_legal_w_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * ɾ����ҵ��������Ϣ
	 * @param blacklist_legal_w_id
	 * @return
	 */
	int deleteBlacklistLegalWorkunit(@Param("blacklist_legal_w_id")int blacklist_legal_w_id);
	
}
