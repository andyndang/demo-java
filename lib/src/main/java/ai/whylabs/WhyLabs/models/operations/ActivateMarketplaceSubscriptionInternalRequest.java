/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ActivateMarketplaceSubscriptionInternalRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=org_id")
    public String orgId;

    public ActivateMarketplaceSubscriptionInternalRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=subscription_id")
    public String subscriptionId;

    public ActivateMarketplaceSubscriptionInternalRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    
    public ActivateMarketplaceSubscriptionInternalRequest(@JsonProperty("org_id") String orgId, @JsonProperty("subscription_id") String subscriptionId) {
        this.orgId = orgId;
        this.subscriptionId = subscriptionId;
  }
}
