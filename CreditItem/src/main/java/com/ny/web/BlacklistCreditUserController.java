package com.ny.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ny.entity.BlacklistCreditUser;
import com.ny.service.BlacklistCreditUserService;

/**
 * BlacklistCreditUser�Ĵ�����
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class BlacklistCreditUserController {
	@Autowired
	BlacklistCreditUserService blacklistCreditUserService;
	
	/**
	 * �б���,��Ҫǰ��ֱ���ڲ������user_id����������url����id
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/blacklistCreditUser",method=RequestMethod.GET)
	private List<BlacklistCreditUser> list(@RequestBody int user_id,Model model){
		List<BlacklistCreditUser> li = blacklistCreditUserService.getOwnBlacklistCreditUser(user_id);
		model.addAttribute("li",li);
		return li;
	}
	
	/**
	 * ��ӹ���
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistCreditUser",method=RequestMethod.PUT)
	private String add(@RequestParam("user_id")int user_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int a = blacklistCreditUserService.addBlacklistCreditUser(user_id, blacklist_detail);
		if(a>-1)
			return "/blacklistCreditUser";
		return "failure";
	}
	
	/**
	 * ���¹���,id��ָ blacklist_credit_u_id
	 * @param blacklist_credit_u_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistCreditUser/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("blacklist_credit_u_id")int blacklist_credit_u_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int u = blacklistCreditUserService.updateBlacklistCreditUser(blacklist_credit_u_id, blacklist_detail);
		if(u>-1)
			return "/blacklistCreditUser";
		return "/failure";
	}
	
	/**
	 * ɾ������,id��ָ blacklist_credit_u_id
	 * @param blacklist_credit_u_id
	 * @return
	 */
	@RequestMapping(value="/blacklistCreditUser/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("blacklist_credit_u_id")int blacklist_credit_u_id) {
		int d = blacklistCreditUserService.deleteBlacklistCreditUser(blacklist_credit_u_id);
		if(d>-1)
			return "/blacklistCreditUser";
		return "failure";
	}
}
