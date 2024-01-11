/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ActivateAzureSubscriptionResponse {
    @JsonProperty("orgId")
    public String orgId;

    public ActivateAzureSubscriptionResponse withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @JsonProperty("userId")
    public String userId;

    public ActivateAzureSubscriptionResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public ActivateAzureSubscriptionResponse(@JsonProperty("orgId") String orgId, @JsonProperty("userId") String userId) {
        this.orgId = orgId;
        this.userId = userId;
  }
}
