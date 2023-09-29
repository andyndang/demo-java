# Log
(*log*)

### Available Operations

* [getProfileObservatoryLink](#getprofileobservatorylink) - Get observatory links for profiles in a given org/model. A max of 3 profiles can be viewed a a time.
* [logAsync](#logasync) - Like /log, except this api doesn't take the actual profile content. It returns an upload link that can be used to upload the profile to.
* [logReference](#logreference) - Returns a presigned URL for uploading the reference profile to.

## getProfileObservatoryLink

Get observatory links for profiles in a given org/model. A max of 3 profiles can be viewed a a time.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetProfileObservatoryLinkRequest;
import ai.whylabs.WhyLabs.models.operations.GetProfileObservatoryLinkResponse;
import ai.whylabs.WhyLabs.models.shared.GetProfileObservatoryLinkRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("gadzooks") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetProfileObservatoryLinkRequest req = new GetProfileObservatoryLinkRequest(                new GetProfileObservatoryLinkRequest() {{
                                batchProfileTimestamps = new Long[]{{
                                    add(738449L),
                                }};
                                referenceProfileIds = new String[]{{
                                    add("Track"),
                                }};
                            }};, "North", "Northeast");            

            GetProfileObservatoryLinkResponse res = sdk.log.getProfileObservatoryLink(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.GetProfileObservatoryLinkRequest](../../models/operations/GetProfileObservatoryLinkRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetProfileObservatoryLinkResponse](../../models/operations/GetProfileObservatoryLinkResponse.md)**


## logAsync

Like /log, except this api doesn't take the actual profile content. It returns an upload link that can be used to upload the profile to.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.LogAsyncRequest;
import ai.whylabs.WhyLabs.models.operations.LogAsyncResponse;
import ai.whylabs.WhyLabs.models.shared.LogAsyncRequest;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SegmentTag;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("navigating") {{
                    apiKeyAuth = "";
                }})
                .build();

            LogAsyncRequest req = new LogAsyncRequest(                new LogAsyncRequest() {{
                                datasetTimestamp = 260466L;
                                segmentTags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                                    add(new SegmentTag() {{
                                        key = "<key>";
                                        value = "shy";
                                    }}),
                                }};
                            }};, "model-123", "org-123");            

            LogAsyncResponse res = sdk.log.logAsync(req);

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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [ai.whylabs.WhyLabs.models.operations.LogAsyncRequest](../../models/operations/LogAsyncRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


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
import ai.whylabs.WhyLabs.models.shared.LogReferenceRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("North") {{
                    apiKeyAuth = "";
                }})
                .build();

            LogReferenceRequest req = new LogReferenceRequest(                new LogReferenceRequest() {{
                                alias = "Jewelery West Cape";
                                datasetTimestamp = 892608L;
                            }};, "model-123", "org-123");            

            LogReferenceResponse res = sdk.log.logReference(req);

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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.operations.LogReferenceRequest](../../models/operations/LogReferenceRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.LogReferenceResponse](../../models/operations/LogReferenceResponse.md)**

