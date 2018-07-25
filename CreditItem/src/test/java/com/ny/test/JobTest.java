package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.JobDao;
import com.ny.entity.Job;

public class JobTest extends BaseTest{
	@Autowired
	JobDao jobDao;
	
	@Test
	public void test() {
		List<Job> li = jobDao.getOwnJob(1);
		Iterator<Job> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
