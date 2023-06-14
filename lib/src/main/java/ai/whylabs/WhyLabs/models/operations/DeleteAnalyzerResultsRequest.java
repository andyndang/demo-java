/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteAnalyzerResultsRequest {
    /**
     * The unique dataset ID in your company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataset_id")
    public String datasetId;

    public DeleteAnalyzerResultsRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    /**
     * Optional, scope deleting analyzer results older than the timestamp
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=end_timestamp")
    public Long endTimestamp;

    public DeleteAnalyzerResultsRequest withEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    
    /**
     * Your company's unique organization ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public DeleteAnalyzerResultsRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    /**
     * Optional, scope deleting analyzer results more recent than the timestamp
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=start_timestamp")
    public Long startTimestamp;

    public DeleteAnalyzerResultsRequest withStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    
    public DeleteAnalyzerResultsRequest(@JsonProperty("dataset_id") String datasetId, @JsonProperty("org_id") String orgId) {
        this.datasetId = datasetId;
        this.orgId = orgId;
  }
}
