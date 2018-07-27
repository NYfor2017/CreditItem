package com.ny.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ny.entity.Job;

/**
 * Job的业务接口类
 * @author N.Y
 *
 */
public interface JobService {
	/**
	 * 获取用户的工作经历列表 
	 * @param user_id
	 * @return
	 */
	List<Job> getOwnJob(@RequestParam("user_id")int user_id);
	
	/**
	 * 添加工作经历
	 * @param job_title
	 * @param job_begin
	 * @param job_end
	 * @param job_workunit
	 * @param user_id
	 * @return
	 */
	int addJob(@RequestParam("job_title")String job_title, @RequestParam("job_begin")String job_begin, @RequestParam("job_end")String job_end, @RequestParam("job_workunit")String job_workunit, @RequestParam("user_id")int user_id);
	
	/**
	 * 更新工作经历
	 * @param job_id
	 * @param job_title
	 * @param job_begin
	 * @param job_end
	 * @param job_workunit
	 * @return
	 */
	int updateJob(@RequestParam("job_id")int job_id, @RequestParam("job_title")String job_title, @RequestParam("job_begin")String job_begin, @RequestParam("job_end")String job_end, @RequestParam("job_workunit")String job_workunit);
	
	/**
	 * 删除工作经历
	 * @param job_id
	 * @return
	 */
	int deleteJob(@RequestParam("job_id")int job_id);

}
