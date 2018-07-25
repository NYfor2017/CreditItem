package com.ny.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ny.entity.Invest;
import com.ny.service.InvestService;
/**
 * Invest的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class InvestController {
	@Autowired
	InvestService investService;
	
	/**
	 * 列表功能，根据user_id获取列表信息
	 * @param user_id
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/invest",method=RequestMethod.GET)
	private List<Invest> list(@RequestParam("user_id")int user_id,Model model){
		List<Invest> li = investService.getOwnInvest(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param invest_itemName
	 * @param invest_amount
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/invest",method=RequestMethod.PUT)
	private String add(@RequestParam("invest_itemName")String invest_itemName, @RequestParam("invest_amount")int invest_amount, @RequestParam("user_id")int user_id) {
		int a = investService.addInvest(invest_itemName, invest_amount, user_id);
		if(a>-1)
			return "/invest";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为invest_id
	 * @param invest_id
	 * @param invest_itemName
	 * @param invest_amount
	 * @return
	 */
	@RequestMapping(value="/invest/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("invest_id")int invest_id, @RequestParam("invest_itemName")String invest_itemName, @RequestParam("invest_amount")int invest_amount) {
		int u = investService.updateInvest(invest_id, invest_itemName, invest_amount);
		if(u>-1)
			return "/invest";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为invest_id
	 * @param invest_id
	 * @return
	 */
	@RequestMapping(value="/invest/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("invest_id")int invest_id) {
		int d = investService.deleteInvest(invest_id);
		if(d>-1)
			return "/invest";
		return "/failure";
	}
}
