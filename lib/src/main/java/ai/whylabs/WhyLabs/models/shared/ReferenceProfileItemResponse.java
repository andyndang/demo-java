/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReferenceProfileItemResponse - A single reference item response.
 */
public class ReferenceProfileItemResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("alias")
    public String alias;

    public ReferenceProfileItemResponse withAlias(String alias) {
        this.alias = alias;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datasetTimestamp")
    public Long datasetTimestamp;

    public ReferenceProfileItemResponse withDatasetTimestamp(Long datasetTimestamp) {
        this.datasetTimestamp = datasetTimestamp;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("downloadUrl")
    public String downloadUrl;

    public ReferenceProfileItemResponse withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("downloadUrls")
    public String[] downloadUrls;

    public ReferenceProfileItemResponse withDownloadUrls(String[] downloadUrls) {
        this.downloadUrls = downloadUrls;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public ReferenceProfileItemResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modelId")
    public String modelId;

    public ReferenceProfileItemResponse withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("orgId")
    public String orgId;

    public ReferenceProfileItemResponse withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("segments")
    public String[] segments;

    public ReferenceProfileItemResponse withSegments(String[] segments) {
        this.segments = segments;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uploadTimestamp")
    public Long uploadTimestamp;

    public ReferenceProfileItemResponse withUploadTimestamp(Long uploadTimestamp) {
        this.uploadTimestamp = uploadTimestamp;
        return this;
    }
    
    public ReferenceProfileItemResponse(){}
}
