/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListNotificationActionsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ListNotificationActionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ListNotificationActionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ListNotificationActionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * ListNotificationActions default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.NotificationAction[] classes;

    public ListNotificationActionsResponse withClasses(ai.whylabs.WhyLabs.models.shared.NotificationAction[] classes) {
        this.classes = classes;
        return this;
    }
    
    public ListNotificationActionsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
