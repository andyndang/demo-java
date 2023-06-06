/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BatchLogReferenceRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("references")
    public LogReferenceRequest[] references;

    public BatchLogReferenceRequest withReferences(LogReferenceRequest[] references) {
        this.references = references;
        return this;
    }
    
    public BatchLogReferenceRequest(){}
}
