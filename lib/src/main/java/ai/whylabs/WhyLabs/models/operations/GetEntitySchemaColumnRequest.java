/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetEntitySchemaColumnRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=column_id")
    public String columnId;

    public GetEntitySchemaColumnRequest withColumnId(String columnId) {
        this.columnId = columnId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataset_id")
    public String datasetId;

    public GetEntitySchemaColumnRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public GetEntitySchemaColumnRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public GetEntitySchemaColumnRequest(@JsonProperty("column_id") String columnId, @JsonProperty("dataset_id") String datasetId, @JsonProperty("org_id") String orgId) {
        this.columnId = columnId;
        this.datasetId = datasetId;
        this.orgId = orgId;
  }
}
