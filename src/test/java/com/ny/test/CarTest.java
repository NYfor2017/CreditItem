package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.CarDao;
import com.ny.entity.Car;

public class CarTest extends BaseTest{
	@Autowired
	CarDao carDao;
	
	@Test
	public void testAll() {
		List<Car> list = carDao.queryAllCar();
		Iterator<Car> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testQuery() {
		List<Car> list = carDao.queryOwnCar(4);
		Iterator<Car> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAdd() {
		int i = carDao.addCar("ÔÁD22223", "ÂêÉ¯À­µÙ", "2232", "2019-2-2", null, "2013-4-12", null, "½Î³µ", "Ó¢¹ú", false, 4);
	}
}
