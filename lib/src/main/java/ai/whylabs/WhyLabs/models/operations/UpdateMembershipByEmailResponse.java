/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class UpdateMembershipByEmailResponse {
    
    public String contentType;

    public UpdateMembershipByEmailResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * UpdateMembershipByEmail default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.MembershipMetadata membershipMetadata;

    public UpdateMembershipByEmailResponse withMembershipMetadata(ai.whylabs.WhyLabs.models.shared.MembershipMetadata membershipMetadata) {
        this.membershipMetadata = membershipMetadata;
        return this;
    }
    
    
    public Integer statusCode;

    public UpdateMembershipByEmailResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public UpdateMembershipByEmailResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public UpdateMembershipByEmailResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
