package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Paper;

/**
 * ���ĵ�Dao��
 * @author N.Y
 *
 */
public interface PaperDao {
	
	/**
	 * �õ��û�����������
	 * @return
	 */
	List<Paper> getOwnPaper(@Param("user_id")int user_id);
	
	/**
	 * �������
	 * @param paper_num
	 * @param paper_title
	 * @param paper_detail
	 * @return
	 */
	int addPaper(@Param("paper_num")String paper_num, @Param("paper_title")String paper_title, @Param("paper_detail")String paper_detail, @Param("user_id")int user_id);
	
	/**
	 * ��������
	 * @param paper_id
	 * @param paper_num
	 * @param paper_title
	 * @param paper_detail
	 */
	int updatePaper(@Param("paper_id")int paper_id, @Param("paper_num")String paper_num, @Param("paper_title")String paper_title, @Param("paper_detail")String paper_detail);
	
	/**
	 * ɾ������
	 * @param paper_id
	 */
	int deletePaper(@Param("paper_id")int paper_id);
	
}
