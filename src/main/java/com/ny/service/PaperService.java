package com.ny.service;

import java.util.List;


import com.ny.entity.Paper;
/**
 * Paper的业务接口类
 * @author N.Y
 *
 */
public interface PaperService {

	/**
	 * 得到用户的所有论文
	 * @param user_id
	 * @return
	 */
	List<Paper> getOwnPaper(int user_id);
	
	/**
	 * 添加论文
	 * @param paper_num
	 * @param paper_title
	 * @param paper_detail
	 * @param user_id
	 * @return
	 */
	int addPaper(String paper_num,String paper_title, String paper_detail,int user_id);
	
	/**
	 * 更新论文
	 * @param paper_id
	 * @param paper_num
	 * @param paper_title
	 * @param paper_detail
	 */
	int updatePaper(int paper_id, String paper_num, String paper_title, String paper_detail);
	
	/**
	 * 删除论文
	 * @param paper_id
	 */
	int deletePaper(int paper_id);
}
