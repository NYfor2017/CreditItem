package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.ContactDao;
import com.ny.entity.Contact;

public class ContactTest extends BaseTest{
	@Autowired
	ContactDao contactDao;
	
	@Test
	public void testList() {
		List<Contact> li = contactDao.getOwnContact(2);
		Iterator<Contact> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAdd() {
		contactDao.addContact("8989898989", false, "13:21:13", "linda", 2);
		
	}
	
	@Test
	public void testUpdate() {
		contactDao.updateContact(4, "123123123", true, "13:13:13", "nicole");
	}
}
