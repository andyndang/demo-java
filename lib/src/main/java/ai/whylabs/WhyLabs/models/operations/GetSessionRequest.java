/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetSessionRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=session_id")
    public String sessionId;

    public GetSessionRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    
    public GetSessionRequest(@JsonProperty("session_id") String sessionId) {
        this.sessionId = sessionId;
  }
}
