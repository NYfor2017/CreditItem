package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.DriveDao;
import com.ny.entity.Drive;

public class DriveTest extends BaseTest{
	
	@Autowired
	DriveDao driveDao;
	
	@Test
	public void testList() {
		List<Drive> list = driveDao.getOwnDrive(2);
		Iterator<Drive> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAdd() {
		int a = driveDao.addDrive("213123718786482", "", "", 1, 2);
		System.out.println("我加进去啦！");
		
	}
	
	@Test
	public void testUpdate() {
		int u = driveDao.updateDrive(3, "1111111111111111", "", "", 3);
	}
}
