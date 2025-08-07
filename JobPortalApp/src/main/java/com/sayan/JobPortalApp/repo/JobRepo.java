package com.sayan.JobPortalApp.repo;

import com.sayan.JobPortalApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jp=new ArrayList<>();

    public void addNewJob(JobPost jobPost) {
        jp.add(jobPost);
    }

    public List<JobPost> returnAllJobs(){
        return jp;
    }
}
