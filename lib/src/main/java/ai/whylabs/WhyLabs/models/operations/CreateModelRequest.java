/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateModelRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=model_id")
    public String modelId;

    public CreateModelRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    
    /**
     * The name of a model
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=model_name")
    public String modelName;

    public CreateModelRequest withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    
    /**
     * The [ModelType] of the dataset
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=model_type")
    public ai.whylabs.WhyLabs.models.shared.ModelType modelType;

    public CreateModelRequest withModelType(ai.whylabs.WhyLabs.models.shared.ModelType modelType) {
        this.modelType = modelType;
        return this;
    }
    
    /**
     * The organization ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public CreateModelRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    /**
     * The [TimePeriod] for data aggregation/alerting for a model
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=time_period")
    public ai.whylabs.WhyLabs.models.shared.TimePeriod timePeriod;

    public CreateModelRequest withTimePeriod(ai.whylabs.WhyLabs.models.shared.TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }
    
    public CreateModelRequest(@JsonProperty("model_name") String modelName, @JsonProperty("org_id") String orgId, @JsonProperty("time_period") ai.whylabs.WhyLabs.models.shared.TimePeriod timePeriod) {
        this.modelName = modelName;
        this.orgId = orgId;
        this.timePeriod = timePeriod;
  }
}
