# AzureMarketplace
(*azureMarketplace*)

### Available Operations

* [activateAzureSubscription](#activateazuresubscription) - Endpoint to activate Azure Marketplace subscriptions
* [azureMarketplaceWebhook](#azuremarketplacewebhook) - Endpoint for Azure Marketplace webhooks

## activateAzureSubscription

Endpoint to activate Azure Marketplace subscriptions

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ActivateAzureSubscriptionResponse;
import ai.whylabs.WhyLabs.models.shared.ActivateAzureSubscriptionRequest;
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

            ai.whylabs.WhyLabs.models.shared.ActivateAzureSubscriptionRequest req = new ActivateAzureSubscriptionRequest(
                "string",
                "string",
                "string"){{
                expectExisting = false;
                modelName = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.ActivateAzureSubscriptionResponse res = sdk.azureMarketplace.activateAzureSubscription(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.shared.ActivateAzureSubscriptionRequest](../../models/shared/ActivateAzureSubscriptionRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.ActivateAzureSubscriptionResponse](../../models/operations/ActivateAzureSubscriptionResponse.md)**


## azureMarketplaceWebhook

Endpoint for Azure Marketplace webhooks

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.AzureMarketplaceWebhookResponse;
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

            String req = "string";

            ai.whylabs.WhyLabs.models.operations.AzureMarketplaceWebhookResponse res = sdk.azureMarketplace.azureMarketplaceWebhook(req);

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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[ai.whylabs.WhyLabs.models.operations.AzureMarketplaceWebhookResponse](../../models/operations/AzureMarketplaceWebhookResponse.md)**

