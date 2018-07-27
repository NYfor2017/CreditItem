package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.EmerContactWMDao;
import com.ny.entity.EmerContactWM;

public class EmerContactWMTest extends BaseTest{
	@Autowired
	EmerContactWMDao emerContactWMDao;
	
	@Test
	public void testList() {
		List<EmerContactWM> li = emerContactWMDao.getOwnEmerContactWM(2);
		Iterator<EmerContactWM> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAdd() {
		emerContactWMDao.addEmerContactWM("╩ф╣о", "13422441421", 2);
	}
	
	@Test
	public void testUpdate() {
		emerContactWMDao.updateEmerContactWM(4, "блсмсм", "13167673282");
		
	}
}
