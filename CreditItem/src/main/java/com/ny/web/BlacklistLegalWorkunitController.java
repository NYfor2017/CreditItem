package com.ny.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ny.entity.BlacklistLegalWorkunit;
import com.ny.service.BlacklistLegalWorkunitService;

/**
 * BlacklistLegalWorkunit的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class BlacklistLegalWorkunitController {
	@Autowired
	BlacklistLegalWorkunitService blacklistLegalWorkunitService;
	
	/**
	 * 列表功能，利用workunit_id获取相应列表信息
	 * @param workunit_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/blacklistLegalWorkunit",method=RequestMethod.GET)
	private List<BlacklistLegalWorkunit> list(@RequestBody int workunit_id){
		List<BlacklistLegalWorkunit> li = blacklistLegalWorkunitService.getOwnBlacklistLegalWorkunit(workunit_id);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param workunit_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistLegalWorkunit",method=RequestMethod.PUT)
	private String add(@RequestParam("workunit_id")int workunit_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int a = blacklistLegalWorkunitService.addBlacklistLegalWorkunit(workunit_id, blacklist_detail);
		if(a>-1)
			return "/blacklistLegalWorkunit";
		return "/failure";
	}
	
	/**
	 * 更新功能，id是blacklist_legal_w_id
	 * @param blacklist_legal_w_id
	 * @param blacklist_detail
	 * @return
	 */
	@RequestMapping(value="/blacklistLegalWorkunit/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("blacklist_legal_w_id")int blacklist_legal_w_id, @RequestParam("blacklist_detail")String blacklist_detail) {
		int u = blacklistLegalWorkunitService.updateBlacklistLegalWorkunit(blacklist_legal_w_id, blacklist_detail);
		if(u>-1)
			return "/blacklistLegalWorkunit";
		return "/failure";
	}
	
	/**
	 * 删除功能，id是blacklist_legal_w_id
	 * @param blacklist_legal_w_id
	 * @return
	 */
	@RequestMapping(value="/blacklistLegalWorkunit/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("blacklist_legal_w_id")int blacklist_legal_w_id) {
		int d = blacklistLegalWorkunitService.deleteBlacklistLegalWorkunit(blacklist_legal_w_id);
		if(d>-1)
			return "/blacklistLegalWorkunit";
		return "/failure";
	}
}
