/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAccountMembershipsRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=managed_org_id")
    public String managedOrgId;

    public GetAccountMembershipsRequest withManagedOrgId(String managedOrgId) {
        this.managedOrgId = managedOrgId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public GetAccountMembershipsRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=role")
    public ai.whylabs.WhyLabs.models.shared.Role role;

    public GetAccountMembershipsRequest withRole(ai.whylabs.WhyLabs.models.shared.Role role) {
        this.role = role;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user_id")
    public String userId;

    public GetAccountMembershipsRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public GetAccountMembershipsRequest(@JsonProperty("org_id") String orgId) {
        this.orgId = orgId;
  }
}
