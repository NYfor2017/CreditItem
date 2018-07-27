package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.HouseDao;
import com.ny.entity.House;

public class HouseTest extends BaseTest{
	
	@Autowired
	private HouseDao houseDao;
	
	@Test
	public void testqueryAllHouse() {
		List<House> houses = houseDao.queryAllHouse();
		Iterator it = houses.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAddHouse() {
		int house = houseDao.addHouse("广东金融学院15栋", 1000000, 1, 2);
	}
	
	@Test
	public void testGetOwnHouse() {
		List<House> houses = houseDao.getOwnHouse(1);
		Iterator it = houses.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testDeleteHouse(){
		houseDao.deleteHouse(7);
	}
	
	@Test
	public void testUpdateHouse() {
		houseDao.updateHouse(12, "广东金融学院9栋", 29999, 1);
	}
}
