/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AccountUserRequest - Information held about a user in an account
 */

public class AccountUserRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    public Boolean active;

    public AccountUserRequest withActive(Boolean active) {
        this.active = active;
        return this;
    }
    
    /**
     * The user's email address
     */
    @JsonProperty("email")
    public String email;

    public AccountUserRequest withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * The external id the user is known by in the provisioner
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("externalId")
    public String externalId;

    public AccountUserRequest withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userSchema")
    public String userSchema;

    public AccountUserRequest withUserSchema(String userSchema) {
        this.userSchema = userSchema;
        return this;
    }
    
    public AccountUserRequest(@JsonProperty("email") String email) {
        this.email = email;
  }
}
