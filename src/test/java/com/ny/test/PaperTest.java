package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.PaperDao;
import com.ny.entity.Paper;

public class PaperTest extends BaseTest{
	
	@Autowired
	PaperDao paperDao;
	
	@Test
	public void testOwn() {
		List<Paper> list = paperDao.getOwnPaper(2);
		Iterator<Paper> li = list.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}
	
	@Test
	public void testAdd() {
		int i = paperDao.addPaper("000000005", "《人民币的安全性》", "blablabla", 4);
		System.out.println("我加完啦！"+i);
	}
	
	@Test
	public void testUpdate() {
		paperDao.updatePaper(4, "0000004", "《比特币是最棒的！》", "blinlinlin");
	}
	
	@Test
	public void testDelete() {
		paperDao.deletePaper(5);
	}
}
