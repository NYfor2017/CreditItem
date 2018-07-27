package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Workunit;
/**
 * Workunit的业务接口类
 * @author N.Y
 *
 */
public interface WorkunitService {
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
	int addWorkunit(@RequestParam("workunit_name")String workunit_name, @RequestParam("workunit_type")String workunit_type, @RequestParam("workunit_reg_number")String workunit_reg_number,
			@RequestParam("workunit_reg_capital")int workunit_reg_capital, @RequestParam("workunit_phone_num1")String workunit_phone_num1, @RequestParam("workunit_phone_num2")String workunit_phone_num2);
	
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
	int updateWorkunit(@RequestParam("workunit_id")int workunit_id, @RequestParam("workunit_name")String workunit_name, @RequestParam("workunit_type")String workunit_type, @RequestParam("workunit_reg_number")String workunit_reg_number,
			@RequestParam("workunit_reg_capital")int workunit_reg_capital, @RequestParam("workunit_phone_num1")String workunit_phone_num1, @RequestParam("workunit_phone_num2")String workunit_phone_num2);
	
	/**
	 * 删除企业
	 * @param workunit_id
	 * @return
	 */
	int deleteWorkunit(@RequestParam("workunit_id")int workunit_id);
	
	/**
	 * 添加航班与用户的关系信息
	 * @param user_id
	 * @param workunit_id
	 * @return
	 */
	int addUserAirline(@RequestParam("user_id")int user_id, @RequestParam("workunit_id")int workunit_id);
}
