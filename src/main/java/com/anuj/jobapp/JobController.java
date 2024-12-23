package com.anuj.jobapp;

import com.anuj.jobapp.model.JobPost;
import com.anuj.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @RequestMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @GetMapping("jobs")
    public String getJobs(Model model) {
        List<JobPost> jobs = jobService.getJobs();
        model.addAttribute("jobs", jobs);
        return "jobs";
    }

    @PostMapping("handleform")
    public String handleForm(JobPost jobPost){
        System.out.println(jobPost);
        jobService.addJob(jobPost);
        return "success";
    }

}
