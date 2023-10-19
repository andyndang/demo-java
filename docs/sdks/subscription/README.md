# Subscription
(*subscription*)

### Available Operations

* [getOrganizationSubscriptions](#getorganizationsubscriptions) - Get organization subscription details

## getOrganizationSubscriptions

Get organization subscription details

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetOrganizationSubscriptionsRequest;
import ai.whylabs.WhyLabs.models.operations.GetOrganizationSubscriptionsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("purple"){{
                    apiKeyAuth = "";
                }})
                .build();

            GetOrganizationSubscriptionsRequest req = new GetOrganizationSubscriptionsRequest("Hybrid");            

            GetOrganizationSubscriptionsResponse res = sdk.subscription.getOrganizationSubscriptions(req);

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.GetOrganizationSubscriptionsRequest](../../models/operations/GetOrganizationSubscriptionsRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetOrganizationSubscriptionsResponse](../../models/operations/GetOrganizationSubscriptionsResponse.md)**

