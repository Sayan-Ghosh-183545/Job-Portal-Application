package com.sayan.JobPortalApp.service;

import com.sayan.JobPortalApp.model.JobPost;
import com.sayan.JobPortalApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost) {

        repo.addNewJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.returnAllJobs();
    }
}
