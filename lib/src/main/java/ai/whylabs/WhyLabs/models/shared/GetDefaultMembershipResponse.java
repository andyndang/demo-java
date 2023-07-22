/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetDefaultMembershipResponse - GetDefaultMembershipForEmail default response
 */

public class GetDefaultMembershipResponse {
    /**
     * Response for the get memberships
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("membership")
    public Membership membership;

    public GetDefaultMembershipResponse withMembership(Membership membership) {
        this.membership = membership;
        return this;
    }
    
    public GetDefaultMembershipResponse(){}
}
