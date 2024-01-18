/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateDatasetProfileUploadResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public CreateDatasetProfileUploadResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * CreateDatasetProfileUpload default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.CreateDatasetProfileUploadResponse createDatasetProfileUploadResponse;

    public CreateDatasetProfileUploadResponse withCreateDatasetProfileUploadResponse(ai.whylabs.WhyLabs.models.shared.CreateDatasetProfileUploadResponse createDatasetProfileUploadResponse) {
        this.createDatasetProfileUploadResponse = createDatasetProfileUploadResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public CreateDatasetProfileUploadResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public CreateDatasetProfileUploadResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreateDatasetProfileUploadResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
