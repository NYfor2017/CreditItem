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
 * ����Ա�Ĵ�����
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
	 * ��½�����
	 * @return
	 */
	@RequestMapping(value="/in",method=RequestMethod.GET)
	private String in() {
		return "/admin";
	}
	
	/**
	 * ��½�Ĵ�����
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
			return "/AdminSignSuc";//��ת������Ա��¼�ɹ���ҳ��
		}
		
		return "/AdminSignFai";//��ת���û���¼ʧ�ܵ�ҳ��
		
	}
	
}
