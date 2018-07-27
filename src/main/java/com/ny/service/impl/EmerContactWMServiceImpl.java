package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.EmerContactWMDao;
import com.ny.entity.EmerContactWM;
import com.ny.service.EmerContactWMService;
/**
 * EmerContactWMService的业务实现类
 * @author N.Y
 *
 */
@Service
public class EmerContactWMServiceImpl implements EmerContactWMService{

	@Autowired
	EmerContactWMDao emerContactWMDao;
	
	public List<EmerContactWM> getOwnEmerContactWM(int user_id) {
		return emerContactWMDao.getOwnEmerContactWM(user_id);
	}

	public int addEmerContactWM(String emercontact_wm_name, String emercontact_wm_number, int user_id) {
		return emerContactWMDao.addEmerContactWM(emercontact_wm_name, emercontact_wm_number, user_id);
	}

	public int updateEmerContactWM(int emercontact_wm_id, String emercontact_wm_name, String emercontact_wm_number) {
		return emerContactWMDao.updateEmerContactWM(emercontact_wm_id, emercontact_wm_name, emercontact_wm_number);
	}

	public int deleteEmerContactWM(int emercontact_wm_id) {
		return emerContactWMDao.deleteEmerContactWM(emercontact_wm_id);
	}
	
}
