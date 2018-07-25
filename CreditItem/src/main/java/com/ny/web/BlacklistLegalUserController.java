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

import com.ny.entity.BlacklistLegalUser;
import com.ny.service.BlacklistLegalUserService;

/**
 * BlacklistLegalUser�Ĵ�����
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class BlacklistLegalUserController {
	@Autowired
	BlacklistLegalUserService blacklistLegalUserService;
	
	/**
	 * �б��ܣ�����user_id��ȡ
	 * @param user_id
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/blacklistLegalUser",method=RequestMethod.GET)
	private List<BlacklistLegalUser> list(@RequestBody int user_id,Model model){
		List<BlacklistLegalUser> li = blacklistLegalUserService.getOwnBlacklistLegalUser(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * ��ӹ���
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistLegalUser",method=RequestMethod.PUT)
	private String add(@RequestParam("user_id")int user_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int a = blacklistLegalUserService.addBlacklistLegalUser(user_id, blacklist_detail);
		if(a>-1)
			return "/blacklistLegalUser";
		return "failure";
	}
	
	/**
	 * ���¹��ܣ�id��blacklist_legal_u_id
	 * @param blacklist_legal_u_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistLegalUser/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("blacklist_legal_u_id")int blacklist_legal_u_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int u = blacklistLegalUserService.updateBlacklistLegalUser(blacklist_legal_u_id, blacklist_detail);
		if(u>-1)
			return "/blacklistLegalUser";
		return "/failure";
	}
	
	/**
	 * ɾ�����ܣ�id��blacklist_legal_u_id
	 * @param blacklist_legal_u_id
	 * @return
	 */
	@RequestMapping(value="/blacklistLegalUser/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("blacklist_legal_u_id")int blacklist_legal_u_id) {
		int d = blacklistLegalUserService.deleteBlacklistLegalUser(blacklist_legal_u_id);
		if(d>-1)
			return "/blacklistLegalUser";
		return "failure";
	}
}
