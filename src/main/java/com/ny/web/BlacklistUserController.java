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

import com.ny.entity.BlacklistUser;
import com.ny.service.BlacklistUserService;

/**
 * BlacklistUser的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class BlacklistUserController {
	@Autowired
	BlacklistUserService blacklistUserService;
	
	/**
	 * 列表功能，利用user_id获取对应的列表
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/blacklistUser",method=RequestMethod.GET)
	private List<BlacklistUser> list(@RequestBody int user_id,Model model){
		List<BlacklistUser> li = blacklistUserService.getOwnBlacklistUser(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param user_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistUser",method=RequestMethod.PUT)
	private String add(@RequestParam("user_id")int user_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int a = blacklistUserService.addBlacklistUser(user_id, blacklist_detail);
		if(a>-1)
			return "/blacklistUser";
		return "failure";
	}
	
	/**
	 * 更新功能，id是blacklist_user_id
	 * @param blacklist_user_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistUser/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("blacklist_user_id")int blacklist_user_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int u = blacklistUserService.updateBlacklistUser(blacklist_user_id, blacklist_detail);
		if(u>-1)
			return "/blacklistUser";
		return "/failure";
	}
	
	/**
	 * 删除功能，id是blacklist_user_id
	 * @param blacklist_user_id
	 * @return
	 */
	@RequestMapping(value="/blacklistUser/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("blacklist_user_id")int blacklist_user_id) {
		int d = blacklistUserService.deleteBlacklistUser(blacklist_user_id);
		if(d>-1)
			return "/blacklistUser";
		return "failure";
	}
}
