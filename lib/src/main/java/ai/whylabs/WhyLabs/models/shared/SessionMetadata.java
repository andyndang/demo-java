/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SessionMetadata - Response for getting sessions.
 */
public class SessionMetadata {
    /**
     * The model id of the session. There should only be a single model.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modelId")
    public String modelId;

    public SessionMetadata withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    
    /**
     * The org id of the session
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("orgId")
    public String orgId;

    public SessionMetadata withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    /**
     * The id of the session
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sessionId")
    public String sessionId;

    public SessionMetadata withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    
    /**
     * The generated user id for the session.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userId")
    public String userId;

    public SessionMetadata withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public SessionMetadata(){}
}
