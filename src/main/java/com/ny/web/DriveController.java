package com.ny.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Drive�Ĵ�����
 * @author N.Y
 *
 */
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ny.entity.Drive;
import com.ny.service.DriveService;
/**
 * Drive�Ĵ�����
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class DriveController {
	@Autowired
	DriveService driveService;
	/**
	 * �б��ܣ�����user_id��ȡ�б���Ϣ
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/drive", method=RequestMethod.GET)
	private List<Drive> list(@RequestBody int user_id,Model model){
		List<Drive> li = driveService.getOwnDrive(user_id);
		model.addAttribute("li",li);
		return li;
	}
	
	/**
	 * ��ӹ���
	 * @param drive_card
	 * @param drive_status
	 * @param drive_quasi_type
	 * @param drive_year
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/drive", method=RequestMethod.PUT)
	private String add(@RequestParam("drive_card")String drive_card, @RequestParam("drive_status")String drive_status,
			@RequestParam("drive_quasi_type")String drive_quasi_type, @RequestParam("drive_year")int drive_year,
			@RequestParam("user_id")int user_id) {
		int a = driveService.addDrive(drive_card, drive_status, drive_quasi_type, drive_year, user_id);
		if(a>-1)
			return "/drive";
		return "/failure";
	}
	
	/**
	 * ���¹��ܣ�idΪdrive_id
	 * @param drive_id
	 * @param drive_card
	 * @param drive_status
	 * @param drive_quasi_type
	 * @param drive_year
	 * @return
	 */
	@RequestMapping(value="/drive/{id}", method=RequestMethod.POST)
	private String update(@RequestParam("drive_id")int drive_id,@RequestParam("drive_card")String drive_card, @RequestParam("drive_status")String drive_status,
			@RequestParam("drive_quasi_type")String drive_quasi_type, @RequestParam("drive_year")int drive_year) {
		int u = driveService.updateDrive(drive_id, drive_card, drive_status, drive_quasi_type, drive_year);
		if(u>-1)
			return "/drive";
		return "/failure";
	}
	
	/**
	 * ɾ�����ܣ�idΪdrive_id
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/drive/{id}", method=RequestMethod.DELETE)
	private String delete(@RequestParam("drive_id")int drive_id) {
		int d = driveService.deleteDrive(drive_id);
		if(d>-1)
			return "/drive";
		return "/failure";
	}
}
