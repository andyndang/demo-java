/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetDefaultMembershipForEmailResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetDefaultMembershipForEmailResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * GetDefaultMembershipForEmail default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.GetDefaultMembershipResponse getDefaultMembershipResponse;

    public GetDefaultMembershipForEmailResponse withGetDefaultMembershipResponse(ai.whylabs.WhyLabs.models.shared.GetDefaultMembershipResponse getDefaultMembershipResponse) {
        this.getDefaultMembershipResponse = getDefaultMembershipResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetDefaultMembershipForEmailResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetDefaultMembershipForEmailResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetDefaultMembershipForEmailResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
