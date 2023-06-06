/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PutMonitorRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public String requestBody;

    public PutMonitorRequest withRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataset_id")
    public String datasetId;

    public PutMonitorRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=monitor_id")
    public String monitorId;

    public PutMonitorRequest withMonitorId(String monitorId) {
        this.monitorId = monitorId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public PutMonitorRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public PutMonitorRequest(@JsonProperty("RequestBody") String requestBody, @JsonProperty("dataset_id") String datasetId, @JsonProperty("monitor_id") String monitorId, @JsonProperty("org_id") String orgId) {
        this.requestBody = requestBody;
        this.datasetId = datasetId;
        this.monitorId = monitorId;
        this.orgId = orgId;
  }
}
