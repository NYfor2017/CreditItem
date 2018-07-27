package com.ny.service;

import java.util.List;

import com.ny.entity.Car;
/**
 * ���ӵ�ҵ��ӿ�
 * @author N.Y
 *
 */
public interface CarService {
	
	/**
	 * ��ȡ�ض��û������г�����Ϣ
	 * @param user_id
	 * @return
	 */
	List<Car> queryOwnCar(int user_id);
	
	/**
	 * ��ӳ�����Ϣ
	 * @param car_number
	 * @param car_brand
	 * @param car_model
	 * @param car_buy_date
	 * @param car_type_year
	 * @param car_hit_market
	 * @param car_type
	 * @param car_size
	 * @param car_pro_country
	 * @param car_pro_type
	 * @param user_id
	 * @return
	 */
	int addCar(String car_number,
			String car_brand, String car_model, 
			String car_buy_date, String car_type_year,
			String car_hit_market, String car_type, 
			String car_size, String car_pro_country,
			boolean car_pro_type,int user_id);
	
	/**
	 * ���³�����Ϣ
	 * @param car_id
	 * @param car_number
	 * @param car_brand
	 * @param car_model
	 * @param car_buy_date
	 * @param car_type_year
	 * @param car_hit_market
	 * @param car_type
	 * @param car_size
	 * @param car_pro_country
	 * @param car_pro_type
	 */
	int updateCar(int car_id,String car_number,
			String car_brand, String car_model, 
			String car_buy_date, String car_type_year,
			String car_hit_market, String car_type, 
			String car_size, String car_pro_country,
			boolean car_pro_type);
	
	/**
	 * ����car_idɾ��������Ϣ
	 * @param car_id
	 */
	int deleteCar(int car_id);
}
