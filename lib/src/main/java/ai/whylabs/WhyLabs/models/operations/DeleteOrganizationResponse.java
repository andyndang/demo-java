/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class DeleteOrganizationResponse {
    
    public String contentType;

    public DeleteOrganizationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * DeleteOrganization default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.Response response;

    public DeleteOrganizationResponse withResponse(ai.whylabs.WhyLabs.models.shared.Response response) {
        this.response = response;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteOrganizationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteOrganizationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public DeleteOrganizationResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
