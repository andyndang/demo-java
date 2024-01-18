# Admin
(*admin*)

### Available Operations

* [activateMarketplaceSubscriptionInternal](#activatemarketplacesubscriptioninternal) - Activate Azure Marketplace subscription to an existing organization.
* [generateReport](#generatereport) - Generate an admin report
* [listAzureMarketplaceSubscriptions](#listazuremarketplacesubscriptions) - List Azure Marketplace subscriptions
* [postMonitorConfigValidationJob](#postmonitorconfigvalidationjob) - Create a monitor config validation job for all configs

## activateMarketplaceSubscriptionInternal

Activate Azure Marketplace subscription to an existing organization.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalRequest;
import ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalRequest req = new ActivateMarketplaceSubscriptionInternalRequest(
                "string",
                "string");

            ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalResponse res = sdk.admin.activateMarketplaceSubscriptionInternal(req);

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalRequest](../../models/operations/ActivateMarketplaceSubscriptionInternalRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalResponse](../../models/operations/ActivateMarketplaceSubscriptionInternalResponse.md)**


## generateReport

Generate an admin report

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GenerateReportRequest;
import ai.whylabs.WhyLabs.models.operations.GenerateReportResponse;
import ai.whylabs.WhyLabs.models.shared.AdminReportType;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GenerateReportRequest req = new GenerateReportRequest(
                AdminReportType.SESSIONS);

            ai.whylabs.WhyLabs.models.operations.GenerateReportResponse res = sdk.admin.generateReport(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GenerateReportRequest](../../models/operations/GenerateReportRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.GenerateReportResponse](../../models/operations/GenerateReportResponse.md)**


## listAzureMarketplaceSubscriptions

List Azure Marketplace subscriptions

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListAzureMarketplaceSubscriptionsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListAzureMarketplaceSubscriptionsResponse res = sdk.admin.listAzureMarketplaceSubscriptions();

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

**[ai.whylabs.WhyLabs.models.operations.ListAzureMarketplaceSubscriptionsResponse](../../models/operations/ListAzureMarketplaceSubscriptionsResponse.md)**


## postMonitorConfigValidationJob

Create a monitor config validation job for all configs

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse res = sdk.admin.postMonitorConfigValidationJob();

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

**[ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse](../../models/operations/PostMonitorConfigValidationJobResponse.md)**

