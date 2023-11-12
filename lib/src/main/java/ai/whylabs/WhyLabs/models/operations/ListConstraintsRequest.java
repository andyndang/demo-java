/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListConstraintsRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataset_id")
    public String datasetId;

    public ListConstraintsRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public ListConstraintsRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public ListConstraintsRequest(@JsonProperty("dataset_id") String datasetId, @JsonProperty("org_id") String orgId) {
        this.datasetId = datasetId;
        this.orgId = orgId;
  }
}
