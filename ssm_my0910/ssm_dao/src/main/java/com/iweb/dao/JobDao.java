package com.iweb.dao;

import com.iweb.model.Job;

import java.util.List;

public interface JobDao {
    Job findJobById(Integer id);

    List<Job> findJobs();
}
