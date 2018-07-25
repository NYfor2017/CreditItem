package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Security;
/**
 * Security的Dao类
 * @author N.Y
 *
 */
public interface SecurityDao {
	/**
	 * 获取用户的社保信息
	 * @param user_id
	 * @return
	 */
	List<Security> getOwnSecurity(@Param("user_id")int user_id);
	
	/**
	 * 添加社保信息
	 * @param secu_if
	 * @param secu_name
	 * @param secu_pay_base
	 * @param secu_pay_unit
	 * @param secu_parti_status
	 * @param secu_city
	 * @param secu_paid_cons_month
	 * @param secu_idcard
	 * @param secu_pay_recent
	 * @param user_id
	 * @return
	 */
	int addSecurity( @Param("secu_if")boolean secu_if,
	 @Param("secu_name")String secu_name,
	 @Param("secu_pay_base")int secu_pay_base,
	 @Param("secu_pay_unit")String secu_pay_unit,
	 @Param("secu_parti_status")String secu_parti_status,
	 @Param("secu_city")String secu_city,
	 @Param("secu_paid_cons_month")int secu_paid_cons_month,
	 @Param("secu_idcard")String secu_idcard,
	 @Param("secu_pay_recent")String secu_pay_recent,
	 @Param("user_id")int user_id);
	
	/**
	 * 更新社保信息
	 * @param secu_id
	 * @param secu_if
	 * @param secu_name
	 * @param secu_pay_base
	 * @param secu_pay_unit
	 * @param secu_parti_status
	 * @param secu_city
	 * @param secu_paid_cons_month
	 * @param secu_idcard
	 * @param secu_pay_recent
	 * @return
	 */
	int updateSecurity( @Param("secu_id")int secu_id,
	 @Param("secu_if")boolean secu_if,
	 @Param("secu_name")String secu_name,
	 @Param("secu_pay_base")int secu_pay_base,
	 @Param("secu_pay_unit")String secu_pay_unit,
	 @Param("secu_parti_status")String secu_parti_status,
	 @Param("secu_city")String secu_city,
	 @Param("secu_paid_cons_month")int secu_paid_cons_month,
	 @Param("secu_idcard")String secu_idcard,
	 @Param("secu_pay_recent")String secu_pay_recent);
	
	/**
	 * 删除社保信息
	 * @param secu_id
	 * @return
	 */
	int deleteSecurity(@Param("secu_id")int secu_id);
	
}
