package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.WorkunitDao;
import com.ny.entity.Workunit;

public class WorkunitTest extends BaseTest{
	@Autowired
	WorkunitDao workunitDao;
	
	@Test
	public void test() {
		List<Workunit> li = workunitDao.getAllWorkunit();
		for(Workunit w : li) {
			System.out.println(w);
		}
		
		//workunitDao.addWorkunit("倪迪达企业", "民营", "23483034678903", 0, "4008208820", "");
		
	}
	
}
