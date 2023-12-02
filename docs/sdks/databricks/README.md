# Databricks
(*databricks*)

### Available Operations

* [getConnection](#getconnection) - Get the connection metadata for a given org
* [listJobs](#listjobs) - List all of the jobs in a workspace.
* [refreshConnection](#refreshconnection) - Refresh metadata for a workspace connection.
* [runJob](#runjob) - Run an existing job in a given databricks workspace.
* [updateConnection](#updateconnection) - Update the connection metadata for a given org

## getConnection

Get the connection metadata for a given org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetConnectionResponse;
import ai.whylabs.WhyLabs.models.shared.GetConnectionRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.GetConnectionRequest req = new GetConnectionRequest(
){{
                orgId = "string";
                workspaceId = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.GetConnectionResponse res = sdk.databricks.getConnection(req);

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
| `request`                                                                                            | [ai.whylabs.WhyLabs.models.shared.GetConnectionRequest](../../models/shared/GetConnectionRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetConnectionResponse](../../models/operations/GetConnectionResponse.md)**


## listJobs

List all of the jobs in a workspace.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListJobsResponse;
import ai.whylabs.WhyLabs.models.shared.ListJobsRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.ListJobsRequest req = new ListJobsRequest(
){{
                orgId = "string";
                workspaceId = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.ListJobsResponse res = sdk.databricks.listJobs(req);

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

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `request`                                                                                  | [ai.whylabs.WhyLabs.models.shared.ListJobsRequest](../../models/shared/ListJobsRequest.md) | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListJobsResponse](../../models/operations/ListJobsResponse.md)**


## refreshConnection

Refresh metadata for a workspace connection.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.RefreshConnectionResponse;
import ai.whylabs.WhyLabs.models.shared.RefreshConnectionRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.RefreshConnectionRequest req = new RefreshConnectionRequest(
){{
                orgId = "string";
                workspaceId = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.RefreshConnectionResponse res = sdk.databricks.refreshConnection(req);

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
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.shared.RefreshConnectionRequest](../../models/shared/RefreshConnectionRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.RefreshConnectionResponse](../../models/operations/RefreshConnectionResponse.md)**


## runJob

Run an existing job in a given databricks workspace.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.RunJobResponse;
import ai.whylabs.WhyLabs.models.shared.RunJobRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.RunJobRequest req = new RunJobRequest(
                353621L){{
                orgId = "string";
                workspaceId = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.RunJobResponse res = sdk.databricks.runJob(req);

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

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [ai.whylabs.WhyLabs.models.shared.RunJobRequest](../../models/shared/RunJobRequest.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.RunJobResponse](../../models/operations/RunJobResponse.md)**


## updateConnection

Update the connection metadata for a given org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateConnectionResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.UpdateConnectionChanges;
import ai.whylabs.WhyLabs.models.shared.UpdateConnectionRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.UpdateConnectionRequest req = new UpdateConnectionRequest(
){{
                changes = new UpdateConnectionChanges(
){{
                    connected = false;
                    demo = false;
                    orgId = "string";

                }};
                orgId = "string";
                workspaceId = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.UpdateConnectionResponse res = sdk.databricks.updateConnection(req);

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
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.shared.UpdateConnectionRequest](../../models/shared/UpdateConnectionRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateConnectionResponse](../../models/operations/UpdateConnectionResponse.md)**

