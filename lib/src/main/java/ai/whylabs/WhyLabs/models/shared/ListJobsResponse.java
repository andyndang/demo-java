/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListJobsResponse - ListJobs default response
 */

public class ListJobsResponse {
    @JsonProperty("jobs")
    public DTOJobsJobDTO[] jobs;

    public ListJobsResponse withJobs(DTOJobsJobDTO[] jobs) {
        this.jobs = jobs;
        return this;
    }
    
    public ListJobsResponse(@JsonProperty("jobs") DTOJobsJobDTO[] jobs) {
        this.jobs = jobs;
  }
}
