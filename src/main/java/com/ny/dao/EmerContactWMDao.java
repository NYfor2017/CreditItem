package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.EmerContactWM;

/**
 * EmerContactWM��Dao��
 * @author N.Y
 *
 */
public interface EmerContactWMDao {
	
	/**
	 * ��ȡ�û��Ĺ���֤��������ϵ�˵�ȫ����Ϣ
	 * @param user_id
	 * @return
	 */
	List<EmerContactWM> getOwnEmerContactWM(@Param("user_id")int user_id);
	
	/**
	 * ��ӹ���֤��������ϵ��
	 * @param emercontact_wm_name
	 * @param emercontact_wm_number
	 * @param user_id
	 * @return
	 */
	int addEmerContactWM(@Param("emercontact_wm_name")String emercontact_wm_name,
			@Param("emercontact_wm_number")String emercontact_wm_number, @Param("user_id")int user_id);
	
	/**
	 * ���¹���֤��������ϵ��
	 * @param emercontact_wm_id
	 * @param emercontact_wm_name
	 * @param emercontact_wm_number
	 * @return
	 */
	int updateEmerContactWM(@Param("emercontact_wm_id")int emercontact_wm_id,@Param("emercontact_wm_name")String emercontact_wm_name,
			@Param("emercontact_wm_number")String emercontact_wm_number);
	
	/**
	 * ɾ������֤��������ϵ��
	 * @param emercontact_wm_id
	 * @return
	 */
	int deleteEmerContactWM(@Param("emercontact_wm_id")int emercontact_wm_id);
	
}
