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

import com.ny.entity.EmerContactWM;
import com.ny.service.EmerContactWMService;
/**
 * EmerContactWM的处理器类
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class EmerContactWMController {
	
	@Autowired
	EmerContactWMService emerContactWMService;
	
	/**
	 * 列表功能，利用user_id获取列表信息
	 * @param user_id
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/emercontactWM",method=RequestMethod.GET)
	private List<EmerContactWM> list(@RequestBody int user_id,Model model){
		List<EmerContactWM> li = emerContactWMService.getOwnEmerContactWM(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param emercontact_wm_name
	 * @param emercontact_wm_number
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/emercontactWM",method=RequestMethod.PUT)
	private String add(@RequestParam("emercontact_wm_name")String emercontact_wm_name,
			@RequestParam("emercontact_wm_number")String emercontact_wm_number, @RequestParam("user_id")int user_id) {
		int a = emerContactWMService.addEmerContactWM(emercontact_wm_name, emercontact_wm_number, user_id);
		if(a>-1)
			return "/emercontactWM";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为emercontact_wm_id
	 * @param emercontact_wm_id
	 * @param emercontact_wm_name
	 * @param emercontact_wm_number
	 * @return
	 */
	@RequestMapping(value="/emercontactWM/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("emercontact_wm_id")int emercontact_wm_id,@RequestParam("emercontact_wm_name")String emercontact_wm_name,
			@RequestParam("emercontact_wm_number")String emercontact_wm_number) {
		int u = emerContactWMService.updateEmerContactWM(emercontact_wm_id, emercontact_wm_name, emercontact_wm_number);
		if(u>-1)
			return "/emercontactWM";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为emercontact_wm_id
	 * @param emercontact_wm_id
	 * @return
	 */
	@RequestMapping(value="/emercontactWM/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("emercontact_wm_id")int emercontact_wm_id) {
		int d = emerContactWMService.deleteEmerContactWM(emercontact_wm_id);
		if(d>-1)
			return "/emercontactWM";
		return "/failure";
	}
}
