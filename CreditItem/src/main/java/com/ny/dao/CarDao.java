package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Car;
/**
 * 车子的Dao类
 * @author N.Y
 *
 */
public interface CarDao {
	
	/**
	 * 查询所有的车
	 * @return
	 */
	List<Car> queryAllCar();
	
	/**
	 * 获取特定用户的所有车产信息
	 * @param user_id
	 * @return
	 */
	List<Car> queryOwnCar(@Param("user_id")int user_id);
	
	/**
	 * 添加车产信息
	 * 其中，user_id是用来标识车子的所有者，需要从页面获得
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
	int addCar(@Param("car_number")String car_number,
			@Param("car_brand")String car_brand, @Param("car_model")String car_model, 
			@Param("car_buy_date")String car_buy_date, @Param("car_type_year")String car_type_year,
			@Param("car_hit_market")String car_hit_market, @Param("car_type")String car_type, 
			@Param("car_size")String car_size, @Param("car_pro_country")String car_pro_country,
			@Param("car_pro_type")boolean car_pro_type,@Param("user_id")int user_id);
	
	/**
	 * 更新车产信息
	 * 其中，car_id是用来标识车子的，需要从页面获得
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
	int updateCar(@Param("car_id")int car_id,@Param("car_number")String car_number,
			@Param("car_brand")String car_brand, @Param("car_model")String car_model, 
			@Param("car_buy_date")String car_buy_date, @Param("car_type_year")String car_type_year,
			@Param("car_hit_market")String car_hit_market, @Param("car_type")String car_type, 
			@Param("car_size")String car_size, @Param("car_pro_country")String car_pro_country,
			@Param("car_pro_type")boolean car_pro_type);
	
	/**
	 * 根据car_id删除车产信息
	 * @param car_id
	 */
	int deleteCar(@Param("car_id")int car_id);
}
