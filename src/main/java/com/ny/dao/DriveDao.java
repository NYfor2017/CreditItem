package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Drive;
/**
 * Drive的Dao类
 * @author N.Y
 *
 */
public interface DriveDao {
	/**
	 * 获取用户的所有驾照信息
	 * @param user_id
	 * @return
	 */
	List<Drive> getOwnDrive(@Param("user_id")int user_id);
	
	/**
	 * 添加驾照信息
	 * @param drive_card
	 * @param drive_status
	 * @param drive_quasi_type
	 * @param drive_year
	 * @param user_id
	 * @return
	 */
	int addDrive(@Param("drive_card")String drive_card, @Param("drive_status")String drive_status,
			@Param("drive_quasi_type")String drive_quasi_type, @Param("drive_year")int drive_year,
			@Param("user_id")int user_id);
	
	/**
	 * 更新驾照
	 * @param drive_id
	 * @param drive_card
	 * @param drive_status
	 * @param drive_quasi_type
	 * @param drive_year
	 * @return
	 */
	int updateDrive(@Param("drive_id")int drive_id,@Param("drive_card")String drive_card, @Param("drive_status")String drive_status,
			@Param("drive_quasi_type")String drive_quasi_type, @Param("drive_year")int drive_year);
	
	/**
	 * 删除驾照信息
	 * @param user_id
	 * @return
	 */
	int deleteDrive(@Param("drive_id")int drive_id);
	
}
