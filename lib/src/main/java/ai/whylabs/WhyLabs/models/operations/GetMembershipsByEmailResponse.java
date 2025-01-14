/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetMembershipsByEmailResponse {
    
    public String contentType;

    public GetMembershipsByEmailResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * GetMembershipsByEmail default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.GetMembershipsResponse getMembershipsResponse;

    public GetMembershipsByEmailResponse withGetMembershipsResponse(ai.whylabs.WhyLabs.models.shared.GetMembershipsResponse getMembershipsResponse) {
        this.getMembershipsResponse = getMembershipsResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public GetMembershipsByEmailResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetMembershipsByEmailResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetMembershipsByEmailResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
