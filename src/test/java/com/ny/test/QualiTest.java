package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.QualiDao;
import com.ny.entity.Quali;

public class QualiTest extends BaseTest{
	@Autowired
	QualiDao qualiDao;
	
	@Test
	public void testList() {
		List<Quali> list = qualiDao.getOwnQuali(2);
		Iterator<Quali> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void testAdd() {
		int a = qualiDao.addQuali("00000000004", "�м��������ʦ�ʸ�֤", "2019-1-1", "צ��Э��", 2);
		System.out.println("�Ҽӽ�ȥ�ˣ�");
	}
	
	@Test
	public void testUpdate() {
		int u = qualiDao.updateQuali(4, "0000000000004", "�߼��������ʦ�ʸ�֤", "2020-1-1", "צ��Э��");
	}
	
	
}
