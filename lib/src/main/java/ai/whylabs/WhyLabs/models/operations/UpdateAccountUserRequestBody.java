/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateAccountUserRequestBody {
    /**
     * Information held about a user in an account
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public ai.whylabs.WhyLabs.models.shared.AccountUser user;

    public UpdateAccountUserRequestBody withUser(ai.whylabs.WhyLabs.models.shared.AccountUser user) {
        this.user = user;
        return this;
    }
    
    public UpdateAccountUserRequestBody(){}
}
