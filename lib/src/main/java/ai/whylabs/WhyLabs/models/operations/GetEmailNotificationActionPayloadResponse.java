/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetEmailNotificationActionPayloadResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetEmailNotificationActionPayloadResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * getEmailNotificationActionPayload default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.EmailNotificationAction emailNotificationAction;

    public GetEmailNotificationActionPayloadResponse withEmailNotificationAction(ai.whylabs.WhyLabs.models.shared.EmailNotificationAction emailNotificationAction) {
        this.emailNotificationAction = emailNotificationAction;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetEmailNotificationActionPayloadResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetEmailNotificationActionPayloadResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetEmailNotificationActionPayloadResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
