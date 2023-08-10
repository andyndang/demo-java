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

            AddNotificationActionRequest req = new AddNotificationActionRequest("asperiores", "user-action", "org-123", ActionType.NA);            

            AddNotificationActionResponse res = sdk.notificationSettings.addNotificationAction(req, new AddNotificationActionSecurity("modi") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.AddNotificationActionRequest](../../models/operations/AddNotificationActionRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.AddNotificationActionSecurity](../../models/operations/AddNotificationActionSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.AddNotificationActionResponse](../../models/operations/AddNotificationActionResponse.md)**


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

            DeleteNotificationActionResponse res = sdk.notificationSettings.deleteNotificationAction(req, new DeleteNotificationActionSecurity("iste") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionRequest](../../models/operations/DeleteNotificationActionRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionSecurity](../../models/operations/DeleteNotificationActionSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionResponse](../../models/operations/DeleteNotificationActionResponse.md)**


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

            DisableNotificationActionResponse res = sdk.notificationSettings.disableNotificationAction(req, new DisableNotificationActionSecurity("dolorum") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [ai.whylabs.WhyLabs.models.operations.DisableNotificationActionRequest](../../models/operations/DisableNotificationActionRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [ai.whylabs.WhyLabs.models.operations.DisableNotificationActionSecurity](../../models/operations/DisableNotificationActionSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[ai.whylabs.WhyLabs.models.operations.DisableNotificationActionResponse](../../models/operations/DisableNotificationActionResponse.md)**


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

            EnableNotificationActionResponse res = sdk.notificationSettings.enableNotificationAction(req, new EnableNotificationActionSecurity("deleniti") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.EnableNotificationActionRequest](../../models/operations/EnableNotificationActionRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [ai.whylabs.WhyLabs.models.operations.EnableNotificationActionSecurity](../../models/operations/EnableNotificationActionSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.EnableNotificationActionResponse](../../models/operations/EnableNotificationActionResponse.md)**


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

            GetNotificationActionResponse res = sdk.notificationSettings.getNotificationAction(req, new GetNotificationActionSecurity("pariatur") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GetNotificationActionRequest](../../models/operations/GetNotificationActionRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.GetNotificationActionSecurity](../../models/operations/GetNotificationActionSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetNotificationActionResponse](../../models/operations/GetNotificationActionResponse.md)**


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

            GetNotificationSettingsRequest req = new GetNotificationSettingsRequest("provident");            

            GetNotificationSettingsResponse res = sdk.notificationSettings.getNotificationSettings(req, new GetNotificationSettingsSecurity("nobis") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsRequest](../../models/operations/GetNotificationSettingsRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsSecurity](../../models/operations/GetNotificationSettingsSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsResponse](../../models/operations/GetNotificationSettingsResponse.md)**


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

            ListNotificationActionsResponse res = sdk.notificationSettings.listNotificationActions(req, new ListNotificationActionsSecurity("libero") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.ListNotificationActionsRequest](../../models/operations/ListNotificationActionsRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [ai.whylabs.WhyLabs.models.operations.ListNotificationActionsSecurity](../../models/operations/ListNotificationActionsSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListNotificationActionsResponse](../../models/operations/ListNotificationActionsResponse.md)**


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

            PutNotificationActionRequest req = new PutNotificationActionRequest("delectus", "user-action", "org-123", ActionType.SLACK);            

            PutNotificationActionResponse res = sdk.notificationSettings.putNotificationAction(req, new PutNotificationActionSecurity("quos") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.PutNotificationActionRequest](../../models/operations/PutNotificationActionRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.PutNotificationActionSecurity](../../models/operations/PutNotificationActionSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutNotificationActionResponse](../../models/operations/PutNotificationActionResponse.md)**


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

            TestNotificationActionResponse res = sdk.notificationSettings.testNotificationAction(req, new TestNotificationActionSecurity("aliquid") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [ai.whylabs.WhyLabs.models.operations.TestNotificationActionRequest](../../models/operations/TestNotificationActionRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [ai.whylabs.WhyLabs.models.operations.TestNotificationActionSecurity](../../models/operations/TestNotificationActionSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[ai.whylabs.WhyLabs.models.operations.TestNotificationActionResponse](../../models/operations/TestNotificationActionResponse.md)**


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

            UpdateNotificationActionRequest req = new UpdateNotificationActionRequest("dolorem", "user-action", "org-123", ActionType.EMAIL);            

            UpdateNotificationActionResponse res = sdk.notificationSettings.updateNotificationAction(req, new UpdateNotificationActionSecurity("dolor") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionRequest](../../models/operations/UpdateNotificationActionRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionSecurity](../../models/operations/UpdateNotificationActionSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionResponse](../../models/operations/UpdateNotificationActionResponse.md)**


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
                                    dayOfWeek = NotificationSettingsDay.MONDAY;
                                    local24HourOfDay = 944373;
                                    localMinuteOfHour = 569574;
                                    localTimezone = "cum";
                                }};;
                                pagerDutySettings = new UberNotificationSchedule(NotificationSqsMessageCadence.DAILY, false) {{
                                    dayOfWeek = NotificationSettingsDay.WEDNESDAY;
                                    local24HourOfDay = 970237;
                                    localMinuteOfHour = 227414;
                                    localTimezone = "dolorum";
                                }};;
                                slackSettings = new UberNotificationSchedule(NotificationSqsMessageCadence.DAILY, false) {{
                                    dayOfWeek = NotificationSettingsDay.SUNDAY;
                                    local24HourOfDay = 58029;
                                    localMinuteOfHour = 56418;
                                    localTimezone = "iure";
                                }};;
                            }};, "odio");            

            UpdateNotificationSettingsResponse res = sdk.notificationSettings.updateNotificationSettings(req, new UpdateNotificationSettingsSecurity("quaerat") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsRequest](../../models/operations/UpdateNotificationSettingsRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsSecurity](../../models/operations/UpdateNotificationSettingsSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsResponse](../../models/operations/UpdateNotificationSettingsResponse.md)**


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

            GetEmailNotificationActionPayloadResponse res = sdk.notificationSettings.getEmailNotificationActionPayload(new GetEmailNotificationActionPayloadSecurity("accusamus") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `security`                                                                                                                                             | [ai.whylabs.WhyLabs.models.operations.GetEmailNotificationActionPayloadSecurity](../../models/operations/GetEmailNotificationActionPayloadSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetEmailNotificationActionPayloadResponse](../../models/operations/GetEmailNotificationActionPayloadResponse.md)**


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

            GetPagerDutyNotificationActionPayloadResponse res = sdk.notificationSettings.getPagerDutyNotificationActionPayload(new GetPagerDutyNotificationActionPayloadSecurity("quidem") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.GetPagerDutyNotificationActionPayloadSecurity](../../models/operations/GetPagerDutyNotificationActionPayloadSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetPagerDutyNotificationActionPayloadResponse](../../models/operations/GetPagerDutyNotificationActionPayloadResponse.md)**


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

            GetSlackNotificationActionPayloadResponse res = sdk.notificationSettings.getSlackNotificationActionPayload(new GetSlackNotificationActionPayloadSecurity("voluptatibus") {{
                apiKeyAuth = "";
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

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `security`                                                                                                                                             | [ai.whylabs.WhyLabs.models.operations.GetSlackNotificationActionPayloadSecurity](../../models/operations/GetSlackNotificationActionPayloadSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetSlackNotificationActionPayloadResponse](../../models/operations/GetSlackNotificationActionPayloadResponse.md)**

