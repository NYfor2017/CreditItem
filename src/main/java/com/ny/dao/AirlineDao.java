package com.ny.dao;



import org.apache.ibatis.annotations.Param;

/**
 * Airline��Dao��
 * @author N.Y
 *
 */
public interface AirlineDao {
	/**
	 * ��Ӻ�����Ϣ
	 * @param airline_level
	 * @param airline_date
	 * @param airline_num
	 * @param airline_fee
	 * @return
	 */
	int addAirline(@Param("airline_level")int airline_level, @Param("airline_date")String airline_date, @Param("airline_num")String airline_num, @Param("airline_fee")double airline_fee);

	/**
	 * ���º�����Ϣ
	 * @param airline_id
	 * @param airline_level
	 * @param airline_date
	 * @param airline_num
	 * @param airline_fee
	 * @return
	 */
	int updateAirline(@Param("airline_id")int airline_id,@Param("airline_level")int airline_level, @Param("airline_date")String airline_date, @Param("airline_num")String airline_num, @Param("airline_fee")double airline_fee);
	
	/**
	 * ɾ��������Ϣ
	 * @param airline_id
	 * @return
	 */
	int deleteAirline(@Param("airline_id")int airline_id);
	
	/**
	 * ��Ӻ������û��Ĺ�ϵ��Ϣ
	 * @param user_id
	 * @param airline_id
	 * @return
	 */
	int addUserAirline(@Param("user_id")int user_id, @Param("airline_id")int airline_id);
}
