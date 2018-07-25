package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.BlacklistCreditUser;

/**
 * BlacklistCreditUser��Dao��
 * @author N.Y
 *
 */
public interface BlacklistCreditUserDao {
	
	/**
	 * ��ȡ�û����Ŵ����ں�����
	 * @param user_id
	 * @return
	 */
	List<BlacklistCreditUser> getOwnBlacklistCreditUser(@Param("user_id")int user_id);
	
	/**
	 * ����Ŵ����ں�����
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistCreditUser(@Param("user_id")int user_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * �����Ŵ����ں�����
	 * @param blacklist_credit_u_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistCreditUser(@Param("blacklist_credit_u_id")int blacklist_credit_u_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * ɾ���Ŵ����ں�����
	 * @param blacklist_credit_u_id
	 * @return
	 */
	int deleteBlacklistCreditUser(@Param("blacklist_credit_u_id")int blacklist_credit_u_id);
	
}
