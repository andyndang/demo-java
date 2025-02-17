/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateDatasetProfileUploadRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public ai.whylabs.WhyLabs.models.shared.LogAsyncRequest logAsyncRequest;

    public CreateDatasetProfileUploadRequest withLogAsyncRequest(ai.whylabs.WhyLabs.models.shared.LogAsyncRequest logAsyncRequest) {
        this.logAsyncRequest = logAsyncRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=session_id")
    public String sessionId;

    public CreateDatasetProfileUploadRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    
    public CreateDatasetProfileUploadRequest(@JsonProperty("LogAsyncRequest") ai.whylabs.WhyLabs.models.shared.LogAsyncRequest logAsyncRequest, @JsonProperty("session_id") String sessionId) {
        this.logAsyncRequest = logAsyncRequest;
        this.sessionId = sessionId;
  }
}
