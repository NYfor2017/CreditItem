package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.DriveDao;
import com.ny.entity.Drive;
import com.ny.service.DriveService;
/**
 * Drive的业务实现类
 * @author N.Y
 *
 */
@Service
public class DriveServiceImpl implements DriveService{
	@Autowired
	DriveDao driveDao;
	
	public List<Drive> getOwnDrive(int user_id) {
		return driveDao.getOwnDrive(user_id);
	}

	public int addDrive(String drive_card, String drive_status, String drive_quasi_type, int drive_year, int user_id) {
		return driveDao.addDrive(drive_card, drive_status, drive_quasi_type, drive_year, user_id);
	}

	public int updateDrive(int drive_id, String drive_card, String drive_status, String drive_quasi_type,
			int drive_year) {
		return driveDao.updateDrive(drive_id, drive_card, drive_status, drive_quasi_type, drive_year);
	}

	public int deleteDrive(int drive_id) {
		return driveDao.deleteDrive(drive_id);
	}

}
