package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.EmerContactFMDao;
import com.ny.entity.EmerContactFM;

public class EmerContactFMTest extends BaseTest{
	@Autowired
	EmerContactFMDao emerContactFMDao;
	
	@Test
	public void testList() {
		List<EmerContactFM> li = emerContactFMDao.getOwnEmerContactFM(2);
		Iterator<EmerContactFM> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAdd() {
		emerContactFMDao.addEmerContactFM("╩ф╣о╣о", "13422441421", 2);
	}
	
	@Test
	public void testUpdate() {
		emerContactFMDao.updateEmerContactFM(4, "блсмсм", "13167673282");
		
	}
}
