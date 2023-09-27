# NotificationSettings
(*notificationSettings*)

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
import ai.whylabs.WhyLabs.models.shared.ActionType;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("maiores") {{
                    apiKeyAuth = "";
                }})
                .build();

            AddNotificationActionRequest req = new AddNotificationActionRequest("quidem", "user-action", "org-123", ActionType.SLACK);            

            AddNotificationActionResponse res = sdk.notificationSettings.addNotificationAction(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.AddNotificationActionRequest](../../models/operations/AddNotificationActionRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("voluptate") {{
                    apiKeyAuth = "";
                }})
                .build();

            DeleteNotificationActionRequest req = new DeleteNotificationActionRequest("user-action", "org-123");            

            DeleteNotificationActionResponse res = sdk.notificationSettings.deleteNotificationAction(req);

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
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.DeleteNotificationActionRequest](../../models/operations/DeleteNotificationActionRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("autem") {{
                    apiKeyAuth = "";
                }})
                .build();

            DisableNotificationActionRequest req = new DisableNotificationActionRequest("user-action", "org-123");            

            DisableNotificationActionResponse res = sdk.notificationSettings.disableNotificationAction(req);

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
| `request`                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.DisableNotificationActionRequest](../../models/operations/DisableNotificationActionRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("nam") {{
                    apiKeyAuth = "";
                }})
                .build();

            EnableNotificationActionRequest req = new EnableNotificationActionRequest("user-action", "org-123");            

            EnableNotificationActionResponse res = sdk.notificationSettings.enableNotificationAction(req);

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
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.EnableNotificationActionRequest](../../models/operations/EnableNotificationActionRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("eaque") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetNotificationActionRequest req = new GetNotificationActionRequest("user-action", "org-123");            

            GetNotificationActionResponse res = sdk.notificationSettings.getNotificationAction(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.GetNotificationActionRequest](../../models/operations/GetNotificationActionRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("pariatur") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetNotificationSettingsRequest req = new GetNotificationSettingsRequest("nemo");            

            GetNotificationSettingsResponse res = sdk.notificationSettings.getNotificationSettings(req);

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
| `request`                                                                                                                        | [ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsRequest](../../models/operations/GetNotificationSettingsRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("voluptatibus") {{
                    apiKeyAuth = "";
                }})
                .build();

            ListNotificationActionsRequest req = new ListNotificationActionsRequest("org-123");            

            ListNotificationActionsResponse res = sdk.notificationSettings.listNotificationActions(req);

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
| `request`                                                                                                                        | [ai.whylabs.WhyLabs.models.operations.ListNotificationActionsRequest](../../models/operations/ListNotificationActionsRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


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
import ai.whylabs.WhyLabs.models.shared.ActionType;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("perferendis") {{
                    apiKeyAuth = "";
                }})
                .build();

            PutNotificationActionRequest req = new PutNotificationActionRequest("fugiat", "user-action", "org-123", ActionType.EMAIL);            

            PutNotificationActionResponse res = sdk.notificationSettings.putNotificationAction(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.PutNotificationActionRequest](../../models/operations/PutNotificationActionRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("aut") {{
                    apiKeyAuth = "";
                }})
                .build();

            TestNotificationActionRequest req = new TestNotificationActionRequest("user-action", "org-123");            

            TestNotificationActionResponse res = sdk.notificationSettings.testNotificationAction(req);

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
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.TestNotificationActionRequest](../../models/operations/TestNotificationActionRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


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
import ai.whylabs.WhyLabs.models.shared.ActionType;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("cumque") {{
                    apiKeyAuth = "";
                }})
                .build();

            UpdateNotificationActionRequest req = new UpdateNotificationActionRequest("corporis", "user-action", "org-123", ActionType.NA);            

            UpdateNotificationActionResponse res = sdk.notificationSettings.updateNotificationAction(req);

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
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.UpdateNotificationActionRequest](../../models/operations/UpdateNotificationActionRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


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
import ai.whylabs.WhyLabs.models.shared.NotificationSettings;
import ai.whylabs.WhyLabs.models.shared.NotificationSettingsDay;
import ai.whylabs.WhyLabs.models.shared.NotificationSqsMessageCadence;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.UberNotificationSchedule;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("libero") {{
                    apiKeyAuth = "";
                }})
                .build();

            UpdateNotificationSettingsRequest req = new UpdateNotificationSettingsRequest(                new NotificationSettings() {{
                                emailSettings = new UberNotificationSchedule(NotificationSqsMessageCadence.WEEKLY, false) {{
                                    dayOfWeek = NotificationSettingsDay.MONDAY;
                                    local24HourOfDay = 339404;
                                    localMinuteOfHour = 521037;
                                    localTimezone = "dignissimos";
                                }};;
                                pagerDutySettings = new UberNotificationSchedule(NotificationSqsMessageCadence.HOURLY, false) {{
                                    dayOfWeek = NotificationSettingsDay.TUESDAY;
                                    local24HourOfDay = 199996;
                                    localMinuteOfHour = 179490;
                                    localTimezone = "perferendis";
                                }};;
                                slackSettings = new UberNotificationSchedule(NotificationSqsMessageCadence.HOURLY, false) {{
                                    dayOfWeek = NotificationSettingsDay.FRIDAY;
                                    local24HourOfDay = 463451;
                                    localMinuteOfHour = 223924;
                                    localTimezone = "vero";
                                }};;
                            }};, "nostrum");            

            UpdateNotificationSettingsResponse res = sdk.notificationSettings.updateNotificationSettings(req);

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
| `request`                                                                                                                              | [ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsRequest](../../models/operations/UpdateNotificationSettingsRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsResponse](../../models/operations/UpdateNotificationSettingsResponse.md)**


## getEmailNotificationActionPayload

Get dummy notification action payload

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetEmailNotificationActionPayloadResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("hic") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetEmailNotificationActionPayloadResponse res = sdk.notificationSettings.getEmailNotificationActionPayload();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[ai.whylabs.WhyLabs.models.operations.GetEmailNotificationActionPayloadResponse](../../models/operations/GetEmailNotificationActionPayloadResponse.md)**


## getPagerDutyNotificationActionPayload

Get dummy notification action payload

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetPagerDutyNotificationActionPayloadResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("recusandae") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetPagerDutyNotificationActionPayloadResponse res = sdk.notificationSettings.getPagerDutyNotificationActionPayload();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[ai.whylabs.WhyLabs.models.operations.GetPagerDutyNotificationActionPayloadResponse](../../models/operations/GetPagerDutyNotificationActionPayloadResponse.md)**


## getSlackNotificationActionPayload

Get dummy notification action payload

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetSlackNotificationActionPayloadResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("omnis") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetSlackNotificationActionPayloadResponse res = sdk.notificationSettings.getSlackNotificationActionPayload();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[ai.whylabs.WhyLabs.models.operations.GetSlackNotificationActionPayloadResponse](../../models/operations/GetSlackNotificationActionPayloadResponse.md)**

