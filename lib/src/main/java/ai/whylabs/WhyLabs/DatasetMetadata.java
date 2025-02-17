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

public class DatasetMetadata {
	
	private SDKConfiguration sdkConfiguration;

	public DatasetMetadata(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Delete dataset metadata for the specified dataset
     * Delete dataset metadata for the specified dataset
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataResponse deleteDatasetMetadata(ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataRequest request, ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset/{dataset_id}/metadata", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataResponse res = new ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataResponse(contentType, httpRes.statusCode()) {{
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
     * Get dataset metadata for the specified dataset
     * Get dataset metadata for the specified dataset
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataResponse getDatasetMetadata(ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataRequest request, ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset/{dataset_id}/metadata", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataResponse res = new ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataResponse(contentType, httpRes.statusCode()) {{
            getDatasetMetadataResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.GetDatasetMetadataResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.GetDatasetMetadataResponse.class);
                res.getDatasetMetadataResponse = out;
            }
        }

        return res;
    }

    /**
     * Put dataset metadata for the specified dataset
     * Put dataset metadata for the specified dataset
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataResponse putDatasetMetadata(ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataRequest request, ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataRequest.class, baseUrl, "/v0/organizations/{org_id}/dataset/{dataset_id}/metadata", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "requestBody", "string");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataResponse res = new ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataResponse(contentType, httpRes.statusCode()) {{
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
}