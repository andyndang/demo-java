/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RefreshConnectionResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public RefreshConnectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * RefreshConnection default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.RefreshConnectionByOrgIdResponse refreshConnectionByOrgIdResponse;

    public RefreshConnectionResponse withRefreshConnectionByOrgIdResponse(ai.whylabs.WhyLabs.models.shared.RefreshConnectionByOrgIdResponse refreshConnectionByOrgIdResponse) {
        this.refreshConnectionByOrgIdResponse = refreshConnectionByOrgIdResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public RefreshConnectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public RefreshConnectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public RefreshConnectionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
