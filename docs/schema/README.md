# schema

### Available Operations

* [getMonitorConfigSchema](#getmonitorconfigschema) - Get the current supported schema of the monitor configuration

## getMonitorConfigSchema

Get the current supported schema of the  monitor configuration

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetMonitorConfigSchemaRequest;
import ai.whylabs.WhyLabs.models.operations.GetMonitorConfigSchemaResponse;
import ai.whylabs.WhyLabs.models.operations.GetMonitorConfigSchemaSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetMonitorConfigSchemaRequest req = new GetMonitorConfigSchemaRequest("org-123");            

            GetMonitorConfigSchemaResponse res = sdk.schema.getMonitorConfigSchema(req, new GetMonitorConfigSchemaSecurity("facilis") {{
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
