package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Job;
/**
 * Job��Dao��
 * @author N.Y
 *
 */
public interface JobDao {
	/**
	 * ��ȡ�û��Ĺ��������б� 
	 * @param user_id
	 * @return
	 */
	List<Job> getOwnJob(@Param("user_id")int user_id);
	
	/**
	 * ��ӹ�������
	 * @param job_title
	 * @param job_begin
	 * @param job_end
	 * @param job_workunit
	 * @param user_id
	 * @return
	 */
	int addJob(@Param("job_title")String job_title, @Param("job_begin")String job_begin, @Param("job_end")String job_end, @Param("job_workunit")String job_workunit, @Param("user_id")int user_id);
	
	/**
	 * ���¹�������
	 * @param job_id
	 * @param job_title
	 * @param job_begin
	 * @param job_end
	 * @param job_workunit
	 * @return
	 */
	int updateJob(@Param("job_id")int job_id, @Param("job_title")String job_title, @Param("job_begin")String job_begin, @Param("job_end")String job_end, @Param("job_workunit")String job_workunit);
	
	/**
	 * ɾ����������
	 * @param job_id
	 * @return
	 */
	int deleteJob(@Param("job_id")int job_id);

}
