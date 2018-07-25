package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.BlacklistLegalUserDao;
import com.ny.entity.BlacklistLegalUser;
import com.ny.service.BlacklistLegalUserService;
@Service
public class BlacklistLegalUserServiceImpl implements BlacklistLegalUserService{

	@Autowired
	BlacklistLegalUserDao blacklistLegalUserDao;
	
	public List<BlacklistLegalUser> getOwnBlacklistLegalUser(int user_id) {
		return blacklistLegalUserDao.getOwnBlacklistLegalUser(user_id);
	}

	public int addBlacklistLegalUser(int user_id, String blacklist_detail) {
		return blacklistLegalUserDao.addBlacklistLegalUser(user_id, blacklist_detail);
	}

	public int updateBlacklistLegalUser(int blacklist_legal_u_id, String blacklist_detail) {
		return blacklistLegalUserDao.updateBlacklistLegalUser(blacklist_legal_u_id, blacklist_detail);
	}

	public int deleteBlacklistLegalUser(int blacklist_legal_u_id) {
		return blacklistLegalUserDao.deleteBlacklistLeaglUser(blacklist_legal_u_id);
	}

	
}
