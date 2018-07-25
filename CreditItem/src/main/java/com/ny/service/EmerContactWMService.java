package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.EmerContactWM;

public interface EmerContactWMService {
	/**
	 * ��ȡ�û��Ĺ���֤��������ϵ�˵�ȫ����Ϣ
	 * @param user_id
	 * @return
	 */
	List<EmerContactWM> getOwnEmerContactWM(@RequestParam("user_id")int user_id);
	
	/**
	 * ��ӹ���֤��������ϵ��
	 * @param emercontact_wm_name
	 * @param emercontact_wm_number
	 * @param user_id
	 * @return
	 */
	int addEmerContactWM(@RequestParam("emercontact_wm_name")String emercontact_wm_name,
			@RequestParam("emercontact_wm_number")String emercontact_wm_number, @RequestParam("user_id")int user_id);
	
	/**
	 * ���¹���֤��������ϵ��
	 * @param emercontact_wm_id
	 * @param emercontact_wm_name
	 * @param emercontact_wm_number
	 * @return
	 */
	int updateEmerContactWM(@RequestParam("emercontact_wm_id")int emercontact_wm_id,@RequestParam("emercontact_wm_name")String emercontact_wm_name,
			@RequestParam("emercontact_wm_number")String emercontact_wm_number);
	
	/**
	 * ɾ������֤��������ϵ��
	 * @param emercontact_wm_id
	 * @return
	 */
	int deleteEmerContactWM(@RequestParam("emercontact_wm_id")int emercontact_wm_id);
	
}
