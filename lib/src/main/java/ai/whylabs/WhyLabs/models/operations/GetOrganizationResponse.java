/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetOrganizationResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetOrganizationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * The organization metadata
     */
    
    public ai.whylabs.WhyLabs.models.shared.OrganizationMetadata organizationMetadata;

    public GetOrganizationResponse withOrganizationMetadata(ai.whylabs.WhyLabs.models.shared.OrganizationMetadata organizationMetadata) {
        this.organizationMetadata = organizationMetadata;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetOrganizationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetOrganizationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrganizationResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
