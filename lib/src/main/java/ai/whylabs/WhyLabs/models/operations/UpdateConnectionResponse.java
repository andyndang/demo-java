/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class UpdateConnectionResponse {
    
    public String contentType;

    public UpdateConnectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * UpdateConnection default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.Response response;

    public UpdateConnectionResponse withResponse(ai.whylabs.WhyLabs.models.shared.Response response) {
        this.response = response;
        return this;
    }
    
    
    public Integer statusCode;

    public UpdateConnectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public UpdateConnectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public UpdateConnectionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
