package com.ny.service;

import java.util.List;


import com.ny.entity.Paper;
/**
 * Paper��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface PaperService {

	/**
	 * �õ��û�����������
	 * @param user_id
	 * @return
	 */
	List<Paper> getOwnPaper(int user_id);
	
	/**
	 * �������
	 * @param paper_num
	 * @param paper_title
	 * @param paper_detail
	 * @param user_id
	 * @return
	 */
	int addPaper(String paper_num,String paper_title, String paper_detail,int user_id);
	
	/**
	 * ��������
	 * @param paper_id
	 * @param paper_num
	 * @param paper_title
	 * @param paper_detail
	 */
	int updatePaper(int paper_id, String paper_num, String paper_title, String paper_detail);
	
	/**
	 * ɾ������
	 * @param paper_id
	 */
	int deletePaper(int paper_id);
}
