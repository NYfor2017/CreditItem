package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.BlacklistUser;
/**
 * BlacklistUser��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface BlacklistUserService {
	/**
	 * ��ȡ���û��ĺ�������Ϣ
	 * @param user_id
	 * @return
	 */
	List<BlacklistUser> getOwnBlacklistUser(@RequestParam("user_id")int user_id);
	
	/**
	 * ��Ӻ�������Ϣ
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistUser(@RequestParam("user_id")int user_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * ���º�������Ϣ
	 * @param blacklist_user_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistUser(@RequestParam("blacklist_user_id")int blacklist_user_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * ɾ����������Ϣ
	 * @param blacklist_user_id
	 * @return
	 */
	int deleteBlacklistUser(@RequestParam("blacklist_user_id")int blacklist_user_id);
	
}
