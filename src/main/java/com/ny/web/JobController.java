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

import com.ny.entity.Job;
import com.ny.service.JobService;

/**
 * Job的处理器
 * @author N.Y
 *
 */
@Controller
@RequestMapping(value="")
public class JobController {
	@Autowired
	JobService jobService;
	
	/**
	 * 列表功能，根据user_id获取列表信息
	 * @param user_id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/job",method=RequestMethod.GET)
	private List<Job> list(@RequestBody int user_id,Model model){
		List<Job> li = jobService.getOwnJob(user_id);
		model.addAttribute("li", li);
		return li;
	}
	
	/**
	 * 添加功能
	 * @param job_title
	 * @param job_begin
	 * @param job_end
	 * @param job_workunit
	 * @param user_id
	 * @return
	 */
	@RequestMapping(value="/job",method=RequestMethod.PUT)
	private String add(@RequestParam("job_title")String job_title, @RequestParam("job_begin")String job_begin, @RequestParam("job_end")String job_end, @RequestParam("job_workunit")String job_workunit, @RequestParam("user_id")int user_id) {
		int a = jobService.addJob(job_title, job_begin, job_end, job_workunit, user_id);
		if(a>-1)
			return "/job";
		return "/failure";
	}
	
	/**
	 * 更新功能，id为job_id
	 * @param job_id
	 * @param job_title
	 * @param job_begin
	 * @param job_end
	 * @param job_workunit
	 * @return
	 */
	@RequestMapping(value="/job/{id}",method=RequestMethod.POST)
	private String update(@RequestParam("job_id")int job_id, @RequestParam("job_title")String job_title, @RequestParam("job_begin")String job_begin, @RequestParam("job_end")String job_end, @RequestParam("job_workunit")String job_workunit) {
		int u = jobService.updateJob(job_id, job_title, job_begin, job_end, job_workunit);
		if(u>-1)
			return "/job";
		return "/failure";
	}
	
	/**
	 * 删除功能，id为job_id
	 * @param job_id
	 * @return
	 */
	@RequestMapping(value="/job/{id}",method=RequestMethod.DELETE)
	private String delete(@RequestParam("job_id")int job_id) {
		int d = jobService.deleteJob(job_id);
		if(d>-1)
			return "/job";
		return "/failure";
	}
}
