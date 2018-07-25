package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.EducationDao;
import com.ny.entity.Education;

public class EducationTest extends BaseTest{
	
	@Autowired
	EducationDao educationDao;
	
	@Test
	public void testList() {
		List<Education> li = educationDao.getOwnEducation(1);
		Iterator<Education> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAdd() {
		educationDao.addEducation("华南理工", "...", "2020-12-1", "1212", "", 1);
	}
	
	@Test
	public void testUpdate() {
		educationDao.updateEducation(3, "华南师范", "...", "2021-12-12", "1231", "");
	}
}
