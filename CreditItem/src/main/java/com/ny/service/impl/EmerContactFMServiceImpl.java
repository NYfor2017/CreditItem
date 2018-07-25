package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.EmerContactFMDao;
import com.ny.entity.EmerContactFM;
/**
 * EmerContactFM的业务实现类
 * @author N.Y
 *
 */
@Service
public class EmerContactFMServiceImpl implements com.ny.service.EmerContactFMService {

	@Autowired
	EmerContactFMDao emerContactFMDao;
	
	public List<EmerContactFM> getOwnEmerContactFM(int user_id) {
		return emerContactFMDao.getOwnEmerContactFM(user_id);
	}

	public int addEmerContactFM(String emercontact_fm_name, String emercontact_fm_number, int user_id) {
		return emerContactFMDao.addEmerContactFM(emercontact_fm_name, emercontact_fm_number, user_id);				
	}

	public int updateEmerContactFM(int emercontact_fm_id, String emercontact_fm_name, String emercontact_fm_number) {
		return emerContactFMDao.updateEmerContactFM(emercontact_fm_id, emercontact_fm_name, emercontact_fm_number);
	}

	public int deleteEmerContactFM(int emercontact_fm_id) {
		return emerContactFMDao.deleteEmerContactFM(emercontact_fm_id);
	}

}
