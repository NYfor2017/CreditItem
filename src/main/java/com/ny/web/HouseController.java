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
 * ������Ϣ�Ĵ�����
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
	 * �õ��û����˵ķ�����Ϣ������user_id��ȡ��Ϣ
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
	 * ��ӷ���
	 * ע�⣺��Ҫ������תҳ����Ϣ
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
			return "/house";  //�����ӳɹ���ˢ�·���ҳ��
		return "/failure";
	}
	
	/**
	 * ���·�����Ϣ
	 * ע�⣺�˴���Ҫҳ���ṩhouse_id��������Ҫ��һ��hidden���Ե���
	 * Ҳ��Ҫ������תҳ����Ϣ
	 * idΪhouse_id
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
			return "/house";  //������³ɹ���ˢ�·���ҳ��
		return "/failure";
	}
	
	/**
	 * ɾ�����ܣ�idΪhouse_id
	 * @param house_id
	 * @return
	 */
	@RequestMapping(value="/house/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("house_id")int house_id) {
		int d = houseService.deleteHouse(house_id);
		if(d>-1)
			return "/house";  //���ɾ���ɹ���ˢ��ҳ��
		return "/failure";
	}
	
}
