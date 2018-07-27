package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.User;

/**
 * �û�ҵ��ӿ�
 * @author N.Y 
 *
 */

public interface UserService {
	
	/**
	 * �û���¼
	 * @param username
	 * @param password
	 * @return
	 */
	User loginUser(String username, String password);
	
	
	/**
	 * ��ѯ�����û���Ϣ
	 * @return
	 */
	List<User> getUserList();
	
	/**
	 * �û�ע��
	 * @param username
	 * @param password
	 * @return
	 */
	int signInUser(String username, String password);
	
	/**
	 * ����õĺ�����Ϣ
	 * @param user_id
	 * @return
	 */
	User getUserAirline(int user_id);
	
	/**
	 * ����õ���ҵ��Ϣ
	 * @param user_id
	 * @return
	 */
	User getUserWorkunit(int user_id);
	
	/**
	 * �����û���Ϣ
	 * @param username
	 * @param password
	 * @param member
	 * @param realName
	 * @param gender
	 * @param idcard
	 * @param phone_number
	 * @param address_original
	 * @param address_living_1
	 * @param address_living_2
	 * @return
	 */
	int updateUser(@RequestParam("username")String username, @RequestParam("password")String password, @RequestParam("member")boolean member, @RequestParam("realName")String realName,
			@RequestParam("gender")boolean gender, @RequestParam("idcard")String idcard, @RequestParam("phone_number")String phone_number, @RequestParam("address_original")String address_original,
			@RequestParam("address_living_1")String address_living_1, @RequestParam("address_living_2")String address_living_2,@RequestParam("photo")String photo);
}
