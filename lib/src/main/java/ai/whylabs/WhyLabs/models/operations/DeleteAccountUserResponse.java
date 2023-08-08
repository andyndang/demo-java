/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteAccountUserResponse {
    
    public String contentType;

    public DeleteAccountUserResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteAccountUserResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteAccountUserResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * DeleteAccountUser default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.Void void_;

    public DeleteAccountUserResponse withVoid(ai.whylabs.WhyLabs.models.shared.Void void_) {
        this.void_ = void_;
        return this;
    }
    
    public DeleteAccountUserResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
