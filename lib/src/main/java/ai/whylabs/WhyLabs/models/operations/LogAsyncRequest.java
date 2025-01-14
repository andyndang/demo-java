/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LogAsyncRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public ai.whylabs.WhyLabs.models.shared.LogAsyncRequest logAsyncRequest;

    public LogAsyncRequest withLogAsyncRequest(ai.whylabs.WhyLabs.models.shared.LogAsyncRequest logAsyncRequest) {
        this.logAsyncRequest = logAsyncRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataset_id")
    public String datasetId;

    public LogAsyncRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public LogAsyncRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public LogAsyncRequest(@JsonProperty("LogAsyncRequest") ai.whylabs.WhyLabs.models.shared.LogAsyncRequest logAsyncRequest, @JsonProperty("dataset_id") String datasetId, @JsonProperty("org_id") String orgId) {
        this.logAsyncRequest = logAsyncRequest;
        this.datasetId = datasetId;
        this.orgId = orgId;
  }
}
