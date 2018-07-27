package com.ny.service;

import org.springframework.web.bind.annotation.RequestParam;
/**
 * Airline的业务接口类
 * @author N.Y
 *
 */
public interface AirlineService {
	/**
	 * 添加航班信息
	 * @param airline_level
	 * @param airline_date
	 * @param airline_num
	 * @param airline_fee
	 * @return
	 */
	int addAirline(@RequestParam("airline_level")int airline_level, @RequestParam("airline_date")String airline_date, @RequestParam("airline_num")String airline_num, @RequestParam("airline_fee")double airline_fee);

	/**
	 * 更新航班信息
	 * @param airline_id
	 * @param airline_level
	 * @param airline_date
	 * @param airline_num
	 * @param airline_fee
	 * @return
	 */
	int updateAirline(@RequestParam("airline_id")int airline_id,@RequestParam("airline_level")int airline_level, @RequestParam("airline_date")String airline_date, @RequestParam("airline_num")String airline_num, @RequestParam("airline_fee")double airline_fee);
	
	/**
	 * 删除航班信息
	 * @param airline_id
	 * @return
	 */
	int deleteAirline(@RequestParam("airline_id")int airline_id);
	
	/**
	 * 添加航班与用户的关系信息
	 * @param user_id
	 * @param airline_id
	 * @return
	 */
	int addUserAirline(@RequestParam("user_id")int user_id, @RequestParam("airline_id")int airline_id);
}
