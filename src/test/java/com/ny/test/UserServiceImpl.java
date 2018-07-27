package com.ny.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.entity.User;
import com.ny.service.UserService;

public class UserServiceImpl extends BaseTest{
	@Autowired
	private UserService userService;
	
	@Test
	public void testLoginService()throws Exception{
		User user = userService.loginUser("abc123", "123123");
		System.out.println(user);
	}
}
