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

import com.ny.entity.Contact;
import com.ny.service.ContactService;
/**
 * Contact的处理器类
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class ContactController {
	
	@Autowired
	ContactService contactService;
	/**
	 * 列表功能，根据user_id获取列表
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	private List<Contact> list(@RequestBody int user_id,Model model){
		List<Contact> li = contactService.getOwnContact(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.PUT)
	private String add(@RequestParam("contact_number")String contact_number, @RequestParam("contact_status")boolean contact_status,
			@RequestParam("contact_time")String contact_time, @RequestParam("contact_name")String contact_name, @RequestParam("user_id")int user_id) {
		int a = contactService.addContact(contact_number, contact_status, contact_time, contact_name, user_id);
		if(a>-1)
			return "/contact";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为contact_id
	 * @param contact_id
	 * @param contact_number
	 * @param contact_status
	 * @param contact_time
	 * @param contact_name
	 * @return
	 */
	@RequestMapping(value="/contact/{id}", method=RequestMethod.POST)
	private String update(@RequestParam("contact_id")int contact_id,@RequestParam("contact_number")String contact_number, @RequestParam("contact_status")boolean contact_status,
			@RequestParam("contact_time")String contact_time, @RequestParam("contact_name")String contact_name) {
		int u = contactService.updateContact(contact_id, contact_number, contact_status, contact_time, contact_name);
		if(u>-1)
			return "/contact";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为contact_id
	 * @param contact_id
	 * @return
	 */
	@RequestMapping(value="/contact/{id}", method=RequestMethod.DELETE)
	private String delete(@RequestParam("contact_id")int contact_id) {
		int d = contactService.deleteContact(contact_id);
		if(d>-1)
			return "/contact";
		return "/failure";
	}
}
