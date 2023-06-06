/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteMonitorRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataset_id")
    public String datasetId;

    public DeleteMonitorRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=monitor_id")
    public String monitorId;

    public DeleteMonitorRequest withMonitorId(String monitorId) {
        this.monitorId = monitorId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public DeleteMonitorRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public DeleteMonitorRequest(@JsonProperty("dataset_id") String datasetId, @JsonProperty("monitor_id") String monitorId, @JsonProperty("org_id") String orgId) {
        this.datasetId = datasetId;
        this.monitorId = monitorId;
        this.orgId = orgId;
  }
}
