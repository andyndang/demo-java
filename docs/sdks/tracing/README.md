# Tracing
(*tracing*)

### Available Operations

* [postTracesJson](#posttracesjson) - Publish traces into WhyLabs
* [postTracesRaw](#posttracesraw) - Publish traces into WhyLabs

## postTracesJson

API to publish traces into WhyLabs

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PostTracesJsonRequest;
import ai.whylabs.WhyLabs.models.operations.PostTracesJsonResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            PostTracesJsonRequest req = new PostTracesJsonRequest(new String[]{{
    add("string"),
}}, "resource-1");            

            PostTracesJsonResponse res = sdk.tracing.postTracesJson(req);

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
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.PostTracesJsonRequest](../../models/operations/PostTracesJsonRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.PostTracesJsonResponse](../../models/operations/PostTracesJsonResponse.md)**


## postTracesRaw

API to publish traces into WhyLabs

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PostTracesRawRequest;
import ai.whylabs.WhyLabs.models.operations.PostTracesRawResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            PostTracesRawRequest req = new PostTracesRawRequest("0xBEA861Fc01".getBytes(), "resource-1");            

            PostTracesRawResponse res = sdk.tracing.postTracesRaw(req);

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
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.PostTracesRawRequest](../../models/operations/PostTracesRawRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.PostTracesRawResponse](../../models/operations/PostTracesRawResponse.md)**

