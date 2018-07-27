package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Contact;
/**
 * Contact的业务接口类
 * @author N.Y
 *
 */
public interface ContactService {
	/**
	 * 获取用户的通讯列表
	 * @param user_id
	 * @return
	 */
	List<Contact> getOwnContact(@RequestParam("user_id")int user_id);
	
	/**
	 * 添加通讯记录条目
	 * @param contact_number
	 * @param contact_status
	 * @param contact_time
	 * @param contact_name
	 * @param user_id
	 * @return
	 */
	int addContact(@RequestParam("contact_number")String contact_number, @RequestParam("contact_status")boolean contact_status,
			@RequestParam("contact_time")String contact_time, @RequestParam("contact_name")String contact_name, @RequestParam("user_id")int user_id);
	
	/**
	 * 更新通讯条目
	 * @param contact_id
	 * @param contact_number
	 * @param contact_status
	 * @param contact_time
	 * @param contact_name
	 * @return
	 */
	int updateContact(@RequestParam("contact_id")int contact_id,@RequestParam("contact_number")String contact_number, @RequestParam("contact_status")boolean contact_status,
			@RequestParam("contact_time")String contact_time, @RequestParam("contact_name")String contact_name);
	
	/**
	 * 删除通讯条目
	 * @param contact_id
	 * @return
	 */
	int deleteContact(@RequestParam("contact_id")int contact_id);
	
}
