/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PutEntitySchemaResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public PutEntitySchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * PutEntitySchema default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.Response response;

    public PutEntitySchemaResponse withResponse(ai.whylabs.WhyLabs.models.shared.Response response) {
        this.response = response;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public PutEntitySchemaResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public PutEntitySchemaResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PutEntitySchemaResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
