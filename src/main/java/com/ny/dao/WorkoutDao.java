package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Workout;
/**
 * Workout的Dao类
 * @author N.Y
 *
 */
public interface WorkoutDao {
	/**
	 * 获取用户的在外任职列表
	 * @param user_id
	 * @return
	 */
	List<Workout> getOwnWorkout(@Param("user_id")int user_id);
	
	/**
	 * 添加在外任职信息
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
	 * 更新在外任职信息
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
	 * 删除在外任职信息
	 * @param workout_id
	 * @return
	 */
	int deleteWorkout(@Param("workout_id")int workout_id);
}
