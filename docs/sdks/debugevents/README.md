# DebugEvents

### Available Operations

* [logDebugEvent](#logdebugevent) - Log a debug event

## logDebugEvent

Create a debug event.
        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.LogDebugEventRequest;
import ai.whylabs.WhyLabs.models.operations.LogDebugEventResponse;
import ai.whylabs.WhyLabs.models.shared.DebugEvent;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.Segment;
import ai.whylabs.WhyLabs.models.shared.SegmentTag;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("iste") {{
                    apiKeyAuth = "";
                }})
                .build();

            LogDebugEventRequest req = new LogDebugEventRequest(                new DebugEvent() {{
                                content = "dolor";
                                creationTimestamp = 616934L;
                                datasetTimestamp = 386489L;
                                segment = new Segment() {{
                                    tags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                                        add(new SegmentTag() {{
                                            key = "hic";
                                            value = "saepe";
                                        }}),
                                    }};
                                }};;
                                tags = new String[]{{
                                    add("fuga"),
                                }};
                                traceId = "in";
                            }};, "model-123", "org-123");            

            LogDebugEventResponse res = sdk.debugEvents.logDebugEvent(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.LogDebugEventRequest](../../models/operations/LogDebugEventRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.LogDebugEventResponse](../../models/operations/LogDebugEventResponse.md)**

