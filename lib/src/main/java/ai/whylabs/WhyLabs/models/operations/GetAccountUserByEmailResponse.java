/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetAccountUserByEmailResponse {
    /**
     * GetAccountUserByEmail default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.AccountUser accountUser;

    public GetAccountUserByEmailResponse withAccountUser(ai.whylabs.WhyLabs.models.shared.AccountUser accountUser) {
        this.accountUser = accountUser;
        return this;
    }
    
    
    public String contentType;

    public GetAccountUserByEmailResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetAccountUserByEmailResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetAccountUserByEmailResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetAccountUserByEmailResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
