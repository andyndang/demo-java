# notificationSettings

### Available Operations

* [addNotificationAction](#addnotificationaction) - Add new notification action
* [deleteNotificationAction](#deletenotificationaction) - Delete notification action
* [disableNotificationAction](#disablenotificationaction) - Disable notification action
* [enableNotificationAction](#enablenotificationaction) - Enable notification action
* [getNotificationAction](#getnotificationaction) - Get notification action for id
* [getNotificationSettings](#getnotificationsettings) - Get notification settings for an org
* [listNotificationActions](#listnotificationactions) - List notification actions for an org
* [putNotificationAction](#putnotificationaction) - Add new notification action
* [testNotificationAction](#testnotificationaction) - Test a notification action
* [updateNotificationAction](#updatenotificationaction) - Update notification action
* [updateNotificationSettings](#updatenotificationsettings) - Update notification settings for an org
* [getEmailNotificationActionPayload](#getemailnotificationactionpayload) - Get dummy notification action payload
* [getPagerDutyNotificationActionPayload](#getpagerdutynotificationactionpayload) - Get dummy notification action payload
* [getSlackNotificationActionPayload](#getslacknotificationactionpayload) - Get dummy notification action payload

## addNotificationAction

Add new notification action

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.AddNotificationActionRequest;
import ai.whylabs.WhyLabs.models.operations.AddNotificationActionResponse;
import ai.whylabs.WhyLabs.models.operations.AddNotificationActionSecurity;
import ai.whylabs.WhyLabs.models.shared.ActionType;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            AddNotificationActionRequest req = new AddNotificationActionRequest("reiciendis", "user-action", "org-123", ActionType.PAGER_DUTY);            

            AddNotificationActionResponse res = sdk.notificationSettings.addNotificationAction(req, new AddNotificationActionSecurity("ad") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteNotificationAction

Delete notification action

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionResponse;
import ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteNotificationActionRequest req = new DeleteNotificationActionRequest("user-action", "org-123");            

            DeleteNotificationActionResponse res = sdk.notificationSettings.deleteNotificationAction(req, new DeleteNotificationActionSecurity("eum") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## disableNotificationAction

Disable notification action

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DisableNotificationActionRequest;
import ai.whylabs.WhyLabs.models.operations.DisableNotificationActionResponse;
import ai.whylabs.WhyLabs.models.operations.DisableNotificationActionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DisableNotificationActionRequest req = new DisableNotificationActionRequest("user-action", "org-123");            

            DisableNotificationActionResponse res = sdk.notificationSettings.disableNotificationAction(req, new DisableNotificationActionSecurity("dolor") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## enableNotificationAction

Enable notification action

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.EnableNotificationActionRequest;
import ai.whylabs.WhyLabs.models.operations.EnableNotificationActionResponse;
import ai.whylabs.WhyLabs.models.operations.EnableNotificationActionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            EnableNotificationActionRequest req = new EnableNotificationActionRequest("user-action", "org-123");            

            EnableNotificationActionResponse res = sdk.notificationSettings.enableNotificationAction(req, new EnableNotificationActionSecurity("necessitatibus") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getNotificationAction

Get notification action for id

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetNotificationActionRequest;
import ai.whylabs.WhyLabs.models.operations.GetNotificationActionResponse;
import ai.whylabs.WhyLabs.models.operations.GetNotificationActionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetNotificationActionRequest req = new GetNotificationActionRequest("user-action", "org-123");            

            GetNotificationActionResponse res = sdk.notificationSettings.getNotificationAction(req, new GetNotificationActionSecurity("odit") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getNotificationSettings

Get notification settings for an org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsRequest;
import ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsResponse;
import ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetNotificationSettingsRequest req = new GetNotificationSettingsRequest("nemo");            

            GetNotificationSettingsResponse res = sdk.notificationSettings.getNotificationSettings(req, new GetNotificationSettingsSecurity("quasi") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listNotificationActions

Get notification actions for an org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListNotificationActionsRequest;
import ai.whylabs.WhyLabs.models.operations.ListNotificationActionsResponse;
import ai.whylabs.WhyLabs.models.operations.ListNotificationActionsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListNotificationActionsRequest req = new ListNotificationActionsRequest("org-123");            

            ListNotificationActionsResponse res = sdk.notificationSettings.listNotificationActions(req, new ListNotificationActionsSecurity("iure") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## putNotificationAction

Add new notification action

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutNotificationActionRequest;
import ai.whylabs.WhyLabs.models.operations.PutNotificationActionResponse;
import ai.whylabs.WhyLabs.models.operations.PutNotificationActionSecurity;
import ai.whylabs.WhyLabs.models.shared.ActionType;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutNotificationActionRequest req = new PutNotificationActionRequest("doloribus", "user-action", "org-123", ActionType.NA);            

            PutNotificationActionResponse res = sdk.notificationSettings.putNotificationAction(req, new PutNotificationActionSecurity("eius") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## testNotificationAction

Test a notification action

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.TestNotificationActionRequest;
import ai.whylabs.WhyLabs.models.operations.TestNotificationActionResponse;
import ai.whylabs.WhyLabs.models.operations.TestNotificationActionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            TestNotificationActionRequest req = new TestNotificationActionRequest("user-action", "org-123");            

            TestNotificationActionResponse res = sdk.notificationSettings.testNotificationAction(req, new TestNotificationActionSecurity("maxime") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## updateNotificationAction

Update notification action

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionResponse;
import ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionSecurity;
import ai.whylabs.WhyLabs.models.shared.ActionType;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            UpdateNotificationActionRequest req = new UpdateNotificationActionRequest("deleniti", "user-action", "org-123", ActionType.PAGER_DUTY);            

            UpdateNotificationActionResponse res = sdk.notificationSettings.updateNotificationAction(req, new UpdateNotificationActionSecurity("in") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## updateNotificationSettings

Update notification settings for an org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsResponse;
import ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsSecurity;
import ai.whylabs.WhyLabs.models.shared.NotificationSettings;
import ai.whylabs.WhyLabs.models.shared.NotificationSettingsDay;
import ai.whylabs.WhyLabs.models.shared.NotificationSqsMessageCadence;
import ai.whylabs.WhyLabs.models.shared.UberNotificationSchedule;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            UpdateNotificationSettingsRequest req = new UpdateNotificationSettingsRequest(                new NotificationSettings() {{
                                emailSettings = new UberNotificationSchedule(NotificationSqsMessageCadence.HOURLY, false) {{
                                    dayOfWeek = NotificationSettingsDay.SUNDAY;
                                    local24HourOfDay = 919483;
                                    localMinuteOfHour = 352312;
                                    localTimezone = "expedita";
                                }};;
                                pagerDutySettings = new UberNotificationSchedule(NotificationSqsMessageCadence.DAILY, false) {{
                                    dayOfWeek = NotificationSettingsDay.SATURDAY;
                                    local24HourOfDay = 841140;
                                    localMinuteOfHour = 149448;
                                    localTimezone = "saepe";
                                }};;
                                slackSettings = new UberNotificationSchedule(NotificationSqsMessageCadence.INDIVIDUAL, false) {{
                                    dayOfWeek = NotificationSettingsDay.SUNDAY;
                                    local24HourOfDay = 162493;
                                    localMinuteOfHour = 508315;
                                    localTimezone = "natus";
                                }};;
                            }};, "magni");            

            UpdateNotificationSettingsResponse res = sdk.notificationSettings.updateNotificationSettings(req, new UpdateNotificationSettingsSecurity("sunt") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getEmailNotificationActionPayload

Get dummy notification action payload

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetEmailNotificationActionPayloadResponse;
import ai.whylabs.WhyLabs.models.operations.GetEmailNotificationActionPayloadSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetEmailNotificationActionPayloadResponse res = sdk.notificationSettings.getEmailNotificationActionPayload(new GetEmailNotificationActionPayloadSecurity("quo") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getPagerDutyNotificationActionPayload

Get dummy notification action payload

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetPagerDutyNotificationActionPayloadResponse;
import ai.whylabs.WhyLabs.models.operations.GetPagerDutyNotificationActionPayloadSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetPagerDutyNotificationActionPayloadResponse res = sdk.notificationSettings.getPagerDutyNotificationActionPayload(new GetPagerDutyNotificationActionPayloadSecurity("illum") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getSlackNotificationActionPayload

Get dummy notification action payload

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetSlackNotificationActionPayloadResponse;
import ai.whylabs.WhyLabs.models.operations.GetSlackNotificationActionPayloadSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetSlackNotificationActionPayloadResponse res = sdk.notificationSettings.getSlackNotificationActionPayload(new GetSlackNotificationActionPayloadSecurity("pariatur") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
