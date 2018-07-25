package com.ny.service;

import java.util.List;

import com.ny.entity.Quali;
/**
 * Qualification的业务接口
 * @author N.Y
 *
 */
public interface QualiService {
	
	/**
	 * 获取用户的所有专利
	 * @param user_id
	 * @return
	 */
	List<Quali> getOwnQuali(int user_id);
	
	/**
	 * 添加专利
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
	 * 更新专利
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
	 * 删除专利
	 * @param quali_id
	 * @return
	 */
	int deleteQuali(int quali_id);
}
