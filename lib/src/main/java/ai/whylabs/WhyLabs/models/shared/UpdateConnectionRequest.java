/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateConnectionRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("changes")
    public UpdateConnectionChanges changes;

    public UpdateConnectionRequest withChanges(UpdateConnectionChanges changes) {
        this.changes = changes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("orgId")
    public String orgId;

    public UpdateConnectionRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workspaceId")
    public String workspaceId;

    public UpdateConnectionRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public UpdateConnectionRequest(){}
}
