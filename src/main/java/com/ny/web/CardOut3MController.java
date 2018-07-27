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

import com.ny.entity.CardOut3M;
import com.ny.service.CardOut3MService;
/**
 * CardOut3M的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class CardOut3MController {
	@Autowired
	CardOut3MService cardOut3MService;
	
	/**
	 * 列表功能，根据user_id获取列表信息
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/cardOut3M",method=RequestMethod.GET)
	private List<CardOut3M> list(@RequestBody int user_id,Model model){
		List<CardOut3M> li = cardOut3MService.getOwnCardOut3M(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param out_3m_time
	 * @param out_3m_amount
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/cardOut3M",method=RequestMethod.PUT)
	private String add(@RequestParam("out_3m_time")int out_3m_time, @RequestParam("out_3m_amount")int out_3m_amount, @RequestParam("user_id")int user_id) {
		int a = cardOut3MService.addCardOut3M(out_3m_time, out_3m_amount, user_id);
		if(a>-1)
			return "/cardOut3M";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为out_3m_id
	 * @param out_3m_id
	 * @param out_3m_time
	 * @param out_3m_amount
	 * @return
	 */
	@RequestMapping(value="/cardOut3M/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("out_3m_id")int out_3m_id,@RequestParam("out_3m_time")int out_3m_time, @RequestParam("out_3m_amount")int out_3m_amount) {
		int u = cardOut3MService.updateCardOut3M(out_3m_id, out_3m_time, out_3m_amount);
		if(u>-1)
			return "/cardOut3M";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为out_3m_id
	 * @param out_3m_id
	 * @return
	 */
	@RequestMapping(value="/cardOut3M/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("out_3m_id")int out_3m_id) {
		int d = cardOut3MService.deleteCardOut3M(out_3m_id);
		if(d>-1)
			return "/cardOut3M";
		return "failure";
	}
}
