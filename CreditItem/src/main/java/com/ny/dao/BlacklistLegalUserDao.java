package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.BlacklistLegalUser;

/**
 * BlacklistLegalUser��Dao��
 * @author N.Y
 *
 */
public interface BlacklistLegalUserDao {
	/**
	 * �û����������°����б�
	 * @param user_id
	 * @return
	 */
	List<BlacklistLegalUser> getOwnBlacklistLegalUser(@Param("user_id")int user_id);
	
	/**
	 * ����������°���
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistLegalUser(@Param("user_id")int user_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * �����������°���
	 * @param blacklist_legal_u_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistLegalUser(@Param("blacklist_legal_u_id")int blacklist_legal_u_id, @Param("blacklist_detail")String blacklist_detail);
	
	/**
	 * ɾ���������°���
	 * @param blacklist_legal_u_id
	 * @return
	 */
	int deleteBlacklistLeaglUser(@Param("blacklist_legal_u_id")int blacklist_legal_u_id);
}
