/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListAccountUsersResponse {
    /**
     * ListAccountUsers default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.AccountUser[] accountUsers;

    public ListAccountUsersResponse withAccountUsers(ai.whylabs.WhyLabs.models.shared.AccountUser[] accountUsers) {
        this.accountUsers = accountUsers;
        return this;
    }
    
    
    public String contentType;

    public ListAccountUsersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public ListAccountUsersResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListAccountUsersResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListAccountUsersResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
