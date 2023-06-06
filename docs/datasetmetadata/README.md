# datasetMetadata

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

            DeleteDatasetMetadataResponse res = sdk.datasetMetadata.deleteDatasetMetadata(req, new DeleteDatasetMetadataSecurity("excepturi") {{
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

            GetDatasetMetadataResponse res = sdk.datasetMetadata.getDatasetMetadata(req, new GetDatasetMetadataSecurity("nisi") {{
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

            PutDatasetMetadataRequest req = new PutDatasetMetadataRequest("recusandae", "model-123", "org-123");            

            PutDatasetMetadataResponse res = sdk.datasetMetadata.putDatasetMetadata(req, new PutDatasetMetadataSecurity("temporibus") {{
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
