package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.User;

public interface UserDao {
	
	/**
	 * 插入用户
	 * @param username
	 * @param password
	 * @param realName
	 * @return
	 */
	int insertUser(@Param("username")String username, @Param("password")String password);
	
	/**
	 * 通过用户名和密码查找用户
	 * @param id
	 * @return
	 */
	User queryUser(@Param("username")String username, @Param("password")String password);
	
	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> queryAll();

	/**
	 * 获得用的航班信息
	 * @param user_id
	 * @return
	 */
	User getUserAirline(@Param("user_id")int user_id);
	
	/**
	 * 获得用的企业信息
	 * @param user_id
	 * @return
	 */
	User getUserWorkunit(@Param("user_id")int user_id);
	
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
	int updateUser(@Param("username")String username, @Param("password")String password, @Param("member")boolean member, @Param("realName")String realName,
			@Param("gender")boolean gender, @Param("idcard")String idcard, @Param("phone_number")String phone_number, @Param("address_original")String address_original,
			@Param("address_living_1")String address_living_1, @Param("address_living_2")String address_living_2);
	
	
}
