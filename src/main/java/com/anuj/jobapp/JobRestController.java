package com.anuj.jobapp;

import com.anuj.jobapp.Responses.Response;
import com.anuj.jobapp.model.JobPost;
import com.anuj.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobRestController {

    @Autowired
    JobService jobService;

    @GetMapping("jobs")
    public List<JobPost> getAllJobs() {
        return jobService.getJobs();
    }

    /*
    I am not sure about use of ResponseEntity here. I need to learn how properly send response in REST API.
    this is just temporary solution.
     */
    @PostMapping("job")
    public ResponseEntity<Response> addJob(JobPost jobPost) {
        jobService.addJob(jobPost);
        return new ResponseEntity<>(new Response("Job created", 201), HttpStatus.CREATED);
    }
}
