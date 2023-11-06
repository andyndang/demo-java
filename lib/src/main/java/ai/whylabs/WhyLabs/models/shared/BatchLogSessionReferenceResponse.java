/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BatchLogSessionReferenceResponse - Response payload for uploading reference profiles.
 */

public class BatchLogSessionReferenceResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("observatoryUrl")
    public String observatoryUrl;

    public BatchLogSessionReferenceResponse withObservatoryUrl(String observatoryUrl) {
        this.observatoryUrl = observatoryUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("references")
    public LogSessionReferenceResponse[] references;

    public BatchLogSessionReferenceResponse withReferences(LogSessionReferenceResponse[] references) {
        this.references = references;
        return this;
    }
    
    public BatchLogSessionReferenceResponse(){}
}
