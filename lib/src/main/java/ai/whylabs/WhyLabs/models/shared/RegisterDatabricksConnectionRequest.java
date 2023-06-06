/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterDatabricksConnectionRequest {
    @JsonProperty("accessToken")
    public String accessToken;

    public RegisterDatabricksConnectionRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("cloudProvider")
    public String cloudProvider;

    public RegisterDatabricksConnectionRequest withCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connectionEstablished")
    public Boolean connectionEstablished;

    public RegisterDatabricksConnectionRequest withConnectionEstablished(Boolean connectionEstablished) {
        this.connectionEstablished = connectionEstablished;
        return this;
    }
    
    @JsonProperty("connectionId")
    public String connectionId;

    public RegisterDatabricksConnectionRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @JsonProperty("demo")
    public Boolean demo;

    public RegisterDatabricksConnectionRequest withDemo(Boolean demo) {
        this.demo = demo;
        return this;
    }
    
    @JsonProperty("email")
    public String email;

    public RegisterDatabricksConnectionRequest withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("freeTrial")
    public Boolean freeTrial;

    public RegisterDatabricksConnectionRequest withFreeTrial(Boolean freeTrial) {
        this.freeTrial = freeTrial;
        return this;
    }
    
    @JsonProperty("hostname")
    public String hostname;

    public RegisterDatabricksConnectionRequest withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    
    @JsonProperty("port")
    public Integer port;

    public RegisterDatabricksConnectionRequest withPort(Integer port) {
        this.port = port;
        return this;
    }
    
    @JsonProperty("workspaceId")
    public String workspaceId;

    public RegisterDatabricksConnectionRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    @JsonProperty("workspaceUrl")
    public String workspaceUrl;

    public RegisterDatabricksConnectionRequest withWorkspaceUrl(String workspaceUrl) {
        this.workspaceUrl = workspaceUrl;
        return this;
    }
    
    public RegisterDatabricksConnectionRequest(@JsonProperty("accessToken") String accessToken, @JsonProperty("cloudProvider") String cloudProvider, @JsonProperty("connectionId") String connectionId, @JsonProperty("demo") Boolean demo, @JsonProperty("email") String email, @JsonProperty("hostname") String hostname, @JsonProperty("port") Integer port, @JsonProperty("workspaceId") String workspaceId, @JsonProperty("workspaceUrl") String workspaceUrl) {
        this.accessToken = accessToken;
        this.cloudProvider = cloudProvider;
        this.connectionId = connectionId;
        this.demo = demo;
        this.email = email;
        this.hostname = hostname;
        this.port = port;
        this.workspaceId = workspaceId;
        this.workspaceUrl = workspaceUrl;
  }
}
