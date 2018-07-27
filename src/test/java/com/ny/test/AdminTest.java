package com.ny.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.AdminDao;
import com.ny.entity.Admin;

public class AdminTest extends BaseTest{
	
	@Autowired
	private AdminDao adminDao; 
	
	@Test
	public void testQueryAdmin()throws Exception{
		Admin admin = adminDao.queryAdmin("admin1", "123123");
		System.out.println(admin);
	}

	
}
