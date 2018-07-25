package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.CardOut3MDao;
import com.ny.entity.CardOut3M;
import com.ny.service.CardOut3MService;
/**
 * CardOut3M的业务实体类
 * @author N.Y
 *
 */
@Service
public class CardOut3MServiceImpl implements CardOut3MService {
	@Autowired
	CardOut3MDao cardOut3MDao;
	
	public List<CardOut3M> getOwnCardOut3M(int user_id) {
		return cardOut3MDao.getOwnCardOut3M(user_id);
	}

	public int addCardOut3M(int out_3m_time, int out_3m_amount, int user_id) {
		return cardOut3MDao.addCardOut3M(out_3m_time, out_3m_amount, user_id);
	}

	public int updateCardOut3M(int out_3m_id, int out_3m_time, int out_3m_amount) {
		return cardOut3MDao.updateCardOut3M(out_3m_id, out_3m_time, out_3m_amount);
	}

	public int deleteCardOut3M(int out_3m_id) {
		return cardOut3MDao.deleteCardOut3M(out_3m_id);
	}

}
