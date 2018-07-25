package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.SecurityDao;
import com.ny.entity.Security;
import com.ny.service.SecurityService;

@Service
public class SecurityServiceImpl implements SecurityService{
	@Autowired
	SecurityDao securityDao;
	
	public List<Security> getOwnSecurity(int user_id) {
		return securityDao.getOwnSecurity(user_id);
	}

	public int addSecurity(boolean secu_if, String secu_name, int secu_pay_base, String secu_pay_unit,
			String secu_parti_status, String secu_city, int secu_paid_cons_month, String secu_idcard,
			String secu_pay_recent, int user_id) {
		return securityDao.addSecurity(secu_if, secu_name, secu_pay_base, secu_pay_unit, secu_parti_status, secu_city, secu_paid_cons_month, secu_idcard, secu_pay_recent, user_id);
	}

	public int updateSecurity(int secu_id, boolean secu_if, String secu_name, int secu_pay_base, String secu_pay_unit,
			String secu_parti_status, String secu_city, int secu_paid_cons_month, String secu_idcard,
			String secu_pay_recent) {
		return securityDao.updateSecurity(secu_id, secu_if, secu_name, secu_pay_base, secu_pay_unit, secu_parti_status, secu_city, secu_paid_cons_month, secu_idcard, secu_pay_recent);
	}

	public int deleteSecurity(int secu_id) {
		return securityDao.deleteSecurity(secu_id);
	}
	
}
