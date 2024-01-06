/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TransactionStartRequest - Request payload for Transaction start.
 */

public class TransactionStartRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datasetId")
    public String datasetId;

    public TransactionStartRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    public TransactionStartRequest(){}
}