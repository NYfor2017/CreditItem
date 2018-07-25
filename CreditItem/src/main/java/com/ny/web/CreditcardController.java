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

import com.ny.entity.Creditcard;
import com.ny.service.CreditcardService;
/**
 * Creditcard的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class CreditcardController {
	@Autowired
	CreditcardService creditcardService;
	/**
	 * 列表功能，根据user_id获取列表信息
	 * @param user_id
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/creditcard",method=RequestMethod.GET)
	private List<Creditcard> list(@RequestBody int user_id,Model model){
		List<Creditcard> li =  creditcardService.getOwnCreditcard(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param creditcard_number
	 * @param creditcard_pro
	 * @param creditcard_status
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/creditcard",method=RequestMethod.PUT)
	private String add(@RequestParam("creditcard_number")String creditcard_number, @RequestParam("creditcard_pro")String creditcard_pro,
			@RequestParam("creditcard_status")String creditcard_status, @RequestParam("user_id")int user_id) {
		int a = creditcardService.addCreditcard(creditcard_number, creditcard_pro, creditcard_status, user_id);
		if(a>-1)
			return "/creditcard";
		return "/failure";			
	}
	
	/**
	 * 更新功能，id为creditcard_id
	 * @param creditcard_id
	 * @param creditcard_number
	 * @param creditcard_pro
	 * @param creditcard_status
	 * @return
	 */
	@RequestMapping(value="/creditcard/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("creditcard_id")int creditcard_id, @RequestParam("creditcard_number")String creditcard_number,
			@RequestParam("creditcard_pro")String creditcard_pro, @RequestParam("creditcard_status")String creditcard_status) {
		int u = creditcardService.updateCreditcard(creditcard_id, creditcard_number, creditcard_pro, creditcard_status);
		if(u>-1)
			return "/creditcard";
		return "/failure";
				
	}
	
	/**
	 * 删除功能，id为creditcard_id
	 * @param creditcard_id
	 * @return
	 */
	@RequestMapping(value="/creditcard/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("creditcard_id")int creditcard_id) {
		int d = creditcardService.deleteCreditcard(creditcard_id);
		if(d>-1)
			return "/creditcard";
		return "/failure";
	}
}
