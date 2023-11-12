/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class UpdateOrgResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public UpdateOrgResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A summary of the organization object if succeeds
     */
    
    public ai.whylabs.WhyLabs.models.shared.OrganizationSummary organizationSummary;

    public UpdateOrgResponse withOrganizationSummary(ai.whylabs.WhyLabs.models.shared.OrganizationSummary organizationSummary) {
        this.organizationSummary = organizationSummary;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public UpdateOrgResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public UpdateOrgResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public UpdateOrgResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
