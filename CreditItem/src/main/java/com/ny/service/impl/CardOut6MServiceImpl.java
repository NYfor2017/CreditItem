package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.CardOut6MDao;
import com.ny.entity.CardOut6M;
import com.ny.service.CardOut6MService;
/**
 * CardOut6M的业务实体类
 * @author N.Y
 *
 */
@Service
public class CardOut6MServiceImpl implements CardOut6MService {
	@Autowired
	CardOut6MDao cardOut6MDao;
	
	public List<CardOut6M> getOwnCardOut6M(int user_id) {
		return cardOut6MDao.getOwnCardOut6M(user_id);
	}

	public int addCardOut6M(int out_6m_time, int out_6m_amount, int user_id) {
		return cardOut6MDao.addCardOut6M(out_6m_time, out_6m_amount, user_id);
	}

	public int updateCardOut6M(int out_6m_id, int out_6m_time, int out_6m_amount) {
		return cardOut6MDao.updateCardOut6M(out_6m_id, out_6m_time, out_6m_amount);
	}

	public int deleteCardOut6M(int out_6m_id) {
		return cardOut6MDao.deleteCardOut6M(out_6m_id);
	}

}
