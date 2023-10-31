/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PutAnalyzerRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public String requestBody;

    public PutAnalyzerRequest withRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=analyzer_id")
    public String analyzerId;

    public PutAnalyzerRequest withAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataset_id")
    public String datasetId;

    public PutAnalyzerRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public PutAnalyzerRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public PutAnalyzerRequest(@JsonProperty("RequestBody") String requestBody, @JsonProperty("analyzer_id") String analyzerId, @JsonProperty("dataset_id") String datasetId, @JsonProperty("org_id") String orgId) {
        this.requestBody = requestBody;
        this.analyzerId = analyzerId;
        this.datasetId = datasetId;
        this.orgId = orgId;
  }
}
