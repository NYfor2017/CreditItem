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

import com.ny.entity.EmerContactFM;
import com.ny.service.EmerContactFMService;
/**
 * EmerContactFM的处理器类
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class EmerContactFMController {
	
	@Autowired
	EmerContactFMService emerContactFMService;
	/**
	 * 列表功能，根据user_id获取列表信息
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/emercontactFM",method=RequestMethod.GET)
	private List<EmerContactFM> list(@RequestBody int user_id,Model model){
		List<EmerContactFM> li = emerContactFMService.getOwnEmerContactFM(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param emercontact_fm_name
	 * @param emercontact_fm_number
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/emercontactFM",method=RequestMethod.PUT)
	private String add(@RequestParam("emercontact_fm_name")String emercontact_fm_name,
			@RequestParam("emercontact_fm_number")String emercontact_fm_number, @RequestParam("user_id")int user_id) {
		int a = emerContactFMService.addEmerContactFM(emercontact_fm_name, emercontact_fm_number, user_id);
		if(a>-1)
			return "/emercontactFM";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为emercontact_fm_id
	 * @param emercontact_fm_id
	 * @param emercontact_fm_name
	 * @param emercontact_fm_number
	 * @return
	 */
	@RequestMapping(value="/emercontactFM/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("emercontact_fm_id")int emercontact_fm_id,@RequestParam("emercontact_fm_name")String emercontact_fm_name,
			@RequestParam("emercontact_fm_number")String emercontact_fm_number) {
		int u = emerContactFMService.updateEmerContactFM(emercontact_fm_id, emercontact_fm_name, emercontact_fm_number);
		if(u>-1)
			return "/emercontactFM";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为emercontact_fm_id
	 * @param emercontact_fm_id
	 * @return
	 */
	@RequestMapping(value="/emercontactFM/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("emercontact_fm_id")int emercontact_fm_id) {
		int d = emerContactFMService.deleteEmerContactFM(emercontact_fm_id);
		if(d>-1)
			return "/emercontactFM";
		return "/failure";
	}
}
