# featureFlags

### Available Operations

* [getFeatureFlags](#getfeatureflags) - Get feature flags for the specified user/org

## getFeatureFlags

Get feature flags for the specified user/org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsRequest;
import ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsResponse;
import ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetFeatureFlagsRequest req = new GetFeatureFlagsRequest("hic", "optio");            

            GetFeatureFlagsResponse res = sdk.featureFlags.getFeatureFlags(req, new GetFeatureFlagsSecurity("totam") {{
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
