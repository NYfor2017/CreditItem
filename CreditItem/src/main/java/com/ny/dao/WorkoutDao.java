package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Workout;
/**
 * Workout��Dao��
 * @author N.Y
 *
 */
public interface WorkoutDao {
	/**
	 * ��ȡ�û���������ְ�б�
	 * @param user_id
	 * @return
	 */
	List<Workout> getOwnWorkout(@Param("user_id")int user_id);
	
	/**
	 * ���������ְ��Ϣ
	 * @param workout_signin
	 * @param workout_type
	 * @param workout_capital
	 * @param workout_job
	 * @param user_id
	 * @return
	 */
	int addWorkout(@Param("workout_signin")String workout_signin,@Param("workout_type")String workout_type,
			@Param("workout_capital")String workout_capital, @Param("workout_job")String workout_job,@Param("user_id")int user_id);
	
	/**
	 * ����������ְ��Ϣ
	 * @param workout_id
	 * @param workout_signin
	 * @param workout_type
	 * @param workout_capital
	 * @param workout_job
	 * @return
	 */
	int updateWorkout(@Param("workout_id")int workout_id,@Param("workout_signin")String workout_signin,@Param("workout_type")String workout_type,
			@Param("workout_capital")String workout_capital, @Param("workout_job")String workout_job);
	
	/**
	 * ɾ��������ְ��Ϣ
	 * @param workout_id
	 * @return
	 */
	int deleteWorkout(@Param("workout_id")int workout_id);
}
