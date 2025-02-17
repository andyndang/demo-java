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

public class Provision {
	
	private SDKConfiguration sdkConfiguration;

	public Provision(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create resources for a new user coming from AWS Marketplace
     * Create resources for a new user coming from AWS Marketplace
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserResponse provisionAWSMarketplaceNewUser(ai.whylabs.WhyLabs.models.shared.ProvisionNewMarketplaceUserRequest request, ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(baseUrl, "/v0/provision/marketplace/aws/new-user");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserResponse res = new ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserResponse(contentType, httpRes.statusCode()) {{
            provisionNewAWSMarketplaceUserResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.ProvisionNewAWSMarketplaceUserResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.ProvisionNewAWSMarketplaceUserResponse.class);
                res.provisionNewAWSMarketplaceUserResponse = out;
            }
        }

        return res;
    }

    /**
     * Create resources for a new user coming from Databricks
     * Create resources for a new user coming from Databricks
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionResponse provisionDatabricksConnection(ai.whylabs.WhyLabs.models.shared.ProvisionDatabricksConnectionRequest request, ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(baseUrl, "/v0/provision/connect/databricks");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionResponse res = new ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionResponse(contentType, httpRes.statusCode()) {{
            provisionDatabricksConnectionResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.ProvisionDatabricksConnectionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.ProvisionDatabricksConnectionResponse.class);
                res.provisionDatabricksConnectionResponse = out;
            }
        }

        return res;
    }

    /**
     * Create the resources that a new user needs to use WhyLabs via the website.
     * Create the resources that a new user needs to use WhyLabs via the website.
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.ProvisionNewUserResponse provisionNewUser(ai.whylabs.WhyLabs.models.shared.ProvisionNewUserRequest request, ai.whylabs.WhyLabs.models.operations.ProvisionNewUserSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(baseUrl, "/v0/provision/new-user");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.ProvisionNewUserResponse res = new ai.whylabs.WhyLabs.models.operations.ProvisionNewUserResponse(contentType, httpRes.statusCode()) {{
            provisionNewUserResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.ProvisionNewUserResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.ProvisionNewUserResponse.class);
                res.provisionNewUserResponse = out;
            }
        }

        return res;
    }

    /**
     * Register databricks metadata, temporarily storing it against a UUID so that it can be used to provision a databricks connection after email authentication
     * Register databricks metadata, temporarily storing it against a UUID so that it can be used to provision a databricks connection after email authentication
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionResponse registerDatabricksConnection(ai.whylabs.WhyLabs.models.shared.RegisterDatabricksConnectionRequest request, ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(baseUrl, "/v0/provision/connect/databricks/staged");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionResponse res = new ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionResponse(contentType, httpRes.statusCode()) {{
            registerDatabricksConnectionResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.RegisterDatabricksConnectionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.RegisterDatabricksConnectionResponse.class);
                res.registerDatabricksConnectionResponse = out;
            }
        }

        return res;
    }
}