package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.WorkoutDao;
import com.ny.entity.Workout;

public class WorkoutTest extends BaseTest{
	@Autowired
	WorkoutDao workoutDao;
	
	@Test
	public void testList() {
		List<Workout> li = workoutDao.getOwnWorkout(1);
		Iterator<Workout> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAdd() {
		workoutDao.addWorkout("100000000004082", "民营企业", "100000000000", "董事长", 1);
		
	}
}
