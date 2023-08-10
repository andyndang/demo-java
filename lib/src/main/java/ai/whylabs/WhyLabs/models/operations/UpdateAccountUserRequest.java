/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateAccountUserRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public ai.whylabs.WhyLabs.models.shared.AccountUser accountUser;

    public UpdateAccountUserRequest withAccountUser(ai.whylabs.WhyLabs.models.shared.AccountUser accountUser) {
        this.accountUser = accountUser;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public UpdateAccountUserRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public UpdateAccountUserRequest(@JsonProperty("AccountUser") ai.whylabs.WhyLabs.models.shared.AccountUser accountUser, @JsonProperty("org_id") String orgId) {
        this.accountUser = accountUser;
        this.orgId = orgId;
  }
}
