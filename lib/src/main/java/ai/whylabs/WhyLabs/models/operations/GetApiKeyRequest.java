/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetApiKeyRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key_id")
    public String keyId;

    public GetApiKeyRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public GetApiKeyRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public GetApiKeyRequest(@JsonProperty("key_id") String keyId, @JsonProperty("org_id") String orgId) {
        this.keyId = keyId;
        this.orgId = orgId;
  }
}
