package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.BlacklistCreditUser;
/**
 * BlacklistCreditUser��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface BlacklistCreditUserService {
	/**
	 * ��ȡ�û����Ŵ����ں�����
	 * @param user_id
	 * @return
	 */
	List<BlacklistCreditUser> getOwnBlacklistCreditUser(@RequestParam("user_id")int user_id);
	
	/**
	 * ����Ŵ����ں�����
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistCreditUser(@RequestParam("user_id")int user_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * �����Ŵ����ں�����
	 * @param blacklist_credit_u_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistCreditUser(@RequestParam("blacklist_credit_u_id")int blacklist_credit_u_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * ɾ���Ŵ����ں�����
	 * @param blacklist_credit_u_id
	 * @return
	 */
	int deleteBlacklistCreditUser(@RequestParam("blacklist_credit_u_id")int blacklist_credit_u_id);
	
}
