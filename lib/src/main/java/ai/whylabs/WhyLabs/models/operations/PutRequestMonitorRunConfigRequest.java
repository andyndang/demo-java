/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PutRequestMonitorRunConfigRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutRequestMonitorRunConfigRequestBody requestBody;

    public PutRequestMonitorRunConfigRequest withRequestBody(PutRequestMonitorRunConfigRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataset_id")
    public String datasetId;

    public PutRequestMonitorRunConfigRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public PutRequestMonitorRunConfigRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public PutRequestMonitorRunConfigRequest(@JsonProperty("RequestBody") PutRequestMonitorRunConfigRequestBody requestBody, @JsonProperty("dataset_id") String datasetId, @JsonProperty("org_id") String orgId) {
        this.requestBody = requestBody;
        this.datasetId = datasetId;
        this.orgId = orgId;
  }
}
