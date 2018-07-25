package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.EducationDao;
import com.ny.entity.Education;
import com.ny.service.EducationService;

@Service
public class EducationServiceImpl implements EducationService {
	@Autowired
	EducationDao educationDao;
	
	public List<Education> getOwnEducation(int user_id) {
		return educationDao.getOwnEducation(user_id);
	}

	public int addEducation(String edu_school, String edu_location, String edu_gra_time, String edu_pro,
			String edu_conclusion, int user_id) {
		return educationDao.addEducation(edu_school, edu_location, edu_gra_time, edu_pro, edu_conclusion, user_id);
	}

	public int updateEducation(int edu_id, String edu_school, String edu_location, String edu_gra_time, String edu_pro,
			String edu_conclusion) {
		return educationDao.updateEducation(edu_id, edu_school, edu_location, edu_gra_time, edu_pro, edu_conclusion);
	}

	public int deleteEducation(int edu_id) {
		return educationDao.deleteEducation(edu_id);
	}

}
