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

import com.ny.entity.BlacklistCreditWorkunit;
import com.ny.service.BlacklistCreditWorkunitService;

/**
 * BlacklistCreditWorkunit�Ĵ�����
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class BlacklistCreditWorkunitController {
	@Autowired
	BlacklistCreditWorkunitService blacklistCreditWorkunitService;
	
	/**
	 * �б��ܣ�����workunit_idֱ�Ӵ����ȡlist��url����Ҫ����
	 * @param workunit_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/blacklistCreditWorkunit",method=RequestMethod.GET)
	private List<BlacklistCreditWorkunit> list(@RequestBody int workunit_id,Model model){
		List<BlacklistCreditWorkunit> li = blacklistCreditWorkunitService.getOwnBlacklistCreditWorkunit(workunit_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * ��ӹ���
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistCreditWorkunit",method=RequestMethod.PUT)
	private String add(@RequestParam("workunit_id")int workunit_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int a = blacklistCreditWorkunitService.addBlacklistCreditWorkunit(workunit_id, blacklist_detail);
		if(a>-1)
			return "/blacklistCreditWorkunit";
		return "/failure";
	}
	
	/**
	 * ���¹��ܣ�id��blacklist_credit_w_id
	 * @param blacklist_credit_w_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistCreditWorkunit/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("blacklist_credit_w_id")int blacklist_credit_w_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int u = blacklistCreditWorkunitService.updateBlacklistCreditWorkunit(blacklist_credit_w_id, blacklist_detail);
		if(u>-1)
			return "/blacklistCreditWorkunit";
		return "/failure";
	}
	
	/**
	 * ɾ�����ܣ�id��blacklist_credit_w_id
	 * @param blacklist_credit_w_id
	 * @return
	 */
	@RequestMapping(value="/blacklistCreditWorkunit/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("blacklist_credit_w_id")int blacklist_credit_w_id) {
		int d = blacklistCreditWorkunitService.deleteBlacklistCreditWorkunit(blacklist_credit_w_id);
		if(d>-1)
			return "/blacklistCreditWorkunit";
		return "/failure";
	}
}
