/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListSegmentsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ListSegmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * The list of segments for the dataset profile
     */
    
    public ai.whylabs.WhyLabs.models.shared.SegmentListResponse segmentListResponse;

    public ListSegmentsResponse withSegmentListResponse(ai.whylabs.WhyLabs.models.shared.SegmentListResponse segmentListResponse) {
        this.segmentListResponse = segmentListResponse;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ListSegmentsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ListSegmentsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListSegmentsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
