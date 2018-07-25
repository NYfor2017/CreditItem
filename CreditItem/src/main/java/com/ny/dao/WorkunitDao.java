package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Workunit;
/**
 * Workunit的Dao类
 * @author N.Y
 *
 */
public interface WorkunitDao {
	/**
	 * 获取全部的企业列表
	 * @return
	 */
	List<Workunit> getAllWorkunit();
	
	/**
	 * 增加企业
	 * @param workunit_name
	 * @param workunit_type
	 * @param workunit_reg_number
	 * @param workunit_reg_capital
	 * @param workunit_phone_num1
	 * @param workunit_phone_num2
	 * @return
	 */
	int addWorkunit(@Param("workunit_name")String workunit_name, @Param("workunit_type")String workunit_type, @Param("workunit_reg_number")String workunit_reg_number,
			@Param("workunit_reg_capital")int workunit_reg_capital, @Param("workunit_phone_num1")String workunit_phone_num1, @Param("workunit_phone_num2")String workunit_phone_num2);
	
	/**
	 * 更新企业
	 * @param workunit_id
	 * @param workunit_name
	 * @param workunit_type
	 * @param workunit_reg_number
	 * @param workunit_reg_capital
	 * @param workunit_phone_num1
	 * @param workunit_phone_num2
	 * @return
	 */
	int updateWorkunit(@Param("workunit_id")int workunit_id, @Param("workunit_name")String workunit_name, @Param("workunit_type")String workunit_type, @Param("workunit_reg_number")String workunit_reg_number,
			@Param("workunit_reg_capital")int workunit_reg_capital, @Param("workunit_phone_num1")String workunit_phone_num1, @Param("workunit_phone_num2")String workunit_phone_num2);
	
	/**
	 * 删除企业
	 * @param workunit_id
	 * @return
	 */
	int deleteWorkunit(@Param("workunit_id")int workunit_id);
	
	/**
	 * 添加企业与用户的关系信息
	 * @param user_id
	 * @param workunit_id
	 * @return
	 */
	int addUserWorkunit(@Param("user_id")int user_id, @Param("workunit_id")int workunit_id);
}
