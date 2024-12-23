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
        System.out.println(jobPost);
        jobRepo.save(jobPost);
    }

    /*
        @Param: None
        @Return: List of JobPost
        Returns all the jobs
     */
    public List<JobPost> getJobs() {
        return jobRepo.findAll();
    }

    public void deleteJob(int id) {
        jobRepo.deleteById(id);
    }
}
