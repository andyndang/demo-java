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

public class DatasetProfile {
	
	private SDKConfiguration sdkConfiguration;

	public DatasetProfile(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Returns data needed to uploading the reference profile
     * Returns data needed to upload the reference profile. Supports uploading segmented reference profiles. 
     *             If segments are omitted, provides data needed to upload a single reference profile. 
     *             This replaces the deprecated LogReference operation.
     *         
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileResponse createReferenceProfile(ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset-profiles/models/{dataset_id}/reference-profile", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "createReferenceProfileRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileResponse res = new ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileResponse(contentType, httpRes.statusCode()) {{
            createReferenceProfileResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.CreateReferenceProfileResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.CreateReferenceProfileResponse.class);
                res.createReferenceProfileResponse = out;
            }
        }

        return res;
    }

    /**
     * Deletes a set of analyzer results
     * Deletes a set of analyzer results. Returns false if scheduling deletion encountered some error.
     * 
     *         
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsResponse deleteAnalyzerResults(ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset-profiles/models/{dataset_id}/analyzer-results", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ai.whylabs.WhyLabs.utils.Utils.getQueryParams(ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsResponse res = new ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsResponse(contentType, httpRes.statusCode()) {{
            deleteAnalyzerResultsResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.DeleteAnalyzerResultsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.DeleteAnalyzerResultsResponse.class);
                res.deleteAnalyzerResultsResponse = out;
            }
        }

        return res;
    }

    /**
     * Deletes a set of dataset profiles
     * Deletes a set of dataset profiles. Returns false if scheduling deletion encountered some error.
     * 
     *         
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesResponse deleteDatasetProfiles(ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset-profiles/models/{dataset_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ai.whylabs.WhyLabs.utils.Utils.getQueryParams(ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesResponse res = new ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesResponse(contentType, httpRes.statusCode()) {{
            deleteDatasetProfilesResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.DeleteDatasetProfilesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.DeleteDatasetProfilesResponse.class);
                res.deleteDatasetProfilesResponse = out;
            }
        }

        return res;
    }

    /**
     * Delete a single reference profile
     * Delete a a Reference Profile. Returns false if the deletion encountered some error.
     * 
     *         
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileResponse deleteReferenceProfile(ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset-profiles/models/{model_id}/reference-profiles/{reference_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileResponse res = new ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileResponse(contentType, httpRes.statusCode()) {{
            deleteReferenceProfileDefaultApplicationJSONBoolean = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Boolean out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Boolean.class);
                res.deleteReferenceProfileDefaultApplicationJSONBoolean = out;
            }
        }

        return res;
    }

    /**
     * Returns a list for profile traces matching a trace id
     * Returns a list of profile traces matching a trace id
     * 
     *         
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetProfileTracesResponse getProfileTraces(ai.whylabs.WhyLabs.models.operations.GetProfileTracesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.GetProfileTracesRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset-profiles/models/{dataset_id}/trace/{trace_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ai.whylabs.WhyLabs.utils.Utils.getQueryParams(ai.whylabs.WhyLabs.models.operations.GetProfileTracesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetProfileTracesResponse res = new ai.whylabs.WhyLabs.models.operations.GetProfileTracesResponse(contentType, httpRes.statusCode()) {{
            profileTracesResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.ProfileTracesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.ProfileTracesResponse.class);
                res.profileTracesResponse = out;
            }
        }

        return res;
    }

    /**
     * Returns a single reference profile
     * Returns a Reference Profile.
     * 
     *         
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetReferenceProfileResponse getReferenceProfile(ai.whylabs.WhyLabs.models.operations.GetReferenceProfileRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.GetReferenceProfileRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset-profiles/models/{model_id}/reference-profiles/{reference_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetReferenceProfileResponse res = new ai.whylabs.WhyLabs.models.operations.GetReferenceProfileResponse(contentType, httpRes.statusCode()) {{
            referenceProfileItemResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.ReferenceProfileItemResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.ReferenceProfileItemResponse.class);
                res.referenceProfileItemResponse = out;
            }
        }

        return res;
    }

    /**
     * Hides a list of segments
     * Returns a list of segments that were hidden for a dataset.
     * 
     *         
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.HideSegmentsResponse hideSegments(ai.whylabs.WhyLabs.models.operations.HideSegmentsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.HideSegmentsRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset-profiles/models/{dataset_id}/segments/hide", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "segmentsListRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.HideSegmentsResponse res = new ai.whylabs.WhyLabs.models.operations.HideSegmentsResponse(contentType, httpRes.statusCode()) {{
            response = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.Response out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.Response.class);
                res.response = out;
            }
        }

        return res;
    }

    /**
     * Returns a list for reference profiles
     * Returns a list of Reference Profiles.
     * 
     *         
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesResponse listReferenceProfiles(ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset-profiles/models/{model_id}/reference-profiles", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ai.whylabs.WhyLabs.utils.Utils.getQueryParams(ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesResponse res = new ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesResponse(contentType, httpRes.statusCode()) {{
            referenceProfileItemResponses = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.ReferenceProfileItemResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.ReferenceProfileItemResponse[].class);
                res.referenceProfileItemResponses = out;
            }
        }

        return res;
    }

    /**
     * Returns a list of segments
     * Returns a list of segments for the dataset.
     * 
     *         
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.ListSegmentsResponse listSegments(ai.whylabs.WhyLabs.models.operations.ListSegmentsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.ListSegmentsRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset-profiles/models/{model_id}/segments", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.ListSegmentsResponse res = new ai.whylabs.WhyLabs.models.operations.ListSegmentsResponse(contentType, httpRes.statusCode()) {{
            segmentListResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.SegmentListResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.SegmentListResponse.class);
                res.segmentListResponse = out;
            }
        }

        return res;
    }
}