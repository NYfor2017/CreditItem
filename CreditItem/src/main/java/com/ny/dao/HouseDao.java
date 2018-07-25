package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.House;

/**
 * ������Dao��
 * @author N.Y
 *
 */
public interface HouseDao {
	
	/**
	 * �õ�������ȫ����Ϣ
	 * @return
	 */
	List<House> queryAllHouse();
	
	/**
	 * ��ӷ�����Ϣ
	 * @param house_address
	 * @param house_value
	 * @param house_payall_if
	 * @param user_id
	 * @return
	 */
	int addHouse(@Param("house_address")String house_address, @Param("house_value")int house_value, @Param("house_payall_if")int house_payall_if, @Param("user_id")int user_id);
	
	/**
	 * �õ��û����˵����з�����Ϣ
	 * @param house_id
	 * @return
	 */
	List<House> getOwnHouse(@Param("user_id")int user_id);
	
	/**
	 * ���·�������
	 * @param house_id
	 * @param house_address
	 * @param house_value
	 * @param house_payall_if
	 */
	int updateHouse(@Param("house_id")int house_id, @Param("house_address")String house_address, @Param("house_value")int house_value, @Param("house_payall_if")int house_payall_if);
	
	/**
	 * ���ݷ�����idɾ��������Ϣ
	 * @param house_id
	 */
	int deleteHouse(@Param("house_id")int house_id);
}
