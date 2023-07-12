/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GenerateReportResponse {
    /**
     * GenerateReport default response
     */
    
    public ai.whylabs.WhyLabs.models.shared.AdminReportResponse adminReportResponse;

    public GenerateReportResponse withAdminReportResponse(ai.whylabs.WhyLabs.models.shared.AdminReportResponse adminReportResponse) {
        this.adminReportResponse = adminReportResponse;
        return this;
    }
    
    
    public String contentType;

    public GenerateReportResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GenerateReportResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GenerateReportResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GenerateReportResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}