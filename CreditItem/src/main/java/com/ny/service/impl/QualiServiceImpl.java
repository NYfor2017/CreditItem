package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.QualiDao;
import com.ny.entity.Quali;
import com.ny.service.QualiService;

@Service
public class QualiServiceImpl implements QualiService{

	@Autowired
	QualiDao qualiDao;
	
	public List<Quali> getOwnQuali(int user_id) {
		return qualiDao.getOwnQuali(user_id);
	}

	public int addQuali(String quali_num, String quali_name, String quali_date, String quali_insti, int user_id) {
		return qualiDao.addQuali(quali_num, quali_name, quali_date, quali_insti, user_id);
	}

	public int updateQuali(int quali_id, String quali_num, String quali_name, String quali_date, String quali_insti) {
		return qualiDao.updateQuali(quali_id, quali_num, quali_name, quali_date, quali_insti);
	}

	public int deleteQuali(int quali_id) {
		return qualiDao.deleteQuali(quali_id);
	}

}
