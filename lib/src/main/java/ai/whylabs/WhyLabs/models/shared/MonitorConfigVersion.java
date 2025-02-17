/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MonitorConfigVersion {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastModified")
    public Long lastModified;

    public MonitorConfigVersion withLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("path")
    public String path;

    public MonitorConfigVersion withPath(String path) {
        this.path = path;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("versionId")
    public String versionId;

    public MonitorConfigVersion withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    
    public MonitorConfigVersion(){}
}
