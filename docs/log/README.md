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
