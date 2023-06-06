/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SubscriptionTier - Organization's subscription tier. Should be PAID for real customers
 */
public enum SubscriptionTier {
    FREE("FREE"),
    PAID("PAID"),
    AWS_MARKETPLACE("AWS_MARKETPLACE"),
    SUBSCRIPTION("SUBSCRIPTION");

    @JsonValue
    public final String value;

    private SubscriptionTier(String value) {
        this.value = value;
    }
}
