/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ListOrganizationMembershipsResponse {
    
    public String contentType;

    public ListOrganizationMembershipsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * ListOrganizationMemberships default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.ListOrganizationMembershipsResponse listOrganizationMembershipsResponse;

    public ListOrganizationMembershipsResponse withListOrganizationMembershipsResponse(ai.whylabs.WhyLabs.models.shared.ListOrganizationMembershipsResponse listOrganizationMembershipsResponse) {
        this.listOrganizationMembershipsResponse = listOrganizationMembershipsResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public ListOrganizationMembershipsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListOrganizationMembershipsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListOrganizationMembershipsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
