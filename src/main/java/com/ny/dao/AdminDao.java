package com.ny.dao;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Admin;

public interface AdminDao {

	/**
	 * 通过用户名和密码查找管理员
	 * @param username
	 * @param password
	 * @return
	 */
	Admin queryAdmin(@Param("username")String username, @Param("password")String password);
	
}
