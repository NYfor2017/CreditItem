package com.ny.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.AirlineDao;
import com.ny.service.AirlineService;
/**
 * Airline的业务实现类
 * @author N.Y
 *
 */
@Service
public class AirlineServiceImpl implements AirlineService {
	@Autowired
	AirlineDao airlineDao;
	
	public int addAirline(int airline_level, String airline_date, String airline_num, double airline_fee) {
		return airlineDao.addAirline(airline_level, airline_date, airline_num, airline_fee);
	}

	public int updateAirline(int airline_id, int airline_level, String airline_date, String airline_num,
			double airline_fee) {
		return airlineDao.updateAirline(airline_id, airline_level, airline_date, airline_num, airline_fee);
	}

	public int deleteAirline(int airline_id) {
		return airlineDao.deleteAirline(airline_id);
	}

	public int addUserAirline(int user_id, int airline_id) {
		return airlineDao.addUserAirline(user_id, airline_id);
	}

}
