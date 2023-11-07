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
import java.time.OffsetDateTime;

public class NotificationSettings {
	
	private SDKConfiguration sdkConfiguration;

	public NotificationSettings(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Add new notification action
     * Add new notification action
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.AddNotificationActionResponse addNotificationAction(ai.whylabs.WhyLabs.models.operations.AddNotificationActionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.AddNotificationActionRequest.class, baseUrl, "/v0/notification-settings/{org_id}/actions/{type}/{action_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.AddNotificationActionResponse res = new ai.whylabs.WhyLabs.models.operations.AddNotificationActionResponse(contentType, httpRes.statusCode()) {{
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
     * Delete notification action
     * Delete notification action
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionResponse deleteNotificationAction(ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionRequest.class, baseUrl, "/v0/notification-settings/{org_id}/actions/{action_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionResponse res = new ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionResponse(contentType, httpRes.statusCode()) {{
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
     * Disable notification action
     * Disable notification action
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.DisableNotificationActionResponse disableNotificationAction(ai.whylabs.WhyLabs.models.operations.DisableNotificationActionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.DisableNotificationActionRequest.class, baseUrl, "/v0/notification-settings/{org_id}/actions/{action_id}/disable", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.DisableNotificationActionResponse res = new ai.whylabs.WhyLabs.models.operations.DisableNotificationActionResponse(contentType, httpRes.statusCode()) {{
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
     * Enable notification action
     * Enable notification action
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.EnableNotificationActionResponse enableNotificationAction(ai.whylabs.WhyLabs.models.operations.EnableNotificationActionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.EnableNotificationActionRequest.class, baseUrl, "/v0/notification-settings/{org_id}/actions/{action_id}/enable", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.EnableNotificationActionResponse res = new ai.whylabs.WhyLabs.models.operations.EnableNotificationActionResponse(contentType, httpRes.statusCode()) {{
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
     * Get notification action for id
     * Get notification action for id
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetNotificationActionResponse getNotificationAction(ai.whylabs.WhyLabs.models.operations.GetNotificationActionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.GetNotificationActionRequest.class, baseUrl, "/v0/notification-settings/{org_id}/actions/{action_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetNotificationActionResponse res = new ai.whylabs.WhyLabs.models.operations.GetNotificationActionResponse(contentType, httpRes.statusCode()) {{
            notificationAction = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.NotificationAction out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.NotificationAction.class);
                res.notificationAction = out;
            }
        }

        return res;
    }

    /**
     * Get notification settings for an org
     * Get notification settings for an org
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsResponse getNotificationSettings(ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsRequest.class, baseUrl, "/v0/notification-settings/{org_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsResponse res = new ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsResponse(contentType, httpRes.statusCode()) {{
            getNotificationSettingsResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.GetNotificationSettingsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.GetNotificationSettingsResponse.class);
                res.getNotificationSettingsResponse = out;
            }
        }

        return res;
    }

    /**
     * List notification actions for an org
     * Get notification actions for an org
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.ListNotificationActionsResponse listNotificationActions(ai.whylabs.WhyLabs.models.operations.ListNotificationActionsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.ListNotificationActionsRequest.class, baseUrl, "/v0/notification-settings/{org_id}/actions", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.ListNotificationActionsResponse res = new ai.whylabs.WhyLabs.models.operations.ListNotificationActionsResponse(contentType, httpRes.statusCode()) {{
            classes = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.NotificationAction[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.NotificationAction[].class);
                res.classes = out;
            }
        }

        return res;
    }

    /**
     * Add new notification action
     * Add new notification action
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.PutNotificationActionResponse putNotificationAction(ai.whylabs.WhyLabs.models.operations.PutNotificationActionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.PutNotificationActionRequest.class, baseUrl, "/v0/notification-settings/{org_id}/actions/{type}/{action_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.PutNotificationActionResponse res = new ai.whylabs.WhyLabs.models.operations.PutNotificationActionResponse(contentType, httpRes.statusCode()) {{
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
     * Test a notification action
     * Test a notification action
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.TestNotificationActionResponse testNotificationAction(ai.whylabs.WhyLabs.models.operations.TestNotificationActionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.TestNotificationActionRequest.class, baseUrl, "/v0/notification-settings/{org_id}/actions/{action_id}/test", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.TestNotificationActionResponse res = new ai.whylabs.WhyLabs.models.operations.TestNotificationActionResponse(contentType, httpRes.statusCode()) {{
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
     * Update notification action
     * Update notification action
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionResponse updateNotificationAction(ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionRequest.class, baseUrl, "/v0/notification-settings/{org_id}/actions/{type}/{action_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionResponse res = new ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionResponse(contentType, httpRes.statusCode()) {{
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
     * Update notification settings for an org
     * Update notification settings for an org
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsResponse updateNotificationSettings(ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsRequest.class, baseUrl, "/v0/notification-settings/{org_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ai.whylabs.WhyLabs.utils.Utils.serializeRequestBody(request, "notificationSettings", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsResponse res = new ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsResponse(contentType, httpRes.statusCode()) {{
            notificationSettings = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.NotificationSettings out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.NotificationSettings.class);
                res.notificationSettings = out;
            }
        }

        return res;
    }

    /**
     * Get dummy notification action payload
     * Get dummy notification action payload
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetEmailNotificationActionPayloadResponse getEmailNotificationActionPayload() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(baseUrl, "/v0/notification-settings/actions/email/payload");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetEmailNotificationActionPayloadResponse res = new ai.whylabs.WhyLabs.models.operations.GetEmailNotificationActionPayloadResponse(contentType, httpRes.statusCode()) {{
            emailNotificationAction = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.EmailNotificationAction out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.EmailNotificationAction.class);
                res.emailNotificationAction = out;
            }
        }

        return res;
    }

    /**
     * Get dummy notification action payload
     * Get dummy notification action payload
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetPagerDutyNotificationActionPayloadResponse getPagerDutyNotificationActionPayload() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(baseUrl, "/v0/notification-settings/actions/pagerduty/payload");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetPagerDutyNotificationActionPayloadResponse res = new ai.whylabs.WhyLabs.models.operations.GetPagerDutyNotificationActionPayloadResponse(contentType, httpRes.statusCode()) {{
            pagerDutyNotificationAction = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.PagerDutyNotificationAction out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.PagerDutyNotificationAction.class);
                res.pagerDutyNotificationAction = out;
            }
        }

        return res;
    }

    /**
     * Get dummy notification action payload
     * Get dummy notification action payload
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ai.whylabs.WhyLabs.models.operations.GetSlackNotificationActionPayloadResponse getSlackNotificationActionPayload() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = ai.whylabs.WhyLabs.utils.Utils.generateURL(baseUrl, "/v0/notification-settings/actions/slack/payload");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ai.whylabs.WhyLabs.models.operations.GetSlackNotificationActionPayloadResponse res = new ai.whylabs.WhyLabs.models.operations.GetSlackNotificationActionPayloadResponse(contentType, httpRes.statusCode()) {{
            slackNotificationAction = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (ai.whylabs.WhyLabs.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ai.whylabs.WhyLabs.models.shared.SlackNotificationAction out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ai.whylabs.WhyLabs.models.shared.SlackNotificationAction.class);
                res.slackNotificationAction = out;
            }
        }

        return res;
    }
}