package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.entity.House;
import com.ny.service.HouseService;

public class HouseServiceImpl extends BaseTest{
	@Autowired
	private HouseService houseService;
	
	@Test
	public void testAddHouse() {
		int house = houseService.addHouse("¹âÃ÷´óÏÃ", 88888888, 1, 5);
	}
	
	@Test
	public void testOwnHouse() {
		List<House> houses = houseService.getOwnHouse(2);
		Iterator<House> it = houses.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
