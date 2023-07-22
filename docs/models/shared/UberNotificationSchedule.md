# UberNotificationSchedule


Combination of all possible schedule types, a hacky workaround for bugs in generated clients that use polymorphic types.
There are three types of schedules. Weekly, Daily, and Individual. You need to set the right fields for each one.

Weekly:
    enabled, cadence=WEEKLY, dayOfWeek, local24HourOfDay, localMinuteOfHour, localTimezone
    
Daily:
    enabled, cadence=DAILY, local24HourOfDay, localMinuteOfHour, localTimezone
    
Individual:
    enabled, cadence=INDIVIDUAL



## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `cadence`                                                                             | [NotificationSqsMessageCadence](../../models/shared/NotificationSqsMessageCadence.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `dayOfWeek`                                                                           | [NotificationSettingsDay](../../models/shared/NotificationSettingsDay.md)             | :heavy_minus_sign:                                                                    | N/A                                                                                   |
| `enabled`                                                                             | *Boolean*                                                                             | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `local24HourOfDay`                                                                    | *Integer*                                                                             | :heavy_minus_sign:                                                                    | N/A                                                                                   |
| `localMinuteOfHour`                                                                   | *Integer*                                                                             | :heavy_minus_sign:                                                                    | N/A                                                                                   |
| `localTimezone`                                                                       | *String*                                                                              | :heavy_minus_sign:                                                                    | N/A                                                                                   |