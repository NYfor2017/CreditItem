package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.EmerContactFM;
/**
 * EmerContactFM的Dao层
 * @author N.Y
 *
 */
public interface EmerContactFMDao {
	/**
	 * 获取用户的直系亲属紧急联系人的全部信息
	 * @param user_id
	 * @return
	 */
	List<EmerContactFM> getOwnEmerContactFM(@Param("user_id")int user_id);
	
	/**
	 * 添加直系亲属紧急联系人
	 * @param emercontact_fm_name
	 * @param emercontact_fm_number
	 * @param user_id
	 * @return
	 */
	int addEmerContactFM(@Param("emercontact_fm_name")String emercontact_fm_name,
			@Param("emercontact_fm_number")String emercontact_fm_number, @Param("user_id")int user_id);
	
	/**
	 * 更新直系亲属紧急联系人信息
	 * @param emercontact_fm_id
	 * @param emercontact_fm_name
	 * @param emercontact_fm_number
	 * @return
	 */
	int updateEmerContactFM(@Param("emercontact_fm_id")int emercontact_fm_id,@Param("emercontact_fm_name")String emercontact_fm_name,
			@Param("emercontact_fm_number")String emercontact_fm_number);
	
	/**
	 * 删除直系亲属紧急联系人
	 * @param emercontact_fm_id
	 * @return
	 */
	int deleteEmerContactFM(@Param("emercontact_fm_id")int emercontact_fm_id);
	
}
