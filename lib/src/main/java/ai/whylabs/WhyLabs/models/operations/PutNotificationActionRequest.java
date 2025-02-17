/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PutNotificationActionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public String requestBody;

    public PutNotificationActionRequest withRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=action_id")
    public String actionId;

    public PutNotificationActionRequest withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public PutNotificationActionRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=type")
    public ai.whylabs.WhyLabs.models.shared.ActionType type;

    public PutNotificationActionRequest withType(ai.whylabs.WhyLabs.models.shared.ActionType type) {
        this.type = type;
        return this;
    }
    
    public PutNotificationActionRequest(@JsonProperty("RequestBody") String requestBody, @JsonProperty("action_id") String actionId, @JsonProperty("org_id") String orgId, @JsonProperty("type") ai.whylabs.WhyLabs.models.shared.ActionType type) {
        this.requestBody = requestBody;
        this.actionId = actionId;
        this.orgId = orgId;
        this.type = type;
  }
}
