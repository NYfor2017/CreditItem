package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Security;
/**
 * Security的业务接口类
 * @author N.Y
 *
 */
public interface SecurityService {
	/**
	 * 获取用户的社保信息
	 * @param user_id
	 * @return
	 */
	List<Security> getOwnSecurity(@RequestParam("user_id")int user_id);
	
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
	int addSecurity( @RequestParam("secu_if")boolean secu_if,
	 @RequestParam("secu_name")String secu_name,
	 @RequestParam("secu_pay_base")int secu_pay_base,
	 @RequestParam("secu_pay_unit")String secu_pay_unit,
	 @RequestParam("secu_parti_status")String secu_parti_status,
	 @RequestParam("secu_city")String secu_city,
	 @RequestParam("secu_paid_cons_month")int secu_paid_cons_month,
	 @RequestParam("secu_idcard")String secu_idcard,
	 @RequestParam("secu_pay_recent")String secu_pay_recent,
	 @RequestParam("user_id")int user_id);
	
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
	int updateSecurity( @RequestParam("secu_id")int secu_id,
	 @RequestParam("secu_if")boolean secu_if,
	 @RequestParam("secu_name")String secu_name,
	 @RequestParam("secu_pay_base")int secu_pay_base,
	 @RequestParam("secu_pay_unit")String secu_pay_unit,
	 @RequestParam("secu_parti_status")String secu_parti_status,
	 @RequestParam("secu_city")String secu_city,
	 @RequestParam("secu_paid_cons_month")int secu_paid_cons_month,
	 @RequestParam("secu_idcard")String secu_idcard,
	 @RequestParam("secu_pay_recent")String secu_pay_recent);
	
	/**
	 * 删除社保信息
	 * @param secu_id
	 * @return
	 */
	int deleteSecurity(@RequestParam("secu_id")int secu_id);
	
}
