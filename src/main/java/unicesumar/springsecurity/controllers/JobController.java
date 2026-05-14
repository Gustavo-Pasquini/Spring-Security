package unicesumar.springsecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unicesumar.springsecurity.models.JobModel;
import unicesumar.springsecurity.services.JobService;

import java.util.List;

@RestController
@RequestMapping(path = "/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping
    public JobModel criarJob(@RequestBody JobModel jobModel) {
        return jobService.save(jobModel);
    }

    @GetMapping
    public List<JobModel> buscarJobs() {
        return jobService.findAll();
    }
}
