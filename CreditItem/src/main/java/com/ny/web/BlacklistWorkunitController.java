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

import com.ny.entity.BlacklistWorkunit;
import com.ny.service.BlacklistWorkunitService;

/**
 * BlacklistWorkunit�Ĵ�����
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class BlacklistWorkunitController {
	@Autowired
	BlacklistWorkunitService blacklistWorkunitService;
	/**
	 * �б��ܣ�����workunit_id��ȡ��Ӧ�б�
	 * @param workunit_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/blacklistWorkunit",method=RequestMethod.GET)
	private List<BlacklistWorkunit> list(@RequestBody int workunit_id,Model model){
		List<BlacklistWorkunit> li = blacklistWorkunitService.getOwnBlacklistWorkunit(workunit_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * ��ӹ���
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistWorkunit",method=RequestMethod.PUT)
	private String add(@RequestParam("workunit_id")int workunit_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int a = blacklistWorkunitService.addBlacklistWorkunit(workunit_id, blacklist_detail);
		if(a>-1)
			return "/blacklistWorkunit";
		return "/failure";
	}
	
	/**
	 * ���¹��ܣ�id��blacklist_workunit_id
	 * @param blacklist_workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistWorkunit/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("blacklist_workunit_id")int blacklist_workunit_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int u = blacklistWorkunitService.updateBlacklistWorkunit(blacklist_workunit_id, blacklist_detail);
		if(u>-1)
			return "/blacklistWorkunit";
		return "/failure";
	}
	
	/**
	 * ɾ�����ܣ�id��blacklist_workunit_id
	 * @param blacklist_workunit_id
	 * @return
	 */
	@RequestMapping(value="/blacklistWorkunit/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("blacklist_credit_w_id")int blacklist_workunit_id) {
		int d = blacklistWorkunitService.deleteBlacklistWorkunit(blacklist_workunit_id);
		if(d>-1)
			return "/blacklistWorkunit";
		return "/failure";
	}
}
