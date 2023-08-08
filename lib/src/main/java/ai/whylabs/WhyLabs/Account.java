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

public class Account {
	
	private SDKConfiguration sdkConfiguration;

	public Account(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create an account user
     * Create an account user
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse createAccountUser(ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest request, ai.whylabs.WhyLabs.models.operations.CreateAccountUserSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest.class, baseUrl, "/v0/accounts/org/{org_id}/users", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse res = new ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse(contentType, httpRes.statusCode()) {{
            accountUser = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.AccountUser out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.AccountUser.class);
                res.accountUser = out;
            }
        }

        return res;
    }

    /**
     * Delete account user
     * Delete an account user's details
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.DeleteAccountUserResponse deleteAccountUser(ai.whylabs.WhyLabs.models.operations.DeleteAccountUserRequest request, ai.whylabs.WhyLabs.models.operations.DeleteAccountUserSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.DeleteAccountUserRequest.class, baseUrl, "/v0/accounts/org/{org_id}/users", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.DeleteAccountUserResponse res = new ai.whylabs.WhyLabs.models.operations.DeleteAccountUserResponse(contentType, httpRes.statusCode()) {{
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
     * Get memberships in an account
     * Get memberships in the account organization and any managed organizations
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsResponse getAccountMemberships(ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsRequest request, ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsRequest.class, baseUrl, "/v0/accounts/org/{org_id}/memberships", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ai.whylabs.WhyLabs.utils.Utils.getQueryParams(ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsResponse res = new ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsResponse(contentType, httpRes.statusCode()) {{
            getAccountMembershipsResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.GetAccountMembershipsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.GetAccountMembershipsResponse.class);
                res.getAccountMembershipsResponse = out;
            }
        }

        return res;
    }

    /**
     * Get users in an account
     * Get users in the account organization and any managed organizations
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetAccountUsersResponse getAccountUsers(ai.whylabs.WhyLabs.models.operations.GetAccountUsersRequest request, ai.whylabs.WhyLabs.models.operations.GetAccountUsersSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.GetAccountUsersRequest.class, baseUrl, "/v0/accounts/org/{org_id}/users", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ai.whylabs.WhyLabs.utils.Utils.getQueryParams(ai.whylabs.WhyLabs.models.operations.GetAccountUsersRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetAccountUsersResponse res = new ai.whylabs.WhyLabs.models.operations.GetAccountUsersResponse(contentType, httpRes.statusCode()) {{
            getAccountUsersResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.GetAccountUsersResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.GetAccountUsersResponse.class);
                res.getAccountUsersResponse = out;
            }
        }

        return res;
    }

    /**
     * Get memberships for a specific org and role
     * Get memberships in a specific organization and role within the account
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsResponse getOrgRoleMemberships(ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsRequest request, ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsRequest.class, baseUrl, "/v0/accounts/org/{org_id}/memberships/{managed_org_id}/{role}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsResponse res = new ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsResponse(contentType, httpRes.statusCode()) {{
            getAccountMembershipsResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.GetAccountMembershipsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.GetAccountMembershipsResponse.class);
                res.getAccountMembershipsResponse = out;
            }
        }

        return res;
    }

    /**
     * Add or delete memberships in a specific role and managed organization
     * Add or delete all of the memberships in a specific role and managed organization
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsResponse patchOrgRoleMemberships(ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsRequest request, ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsRequest.class, baseUrl, "/v0/accounts/org/{org_id}/memberships/{managed_org_id}/{role}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsResponse res = new ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsResponse(contentType, httpRes.statusCode()) {{
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
     * Replace the memberships in a specific role and managed organization
     * Replace all of the memberships in a specific role and managed organization
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsResponse putOrgRoleMemberships(ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsRequest request, ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsRequest.class, baseUrl, "/v0/accounts/org/{org_id}/memberships/{managed_org_id}/{role}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsResponse res = new ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsResponse(contentType, httpRes.statusCode()) {{
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
     * Update account user
     * Update an account user's details
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.UpdateAccountUserResponse updateAccountUser(ai.whylabs.WhyLabs.models.operations.UpdateAccountUserRequest request, ai.whylabs.WhyLabs.models.operations.UpdateAccountUserSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.UpdateAccountUserRequest.class, baseUrl, "/v0/accounts/org/{org_id}/users/{user_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = ai.whylabs.WhyLabs.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.UpdateAccountUserResponse res = new ai.whylabs.WhyLabs.models.operations.UpdateAccountUserResponse(contentType, httpRes.statusCode()) {{
            accountUser = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.AccountUser out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.AccountUser.class);
                res.accountUser = out;
            }
        }

        return res;
    }
}