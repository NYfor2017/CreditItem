package com.ny.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ny.entity.Workunit;
import com.ny.service.WorkunitService;

/**
 * Workunit的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class WorkunitController {
	@Autowired
	WorkunitService workunitService;
	
	/**
	 * 获取所有的企业名单
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/workunit",method=RequestMethod.GET)
	private List<Workunit> list(Model model){
		List<Workunit> li = workunitService.getAllWorkunit();
		model.addAttribute("li",li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param workunit_name
	 * @param workunit_type
	 * @param workunit_reg_number
	 * @param workunit_reg_capital
	 * @param workunit_phone_num1
	 * @param workunit_phone_num2
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.PUT)
	private String add(@RequestParam("workunit_name")String workunit_name, @RequestParam("workunit_type")String workunit_type, @RequestParam("workunit_reg_number")String workunit_reg_number,
			@RequestParam("workunit_reg_capital")int workunit_reg_capital, @RequestParam("workunit_phone_num1")String workunit_phone_num1, @RequestParam("workunit_phone_num2")String workunit_phone_num2) {
		int a = workunitService.addWorkunit(workunit_name, workunit_type, workunit_reg_number, workunit_reg_capital, workunit_phone_num1, workunit_phone_num2);
		if(a>0)
			return "/workunit";
		return "/failure";
	}
	
	/**
	 * 更新功能
	 * @param workunit_id
	 * @param workunit_name
	 * @param workunit_type
	 * @param workunit_reg_number
	 * @param workunit_reg_capital
	 * @param workunit_phone_num1
	 * @param workunit_phone_num2
	 * @return
	 */
	@RequestMapping(value="/workunit/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("workunit_id")int workunit_id, @RequestParam("workunit_name")String workunit_name, @RequestParam("workunit_type")String workunit_type, @RequestParam("workunit_reg_number")String workunit_reg_number,
			@RequestParam("workunit_reg_capital")int workunit_reg_capital, @RequestParam("workunit_phone_num1")String workunit_phone_num1, @RequestParam("workunit_phone_num2")String workunit_phone_num2) {
		int u = workunitService.updateWorkunit(workunit_id, workunit_name, workunit_type, workunit_reg_number, workunit_reg_capital, workunit_phone_num1, workunit_phone_num2);
		if(u>0)
			return "/workunit";
		return "/failure";
	}
	
	/**
	 * 删除功能，参数是删除数据的id
	 * @param workunit_id
	 * @return
	 */
	@RequestMapping(value="/workunit/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("workunit_id")int workunit_id) {
		int d = workunitService.deleteWorkunit(workunit_id);
		if(d>0)
			return "/workunit";
		return "/failure";
	}
	
	/**
	 * 添加user与workunit之间的关系，这个需要workunit的再下一级
	 * @param user_id
	 * @param workunit_id
	 * @return
	 */
	@RequestMapping(value="/workunit/addUserWorkunit",method=RequestMethod.POST)
	private String addUserWorkunit(@RequestParam("user_id")int user_id, @RequestParam("workunit_id")int workunit_id) {
		int aua = workunitService.addUserAirline(user_id, workunit_id);
		if(aua>0)
			return "/workunit";
		return "/failure";
	}
}
