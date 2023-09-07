/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListConstraintsResponse {
    
    public String contentType;

    public ListConstraintsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * ListConstraints default response
     */
    
    public String[] listConstraintsDefaultApplicationJSONStrings;

    public ListConstraintsResponse withListConstraintsDefaultApplicationJSONStrings(String[] listConstraintsDefaultApplicationJSONStrings) {
        this.listConstraintsDefaultApplicationJSONStrings = listConstraintsDefaultApplicationJSONStrings;
        return this;
    }
    
    
    public Integer statusCode;

    public ListConstraintsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListConstraintsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListConstraintsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
