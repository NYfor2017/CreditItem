package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.UserDao;
import com.ny.entity.User;
import com.ny.service.UserService;
/**
 * 用户的业务实现类
 * @author N.Y
 *
 */
@Service
public class UserSerivceImpl implements UserService{
	
	
	//注入Service依赖
	@Autowired
	private UserDao userDao;

	
	public User loginUser(String username, String password) {
		return userDao.queryUser(username, password);
	}

	public List<User> getUserList() {
		return userDao.queryAll();
	}

	public int signInUser(String username, String password) {
		return userDao.insertUser(username, password);
	}

	public User getUserAirline(int user_id) {
		return userDao.getUserAirline(user_id);
	}

	public int updateUser(String username, String password, boolean member, String realName, boolean gender,
			String idcard, String phone_number, String address_original, String address_living_1,
			String address_living_2) {
		return userDao.updateUser(username, password, member, realName, gender, idcard, phone_number, address_original, address_living_1, address_living_2);
	}

	public User getUserWorkunit(int user_id) {
		return userDao.getUserWorkunit(user_id);
	}

}
