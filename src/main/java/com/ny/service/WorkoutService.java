package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Workout;
/**
 * Workout��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface WorkoutService {
	/**
	 * ��ȡ�û���������ְ�б�
	 * @param user_id
	 * @return
	 */
	List<Workout> getOwnWorkout(@RequestParam("user_id")int user_id);
	
	/**
	 * ���������ְ��Ϣ
	 * @param workout_signin
	 * @param workout_type
	 * @param workout_capital
	 * @param workout_job
	 * @param user_id
	 * @return
	 */
	int addWorkout(@RequestParam("workout_signin")String workout_signin,@RequestParam("workout_type")String workout_type,
			@RequestParam("workout_capital")String workout_capital, @RequestParam("workout_job")String workout_job,@RequestParam("user_id")int user_id);
	
	/**
	 * ����������ְ��Ϣ
	 * @param workout_id
	 * @param workout_signin
	 * @param workout_type
	 * @param workout_capital
	 * @param workout_job
	 * @return
	 */
	int updateWorkout(@RequestParam("workout_id")int workout_id,@RequestParam("workout_signin")String workout_signin,@RequestParam("workout_type")String workout_type,
			@RequestParam("workout_capital")String workout_capital, @RequestParam("workout_job")String workout_job);
	
	/**
	 * ɾ��������ְ��Ϣ
	 * @param workout_id
	 * @return
	 */
	int deleteWorkout(@RequestParam("workout_id")int workout_id);
}
