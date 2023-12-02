# Payment
(*payment*)

### Available Operations

* [stripePaymentEndpoint](#stripepaymentendpoint) - Endpoint for Stripe payment webhooks

## stripePaymentEndpoint

Endpoint for Stripe payment webhooks

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.StripePaymentEndpointResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            String req = "string";

            ai.whylabs.WhyLabs.models.operations.StripePaymentEndpointResponse res = sdk.payment.stripePaymentEndpoint(req);

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

**[ai.whylabs.WhyLabs.models.operations.StripePaymentEndpointResponse](../../models/operations/StripePaymentEndpointResponse.md)**

