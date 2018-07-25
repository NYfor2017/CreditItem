package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.WorkoutDao;
import com.ny.entity.Workout;
import com.ny.service.WorkoutService;
@Service
public class WorkoutServiceImpl implements WorkoutService {

	@Autowired
	WorkoutDao workoutDao;
	
	public List<Workout> getOwnWorkout(int user_id) {
		return workoutDao.getOwnWorkout(user_id);
	}

	public int addWorkout(String workout_signin, String workout_type, String workout_capital, String workout_job,
			int user_id) {
		return workoutDao.addWorkout(workout_signin, workout_type, workout_capital, workout_job, user_id);
	}

	public int updateWorkout(int workout_id, String workout_signin, String workout_type, String workout_capital,
			String workout_job) {
		return workoutDao.updateWorkout(workout_id, workout_signin, workout_type, workout_capital, workout_job);
	}

	public int deleteWorkout(int workout_id) {
		return workoutDao.deleteWorkout(workout_id);
	}

}
