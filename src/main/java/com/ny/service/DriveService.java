package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Drive;
/**
 * Drive的业务接口类
 * @author N.Y
 *
 */
public interface DriveService {
	/**
	 * 获取用户的所有驾照信息
	 * @param user_id
	 * @return
	 */
	List<Drive> getOwnDrive(@RequestParam("user_id")int user_id);
	
	/**
	 * 添加驾照信息
	 * @param drive_card
	 * @param drive_status
	 * @param drive_quasi_type
	 * @param drive_year
	 * @param user_id
	 * @return
	 */
	int addDrive(@RequestParam("drive_card")String drive_card, @RequestParam("drive_status")String drive_status,
			@RequestParam("drive_quasi_type")String drive_quasi_type, @RequestParam("drive_year")int drive_year,
			@RequestParam("user_id")int user_id);
	
	/**
	 * 更新驾照
	 * @param drive_id
	 * @param drive_card
	 * @param drive_status
	 * @param drive_quasi_type
	 * @param drive_year
	 * @return
	 */
	int updateDrive(@RequestParam("drive_id")int drive_id,@RequestParam("drive_card")String drive_card, @RequestParam("drive_status")String drive_status,
			@RequestParam("drive_quasi_type")String drive_quasi_type, @RequestParam("drive_year")int drive_year);
	
	/**
	 * 删除驾照信息
	 * @param user_id
	 * @return
	 */
	int deleteDrive(@RequestParam("drive_id")int drive_id);
}
