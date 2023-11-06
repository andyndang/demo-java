/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requestId")
    public String requestId;

    public SearchResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public EntitySearchResult[] results;

    public SearchResponse withResults(EntitySearchResult[] results) {
        this.results = results;
        return this;
    }
    
    public SearchResponse(){}
}
