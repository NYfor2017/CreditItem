package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.ContactDao;
import com.ny.entity.Contact;
import com.ny.service.ContactService;
/**
 * Contact的业务实现类
 * @author N.Y
 *
 */
@Service
public class ContactServiceiImpl implements ContactService {

	@Autowired
	ContactDao contactDao;
	
	
	public List<Contact> getOwnContact(int user_id) {
		return contactDao.getOwnContact(user_id);
	}

	public int addContact(String contact_number, boolean contact_status, String contact_time, String contact_name,
			int user_id) {
		return contactDao.addContact(contact_number, contact_status, contact_time, contact_name, user_id);
	}

	public int updateContact(int contact_id, String contact_number, boolean contact_status, String contact_time,
			String contact_name) {
		return contactDao.updateContact(contact_id, contact_number, contact_status, contact_time, contact_name);
	}

	public int deleteContact(int contact_id) {
		return contactDao.deleteContact(contact_id);
	}

}
