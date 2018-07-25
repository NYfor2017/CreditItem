package com.ny.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ny.service.AirlineService;

@Controller
@RequestMapping(value="")
public class AirlineController {
	@Autowired
	AirlineService airlineService;
	/**
	 * Ìí¼Ó¹¦ÄÜ
	 * @param airline_level
	 * @param airline_date
	 * @param airline_num
	 * @param airline_fee
	 * @return
	 */
	@RequestMapping(value="/airline", method=RequestMethod.PUT)
	private String add(@RequestParam("airline_level")int airline_level, @RequestParam("airline_date")String airline_date, @RequestParam("airline_num")String airline_num, @RequestParam("airline_fee")double airline_fee) {
		int a = airlineService.addAirline(airline_level, airline_date, airline_num, airline_fee);
		if(a>-1)
			return "/airline";
		return "/failure";
	}
	
	/**
	 * ¸üĞÂ¹¦ÄÜ
	 * @param airline_id
	 * @param airline_level
	 * @param airline_date
	 * @param airline_num
	 * @param airline_fee
	 * @return
	 */
	@RequestMapping(value="/airline/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("airline_id")int airline_id,@RequestParam("airline_level")int airline_level, @RequestParam("airline_date")String airline_date, @RequestParam("airline_num")String airline_num, @RequestParam("airline_fee")double airline_fee) {
		int u = airlineService.updateAirline(airline_id, airline_level, airline_date, airline_num, airline_fee);
		if(u>-1)
			return "/airline";
		return "/failure";
	}
	
	/**
	 * É¾³ı¹¦ÄÜ
	 * @param airline_id
	 * @return
	 */
	@RequestMapping(value="/airline/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("airline_id")int airline_id) {
		int d = airlineService.deleteAirline(airline_id);
		if(d>-1)
			return "/airline";
		return "/failure";
	}
	
	/**
	 * Ìí¼ÓuserÓëairlineÖ®¼äµÄ¹ØÏµ
	 * @param user_id
	 * @param airline_id
	 * @return
	 */
	@RequestMapping(value="/airline/addUserAirline",method=RequestMethod.PUT)
	private String addUserAirline(@RequestParam("user_id")int user_id, @RequestParam("airline_id")int airline_id) {
		int aua = airlineService.addUserAirline(user_id, airline_id);
		if(aua>-1)
			return "/airline";
		return "/failure";
	}
}
