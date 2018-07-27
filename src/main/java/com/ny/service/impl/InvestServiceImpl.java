package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.InvestDao;
import com.ny.entity.Invest;
import com.ny.service.InvestService;

/**
 * Invest的业务实现类
 * @author N.Y
 *
 */
@Service
public class InvestServiceImpl implements InvestService{
	@Autowired
	InvestDao investDao;
	
	public List<Invest> getOwnInvest(int user_id) {
		return investDao.getOwnInvest(user_id);
	}

	public int addInvest(String invest_itemName, int invest_amount, int user_id) {
		return investDao.addInvest(invest_itemName, invest_amount, user_id);
	}

	public int updateInvest(int invest_id, String invest_itemName, int invest_amount) {
		return investDao.updateInvest(invest_id, invest_itemName, invest_amount);
	}

	public int deleteInvest(int invest_id) {
		return investDao.deleteInvest(invest_id);
	}

}
