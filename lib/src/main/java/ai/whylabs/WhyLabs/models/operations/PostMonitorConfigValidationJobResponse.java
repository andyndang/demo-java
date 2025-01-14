/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PostMonitorConfigValidationJobResponse {
    
    public String contentType;

    public PostMonitorConfigValidationJobResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public PostMonitorConfigValidationJobResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostMonitorConfigValidationJobResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * PostMonitorConfigValidationJob default response
     */
    
    public java.util.Map<String, Object> void_;

    public PostMonitorConfigValidationJobResponse withVoid(java.util.Map<String, Object> void_) {
        this.void_ = void_;
        return this;
    }
    
    public PostMonitorConfigValidationJobResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
