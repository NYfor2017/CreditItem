package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.UserDao;
import com.ny.entity.User;

public class UserTest extends BaseTest{
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testInsertUser()throws Exception{
		int user = userDao.insertUser("abcccc", "123456");
		System.out.println(user);
	}
	@Test
	public void testQueryUser()throws Exception{
		String username = "abc123";
		String password = "123456";
		User user = userDao.queryUser(username, password);
		System.out.println(user);
	}
	
	@Test
	public void testQueryAll()throws Exception{
		List<User> users = userDao.queryAll();
		Iterator<User> it = users.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
