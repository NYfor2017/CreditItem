package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.User;

/**
 * 用户业务接口
 * @author N.Y 
 *
 */

public interface UserService {
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	User loginUser(String username, String password);
	
	
	/**
	 * 查询所有用户信息
	 * @return
	 */
	List<User> getUserList();
	
	/**
	 * 用户注册
	 * @param username
	 * @param password
	 * @return
	 */
	int signInUser(String username, String password);
	
	/**
	 * 获得用的航班信息
	 * @param user_id
	 * @return
	 */
	User getUserAirline(int user_id);
	
	/**
	 * 获得用的企业信息
	 * @param user_id
	 * @return
	 */
	User getUserWorkunit(int user_id);
	
	/**
	 * 更新用户信息
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
