package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.PaperDao;
import com.ny.entity.Paper;
import com.ny.service.PaperService;
/**
 * Paper的业务实现类
 * @author N.Y
 *
 */
@Service
public class PaperServiceImpl implements PaperService{

	@Autowired
	PaperDao paperDao;
	
	public List<Paper> getOwnPaper(int user_id) {
		return paperDao.getOwnPaper(user_id);
	}

	public int addPaper(String paper_num, String paper_title, String paper_detail, int user_id) {
		return paperDao.addPaper(paper_num, paper_title, paper_detail, user_id);	
	}

	public int updatePaper(int paper_id, String paper_num, String paper_title, String paper_detail) {
		return paperDao.updatePaper(paper_id, paper_num, paper_title, paper_detail);
	}

	public int deletePaper(int paper_id) {
		return paperDao.deletePaper(paper_id);
	}
	
}
