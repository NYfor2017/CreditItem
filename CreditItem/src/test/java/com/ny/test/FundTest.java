package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.FundDao;
import com.ny.entity.Fund;

public class FundTest extends BaseTest{
	@Autowired
	FundDao fundDao;
	
	@Test
	public void testList() {
		List<Fund> li = fundDao.getOwnFund(1);
		Iterator<Fund> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
