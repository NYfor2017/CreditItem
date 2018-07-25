package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.EmerContactFM;
/**
 * EmerContactFM��ҵ��ӿ���
 * @author N.Y
 *
 */
public interface EmerContactFMService {
	/**
	 * ��ȡ�û���ֱϵ����������ϵ�˵�ȫ����Ϣ
	 * @param user_id
	 * @return
	 */
	List<EmerContactFM> getOwnEmerContactFM(@RequestParam("user_id")int user_id);
	
	/**
	 * ���ֱϵ����������ϵ��
	 * @param emercontact_fm_name
	 * @param emercontact_fm_number
	 * @param user_id
	 * @return
	 */
	int addEmerContactFM(@RequestParam("emercontact_fm_name")String emercontact_fm_name,
			@RequestParam("emercontact_fm_number")String emercontact_fm_number, @RequestParam("user_id")int user_id);
	
	/**
	 * ����ֱϵ����������ϵ��
	 * @param emercontact_fm_id
	 * @param emercontact_fm_name
	 * @param emercontact_fm_number
	 * @return
	 */
	int updateEmerContactFM(@RequestParam("emercontact_fm_id")int emercontact_fm_id,@RequestParam("emercontact_fm_name")String emercontact_fm_name,
			@RequestParam("emercontact_fm_number")String emercontact_fm_number);
	
	/**
	 * ɾ��ֱϵ����������ϵ��
	 * @param emercontact_fm_id
	 * @return
	 */
	int deleteEmerContactFM(@RequestParam("emercontact_fm_id")int emercontact_fm_id);
	
}
