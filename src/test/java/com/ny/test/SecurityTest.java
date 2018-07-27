package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.SecurityDao;
import com.ny.entity.Security;


public class SecurityTest extends BaseTest{
	@Autowired
	SecurityDao securityDao;
	
	@Test
	public void testList() {
		List<Security> li = securityDao.getOwnSecurity(1);
		Iterator<Security> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
