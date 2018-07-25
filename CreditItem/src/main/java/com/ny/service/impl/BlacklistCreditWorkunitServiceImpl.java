package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.BlacklistCreditWorkunitDao;
import com.ny.entity.BlacklistCreditWorkunit;
import com.ny.service.BlacklistCreditWorkunitService;
/**
 * BlacklistCreditWorkunit的业务实现类
 * @author N.Y
 *
 */
@Service
public class BlacklistCreditWorkunitServiceImpl implements BlacklistCreditWorkunitService {

	@Autowired
	BlacklistCreditWorkunitDao blacklistCreditWorkunitDao;
	

	public List<BlacklistCreditWorkunit> getOwnBlacklistCreditWorkunit(int workunit_id) {
		return blacklistCreditWorkunitDao.getOwnBlacklistCreditWorkunit(workunit_id);
	}

	public int addBlacklistCreditWorkunit(int workunit_id, String blacklist_detail) {
		return blacklistCreditWorkunitDao.addBlacklistCreditWorkunit(workunit_id, blacklist_detail);
	}

	public int updateBlacklistCreditWorkunit(int blacklist_credit_w_id, String blacklist_detail) {
		return blacklistCreditWorkunitDao.updateBlacklistCreditWorkunit(blacklist_credit_w_id, blacklist_detail);
	}

	public int deleteBlacklistCreditWorkunit(int blacklist_credit_w_id) {
		return blacklistCreditWorkunitDao.deleteBlacklistCreditWorkunit(blacklist_credit_w_id);
	}
	

}
