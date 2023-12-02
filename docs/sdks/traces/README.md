# Traces
(*traces*)

### Available Operations

* [exportTracesJson](#exporttracesjson) - Export traces into WhyLabs
* [exportTracesRaw](#exporttracesraw) - Export traces into WhyLabs

## exportTracesJson

API to export traces into WhyLabs

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ExportTracesJsonRequest;
import ai.whylabs.WhyLabs.models.operations.ExportTracesJsonResponse;
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

            ai.whylabs.WhyLabs.models.operations.ExportTracesJsonRequest req = new ExportTracesJsonRequest(
                new String[]{{
                    add("string"),
                }}){{
                xWhylabsResource = "resource-1";

            }};

            ai.whylabs.WhyLabs.models.operations.ExportTracesJsonResponse res = sdk.traces.exportTracesJson(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [ai.whylabs.WhyLabs.models.operations.ExportTracesJsonRequest](../../models/operations/ExportTracesJsonRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[ai.whylabs.WhyLabs.models.operations.ExportTracesJsonResponse](../../models/operations/ExportTracesJsonResponse.md)**


## exportTracesRaw

API to export traces into WhyLabs

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ExportTracesRawRequest;
import ai.whylabs.WhyLabs.models.operations.ExportTracesRawResponse;
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

            ai.whylabs.WhyLabs.models.operations.ExportTracesRawRequest req = new ExportTracesRawRequest(
                "0x13AeB07844".getBytes()){{
                xWhylabsResource = "resource-1";

            }};

            ai.whylabs.WhyLabs.models.operations.ExportTracesRawResponse res = sdk.traces.exportTracesRaw(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.ExportTracesRawRequest](../../models/operations/ExportTracesRawRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.ExportTracesRawResponse](../../models/operations/ExportTracesRawResponse.md)**

