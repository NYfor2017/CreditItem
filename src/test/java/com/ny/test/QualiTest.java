package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.QualiDao;
import com.ny.entity.Quali;

public class QualiTest extends BaseTest{
	@Autowired
	QualiDao qualiDao;
	
	@Test
	public void testList() {
		List<Quali> list = qualiDao.getOwnQuali(2);
		Iterator<Quali> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAdd() {
		int a = qualiDao.addQuali("00000000004", "中级软件工程师资格证", "2019-1-1", "爪哇协会", 2);
		System.out.println("我加进去了！");
	}
	
	@Test
	public void testUpdate() {
		int u = qualiDao.updateQuali(4, "0000000000004", "高级软件工程师资格证", "2020-1-1", "爪哇协会");
	}
	
	
}
