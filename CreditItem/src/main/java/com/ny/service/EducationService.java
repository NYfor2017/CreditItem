package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Education;

public interface EducationService {
	/**
	 * 获取用户的学历列表
	 * @param user_id
	 * @return
	 */
	List<Education> getOwnEducation(@RequestParam("user_id")int user_id);
	
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
	int addEducation(@RequestParam("edu_school")String edu_school, @RequestParam("edu_location")String edu_location, @RequestParam("edu_gra_time")String edu_gra_time,
			@RequestParam("edu_pro")String edu_pro, @RequestParam("edu_conclusion")String edu_conclusion, @RequestParam("user_id")int user_id);
	
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
	int updateEducation(@RequestParam("edu_id")int edu_id,@RequestParam("edu_school")String edu_school, @RequestParam("edu_location")String edu_location, @RequestParam("edu_gra_time")String edu_gra_time,
			@RequestParam("edu_pro")String edu_pro, @RequestParam("edu_conclusion")String edu_conclusion);
	
	/**
	 * 删除学历
	 * @param edu_id
	 * @return
	 */
	int deleteEducation(@RequestParam("edu_id")int edu_id);
}
