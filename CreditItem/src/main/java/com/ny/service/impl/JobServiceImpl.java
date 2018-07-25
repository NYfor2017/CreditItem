package com.ny.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.dao.JobDao;
import com.ny.entity.Job;
import com.ny.service.JobService;
/**
 * Job的业务实现类
 * @author N.Y
 *
 */
@Service
public class JobServiceImpl implements JobService {
	@Autowired
	JobDao jobDao;
	
	public List<Job> getOwnJob(int user_id) {

		return jobDao.getOwnJob(user_id);
	}

	public int addJob(String job_title, String job_begin, String job_end, String job_workunit, int user_id) {
		return jobDao.addJob(job_title, job_begin, job_end, job_workunit, user_id);
	}

	public int updateJob(int job_id, String job_title, String job_begin, String job_end, String job_workunit) {
		return jobDao.updateJob(job_id, job_title, job_begin, job_end, job_workunit);
	}

	public int deleteJob(int job_id) {
		return jobDao.deleteJob(job_id);
	}

}
