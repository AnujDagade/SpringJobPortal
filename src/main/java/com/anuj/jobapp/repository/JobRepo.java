package com.anuj.jobapp.repository;

import com.anuj.jobapp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    private List<JobPost> jobs;
    public JobRepo() {
        jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Developer", "Java Developer", "Bangalore", "ABC", Arrays.asList("Java", "Spring", "Hibernate")),
                new JobPost(2, "Python Developer", "Python Developer", "Bangalore", "XYZ", Arrays.asList("Python", "Django", "Flask")),
                new JobPost(3, "React Developer", "React Developer", "Bangalore", "PQR", Arrays.asList("React", "Redux", "Javascript"))
        ));
    }

    public List<JobPost> getJobs() {
        return jobs;
    }
    public void deleteJobById(int id) {
        jobs.removeIf(jobPost -> jobPost.getPostId() == id);
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
    }
}
