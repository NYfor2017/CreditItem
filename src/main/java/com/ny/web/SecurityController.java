package com.ny.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Security;
import com.ny.service.SecurityService;

/**
 * Security的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class SecurityController {
	@Autowired
	SecurityService securityService;
	
	/**
	 * 列表功能，通过user_id获取列表
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/security",method=RequestMethod.GET)
	private List<Security> list(@RequestBody int user_id,Model model){
		List<Security> li = securityService.getOwnSecurity(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
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
	@RequestMapping(value="/security",method=RequestMethod.PUT)
	private String add(@RequestParam("secu_if")boolean secu_if,
	 @RequestParam("secu_name")String secu_name,
	 @RequestParam("secu_pay_base")int secu_pay_base,
	 @RequestParam("secu_pay_unit")String secu_pay_unit,
	 @RequestParam("secu_parti_status")String secu_parti_status,
	 @RequestParam("secu_city")String secu_city,
	 @RequestParam("secu_paid_cons_month")int secu_paid_cons_month,
	 @RequestParam("secu_idcard")String secu_idcard,
	 @RequestParam("secu_pay_recent")String secu_pay_recent,
	 @RequestParam("user_id")int user_id) {
		int a = securityService.addSecurity(secu_if, secu_name, secu_pay_base, secu_pay_unit, secu_parti_status, secu_city, secu_paid_cons_month, secu_idcard, secu_pay_recent, user_id);
		if(a>-1)
			return "/security";
		return "failure";
	}
	
	/**
	 * 更新功能，id为secu_id
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
	@RequestMapping(value="/security/{id}",method=RequestMethod.POST)
	private String update( @RequestParam("secu_id")int secu_id,
	 @RequestParam("secu_if")boolean secu_if,
	 @RequestParam("secu_name")String secu_name,
	 @RequestParam("secu_pay_base")int secu_pay_base,
	 @RequestParam("secu_pay_unit")String secu_pay_unit,
	 @RequestParam("secu_parti_status")String secu_parti_status,
	 @RequestParam("secu_city")String secu_city,
	 @RequestParam("secu_paid_cons_month")int secu_paid_cons_month,
	 @RequestParam("secu_idcard")String secu_idcard,
	 @RequestParam("secu_pay_recent")String secu_pay_recent) {
		int u = securityService.updateSecurity(secu_id, secu_if, secu_name, secu_pay_base, secu_pay_unit, secu_parti_status, secu_city, secu_paid_cons_month, secu_idcard, secu_pay_recent);
		if(u>-1)
			return "/security";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为secu_id
	 * @param secu_id
	 * @return
	 */
	@RequestMapping(value="/security/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("secu_id")int secu_id) {
		int d = securityService.deleteSecurity(secu_id);
		if(d>-1)
			return "/security";
		return "failure";
	}
}
