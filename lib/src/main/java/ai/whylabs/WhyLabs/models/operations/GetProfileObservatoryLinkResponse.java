/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetProfileObservatoryLinkResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetProfileObservatoryLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * GetProfileObservatoryLink default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.GetProfileObservatoryLinkResponse getProfileObservatoryLinkResponse;

    public GetProfileObservatoryLinkResponse withGetProfileObservatoryLinkResponse(ai.whylabs.WhyLabs.models.shared.GetProfileObservatoryLinkResponse getProfileObservatoryLinkResponse) {
        this.getProfileObservatoryLinkResponse = getProfileObservatoryLinkResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetProfileObservatoryLinkResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetProfileObservatoryLinkResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetProfileObservatoryLinkResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
