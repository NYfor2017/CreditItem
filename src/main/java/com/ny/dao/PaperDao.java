package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Paper;

/**
 * 论文的Dao类
 * @author N.Y
 *
 */
public interface PaperDao {
	
	/**
	 * 得到用户的所有论文
	 * @return
	 */
	List<Paper> getOwnPaper(@Param("user_id")int user_id);
	
	/**
	 * 添加论文
	 * @param paper_num
	 * @param paper_title
	 * @param paper_detail
	 * @return
	 */
	int addPaper(@Param("paper_num")String paper_num, @Param("paper_title")String paper_title, @Param("paper_detail")String paper_detail, @Param("user_id")int user_id);
	
	/**
	 * 更新论文
	 * @param paper_id
	 * @param paper_num
	 * @param paper_title
	 * @param paper_detail
	 */
	int updatePaper(@Param("paper_id")int paper_id, @Param("paper_num")String paper_num, @Param("paper_title")String paper_title, @Param("paper_detail")String paper_detail);
	
	/**
	 * 删除论文
	 * @param paper_id
	 */
	int deletePaper(@Param("paper_id")int paper_id);
	
}
