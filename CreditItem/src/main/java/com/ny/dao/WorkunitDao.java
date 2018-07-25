package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Workunit;
/**
 * Workunit��Dao��
 * @author N.Y
 *
 */
public interface WorkunitDao {
	/**
	 * ��ȡȫ������ҵ�б�
	 * @return
	 */
	List<Workunit> getAllWorkunit();
	
	/**
	 * ������ҵ
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
	 * ������ҵ
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
	 * ɾ����ҵ
	 * @param workunit_id
	 * @return
	 */
	int deleteWorkunit(@Param("workunit_id")int workunit_id);
	
	/**
	 * �����ҵ���û��Ĺ�ϵ��Ϣ
	 * @param user_id
	 * @param workunit_id
	 * @return
	 */
	int addUserWorkunit(@Param("user_id")int user_id, @Param("workunit_id")int workunit_id);
}
