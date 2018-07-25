package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.BlacklistCreditWorkunitDao;
import com.ny.entity.BlacklistCreditWorkunit;

public class BlacklistWorkunitTest extends BaseTest{
	@Autowired
	BlacklistCreditWorkunitDao bcwd;
	
	@Test
	public void test() {
		List<BlacklistCreditWorkunit> li = bcwd.getOwnBlacklistCreditWorkunit(1);
		Iterator<BlacklistCreditWorkunit> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
