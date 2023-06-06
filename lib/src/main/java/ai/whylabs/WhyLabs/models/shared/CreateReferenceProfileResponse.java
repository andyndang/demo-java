/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateReferenceProfileResponse - Response payload for creating a reference profile.
 */
public class CreateReferenceProfileResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("alias")
    public String alias;

    public CreateReferenceProfileResponse withAlias(String alias) {
        this.alias = alias;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datasetId")
    public String datasetId;

    public CreateReferenceProfileResponse withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CreateReferenceProfileResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("segments")
    public String[] segments;

    public CreateReferenceProfileResponse withSegments(String[] segments) {
        this.segments = segments;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uploadTimestamp")
    public Long uploadTimestamp;

    public CreateReferenceProfileResponse withUploadTimestamp(Long uploadTimestamp) {
        this.uploadTimestamp = uploadTimestamp;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uploadUrls")
    public String[] uploadUrls;

    public CreateReferenceProfileResponse withUploadUrls(String[] uploadUrls) {
        this.uploadUrls = uploadUrls;
        return this;
    }
    
    public CreateReferenceProfileResponse(){}
}
