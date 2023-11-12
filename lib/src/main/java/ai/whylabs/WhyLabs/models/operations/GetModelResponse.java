/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetModelResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetModelResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A [ModelMetadataResponse] object if operation succeeds
     */
    
    public ai.whylabs.WhyLabs.models.shared.ModelMetadataResponse modelMetadataResponse;

    public GetModelResponse withModelMetadataResponse(ai.whylabs.WhyLabs.models.shared.ModelMetadataResponse modelMetadataResponse) {
        this.modelMetadataResponse = modelMetadataResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetModelResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetModelResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetModelResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
