/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.operations;

import ai.whylabs.WhyLabs.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PartiallyUpdateOrganizationRequest {
    /**
     * Domain associated with this organization
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=domain")
    public String domain;

    public PartiallyUpdateOrganizationRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    /**
     * Email domains associated with this organization, as a comma separated list
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=email_domains")
    public String emailDomains;

    public PartiallyUpdateOrganizationRequest withEmailDomains(String emailDomains) {
        this.emailDomains = emailDomains;
        return this;
    }
    
    /**
     * The name of the organization
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=name")
    public String name;

    public PartiallyUpdateOrganizationRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Email address that should be used for notifications for this organization
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=notification_email_address")
    public String notificationEmailAddress;

    public PartiallyUpdateOrganizationRequest withNotificationEmailAddress(String notificationEmailAddress) {
        this.notificationEmailAddress = notificationEmailAddress;
        return this;
    }
    
    /**
     * Url that users of this organization will be redirected to in some cases (such as via Siren notifications). NOTE: should NOT be followed by a trailing slash!
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=observatory_url")
    public String observatoryUrl;

    public PartiallyUpdateOrganizationRequest withObservatoryUrl(String observatoryUrl) {
        this.observatoryUrl = observatoryUrl;
        return this;
    }
    
    /**
     * The unique ID of an organization. If an organization with this ID does not exist, this method will throw an exception.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_id")
    public String orgId;

    public PartiallyUpdateOrganizationRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pager_duty_key")
    public String pagerDutyKey;

    public PartiallyUpdateOrganizationRequest withPagerDutyKey(String pagerDutyKey) {
        this.pagerDutyKey = pagerDutyKey;
        return this;
    }
    
    /**
     * Slack Webhook that should be used for notifications for this organization
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=slack_webhook")
    public String slackWebhook;

    public PartiallyUpdateOrganizationRequest withSlackWebhook(String slackWebhook) {
        this.slackWebhook = slackWebhook;
        return this;
    }
    
    /**
     * Organization's subscription tier. Should be PAID for real customers
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=subscription_tier")
    public ai.whylabs.WhyLabs.models.shared.SubscriptionTier subscriptionTier;

    public PartiallyUpdateOrganizationRequest withSubscriptionTier(ai.whylabs.WhyLabs.models.shared.SubscriptionTier subscriptionTier) {
        this.subscriptionTier = subscriptionTier;
        return this;
    }
    
    public PartiallyUpdateOrganizationRequest(@JsonProperty("org_id") String orgId) {
        this.orgId = orgId;
  }
}
