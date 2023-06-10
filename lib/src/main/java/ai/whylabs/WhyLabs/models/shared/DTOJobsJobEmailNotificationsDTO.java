/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DTOJobsJobEmailNotificationsDTO {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("noAlertForSkippedRuns")
    public Boolean noAlertForSkippedRuns;

    public DTOJobsJobEmailNotificationsDTO withNoAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
        this.noAlertForSkippedRuns = noAlertForSkippedRuns;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("onFailure")
    public DTOJobsJobEmailNotificationsDTOOnFailure[] onFailure;

    public DTOJobsJobEmailNotificationsDTO withOnFailure(DTOJobsJobEmailNotificationsDTOOnFailure[] onFailure) {
        this.onFailure = onFailure;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("onStart")
    public DTOJobsJobEmailNotificationsDTOOnStart[] onStart;

    public DTOJobsJobEmailNotificationsDTO withOnStart(DTOJobsJobEmailNotificationsDTOOnStart[] onStart) {
        this.onStart = onStart;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("onSuccess")
    public DTOJobsJobEmailNotificationsDTOOnSuccess[] onSuccess;

    public DTOJobsJobEmailNotificationsDTO withOnSuccess(DTOJobsJobEmailNotificationsDTOOnSuccess[] onSuccess) {
        this.onSuccess = onSuccess;
        return this;
    }
    
    public DTOJobsJobEmailNotificationsDTO(){}
}
