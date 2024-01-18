/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ActivateAzureSubscriptionResponse {
    /**
     * ActivateAzureSubscription default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.ActivateAzureSubscriptionResponse activateAzureSubscriptionResponse;

    public ActivateAzureSubscriptionResponse withActivateAzureSubscriptionResponse(ai.whylabs.WhyLabs.models.shared.ActivateAzureSubscriptionResponse activateAzureSubscriptionResponse) {
        this.activateAzureSubscriptionResponse = activateAzureSubscriptionResponse;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ActivateAzureSubscriptionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ActivateAzureSubscriptionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ActivateAzureSubscriptionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ActivateAzureSubscriptionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}