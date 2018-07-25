package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.BlacklistUser;
/**
 * BlacklistUser的业务接口类
 * @author N.Y
 *
 */
public interface BlacklistUserService {
	/**
	 * 获取该用户的黑名单信息
	 * @param user_id
	 * @return
	 */
	List<BlacklistUser> getOwnBlacklistUser(@RequestParam("user_id")int user_id);
	
	/**
	 * 添加黑名单信息
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	int addBlacklistUser(@RequestParam("user_id")int user_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * 更新黑名单信息
	 * @param blacklist_user_id
	 * @param blacklist_detail
	 * @return
	 */
	int updateBlacklistUser(@RequestParam("blacklist_user_id")int blacklist_user_id, @RequestParam("blacklist_detail")String blacklist_detail);
	
	/**
	 * 删除黑名单信息
	 * @param blacklist_user_id
	 * @return
	 */
	int deleteBlacklistUser(@RequestParam("blacklist_user_id")int blacklist_user_id);
	
}
