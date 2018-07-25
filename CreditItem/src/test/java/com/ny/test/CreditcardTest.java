package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.CreditcardDao;
import com.ny.entity.Creditcard;

public class CreditcardTest extends BaseTest{
	@Autowired
	CreditcardDao creditcardDao;
	
	@Test
	public void testList() {
		List<Creditcard> li = creditcardDao.getOwnCreditcard(1);
		Iterator<Creditcard> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAdd() {
		creditcardDao.addCreditcard("2317263816827", "中国农业银行", "活期", 1);
	}
	
	@Test
	public void testUpdate() {
		creditcardDao.updateCreditcard(3,"2317263192312316827", "中国农业银行", "活期");
	}
}
