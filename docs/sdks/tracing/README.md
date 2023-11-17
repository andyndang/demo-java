# Tracing
(*tracing*)

### Available Operations

* [postSpansJson](#postspansjson) - Publish Spans into WhyLabs
* [postSpansRaw](#postspansraw) - Publish Spans into WhyLabs

## postSpansJson

API to publish Spans into WhyLabs

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PostSpansJsonRequest;
import ai.whylabs.WhyLabs.models.operations.PostSpansJsonResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            PostSpansJsonRequest req = new PostSpansJsonRequest(new String[]{{
    add("string"),
}}, "resource-1");            

            PostSpansJsonResponse res = sdk.tracing.postSpansJson(req);

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
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.PostSpansJsonRequest](../../models/operations/PostSpansJsonRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.PostSpansJsonResponse](../../models/operations/PostSpansJsonResponse.md)**


## postSpansRaw

API to publish Spans into WhyLabs

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PostSpansRawRequest;
import ai.whylabs.WhyLabs.models.operations.PostSpansRawResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            PostSpansRawRequest req = new PostSpansRawRequest("0xacBf544EcA".getBytes(), "resource-1");            

            PostSpansRawResponse res = sdk.tracing.postSpansRaw(req);

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
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.operations.PostSpansRawRequest](../../models/operations/PostSpansRawRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.PostSpansRawResponse](../../models/operations/PostSpansRawResponse.md)**

