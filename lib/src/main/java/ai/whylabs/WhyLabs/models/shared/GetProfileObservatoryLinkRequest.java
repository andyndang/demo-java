/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetProfileObservatoryLinkRequest - Get a url for viewing profiles in the observatory
 */

public class GetProfileObservatoryLinkRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batchProfileTimestamps")
    public Long[] batchProfileTimestamps;

    public GetProfileObservatoryLinkRequest withBatchProfileTimestamps(Long[] batchProfileTimestamps) {
        this.batchProfileTimestamps = batchProfileTimestamps;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("referenceProfileIds")
    public String[] referenceProfileIds;

    public GetProfileObservatoryLinkRequest withReferenceProfileIds(String[] referenceProfileIds) {
        this.referenceProfileIds = referenceProfileIds;
        return this;
    }
    
    public GetProfileObservatoryLinkRequest(){}
}
