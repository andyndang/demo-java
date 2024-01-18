/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TransactionLogRequest - Request payload for Transaction log.
 */

public class TransactionLogRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datasetTimestamp")
    public Long datasetTimestamp;

    public TransactionLogRequest withDatasetTimestamp(Long datasetTimestamp) {
        this.datasetTimestamp = datasetTimestamp;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    public String region;

    public TransactionLogRequest withRegion(String region) {
        this.region = region;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("segmentTags")
    public SegmentTag[] segmentTags;

    public TransactionLogRequest withSegmentTags(SegmentTag[] segmentTags) {
        this.segmentTags = segmentTags;
        return this;
    }
    
    public TransactionLogRequest(){}
}
