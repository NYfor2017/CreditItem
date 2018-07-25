package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.House;

/**
 * 房产的Dao类
 * @author N.Y
 *
 */
public interface HouseDao {
	
	/**
	 * 得到房产的全部信息
	 * @return
	 */
	List<House> queryAllHouse();
	
	/**
	 * 添加房产信息
	 * @param house_address
	 * @param house_value
	 * @param house_payall_if
	 * @param user_id
	 * @return
	 */
	int addHouse(@Param("house_address")String house_address, @Param("house_value")int house_value, @Param("house_payall_if")int house_payall_if, @Param("user_id")int user_id);
	
	/**
	 * 得到用户个人的所有房产信息
	 * @param house_id
	 * @return
	 */
	List<House> getOwnHouse(@Param("user_id")int user_id);
	
	/**
	 * 更新房产数据
	 * @param house_id
	 * @param house_address
	 * @param house_value
	 * @param house_payall_if
	 */
	int updateHouse(@Param("house_id")int house_id, @Param("house_address")String house_address, @Param("house_value")int house_value, @Param("house_payall_if")int house_payall_if);
	
	/**
	 * 根据房产的id删除房产信息
	 * @param house_id
	 */
	int deleteHouse(@Param("house_id")int house_id);
}
