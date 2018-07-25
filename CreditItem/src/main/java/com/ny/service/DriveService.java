package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Drive;
/**
 * Drive��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface DriveService {
	/**
	 * ��ȡ�û������м�����Ϣ
	 * @param user_id
	 * @return
	 */
	List<Drive> getOwnDrive(@RequestParam("user_id")int user_id);
	
	/**
	 * ��Ӽ�����Ϣ
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
	 * ���¼���
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
	 * ɾ��������Ϣ
	 * @param user_id
	 * @return
	 */
	int deleteDrive(@RequestParam("drive_id")int drive_id);
}
