package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.CardOut12MDao;
import com.ny.entity.CardOut12M;
import com.ny.service.CardOut12MService;
/**
 * CardOut12M的业务实现类
 * @author N.Y
 *
 */
@Service
public class CardOut12MServiceImpl implements CardOut12MService {

	@Autowired
	CardOut12MDao cardOut12MDao;
	
	public List<CardOut12M> getOwnCardOut12M(int user_id) {
		return cardOut12MDao.getOwnCardOut12M(user_id);
	}

	public int addCardOut12M(int out_12m_time, int out_12m_amount, int user_id) {
		return cardOut12MDao.addCardOut12M(out_12m_time, out_12m_amount, user_id);
	}

	public int updateCardOut12M(int out_12m_id, int out_12m_time, int out_12m_amount) {
		return cardOut12MDao.updateCardOut12M(out_12m_id, out_12m_time, out_12m_amount);
	}

	public int deleteCardOut12M(int out_12m_id) {
		return cardOut12MDao.deleteCardOut12M(out_12m_id);
	}

}
