package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.WorkunitDao;
import com.ny.entity.Workunit;
import com.ny.service.WorkunitService;
/**
 * Workunit的业务实现类
 * @author N.Y
 *
 */
@Service
public class WorkunitServiceImpl implements WorkunitService {

	@Autowired
	WorkunitDao workunitDao;
	
	public List<Workunit> getAllWorkunit() {
		return workunitDao.getAllWorkunit();
	}

	public int addWorkunit(String workunit_name, String workunit_type, String workunit_reg_number,
			int workunit_reg_capital, String workunit_phone_num1, String workunit_phone_num2) {
		return workunitDao.addWorkunit(workunit_name, workunit_type, workunit_reg_number, workunit_reg_capital, workunit_phone_num1, workunit_phone_num2);
		
	}

	public int updateWorkunit(int workunit_id, String workunit_name, String workunit_type, String workunit_reg_number,
			int workunit_reg_capital, String workunit_phone_num1, String workunit_phone_num2) {
		return workunitDao.updateWorkunit(workunit_id, workunit_name, workunit_type, workunit_reg_number, workunit_reg_capital, workunit_phone_num1, workunit_phone_num2);
	}

	public int deleteWorkunit(int workunit_id) {
		return workunitDao.deleteWorkunit(workunit_id);
	}

	public int addUserAirline(int user_id, int workunit_id) {
		return workunitDao.addUserWorkunit(user_id, workunit_id);
	}

}
