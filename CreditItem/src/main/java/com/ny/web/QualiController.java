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

import com.ny.entity.Quali;
import com.ny.service.QualiService;
/**
 * Qualification的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class QualiController {
	
	@Autowired
	QualiService qualiService;
	
	/**
	 * 列表功能，根据user_id获取列表
	 * @param user_id
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/quali",method=RequestMethod.GET)
	private List<Quali> list(@RequestBody int user_id,Model model){
		List<Quali> list = qualiService.getOwnQuali(user_id);
		model.addAttribute("list", list);
		return list;
	}
	
	/**
	 * 添加功能
	 * @param quali_num
	 * @param quali_name
	 * @param quali_date
	 * @param quali_insti
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/quali",method=RequestMethod.PUT)
	private String add(@RequestParam("quali_num")String quali_num,@RequestParam("quali_name")String quali_name,
			@RequestParam("quali_date")String quali_date, @RequestParam("quali_insti")String quali_insti, @RequestParam("user_id")int user_id) {
		int a = qualiService.addQuali(quali_num, quali_name, quali_date, quali_insti, user_id);
		if(a>-1)
			return "/quali";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为quali_id
	 * @param quali_id
	 * @param quali_num
	 * @param quali_name
	 * @param quali_date
	 * @param quali_insti
	 * @return
	 */
	@RequestMapping(value="/quali/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("quali_id")int quali_id,@RequestParam("quali_num")String quali_num,@RequestParam("quali_name")String quali_name,
			@RequestParam("quali_date")String quali_date, @RequestParam("quali_insti")String quali_insti) {
		int u = qualiService.updateQuali(quali_id, quali_num, quali_name, quali_date, quali_insti);
		if(u>-1)
			return "/quali";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为quali_id
	 * @param quali_id
	 * @return
	 */
	@RequestMapping(value="/quali/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("quali_id")int quali_id) {
		int d = qualiService.deleteQuali(quali_id);
		if(d>-1)
			return "/quali";
		return "failure";
	}
}
