package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.CarDao;
import com.ny.entity.Car;
import com.ny.service.CarService;

/**
 * Car的业务实现类
 * @author N.Y
 *
 */
@Service
public class CarServiceImpl implements CarService{

	@Autowired
	CarDao carDao;
	public List<Car> queryOwnCar(int user_id) {
		return carDao.queryOwnCar(user_id);
	}

	public int addCar(String car_number, String car_brand, String car_model, String car_buy_date, String car_type_year,
			String car_hit_market, String car_type, String car_size, String car_pro_country, boolean car_pro_type,
			int user_id) {
		return carDao.addCar(car_number, car_brand, car_model, car_buy_date, car_type_year, car_hit_market, car_type, car_size, car_pro_country, car_pro_type, user_id);
	}

	public int updateCar(int car_id, String car_number, String car_brand, String car_model, String car_buy_date,
			String car_type_year, String car_hit_market, String car_type, String car_size, String car_pro_country,
			boolean car_pro_type) {
		return carDao.updateCar(car_id, car_number, car_brand, car_model, car_buy_date, car_type_year, car_hit_market, car_type, car_size, car_pro_country, car_pro_type);
		
	}

	public int deleteCar(int car_id) {
		return carDao.deleteCar(car_id);
	}
	
}
