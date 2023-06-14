/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeactivateModelRequest {
    /**
     * The model ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=model_id")
    public String modelId;

    public DeactivateModelRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    
    /**
     * The organization ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public DeactivateModelRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public DeactivateModelRequest(@JsonProperty("model_id") String modelId, @JsonProperty("org_id") String orgId) {
        this.modelId = modelId;
        this.orgId = orgId;
  }
}
