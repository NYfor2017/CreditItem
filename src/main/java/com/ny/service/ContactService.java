package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Contact;
/**
 * Contact��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface ContactService {
	/**
	 * ��ȡ�û���ͨѶ�б�
	 * @param user_id
	 * @return
	 */
	List<Contact> getOwnContact(@RequestParam("user_id")int user_id);
	
	/**
	 * ���ͨѶ��¼��Ŀ
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
	 * ����ͨѶ��Ŀ
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
	 * ɾ��ͨѶ��Ŀ
	 * @param contact_id
	 * @return
	 */
	int deleteContact(@RequestParam("contact_id")int contact_id);
	
}
