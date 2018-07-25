package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Quali;
/**
 * QualificationµÄDaoÀà
 * @author N.Y
 *
 */
public interface QualiDao {
	List<Quali> getOwnQuali(@Param("user_id")int user_id);
	
	int addQuali(@Param("quali_num")String quali_num,@Param("quali_name")String quali_name,
			@Param("quali_date")String quali_date, @Param("quali_insti")String quali_insti, @Param("user_id")int user_id);
	
	int updateQuali(@Param("quali_id")int quali_id, @Param("quali_num")String quali_num,@Param("quali_name")String quali_name,
			@Param("quali_date")String quali_date, @Param("quali_insti")String quali_insti);
	
	int deleteQuali(@Param("quali_id")int quali_id);
}
