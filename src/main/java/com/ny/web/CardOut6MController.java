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

import com.ny.entity.CardOut6M;
import com.ny.service.CardOut6MService;
/**
 * CardOut6M的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class CardOut6MController {
	@Autowired
	CardOut6MService cardOut6MService;
	
	/**
	 * 列表功能，根据user_id获取列表信息
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/cardOut6M",method=RequestMethod.GET)
	private List<CardOut6M> list(@RequestBody int user_id,Model model){
		List<CardOut6M> li = cardOut6MService.getOwnCardOut6M(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param out_6m_time
	 * @param out_6m_amount
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/cardOut6M",method=RequestMethod.PUT)
	private String add(@RequestParam("out_6m_time")int out_6m_time, @RequestParam("out_6m_amount")int out_6m_amount, @RequestParam("user_id")int user_id) {
		int a = cardOut6MService.addCardOut6M(out_6m_time, out_6m_amount, user_id);
		if(a>-1)
			return "/cardOut6M";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为out_6m_id
	 * @param out_6m_id
	 * @param out_6m_time
	 * @param out_6m_amount
	 * @return
	 */
	@RequestMapping(value="/cardOut6M/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("out_6m_id")int out_6m_id,@RequestParam("out_6m_time")int out_6m_time, @RequestParam("out_6m_amount")int out_6m_amount) {
		int u = cardOut6MService.updateCardOut6M(out_6m_id, out_6m_time, out_6m_amount);
		if(u>-1)
			return "/cardOut6M";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为out_6m_id 
	 * @param out_6m_id
	 * @return
	 */
	@RequestMapping(value="/cardOut6M/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("out_6m_id")int out_6m_id) {
		int d = cardOut6MService.deleteCardOut6M(out_6m_id);
		if(d>-1)
			return "/cardOut6M";
		return "failure";
	}
}
