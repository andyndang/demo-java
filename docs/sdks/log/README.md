# log

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
import ai.whylabs.WhyLabs.models.operations.GetProfileObservatoryLinkSecurity;
import ai.whylabs.WhyLabs.models.shared.GetProfileObservatoryLinkRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetProfileObservatoryLinkRequest req = new GetProfileObservatoryLinkRequest(                new GetProfileObservatoryLinkRequest() {{
                                batchProfileTimestamps = new Long[]{{
                                    add(135474L),
                                    add(102863L),
                                    add(298282L),
                                    add(92373L),
                                }};
                                referenceProfileIds = new String[]{{
                                    add("ullam"),
                                    add("provident"),
                                    add("quos"),
                                }};
                            }};, "sint", "accusantium");            

            GetProfileObservatoryLinkResponse res = sdk.log.getProfileObservatoryLink(req, new GetProfileObservatoryLinkSecurity("mollitia") {{
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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [ai.whylabs.WhyLabs.models.operations.GetProfileObservatoryLinkRequest](../../models/operations/GetProfileObservatoryLinkRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [ai.whylabs.WhyLabs.models.operations.GetProfileObservatoryLinkSecurity](../../models/operations/GetProfileObservatoryLinkSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import ai.whylabs.WhyLabs.models.operations.LogAsyncSecurity;
import ai.whylabs.WhyLabs.models.shared.LogAsyncRequest;
import ai.whylabs.WhyLabs.models.shared.SegmentTag;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            LogAsyncRequest req = new LogAsyncRequest(                new LogAsyncRequest() {{
                                datasetTimestamp = 968962L;
                                segmentTags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                                    add(new SegmentTag() {{
                                        key = "ad";
                                        value = "eum";
                                    }}),
                                    add(new SegmentTag() {{
                                        key = "dolor";
                                        value = "necessitatibus";
                                    }}),
                                    add(new SegmentTag() {{
                                        key = "odit";
                                        value = "nemo";
                                    }}),
                                }};
                            }};, "model-123", "org-123");            

            LogAsyncResponse res = sdk.log.logAsync(req, new LogAsyncSecurity("quasi") {{
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
                                alias = "iure";
                                datasetTimestamp = 984043L;
                            }};, "model-123", "org-123");            

            LogReferenceResponse res = sdk.log.logReference(req, new LogReferenceSecurity("debitis") {{
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

