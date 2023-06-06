/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ai.whylabs.WhyLabs.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationSettings - Settings that control how and when notifications are delivered.
 */
public class NotificationSettings {
    /**
     * Combination of all possible schedule types, a hacky workaround for bugs in generated clients that use polymorphic types.
     * There are three types of schedules. Weekly, Daily, and Individual. You need to set the right fields for each one.
     * 
     * Weekly:
     *     enabled, cadence=WEEKLY, dayOfWeek, local24HourOfDay, localMinuteOfHour, localTimezone
     *     
     * Daily:
     *     enabled, cadence=DAILY, local24HourOfDay, localMinuteOfHour, localTimezone
     *     
     * Individual:
     *     enabled, cadence=INDIVIDUAL
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailSettings")
    public UberNotificationSchedule emailSettings;

    public NotificationSettings withEmailSettings(UberNotificationSchedule emailSettings) {
        this.emailSettings = emailSettings;
        return this;
    }
    
    /**
     * Combination of all possible schedule types, a hacky workaround for bugs in generated clients that use polymorphic types.
     * There are three types of schedules. Weekly, Daily, and Individual. You need to set the right fields for each one.
     * 
     * Weekly:
     *     enabled, cadence=WEEKLY, dayOfWeek, local24HourOfDay, localMinuteOfHour, localTimezone
     *     
     * Daily:
     *     enabled, cadence=DAILY, local24HourOfDay, localMinuteOfHour, localTimezone
     *     
     * Individual:
     *     enabled, cadence=INDIVIDUAL
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pagerDutySettings")
    public UberNotificationSchedule pagerDutySettings;

    public NotificationSettings withPagerDutySettings(UberNotificationSchedule pagerDutySettings) {
        this.pagerDutySettings = pagerDutySettings;
        return this;
    }
    
    /**
     * Combination of all possible schedule types, a hacky workaround for bugs in generated clients that use polymorphic types.
     * There are three types of schedules. Weekly, Daily, and Individual. You need to set the right fields for each one.
     * 
     * Weekly:
     *     enabled, cadence=WEEKLY, dayOfWeek, local24HourOfDay, localMinuteOfHour, localTimezone
     *     
     * Daily:
     *     enabled, cadence=DAILY, local24HourOfDay, localMinuteOfHour, localTimezone
     *     
     * Individual:
     *     enabled, cadence=INDIVIDUAL
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("slackSettings")
    public UberNotificationSchedule slackSettings;

    public NotificationSettings withSlackSettings(UberNotificationSchedule slackSettings) {
        this.slackSettings = slackSettings;
        return this;
    }
    
    public NotificationSettings(){}
}
