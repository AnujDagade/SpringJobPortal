package com.anuj.jobapp;

import com.anuj.jobapp.Responses.Response;
import com.anuj.jobapp.model.JobPost;
import com.anuj.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("job/{id}")
    public ResponseEntity<Response> deleteJob(@PathVariable("id") int id) {
        jobService.deleteJob(id);
        System.out.println(jobService.getJobs());
        return new ResponseEntity<>(new Response("Job deleted", 200), HttpStatus.OK);
    }
}
