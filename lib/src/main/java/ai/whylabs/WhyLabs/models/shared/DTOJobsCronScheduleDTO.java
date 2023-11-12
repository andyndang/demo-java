/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DTOJobsCronScheduleDTO {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quartzCronExpression")
    public String quartzCronExpression;

    public DTOJobsCronScheduleDTO withQuartzCronExpression(String quartzCronExpression) {
        this.quartzCronExpression = quartzCronExpression;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezoneId")
    public String timezoneId;

    public DTOJobsCronScheduleDTO withTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
        return this;
    }
    
    public DTOJobsCronScheduleDTO(){}
}
