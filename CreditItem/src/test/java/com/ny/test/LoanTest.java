package com.ny.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ny.BaseTest;
import com.ny.dao.LoanDao;
import com.ny.entity.Loan;

public class LoanTest extends BaseTest{
	@Autowired
	LoanDao loanDao;
	
	@Test
	public void testList() {
		List<Loan> li = loanDao.getOwnLoan(1);
		Iterator<Loan> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
