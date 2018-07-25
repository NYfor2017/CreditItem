package com.ny.dao;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Admin;

public interface AdminDao {

	/**
	 * Í¨¹ýÓÃ»§ÃûºÍÃÜÂë²éÕÒ¹ÜÀíÔ±
	 * @param username
	 * @param password
	 * @return
	 */
	Admin queryAdmin(@Param("username")String username, @Param("password")String password);
	
}
