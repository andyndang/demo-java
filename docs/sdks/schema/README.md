# Schema
(*schema*)

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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("following") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetMonitorConfigSchemaRequest req = new GetMonitorConfigSchemaRequest("org-123");            

            GetMonitorConfigSchemaResponse res = sdk.schema.getMonitorConfigSchema(req);

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
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GetMonitorConfigSchemaRequest](../../models/operations/GetMonitorConfigSchemaRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetMonitorConfigSchemaResponse](../../models/operations/GetMonitorConfigSchemaResponse.md)**

