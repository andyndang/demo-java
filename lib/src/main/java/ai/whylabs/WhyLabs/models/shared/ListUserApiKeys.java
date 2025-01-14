/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListUserApiKeys - Response for listing API key metadata
 */
public class ListUserApiKeys {
    /**
     * A list of all known API key metadata
     */
    @JsonProperty("items")
    public UserApiKey[] items;

    public ListUserApiKeys withItems(UserApiKey[] items) {
        this.items = items;
        return this;
    }
    
    public ListUserApiKeys(@JsonProperty("items") UserApiKey[] items) {
        this.items = items;
  }
}
