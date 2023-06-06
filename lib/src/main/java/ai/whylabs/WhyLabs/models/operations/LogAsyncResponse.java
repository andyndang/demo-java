/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class LogAsyncResponse {
    /**
     * LogAsync default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.AsyncLogResponse asyncLogResponse;

    public LogAsyncResponse withAsyncLogResponse(ai.whylabs.WhyLabs.models.shared.AsyncLogResponse asyncLogResponse) {
        this.asyncLogResponse = asyncLogResponse;
        return this;
    }
    
    
    public String contentType;

    public LogAsyncResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public LogAsyncResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public LogAsyncResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public LogAsyncResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
