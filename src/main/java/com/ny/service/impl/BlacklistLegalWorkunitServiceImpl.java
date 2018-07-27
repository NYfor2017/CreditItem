package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.BlacklistLegalWorkunitDao;
import com.ny.entity.BlacklistLegalWorkunit;
import com.ny.service.BlacklistLegalWorkunitService;
/**
 * BlacklistLegalWorkunit的业务实现类
 * @author N.Y
 *
 */
@Service
public class BlacklistLegalWorkunitServiceImpl implements BlacklistLegalWorkunitService {
	
	@Autowired
	BlacklistLegalWorkunitDao blacklistLegalWorkunitDao;
	
	public List<BlacklistLegalWorkunit> getOwnBlacklistLegalWorkunit(int workunit_id) {
		return blacklistLegalWorkunitDao.getOwnBlacklistLegalWorkunit(workunit_id);
	}

	public int addBlacklistLegalWorkunit(int workunit_id, String blacklist_detail) {
		return blacklistLegalWorkunitDao.addBlacklistLegalWorkunit(workunit_id, blacklist_detail);
	}

	public int updateBlacklistLegalWorkunit(int blacklist_legal_w_id, String blacklist_detail) {
		return blacklistLegalWorkunitDao.updateBlacklistLegalWorkunit(blacklist_legal_w_id, blacklist_detail);
	}

	public int deleteBlacklistLegalWorkunit(int blacklist_legal_w_id) {
		return blacklistLegalWorkunitDao.deleteBlacklistLegalWorkunit(blacklist_legal_w_id);
	}

}
