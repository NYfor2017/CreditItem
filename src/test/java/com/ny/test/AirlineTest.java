package com.ny.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.AirlineDao;
import com.ny.dao.UserDao;

public class AirlineTest extends BaseTest{
	@Autowired
	AirlineDao airlineDao;
	UserDao userDao;
	
	@Test
	public void test() {
		airlineDao.addAirline(3, "2018-07-13", "SA889", 1234.22);
		airlineDao.addUserAirline(2, 4);
	}
	
}
