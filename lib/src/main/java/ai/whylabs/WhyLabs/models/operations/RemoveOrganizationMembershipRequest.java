/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RemoveOrganizationMembershipRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=email")
    public String email;

    public RemoveOrganizationMembershipRequest withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public RemoveOrganizationMembershipRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public RemoveOrganizationMembershipRequest(@JsonProperty("email") String email, @JsonProperty("org_id") String orgId) {
        this.email = email;
        this.orgId = orgId;
  }
}
