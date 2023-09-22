/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs;

import ai.whylabs.WhyLabs.utils.HTTPClient;
import ai.whylabs.WhyLabs.utils.HTTPRequest;
import ai.whylabs.WhyLabs.utils.JSON;
import ai.whylabs.WhyLabs.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Sessions {
	
	private SDKConfiguration sdkConfiguration;

	public Sessions(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create multiple reference profile uploads for a given session.
     * Create multiple reference profile uploads for a given session.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadResponse batchCreateReferenceProfileUpload(ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadRequest.class, baseUrl, "/v0/sessions/{session_id}/references", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "batchLogReferenceRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadResponse res = new ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadResponse(contentType, httpRes.statusCode()) {{
            batchLogSessionReferenceResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.BatchLogSessionReferenceResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.BatchLogSessionReferenceResponse.class);
                res.batchLogSessionReferenceResponse = out;
            }
        }

        return res;
    }

    /**
     * Claim a guest session, copying its model data into another org and expiring the session.
     * Claim a guest session, copying its model data into another org and expiring the session.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionResponse claimGuestSession(ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionRequest.class, baseUrl, "/v0/sessions/{session_id}/claim", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ai.whylabs.WhyLabs.utils.Utils.getQueryParams(ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionResponse res = new ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionResponse(contentType, httpRes.statusCode()) {{
            void_ = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.Void out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.Void.class);
                res.void_ = out;
            }
        }

        return res;
    }

    /**
     * Create an upload for a given session.
     * Create an upload for a given session.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadResponse createDatasetProfileUpload(ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadRequest.class, baseUrl, "/v0/sessions/{session_id}/upload", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "logAsyncRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadResponse res = new ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadResponse(contentType, httpRes.statusCode()) {{
            createDatasetProfileUploadResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.CreateDatasetProfileUploadResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.CreateDatasetProfileUploadResponse.class);
                res.createDatasetProfileUploadResponse = out;
            }
        }

        return res;
    }

    /**
     * Create a reference profile upload for a given session.
     * Create a reference profile upload for a given session.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadResponse createReferenceProfileUpload(ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadRequest.class, baseUrl, "/v0/sessions/{session_id}/reference", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "logReferenceRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadResponse res = new ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadResponse(contentType, httpRes.statusCode()) {{
            logSessionReferenceResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.LogSessionReferenceResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.LogSessionReferenceResponse.class);
                res.logSessionReferenceResponse = out;
            }
        }

        return res;
    }

    /**
     * Create a new session that can be used to upload dataset profiles from whylogs for display in whylabs.
     * Create a new session that can be used to upload dataset profiles from whylogs for display in whylabs.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.CreateSessionResponse createSession(ai.whylabs.WhyLabs.models.shared.CreateSessionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(baseUrl, "/v0/sessions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.CreateSessionResponse res = new ai.whylabs.WhyLabs.models.operations.CreateSessionResponse(contentType, httpRes.statusCode()) {{
            createSessionResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.CreateSessionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.CreateSessionResponse.class);
                res.createSessionResponse = out;
            }
        }

        return res;
    }

    /**
     * Get information about a session.
     * Get information about a session.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetSessionResponse getSession(ai.whylabs.WhyLabs.models.operations.GetSessionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.GetSessionRequest.class, baseUrl, "/v0/sessions/{session_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetSessionResponse res = new ai.whylabs.WhyLabs.models.operations.GetSessionResponse(contentType, httpRes.statusCode()) {{
            getSessionResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.GetSessionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.GetSessionResponse.class);
                res.getSessionResponse = out;
            }
        }

        return res;
    }

    /**
     * Get observatory links for profiles in a given session. A max of 3 profiles can be viewed a a time.
     * Get observatory links for profiles in a given session. A max of 3 profiles can be viewed a a time.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkResponse getSessionProfileObservatoryLink(ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkRequest.class, baseUrl, "/v0/sessions/observatory-link/{session_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "getProfileObservatoryLinkRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkResponse res = new ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkResponse(contentType, httpRes.statusCode()) {{
            getProfileObservatoryLinkResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.GetProfileObservatoryLinkResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.GetProfileObservatoryLinkResponse.class);
                res.getProfileObservatoryLinkResponse = out;
            }
        }

        return res;
    }
}