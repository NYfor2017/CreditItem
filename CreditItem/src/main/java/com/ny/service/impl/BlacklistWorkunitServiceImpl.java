package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.BlacklistWorkunitDao;
import com.ny.entity.BlacklistWorkunit;
import com.ny.service.BlacklistWorkunitService;
/**
 * BlacklistWorkunit的业务实现类
 * @author N.Y
 *
 */
@Service
public class BlacklistWorkunitServiceImpl implements BlacklistWorkunitService {

	@Autowired
	BlacklistWorkunitDao blacklistWorkunitDao;
	
	public List<BlacklistWorkunit> getOwnBlacklistWorkunit(int workunit_id) {
		return blacklistWorkunitDao.getOwnBlacklistWorkunit(workunit_id);
	}

	public int addBlacklistWorkunit(int workunit_id, String blacklist_detail) {
		return blacklistWorkunitDao.addBlacklistWorkunit(workunit_id, blacklist_detail);
	}

	public int updateBlacklistWorkunit(int blacklist__w_id, String blacklist_detail) {
		return blacklistWorkunitDao.updateBlacklistWorkunit(blacklist__w_id, blacklist_detail);
	}

	public int deleteBlacklistWorkunit(int blacklist__w_id) {
		return blacklistWorkunitDao.deleteBlacklistWorkunit(blacklist__w_id);
	}

}
