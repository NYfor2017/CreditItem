package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.EmerContactFM;
/**
 * EmerContactFM的业务接口类
 * @author N.Y
 *
 */
public interface EmerContactFMService {
	/**
	 * 获取用户的直系亲属紧急联系人的全部信息
	 * @param user_id
	 * @return
	 */
	List<EmerContactFM> getOwnEmerContactFM(@RequestParam("user_id")int user_id);
	
	/**
	 * 添加直系亲属紧急联系人
	 * @param emercontact_fm_name
	 * @param emercontact_fm_number
	 * @param user_id
	 * @return
	 */
	int addEmerContactFM(@RequestParam("emercontact_fm_name")String emercontact_fm_name,
			@RequestParam("emercontact_fm_number")String emercontact_fm_number, @RequestParam("user_id")int user_id);
	
	/**
	 * 更新直系亲属紧急联系人
	 * @param emercontact_fm_id
	 * @param emercontact_fm_name
	 * @param emercontact_fm_number
	 * @return
	 */
	int updateEmerContactFM(@RequestParam("emercontact_fm_id")int emercontact_fm_id,@RequestParam("emercontact_fm_name")String emercontact_fm_name,
			@RequestParam("emercontact_fm_number")String emercontact_fm_number);
	
	/**
	 * 删除直系亲属紧急联系人
	 * @param emercontact_fm_id
	 * @return
	 */
	int deleteEmerContactFM(@RequestParam("emercontact_fm_id")int emercontact_fm_id);
	
}
