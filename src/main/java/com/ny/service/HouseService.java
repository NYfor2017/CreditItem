package com.ny.service;

import java.util.List;


import com.ny.entity.House;
/**
 * 房产信息业务接口
 * @author N.Y
 *
 */
public interface HouseService {
	
	/**
	 * 获取指定用户的所有房产信息
	 * @return
	 */
	List<House> getOwnHouse(int user_id);
	
	/**
	 * 增加房产
	 * @param house_address
	 * @param house_value
	 * @param house_payall_if
	 * @param user_id
	 * @return
	 */
	int addHouse(String house_address, int house_value, int house_payall_if,int user_id);
	
	/**
	 * 更新房产数据
	 * @param house_id
	 * @param house_address
	 * @param house_value
	 * @param house_payall_if
	 */
	int updateHouse(int house_id, String house_address, int house_value, int house_payall_if);
	
	/**
	 * 删除房产
	 * @param house_id
	 */
	int deleteHouse(int house_id);
}
