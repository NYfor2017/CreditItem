package com.ny.service;

import com.ny.entity.Admin;
/**
 * ����Ա��ҵ��ӿ�
 * @author N.Y
 *
 */
public interface AdminService {
	
	/**
	 * ����Ա��¼
	 * @param name
	 * @param password
	 * @return
	 */
	Admin loginAdmin(String username, String password);
}
