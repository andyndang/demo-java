# debugEvents

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
import ai.whylabs.WhyLabs.models.operations.LogDebugEventSecurity;
import ai.whylabs.WhyLabs.models.shared.DebugEvent;
import ai.whylabs.WhyLabs.models.shared.Segment;
import ai.whylabs.WhyLabs.models.shared.SegmentTag;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            LogDebugEventRequest req = new LogDebugEventRequest(                new DebugEvent() {{
                                content = "reiciendis";
                                creationTimestamp = 666767L;
                                datasetTimestamp = 653140L;
                                segment = new Segment() {{
                                    tags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                                        add(new SegmentTag() {{
                                            key = "dolores";
                                            value = "dolorem";
                                        }}),
                                        add(new SegmentTag() {{
                                            key = "corporis";
                                            value = "explicabo";
                                        }}),
                                        add(new SegmentTag() {{
                                            key = "nobis";
                                            value = "enim";
                                        }}),
                                    }};
                                }};;
                                tags = new String[]{{
                                    add("nemo"),
                                    add("minima"),
                                    add("excepturi"),
                                }};
                                traceId = "accusantium";
                            }};, "model-123", "org-123");            

            LogDebugEventResponse res = sdk.debugEvents.logDebugEvent(req, new LogDebugEventSecurity("iure") {{
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

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.LogDebugEventRequest](../../models/operations/LogDebugEventRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [ai.whylabs.WhyLabs.models.operations.LogDebugEventSecurity](../../models/operations/LogDebugEventSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.LogDebugEventResponse](../../models/operations/LogDebugEventResponse.md)**
