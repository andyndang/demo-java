# AzureMarketplace
(*azureMarketplace*)

### Available Operations

* [azureMarketplaceWebhook](#azuremarketplacewebhook) - Endpoint for Azure Marketplace webhooks

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

