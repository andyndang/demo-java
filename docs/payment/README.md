# payment

### Available Operations

* [stripePaymentEndpoint](#stripepaymentendpoint) - Endpoint for Stripe payment webhooks

## stripePaymentEndpoint

Endpoint for Stripe payment webhooks

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.StripePaymentEndpointResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.. req = "cumque"            

            StripePaymentEndpointResponse res = sdk.payment.stripePaymentEndpoint(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
