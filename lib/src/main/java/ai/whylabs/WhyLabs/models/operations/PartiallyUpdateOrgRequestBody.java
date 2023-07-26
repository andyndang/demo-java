/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PartiallyUpdateOrgRequestBody {
    /**
     * The unique ID of an organization. If an organization with this ID does not exist, this method will throw an exception.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("org_id")
    public String orgId;

    public PartiallyUpdateOrgRequestBody withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public PartiallyUpdateOrgRequestBody(){}
}
