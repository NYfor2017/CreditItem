package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Contact;
/**
 * Contact��Dao��
 * @author N.Y
 *
 */
public interface ContactDao {
	/**
	 * ��ȡ�û���ͨѶ�б�
	 * @param user_id
	 * @return
	 */
	List<Contact> getOwnContact(@Param("user_id")int user_id);
	
	/**
	 * ���ͨѶ��¼��Ŀ
	 * @param contact_number
	 * @param contact_status
	 * @param contact_time
	 * @param contact_name
	 * @param user_id
	 * @return
	 */
	int addContact(@Param("contact_number")String contact_number, @Param("contact_status")boolean contact_status,
			@Param("contact_time")String contact_time, @Param("contact_name")String contact_name, @Param("user_id")int user_id);
	
	/**
	 * ����ͨѶ��Ŀ
	 * @param contact_id
	 * @param contact_number
	 * @param contact_status
	 * @param contact_time
	 * @param contact_name
	 * @return
	 */
	int updateContact(@Param("contact_id")int contact_id,@Param("contact_number")String contact_number, @Param("contact_status")boolean contact_status,
			@Param("contact_time")String contact_time, @Param("contact_name")String contact_name);
	
	/**
	 * ɾ��ͨѶ��Ŀ
	 * @param contact_id
	 * @return
	 */
	int deleteContact(@Param("contact_id")int contact_id);
	
	
}
