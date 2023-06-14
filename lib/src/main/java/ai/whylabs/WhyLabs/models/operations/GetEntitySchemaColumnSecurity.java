/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetEntitySchemaColumnSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=X-API-Key")
    public String apiKeyAuth;

    public GetEntitySchemaColumnSecurity withApiKeyAuth(String apiKeyAuth) {
        this.apiKeyAuth = apiKeyAuth;
        return this;
    }
    
    public GetEntitySchemaColumnSecurity(@JsonProperty("ApiKeyAuth") String apiKeyAuth) {
        this.apiKeyAuth = apiKeyAuth;
  }
}
