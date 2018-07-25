package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.BlacklistCreditUserDao;
import com.ny.entity.BlacklistCreditUser;
import com.ny.service.BlacklistCreditUserService;
/**
 * BlacklistCreditUser的业务实现类
 * @author N.Y
 *
 */
@Service
public class BlacklistCreditUserServiceImpl implements BlacklistCreditUserService{
	@Autowired
	BlacklistCreditUserDao blacklistCreditUserDao;
	
	public List<BlacklistCreditUser> getOwnBlacklistCreditUser(int user_id) {
		return blacklistCreditUserDao.getOwnBlacklistCreditUser(user_id);
	}

	public int addBlacklistCreditUser(int user_id, String blacklist_detail) {
		return blacklistCreditUserDao.addBlacklistCreditUser(user_id, blacklist_detail);
	}

	public int updateBlacklistCreditUser(int blacklist_credit_u_id, String blacklist_detail) {
		return blacklistCreditUserDao.updateBlacklistCreditUser(blacklist_credit_u_id, blacklist_detail);
	}

	public int deleteBlacklistCreditUser(int blacklist_credit_u_id) {
		return blacklistCreditUserDao.deleteBlacklistCreditUser(blacklist_credit_u_id);
	}

}
