package com.ny.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ny.entity.Admin;
import com.ny.service.AdminService;
/**
 * 管理员的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 登陆的入口
	 * @return
	 */
	@RequestMapping(value="/in",method=RequestMethod.GET)
	private String in() {
		return "/admin";
	}
	
	/**
	 * 登陆的处理器
	 * @param username
	 * @param password
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/admin",method=RequestMethod.POST)
	public String login(@RequestParam("username")String username, @RequestParam("password")String password,Model model){
		
		Admin admin = adminService.loginAdmin(username, password);
		
		if(admin!=null||!admin.getUsername().equals("")){
			model.addAttribute("admin",admin);
			return "/AdminSignSuc";//跳转到管理员登录成功的页面
		}
		
		return "/AdminSignFai";//跳转到用户登录失败的页面
		
	}
	
}
