/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetMonitorConfigV3VersionResponse {
    
    public String contentType;

    public GetMonitorConfigV3VersionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * GetMonitorConfigV3Version default response
     */
    
    public String getMonitorConfigV3VersionDefaultApplicationJSONString;

    public GetMonitorConfigV3VersionResponse withGetMonitorConfigV3VersionDefaultApplicationJSONString(String getMonitorConfigV3VersionDefaultApplicationJSONString) {
        this.getMonitorConfigV3VersionDefaultApplicationJSONString = getMonitorConfigV3VersionDefaultApplicationJSONString;
        return this;
    }
    
    
    public Integer statusCode;

    public GetMonitorConfigV3VersionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetMonitorConfigV3VersionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetMonitorConfigV3VersionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
