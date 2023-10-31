/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAccountUserRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public ai.whylabs.WhyLabs.models.shared.CreateAccountUserRequest createAccountUserRequest;

    public CreateAccountUserRequest withCreateAccountUserRequest(ai.whylabs.WhyLabs.models.shared.CreateAccountUserRequest createAccountUserRequest) {
        this.createAccountUserRequest = createAccountUserRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public CreateAccountUserRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public CreateAccountUserRequest(@JsonProperty("CreateAccountUserRequest") ai.whylabs.WhyLabs.models.shared.CreateAccountUserRequest createAccountUserRequest, @JsonProperty("org_id") String orgId) {
        this.createAccountUserRequest = createAccountUserRequest;
        this.orgId = orgId;
  }
}
