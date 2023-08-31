/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LogDebugEventRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public ai.whylabs.WhyLabs.models.shared.DebugEvent debugEvent;

    public LogDebugEventRequest withDebugEvent(ai.whylabs.WhyLabs.models.shared.DebugEvent debugEvent) {
        this.debugEvent = debugEvent;
        return this;
    }
    
    /**
     * The resource ID to log the event to
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataset_id")
    public String datasetId;

    public LogDebugEventRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    /**
     * Your company's unique organization ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public LogDebugEventRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public LogDebugEventRequest(@JsonProperty("DebugEvent") ai.whylabs.WhyLabs.models.shared.DebugEvent debugEvent, @JsonProperty("dataset_id") String datasetId, @JsonProperty("org_id") String orgId) {
        this.debugEvent = debugEvent;
        this.datasetId = datasetId;
        this.orgId = orgId;
  }
}