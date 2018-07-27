package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.RiskInvestUserDao;
import com.ny.entity.RiskInvestUser;

public class RiskInvestUserTest extends BaseTest {
	
	@Autowired
	RiskInvestUserDao rd;
	
	@Test
	public void testList() {
		List<RiskInvestUser> li = rd.getOwnRiskInvestUser(1);
		Iterator<RiskInvestUser> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
