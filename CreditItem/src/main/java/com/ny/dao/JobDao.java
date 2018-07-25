package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Job;
/**
 * Job的Dao类
 * @author N.Y
 *
 */
public interface JobDao {
	/**
	 * 获取用户的工作经历列表 
	 * @param user_id
	 * @return
	 */
	List<Job> getOwnJob(@Param("user_id")int user_id);
	
	/**
	 * 添加工作经历
	 * @param job_title
	 * @param job_begin
	 * @param job_end
	 * @param job_workunit
	 * @param user_id
	 * @return
	 */
	int addJob(@Param("job_title")String job_title, @Param("job_begin")String job_begin, @Param("job_end")String job_end, @Param("job_workunit")String job_workunit, @Param("user_id")int user_id);
	
	/**
	 * 更新工作经历
	 * @param job_id
	 * @param job_title
	 * @param job_begin
	 * @param job_end
	 * @param job_workunit
	 * @return
	 */
	int updateJob(@Param("job_id")int job_id, @Param("job_title")String job_title, @Param("job_begin")String job_begin, @Param("job_end")String job_end, @Param("job_workunit")String job_workunit);
	
	/**
	 * 删除工作经历
	 * @param job_id
	 * @return
	 */
	int deleteJob(@Param("job_id")int job_id);

}
