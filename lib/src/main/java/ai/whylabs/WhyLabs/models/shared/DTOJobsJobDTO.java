/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import ai.whylabs.WhyLabs.utils.DateTimeDeserializer;
import ai.whylabs.WhyLabs.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class DTOJobsJobDTO {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdTime")
    public OffsetDateTime createdTime;

    public DTOJobsJobDTO withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("creatorUserName")
    public String creatorUserName;

    public DTOJobsJobDTO withCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jobId")
    public Long jobId;

    public DTOJobsJobDTO withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    public DTOJobsJobSettingsDTO settings;

    public DTOJobsJobDTO withSettings(DTOJobsJobSettingsDTO settings) {
        this.settings = settings;
        return this;
    }
    
    public DTOJobsJobDTO(){}
}
