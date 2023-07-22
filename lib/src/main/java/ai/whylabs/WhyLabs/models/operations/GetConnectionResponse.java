/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetConnectionResponse {
    
    public String contentType;

    public GetConnectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * GetConnection default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.GetConnectionResponse getConnectionResponse;

    public GetConnectionResponse withGetConnectionResponse(ai.whylabs.WhyLabs.models.shared.GetConnectionResponse getConnectionResponse) {
        this.getConnectionResponse = getConnectionResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public GetConnectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetConnectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetConnectionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
