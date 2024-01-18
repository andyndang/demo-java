/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ExportTracesJsonResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ExportTracesJsonResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * ExportTraces default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.ExportTraceServiceResponse exportTraceServiceResponse;

    public ExportTracesJsonResponse withExportTraceServiceResponse(ai.whylabs.WhyLabs.models.shared.ExportTraceServiceResponse exportTraceServiceResponse) {
        this.exportTraceServiceResponse = exportTraceServiceResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ExportTracesJsonResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ExportTracesJsonResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ExportTracesJsonResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
