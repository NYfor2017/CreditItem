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

import com.ny.entity.Education;
import com.ny.service.EducationService;
/**
 * Education的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping("")
public class EducationController {
	@Autowired
	EducationService educationService;
	/**
	 * 列表功能，根据user_id获取列表
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/education",method=RequestMethod.GET)
	private List<Education> list(@RequestBody int user_id,Model model){
		List<Education> li =  educationService.getOwnEducation(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param edu_school
	 * @param edu_location
	 * @param edu_gra_time
	 * @param edu_pro
	 * @param edu_conclusion
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/education",method=RequestMethod.PUT)
	private String add(@RequestParam("edu_school")String edu_school, @RequestParam("edu_location")String edu_location, @RequestParam("edu_gra_time")String edu_gra_time,
			@RequestParam("edu_pro")String edu_pro, @RequestParam("edu_conclusion")String edu_conclusion, @RequestParam("user_id")int user_id) {
		int a = educationService.addEducation(edu_school, edu_location, edu_gra_time, edu_pro, edu_conclusion, user_id);
		if(a>-1)
			return "/education";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为edu_id
	 * @param edu_id
	 * @param edu_school
	 * @param edu_location
	 * @param edu_gra_time
	 * @param edu_pro
	 * @param edu_conclusion
	 * @return
	 */
	@RequestMapping(value="/education/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("edu_id")int edu_id,@RequestParam("edu_school")String edu_school, @RequestParam("edu_location")String edu_location, @RequestParam("edu_gra_time")String edu_gra_time,
			@RequestParam("edu_pro")String edu_pro, @RequestParam("edu_conclusion")String edu_conclusion) {
		int u = educationService.updateEducation(edu_id, edu_school, edu_location, edu_gra_time, edu_pro, edu_conclusion);
		if(u>-1)
			return "/education";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为edu_id
	 * @param edu_id
	 * @return
	 */
	@RequestMapping(value="/education/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("edu_id")int edu_id) {
		int d = educationService.deleteEducation(edu_id);
		if(d>-1)
			return "/education";
		return "/failure";
	}
}
