package unicesumar.springsecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicesumar.springsecurity.models.JobModel;
import unicesumar.springsecurity.repositories.JobRepository;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<JobModel> findAll() {
        return jobRepository.findAll();
    }

    public JobModel save(JobModel jobModel) {
        return jobRepository.save(jobModel);
    }

}
