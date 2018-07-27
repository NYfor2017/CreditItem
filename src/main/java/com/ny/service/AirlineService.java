package com.ny.service;

import org.springframework.web.bind.annotation.RequestParam;
/**
 * Airline��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface AirlineService {
	/**
	 * ��Ӻ�����Ϣ
	 * @param airline_level
	 * @param airline_date
	 * @param airline_num
	 * @param airline_fee
	 * @return
	 */
	int addAirline(@RequestParam("airline_level")int airline_level, @RequestParam("airline_date")String airline_date, @RequestParam("airline_num")String airline_num, @RequestParam("airline_fee")double airline_fee);

	/**
	 * ���º�����Ϣ
	 * @param airline_id
	 * @param airline_level
	 * @param airline_date
	 * @param airline_num
	 * @param airline_fee
	 * @return
	 */
	int updateAirline(@RequestParam("airline_id")int airline_id,@RequestParam("airline_level")int airline_level, @RequestParam("airline_date")String airline_date, @RequestParam("airline_num")String airline_num, @RequestParam("airline_fee")double airline_fee);
	
	/**
	 * ɾ��������Ϣ
	 * @param airline_id
	 * @return
	 */
	int deleteAirline(@RequestParam("airline_id")int airline_id);
	
	/**
	 * ��Ӻ������û��Ĺ�ϵ��Ϣ
	 * @param user_id
	 * @param airline_id
	 * @return
	 */
	int addUserAirline(@RequestParam("user_id")int user_id, @RequestParam("airline_id")int airline_id);
}
