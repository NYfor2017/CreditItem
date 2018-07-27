package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.BlacklistCreditWorkunit;
/**
 * BlacklistCreditWorkunit��Dao��
 * @author N.Y
 *
 */
public interface BlacklistCreditWorkunitDao {
	/**
	 * �����ҵ�����ú�����
	 * @param workunit_id
	 * @return
	 */
	List<BlacklistCreditWorkunit> getOwnBlacklistCreditWorkunit(@Param("workunit_id")int workunit_id);
	
	/**
	 * �����ҵ���ú�����
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistCreditWorkunit(@Param("workunit_id")int workunit_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * ������ҵ���ú�����
	 * @param blacklist_credit_w_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistCreditWorkunit(@Param("blacklist_credit_w_id")int blacklist_credit_w_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * ɾ����ҵ���ú�����
	 * @param blacklist_credit_w_id
	 * @return
	 */
	int deleteBlacklistCreditWorkunit(@Param("blacklist_credit_w_id")int blacklist_credit_w_id);
	
}
