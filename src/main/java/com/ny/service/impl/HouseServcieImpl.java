package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.HouseDao;
import com.ny.entity.House;
import com.ny.service.HouseService;

/**
 * 房产信息的业务实现类
 * @author N.Y
 *
 */
@Service
public class HouseServcieImpl implements HouseService{

	@Autowired
	private HouseDao houseDao;
	
	public List<House> getOwnHouse(int user_id) {
		return houseDao.getOwnHouse(user_id);
	}

	public int addHouse(String house_address, int house_value, int house_payall_if, int user_id) {
		return houseDao.addHouse(house_address, house_value, house_payall_if, user_id);
	}

	public int updateHouse(int house_id, String house_address, int house_value, int house_payall_if) {
		return houseDao.updateHouse(house_id, house_address, house_value, house_payall_if);
	}

	public int deleteHouse(int house_id) {
		return houseDao.deleteHouse(house_id);
	}

}
