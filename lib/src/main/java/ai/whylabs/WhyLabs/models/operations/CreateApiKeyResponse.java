/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateApiKeyResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public CreateApiKeyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public CreateApiKeyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public CreateApiKeyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * A object with key ID and other metadata about the key
     */
    
    public ai.whylabs.WhyLabs.models.shared.UserApiKey userApiKey;

    public CreateApiKeyResponse withUserApiKey(ai.whylabs.WhyLabs.models.shared.UserApiKey userApiKey) {
        this.userApiKey = userApiKey;
        return this;
    }
    
    public CreateApiKeyResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
