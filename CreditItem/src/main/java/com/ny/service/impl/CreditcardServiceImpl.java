package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.CreditcardDao;
import com.ny.entity.Creditcard;
import com.ny.service.CreditcardService;
@Service
public class CreditcardServiceImpl implements CreditcardService {

	@Autowired
	CreditcardDao creditcardDao;
	
	public List<Creditcard> getOwnCreditcard(int user_id) {
		return creditcardDao.getOwnCreditcard(user_id);
	}

	public int addCreditcard(String creditcard_number, String creditcard_pro, String creditcard_status, int user_id) {
		return creditcardDao.addCreditcard(creditcard_number, creditcard_pro, creditcard_status, user_id);
	}

	public int updateCreditcard(int creditcard_id, String creditcard_number, String creditcard_pro,
			String creditcard_status) {
		return creditcardDao.updateCreditcard(creditcard_id, creditcard_number, creditcard_pro, creditcard_status);
				
	}

	public int deleteCreditcard(int creditcard_id) {
		return creditcardDao.deleteCreditcard(creditcard_id);
	}

}
