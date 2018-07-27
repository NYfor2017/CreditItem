package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.CardOut12MDao;
import com.ny.entity.CardOut12M;

public class CardOutTest extends BaseTest{
	
	@Autowired
	CardOut12MDao c12;
	
	@Test
	public void test12() {
		List<CardOut12M> li = c12.getOwnCardOut12M(1);
		Iterator<CardOut12M> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
