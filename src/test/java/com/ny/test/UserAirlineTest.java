package com.ny.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.AirlineDao;
import com.ny.dao.UserDao;
import com.ny.entity.Airline;
import com.ny.entity.User;

public class UserAirlineTest extends BaseTest{
	@Autowired
	UserDao userDao;
	AirlineDao airlineDao;
	
	
	@Test
	public void testAir() {
		User li = userDao.getUserAirline(2);
		List<Airline> set = li.getAir();
		for(Airline a:set) {
			System.out.println(a.getAirline_id()+"..."+a.getAirline_fee());
		}
	}
}
