/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAWSMarketplaceMetadataRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public GetAWSMarketplaceMetadataRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public GetAWSMarketplaceMetadataRequest(@JsonProperty("org_id") String orgId) {
        this.orgId = orgId;
  }
}
