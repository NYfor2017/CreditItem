package com.ny.dao;



import org.apache.ibatis.annotations.Param;

/**
 * Airline的Dao类
 * @author N.Y
 *
 */
public interface AirlineDao {
	/**
	 * 添加航班信息
	 * @param airline_level
	 * @param airline_date
	 * @param airline_num
	 * @param airline_fee
	 * @return
	 */
	int addAirline(@Param("airline_level")int airline_level, @Param("airline_date")String airline_date, @Param("airline_num")String airline_num, @Param("airline_fee")double airline_fee);

	/**
	 * 更新航班信息
	 * @param airline_id
	 * @param airline_level
	 * @param airline_date
	 * @param airline_num
	 * @param airline_fee
	 * @return
	 */
	int updateAirline(@Param("airline_id")int airline_id,@Param("airline_level")int airline_level, @Param("airline_date")String airline_date, @Param("airline_num")String airline_num, @Param("airline_fee")double airline_fee);
	
	/**
	 * 删除航班信息
	 * @param airline_id
	 * @return
	 */
	int deleteAirline(@Param("airline_id")int airline_id);
	
	/**
	 * 添加航班与用户的关系信息
	 * @param user_id
	 * @param airline_id
	 * @return
	 */
	int addUserAirline(@Param("user_id")int user_id, @Param("airline_id")int airline_id);
}
