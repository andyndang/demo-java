# log

### Available Operations

* [logAsync](#logasync) - Like /log, except this api doesn't take the actual profile content. It returns an upload link that can be used to upload the profile to.
* [logReference](#logreference) - Returns a presigned URL for uploading the reference profile to.

## logAsync

Like /log, except this api doesn't take the actual profile content. It returns an upload link that can be used to upload the profile to.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.LogAsyncRequest;
import ai.whylabs.WhyLabs.models.operations.LogAsyncResponse;
import ai.whylabs.WhyLabs.models.operations.LogAsyncSecurity;
import ai.whylabs.WhyLabs.models.shared.LogAsyncRequest;
import ai.whylabs.WhyLabs.models.shared.SegmentTag;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            LogAsyncRequest req = new LogAsyncRequest(                new LogAsyncRequest() {{
                                datasetTimestamp = 289406L;
                                segmentTags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                                    add(new SegmentTag() {{
                                        key = "qui";
                                        value = "aliquid";
                                    }}),
                                    add(new SegmentTag() {{
                                        key = "cupiditate";
                                        value = "quos";
                                    }}),
                                }};
                            }};, "model-123", "org-123");            

            LogAsyncResponse res = sdk.log.logAsync(req, new LogAsyncSecurity("perferendis") {{
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [ai.whylabs.WhyLabs.models.operations.LogAsyncRequest](../../models/operations/LogAsyncRequest.md)   | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `security`                                                                                           | [ai.whylabs.WhyLabs.models.operations.LogAsyncSecurity](../../models/operations/LogAsyncSecurity.md) | :heavy_check_mark:                                                                                   | The security requirements to use for the request.                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.LogAsyncResponse](../../models/operations/LogAsyncResponse.md)**


## logReference

Reference profiles can be used for.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.LogReferenceRequest;
import ai.whylabs.WhyLabs.models.operations.LogReferenceResponse;
import ai.whylabs.WhyLabs.models.operations.LogReferenceSecurity;
import ai.whylabs.WhyLabs.models.shared.LogReferenceRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            LogReferenceRequest req = new LogReferenceRequest(                new LogReferenceRequest() {{
                                alias = "magni";
                                datasetTimestamp = 828940L;
                            }};, "model-123", "org-123");            

            LogReferenceResponse res = sdk.log.logReference(req, new LogReferenceSecurity("ipsam") {{
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.LogReferenceRequest](../../models/operations/LogReferenceRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [ai.whylabs.WhyLabs.models.operations.LogReferenceSecurity](../../models/operations/LogReferenceSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.LogReferenceResponse](../../models/operations/LogReferenceResponse.md)**

