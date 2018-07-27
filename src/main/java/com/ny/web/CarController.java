package com.ny.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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

import com.ny.entity.Car;
import com.ny.service.CarService;

/**
 * 车产的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class CarController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CarService carService;
	
	/**
	 * 列表功能，利用user_id来获取相应的列表信息
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/car", method=RequestMethod.GET)
	private List<Car> list(@RequestBody int user_id,Model model){
		List<Car> list = carService.queryOwnCar(user_id);
		model.addAttribute("list", list);
		return list;
	}
	
	/**
	 * 添加功能
	 * @param car_number
	 * @param car_brand
	 * @param car_model
	 * @param car_buy_date
	 * @param car_type_year
	 * @param car_hit_market
	 * @param car_type
	 * @param car_size
	 * @param car_pro_country
	 * @param car_pro_type
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/car",method=RequestMethod.PUT)
	private String add(@RequestParam("car_number")String car_number,
			@RequestParam("car_brand")String car_brand, @RequestParam("car_model")String car_model, 
			@RequestParam("car_buy_date")String car_buy_date, @RequestParam("car_type_year")String car_type_year,
			@RequestParam("car_hit_market")String car_hit_market, @RequestParam("car_type")String car_type, 
			@RequestParam("car_size")String car_size, @RequestParam("car_pro_country")String car_pro_country,
			@RequestParam("car_pro_type")boolean car_pro_type,@RequestParam("user_id")int user_id) {
		int car = carService.addCar(car_number, car_brand, car_model, car_buy_date, car_type_year, car_hit_market, car_type, car_size, car_pro_country, car_pro_type, user_id);
		if(car>-1)
			return "/car";
		return "/failure";
	}
	
	/**
	 * 更新功能，id是car_id
	 * @param car_id
	 * @param car_number
	 * @param car_brand
	 * @param car_model
	 * @param car_buy_date
	 * @param car_type_year
	 * @param car_hit_market
	 * @param car_type
	 * @param car_size
	 * @param car_pro_country
	 * @param car_pro_type
	 * @return
	 */
	@RequestMapping(value="/car/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("car_id")int car_id,@RequestParam("car_number")String car_number,
			@RequestParam("car_brand")String car_brand, @RequestParam("car_model")String car_model, 
			@RequestParam("car_buy_date")String car_buy_date, @RequestParam("car_type_year")String car_type_year,
			@RequestParam("car_hit_market")String car_hit_market, @RequestParam("car_type")String car_type, 
			@RequestParam("car_size")String car_size, @RequestParam("car_pro_country")String car_pro_country,
			@RequestParam("car_pro_type")boolean car_pro_type) {
		int u = carService.updateCar(car_id, car_number, car_brand, car_model, car_buy_date, car_type_year, car_hit_market, car_type, car_size, car_pro_country, car_pro_type);
		if(u>-1)
			return "/car";
		return "/failure";
	}
	
	/**
	 * 删除功能，id是car_id
	 * @param car_id
	 * @return
	 */
	@RequestMapping(value="/car/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("car_id")int car_id) {
		int d = carService.deleteCar(car_id);
		if(d>-1)
			return "/car";
		return "/failure";
	}
	
}
