/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class EnableNotificationActionResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public EnableNotificationActionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public EnableNotificationActionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public EnableNotificationActionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * EnableNotificationAction default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.Void void_;

    public EnableNotificationActionResponse withVoid(ai.whylabs.WhyLabs.models.shared.Void void_) {
        this.void_ = void_;
        return this;
    }
    
    public EnableNotificationActionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
