/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetMembershipsResponse - Response for the GetMemberships API
 */
public class GetMembershipsResponse {
    /**
     * A list of all memberships that a user has.
     */
    @JsonProperty("memberships")
    public Membership[] memberships;

    public GetMembershipsResponse withMemberships(Membership[] memberships) {
        this.memberships = memberships;
        return this;
    }
    
    public GetMembershipsResponse(@JsonProperty("memberships") Membership[] memberships) {
        this.memberships = memberships;
  }
}
