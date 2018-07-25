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

import com.ny.entity.CardOut12M;
import com.ny.service.CardOut12MService;
/**
 * CardOut12M的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class CardOut12MController {
	@Autowired
	CardOut12MService cardOut12MService;
	
	/**
	 * 列表功能，根据user_id获取列表信息
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/cardOut12M",method=RequestMethod.GET)
	private List<CardOut12M> list(@RequestBody int user_id,Model model){
		List<CardOut12M> li = cardOut12MService.getOwnCardOut12M(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param out_12m_time
	 * @param out_12m_amount
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/cardOut12M",method=RequestMethod.PUT)
	private String add(@RequestParam("out_12m_time")int out_12m_time, @RequestParam("out_12m_amount")int out_12m_amount, @RequestParam("user_id")int user_id) {
		int a = cardOut12MService.addCardOut12M(out_12m_time, out_12m_amount, user_id);
		if(a>-1)
			return "/cardOut12M";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为out_12m_id
	 * @param out_12m_id
	 * @param out_12m_time
	 * @param out_12m_amount
	 * @return
	 */
	@RequestMapping(value="/cardOut12M/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("out_12m_id")int out_12m_id,@RequestParam("out_12m_time")int out_12m_time, @RequestParam("out_12m_amount")int out_12m_amount) {
		int u = cardOut12MService.updateCardOut12M(out_12m_id, out_12m_time, out_12m_amount);
		if(u>-1)
			return "/cardOut12M";
		return "/failure";
	}
	
	/**
	 * 删除功能，id是out_12m_id
	 * @param out_12m_id
	 * @return
	 */
	@RequestMapping(value="/cardOut12M/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("out_12m_id")int out_12m_id) {
		int d = cardOut12MService.deleteCardOut12M(out_12m_id);
		if(d>-1)
			return "/cardOut12M";
		return "failure";
	}
}
