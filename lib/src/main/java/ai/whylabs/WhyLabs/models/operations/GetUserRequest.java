/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUserRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    public String userId;

    public GetUserRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public GetUserRequest(@JsonProperty("user_id") String userId) {
        this.userId = userId;
  }
}
