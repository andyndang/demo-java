/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListModelsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ListModelsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A list of model summary items
     */
    
    public ai.whylabs.WhyLabs.models.shared.ListModelsResponse listModelsResponse;

    public ListModelsResponse withListModelsResponse(ai.whylabs.WhyLabs.models.shared.ListModelsResponse listModelsResponse) {
        this.listModelsResponse = listModelsResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ListModelsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ListModelsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListModelsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
