package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.InvestDao;
import com.ny.entity.Invest;

public class InvestTest extends BaseTest{
	@Autowired
	InvestDao investDao;
	
	@Test
	public void test() {
		List<Invest> li = investDao.getOwnInvest(1);
		Iterator<Invest> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
