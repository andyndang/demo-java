/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class LogReferenceResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public LogReferenceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * LogReference default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.LogReferenceResponse logReferenceResponse;

    public LogReferenceResponse withLogReferenceResponse(ai.whylabs.WhyLabs.models.shared.LogReferenceResponse logReferenceResponse) {
        this.logReferenceResponse = logReferenceResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public LogReferenceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public LogReferenceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public LogReferenceResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
