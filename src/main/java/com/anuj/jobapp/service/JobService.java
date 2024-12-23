package com.anuj.jobapp.service;

import com.anuj.jobapp.model.JobPost;
import org.springframework.stereotype.Service;
import com.anuj.jobapp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public void addJob(JobPost jobPost) {
        jobRepo.addJob(jobPost);
    }

    public List<JobPost> getJobs() {
        return jobRepo.getJobs();
    }
}
