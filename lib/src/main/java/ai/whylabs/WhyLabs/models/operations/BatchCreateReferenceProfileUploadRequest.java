/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BatchCreateReferenceProfileUploadRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public ai.whylabs.WhyLabs.models.shared.BatchLogReferenceRequest batchLogReferenceRequest;

    public BatchCreateReferenceProfileUploadRequest withBatchLogReferenceRequest(ai.whylabs.WhyLabs.models.shared.BatchLogReferenceRequest batchLogReferenceRequest) {
        this.batchLogReferenceRequest = batchLogReferenceRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=session_id")
    public String sessionId;

    public BatchCreateReferenceProfileUploadRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    
    public BatchCreateReferenceProfileUploadRequest(@JsonProperty("BatchLogReferenceRequest") ai.whylabs.WhyLabs.models.shared.BatchLogReferenceRequest batchLogReferenceRequest, @JsonProperty("session_id") String sessionId) {
        this.batchLogReferenceRequest = batchLogReferenceRequest;
        this.sessionId = sessionId;
  }
}
