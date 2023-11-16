/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PutAnalyzerResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public PutAnalyzerResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * PutAnalyzer default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.Response response;

    public PutAnalyzerResponse withResponse(ai.whylabs.WhyLabs.models.shared.Response response) {
        this.response = response;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public PutAnalyzerResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public PutAnalyzerResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PutAnalyzerResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
