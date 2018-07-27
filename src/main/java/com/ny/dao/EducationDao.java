package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Education;
/**
 * Education的Dao类
 * @author N.Y
 *
 */
public interface EducationDao {
	/**
	 * 获取用户的学历列表
	 * @param user_id
	 * @return
	 */
	List<Education> getOwnEducation(@Param("user_id")int user_id);
	
	/**
	 * 添加学历
	 * @param edu_school
	 * @param edu_location
	 * @param edu_gra_time
	 * @param edu_pro
	 * @param edu_conclusion
	 * @param user_id
	 * @return
	 */
	int addEducation(@Param("edu_school")String edu_school, @Param("edu_location")String edu_location, @Param("edu_gra_time")String edu_gra_time,
			@Param("edu_pro")String edu_pro, @Param("edu_conclusion")String edu_conclusion, @Param("user_id")int user_id);
	
	/**
	 * 更新学历
	 * @param edu_id
	 * @param edu_school
	 * @param edu_location
	 * @param edu_gra_time
	 * @param edu_pro
	 * @param edu_conclusion
	 * @return
	 */
	int updateEducation(@Param("edu_id")int edu_id,@Param("edu_school")String edu_school, @Param("edu_location")String edu_location, @Param("edu_gra_time")String edu_gra_time,
			@Param("edu_pro")String edu_pro, @Param("edu_conclusion")String edu_conclusion);
	
	/**
	 * 删除学历
	 * @param edu_id
	 * @return
	 */
	int deleteEducation(@Param("edu_id")int edu_id);
}
