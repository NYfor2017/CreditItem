package com.ny.service;

import java.util.List;


import com.ny.entity.House;
/**
 * ������Ϣҵ��ӿ�
 * @author N.Y
 *
 */
public interface HouseService {
	
	/**
	 * ��ȡָ���û������з�����Ϣ
	 * @return
	 */
	List<House> getOwnHouse(int user_id);
	
	/**
	 * ���ӷ���
	 * @param house_address
	 * @param house_value
	 * @param house_payall_if
	 * @param user_id
	 * @return
	 */
	int addHouse(String house_address, int house_value, int house_payall_if,int user_id);
	
	/**
	 * ���·�������
	 * @param house_id
	 * @param house_address
	 * @param house_value
	 * @param house_payall_if
	 */
	int updateHouse(int house_id, String house_address, int house_value, int house_payall_if);
	
	/**
	 * ɾ������
	 * @param house_id
	 */
	int deleteHouse(int house_id);
}
