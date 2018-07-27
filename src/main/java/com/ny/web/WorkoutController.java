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

import com.ny.entity.Workout;
import com.ny.service.WorkoutService;

@Controller
@RequestMapping("")
public class WorkoutController {
	
	@Autowired
	WorkoutService workoutService;
	/**
	 * 列表功能，根据user_id获取列表
	 * @param user_id
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/workout",method=RequestMethod.GET)
	private List<Workout> list(@RequestBody int user_id,Model model){
		List<Workout> li = workoutService.getOwnWorkout(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param workout_signin
	 * @param workout_type
	 * @param workout_capital
	 * @param workout_job
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/workout",method=RequestMethod.PUT)
	private String add(@RequestParam("workout_signin")String workout_signin,@RequestParam("workout_type")String workout_type,
			@RequestParam("workout_capital")String workout_capital, @RequestParam("workout_job")String workout_job,@RequestParam("user_id")int user_id) {
		int a = workoutService.addWorkout(workout_signin, workout_type, workout_capital, workout_job, user_id);
		if(a>-1)
			return "/workout";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为workout_id
	 * @param workout_id
	 * @param workout_signin
	 * @param workout_type
	 * @param workout_capital
	 * @param workout_job
	 * @return
	 */
	@RequestMapping(value="/workout/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("workout_id")int workout_id,@RequestParam("workout_signin")String workout_signin,@RequestParam("workout_type")String workout_type,
			@RequestParam("workout_capital")String workout_capital, @RequestParam("workout_job")String workout_job) {
		int u = workoutService.updateWorkout(workout_id, workout_signin, workout_type, workout_capital, workout_job);
		if(u>-1)
			return "/workout";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为workout_id
	 * @param workout_id
	 * @return
	 */
	@RequestMapping(value="/workout/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("workout_id")int workout_id) {
		int d = workoutService.deleteWorkout(workout_id);
		if(d>-1)
			return "/workout";
		return "/failure";
	}
}
