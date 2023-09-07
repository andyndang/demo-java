# featureWeights

### Available Operations

* [getColumnWeights](#getcolumnweights) - Get column weights for the specified dataset
* [putColumnWeights](#putcolumnweights) - Put column weights for the specified dataset

## getColumnWeights

Get column weights for the specified dataset

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetColumnWeightsRequest;
import ai.whylabs.WhyLabs.models.operations.GetColumnWeightsResponse;
import ai.whylabs.WhyLabs.models.operations.GetColumnWeightsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetColumnWeightsRequest req = new GetColumnWeightsRequest("model-123", "org-123");            

            GetColumnWeightsResponse res = sdk.featureWeights.getColumnWeights(req, new GetColumnWeightsSecurity("saepe") {{
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.operations.GetColumnWeightsRequest](../../models/operations/GetColumnWeightsRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [ai.whylabs.WhyLabs.models.operations.GetColumnWeightsSecurity](../../models/operations/GetColumnWeightsSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetColumnWeightsResponse](../../models/operations/GetColumnWeightsResponse.md)**


## putColumnWeights

Put column weights for the specified dataset

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutColumnWeightsRequest;
import ai.whylabs.WhyLabs.models.operations.PutColumnWeightsResponse;
import ai.whylabs.WhyLabs.models.operations.PutColumnWeightsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutColumnWeightsRequest req = new PutColumnWeightsRequest("fuga", "model-123", "org-123");            

            PutColumnWeightsResponse res = sdk.featureWeights.putColumnWeights(req, new PutColumnWeightsSecurity("in") {{
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.operations.PutColumnWeightsRequest](../../models/operations/PutColumnWeightsRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [ai.whylabs.WhyLabs.models.operations.PutColumnWeightsSecurity](../../models/operations/PutColumnWeightsSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutColumnWeightsResponse](../../models/operations/PutColumnWeightsResponse.md)**

