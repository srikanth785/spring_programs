package com.cat.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthRestController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    @GetMapping("/import")
    public ResponseEntity<String> loadData() {
        try {
            JobParameters jobParams = new JobParametersBuilder()
                    .addLong("startAt", System.currentTimeMillis())
                    .toJobParameters();

            jobLauncher.run(job, jobParams);

            return ResponseEntity.ok("Batch job started successfully.");

        } catch (JobExecutionAlreadyRunningException e) {
            return ResponseEntity.status(409).body("Job is already running.");
        } catch (JobRestartException e) {
            return ResponseEntity.status(500).body("Job restart failed.");
        } catch (JobInstanceAlreadyCompleteException e) {
            return ResponseEntity.status(409).body("Job instance already completed.");
        } catch (JobParametersInvalidException e) {
            return ResponseEntity.badRequest().body("Invalid job parameters.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Job failed to start: " + e.getMessage());
        }
    }
}
