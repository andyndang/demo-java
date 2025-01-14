/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClaimGuestSessionRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=org_id")
    public String orgId;

    public ClaimGuestSessionRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=session_id")
    public String sessionId;

    public ClaimGuestSessionRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    
    public ClaimGuestSessionRequest(@JsonProperty("org_id") String orgId, @JsonProperty("session_id") String sessionId) {
        this.orgId = orgId;
        this.sessionId = sessionId;
  }
}
