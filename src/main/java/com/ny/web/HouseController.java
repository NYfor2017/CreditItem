package com.ny.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ny.entity.House;
import com.ny.service.HouseService;

/**
 * 房产信息的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class HouseController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HouseService houseService;
	
	/**
	 * 得到用户个人的房产信息，根据user_id获取信息
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/house",method=RequestMethod.GET)
	private List<House> list(@RequestBody int user_id,Model model){
		List<House> list = houseService.getOwnHouse(user_id);
		model.addAttribute("list", list);
		return list;
	}
	
	/**
	 * 添加房产
	 * 注意：需要更新跳转页面信息
	 * @param house_address
	 * @param house_value
	 * @param house_payall_if
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/house", method=RequestMethod.PUT)
	private String add(@RequestParam("house_address")String house_address, @RequestParam("house_value")int house_value, @RequestParam("house_payall_if")int house_payall_if,@RequestParam("user_id")int user_id) {
		int house = houseService.addHouse(house_address, house_value, house_payall_if, user_id);
		if(house>-1)
			return "/house";  //如果添加成功就刷新房产页面
		return "/failure";
	}
	
	/**
	 * 更新房产信息
	 * 注意：此处需要页面提供house_id，所以需要有一个hidden属性的行
	 * 也需要更新跳转页面信息
	 * id为house_id
	 * @param house_id
	 * @param house_address
	 * @param house_value
	 * @param house_payall_if
	 * @return
	 */
	@RequestMapping(value="/house/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("house_id")int house_id,@RequestParam("house_address")String house_address, @RequestParam("house_value")int house_value, @RequestParam("house_payall_if")int house_payall_if) {
		int u = houseService.updateHouse(house_id, house_address, house_value, house_payall_if);
		if(u>-1)
			return "/house";  //如果更新成功就刷新房产页面
		return "/failure";
	}
	
	/**
	 * 删除功能，id为house_id
	 * @param house_id
	 * @return
	 */
	@RequestMapping(value="/house/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("house_id")int house_id) {
		int d = houseService.deleteHouse(house_id);
		if(d>-1)
			return "/house";  //如果删除成功就刷新页面
		return "/failure";
	}
	
}
