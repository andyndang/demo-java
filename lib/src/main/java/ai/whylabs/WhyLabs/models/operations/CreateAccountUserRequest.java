/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAccountUserRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public CreateAccountUserRequestBody requestBody;

    public CreateAccountUserRequest withRequestBody(CreateAccountUserRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public CreateAccountUserRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public CreateAccountUserRequest(@JsonProperty("RequestBody") CreateAccountUserRequestBody requestBody, @JsonProperty("org_id") String orgId) {
        this.requestBody = requestBody;
        this.orgId = orgId;
  }
}
