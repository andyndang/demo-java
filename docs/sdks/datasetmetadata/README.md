# DatasetMetadata

### Available Operations

* [deleteDatasetMetadata](#deletedatasetmetadata) - Delete dataset metadata for the specified dataset
* [getDatasetMetadata](#getdatasetmetadata) - Get dataset metadata for the specified dataset
* [putDatasetMetadata](#putdatasetmetadata) - Put dataset metadata for the specified dataset

## deleteDatasetMetadata

Delete dataset metadata for the specified dataset

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataResponse;
import ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteDatasetMetadataRequest req = new DeleteDatasetMetadataRequest("model-123", "org-123");            

            DeleteDatasetMetadataResponse res = sdk.datasetMetadata.deleteDatasetMetadata(req, new DeleteDatasetMetadataSecurity("dicta") {{
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataRequest](../../models/operations/DeleteDatasetMetadataRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataSecurity](../../models/operations/DeleteDatasetMetadataSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteDatasetMetadataResponse](../../models/operations/DeleteDatasetMetadataResponse.md)**


## getDatasetMetadata

Get dataset metadata for the specified dataset

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataRequest;
import ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataResponse;
import ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetDatasetMetadataRequest req = new GetDatasetMetadataRequest("model-123", "org-123");            

            GetDatasetMetadataResponse res = sdk.datasetMetadata.getDatasetMetadata(req, new GetDatasetMetadataSecurity("nam") {{
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataRequest](../../models/operations/GetDatasetMetadataRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataSecurity](../../models/operations/GetDatasetMetadataSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetDatasetMetadataResponse](../../models/operations/GetDatasetMetadataResponse.md)**


## putDatasetMetadata

Put dataset metadata for the specified dataset

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataRequest;
import ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataResponse;
import ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutDatasetMetadataRequest req = new PutDatasetMetadataRequest("officia", "model-123", "org-123");            

            PutDatasetMetadataResponse res = sdk.datasetMetadata.putDatasetMetadata(req, new PutDatasetMetadataSecurity("occaecati") {{
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataRequest](../../models/operations/PutDatasetMetadataRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataSecurity](../../models/operations/PutDatasetMetadataSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutDatasetMetadataResponse](../../models/operations/PutDatasetMetadataResponse.md)**

