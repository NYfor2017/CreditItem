package com.ny.service;

import com.ny.entity.Admin;
/**
 * 管理员的业务接口
 * @author N.Y
 *
 */
public interface AdminService {
	
	/**
	 * 管理员登录
	 * @param name
	 * @param password
	 * @return
	 */
	Admin loginAdmin(String username, String password);
}
