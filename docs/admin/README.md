# admin

### Available Operations

* [postMonitorConfigValidationJob](#postmonitorconfigvalidationjob) - Create a monitor config validation job for all configs

## postMonitorConfigValidationJob

Create a monitor config validation job for all configs

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse;
import ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PostMonitorConfigValidationJobResponse res = sdk.admin.postMonitorConfigValidationJob(new PostMonitorConfigValidationJobSecurity("provident") {{
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
