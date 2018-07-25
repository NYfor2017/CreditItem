package com.ny.service;

import java.util.List;

import com.ny.entity.Quali;
/**
 * Qualification��ҵ��ӿ�
 * @author N.Y
 *
 */
public interface QualiService {
	
	/**
	 * ��ȡ�û�������ר��
	 * @param user_id
	 * @return
	 */
	List<Quali> getOwnQuali(int user_id);
	
	/**
	 * ���ר��
	 * @param quali_num
	 * @param quali_name
	 * @param quali_date
	 * @param quali_insti
	 * @param user_id
	 * @return
	 */
	int addQuali(String quali_num,String quali_name,String quali_date,
			String quali_insti,int user_id);
	
	/**
	 * ����ר��
	 * @param quali_id
	 * @param quali_num
	 * @param quali_name
	 * @param quali_date
	 * @param quali_insti
	 * @return
	 */
	int updateQuali(int quali_id, String quali_num,String quali_name,
			String quali_date,String quali_insti);
	
	/**
	 * ɾ��ר��
	 * @param quali_id
	 * @return
	 */
	int deleteQuali(int quali_id);
}
