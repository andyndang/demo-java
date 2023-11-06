/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetMembershipsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetMembershipsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * GetMemberships default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.GetMembershipsResponse getMembershipsResponse;

    public GetMembershipsResponse withGetMembershipsResponse(ai.whylabs.WhyLabs.models.shared.GetMembershipsResponse getMembershipsResponse) {
        this.getMembershipsResponse = getMembershipsResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetMembershipsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetMembershipsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetMembershipsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
