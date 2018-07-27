package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.EmerContactFM;
/**
 * EmerContactFM��Dao��
 * @author N.Y
 *
 */
public interface EmerContactFMDao {
	/**
	 * ��ȡ�û���ֱϵ����������ϵ�˵�ȫ����Ϣ
	 * @param user_id
	 * @return
	 */
	List<EmerContactFM> getOwnEmerContactFM(@Param("user_id")int user_id);
	
	/**
	 * ���ֱϵ����������ϵ��
	 * @param emercontact_fm_name
	 * @param emercontact_fm_number
	 * @param user_id
	 * @return
	 */
	int addEmerContactFM(@Param("emercontact_fm_name")String emercontact_fm_name,
			@Param("emercontact_fm_number")String emercontact_fm_number, @Param("user_id")int user_id);
	
	/**
	 * ����ֱϵ����������ϵ����Ϣ
	 * @param emercontact_fm_id
	 * @param emercontact_fm_name
	 * @param emercontact_fm_number
	 * @return
	 */
	int updateEmerContactFM(@Param("emercontact_fm_id")int emercontact_fm_id,@Param("emercontact_fm_name")String emercontact_fm_name,
			@Param("emercontact_fm_number")String emercontact_fm_number);
	
	/**
	 * ɾ��ֱϵ����������ϵ��
	 * @param emercontact_fm_id
	 * @return
	 */
	int deleteEmerContactFM(@Param("emercontact_fm_id")int emercontact_fm_id);
	
}
