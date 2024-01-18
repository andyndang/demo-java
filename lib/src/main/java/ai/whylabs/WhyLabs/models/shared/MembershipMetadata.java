/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MembershipMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    public Boolean default_;

    public MembershipMetadata withDefault(Boolean default_) {
        this.default_ = default_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("orgId")
    public String orgId;

    public MembershipMetadata withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public Role role;

    public MembershipMetadata withRole(Role role) {
        this.role = role;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userId")
    public String userId;

    public MembershipMetadata withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public MembershipMetadata(){}
}
