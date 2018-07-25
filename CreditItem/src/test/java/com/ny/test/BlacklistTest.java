package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.BlacklistUserDao;
import com.ny.entity.BlacklistUser;

public class BlacklistTest extends BaseTest{
	@Autowired
	BlacklistUserDao bd;
	
	@Test
	public void test() {
		List<BlacklistUser> li = bd.getOwnBlacklistUser(1);
		Iterator<BlacklistUser> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
