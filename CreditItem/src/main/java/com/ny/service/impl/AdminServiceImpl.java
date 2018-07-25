package com.ny.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.AdminDao;
import com.ny.entity.Admin;
import com.ny.service.AdminService;
/**
 * ����Ա��ҵ��ʵ����
 * @author N.Y
 *
 */
@Service
public class AdminServiceImpl implements AdminService{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private AdminDao adminDao;

	public Admin loginAdmin(String username, String password) {
		
		return adminDao.queryAdmin(username, password);
	}
	
	
}
