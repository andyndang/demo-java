/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntitySearchResult {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("actionId")
    public String actionId;

    public EntitySearchResult withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datasetId")
    public String datasetId;

    public EntitySearchResult withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("featureName")
    public String featureName;

    public EntitySearchResult withFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keywords")
    public String keywords;

    public EntitySearchResult withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public String metadata;

    public EntitySearchResult withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("monitorId")
    public String monitorId;

    public EntitySearchResult withMonitorId(String monitorId) {
        this.monitorId = monitorId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("orgId")
    public String orgId;

    public EntitySearchResult withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public EntitySearchResult withType(String type) {
        this.type = type;
        return this;
    }
    
    public EntitySearchResult(){}
}
