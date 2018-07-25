package com.ny.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ny.entity.BlacklistUser;
import com.ny.service.BlacklistUserService;
/**
 * BlacklistUser的业务实现类
 * @author N.Y
 *
 */
@Service
public class BlacklistUserServiceImpl implements BlacklistUserService {

	public List<BlacklistUser> getOwnBlacklistUser(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int addBlacklistUser(int user_id, String blacklist_detail) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateBlacklistUser(int blacklist_user_id, String blacklist_detail) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteBlacklistUser(int blacklist_user_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
