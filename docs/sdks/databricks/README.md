# databricks

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
import ai.whylabs.WhyLabs.models.operations.GetConnectionSecurity;
import ai.whylabs.WhyLabs.models.shared.GetConnectionRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.GetConnectionRequest req = new GetConnectionRequest() {{
                orgId = "ipsam";
                workspaceId = "repellendus";
            }};            

            GetConnectionResponse res = sdk.databricks.getConnection(req, new GetConnectionSecurity("sapiente") {{
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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.shared.GetConnectionRequest](../../models/shared/GetConnectionRequest.md)           | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [ai.whylabs.WhyLabs.models.operations.GetConnectionSecurity](../../models/operations/GetConnectionSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetConnectionResponse](../../models/operations/GetConnectionResponse.md)**


## listJobs

List all of the jobs in a workspace.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListJobsResponse;
import ai.whylabs.WhyLabs.models.operations.ListJobsSecurity;
import ai.whylabs.WhyLabs.models.shared.ListJobsRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.ListJobsRequest req = new ListJobsRequest() {{
                orgId = "quo";
                workspaceId = "odit";
            }};            

            ListJobsResponse res = sdk.databricks.listJobs(req, new ListJobsSecurity("at") {{
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
| `request`                                                                                            | [ai.whylabs.WhyLabs.models.shared.ListJobsRequest](../../models/shared/ListJobsRequest.md)           | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `security`                                                                                           | [ai.whylabs.WhyLabs.models.operations.ListJobsSecurity](../../models/operations/ListJobsSecurity.md) | :heavy_check_mark:                                                                                   | The security requirements to use for the request.                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListJobsResponse](../../models/operations/ListJobsResponse.md)**


## refreshConnection

Refresh metadata for a workspace connection.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.RefreshConnectionResponse;
import ai.whylabs.WhyLabs.models.operations.RefreshConnectionSecurity;
import ai.whylabs.WhyLabs.models.shared.RefreshConnectionRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.RefreshConnectionRequest req = new RefreshConnectionRequest() {{
                orgId = "at";
                workspaceId = "maiores";
            }};            

            RefreshConnectionResponse res = sdk.databricks.refreshConnection(req, new RefreshConnectionSecurity("molestiae") {{
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.shared.RefreshConnectionRequest](../../models/shared/RefreshConnectionRequest.md)           | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [ai.whylabs.WhyLabs.models.operations.RefreshConnectionSecurity](../../models/operations/RefreshConnectionSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[ai.whylabs.WhyLabs.models.operations.RefreshConnectionResponse](../../models/operations/RefreshConnectionResponse.md)**


## runJob

Run an existing job in a given databricks workspace.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.RunJobResponse;
import ai.whylabs.WhyLabs.models.operations.RunJobSecurity;
import ai.whylabs.WhyLabs.models.shared.RunJobRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.RunJobRequest req = new RunJobRequest(799159L) {{
                orgId = "quod";
                workspaceId = "esse";
            }};            

            RunJobResponse res = sdk.databricks.runJob(req, new RunJobSecurity("totam") {{
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

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [ai.whylabs.WhyLabs.models.shared.RunJobRequest](../../models/shared/RunJobRequest.md)           | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |
| `security`                                                                                       | [ai.whylabs.WhyLabs.models.operations.RunJobSecurity](../../models/operations/RunJobSecurity.md) | :heavy_check_mark:                                                                               | The security requirements to use for the request.                                                |


### Response

**[ai.whylabs.WhyLabs.models.operations.RunJobResponse](../../models/operations/RunJobResponse.md)**


## updateConnection

Update the connection metadata for a given org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateConnectionResponse;
import ai.whylabs.WhyLabs.models.operations.UpdateConnectionSecurity;
import ai.whylabs.WhyLabs.models.shared.UpdateConnectionChanges;
import ai.whylabs.WhyLabs.models.shared.UpdateConnectionRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.UpdateConnectionRequest req = new UpdateConnectionRequest() {{
                changes = new UpdateConnectionChanges() {{
                    connected = false;
                    demo = false;
                    orgId = "porro";
                }};;
                orgId = "dolorum";
                workspaceId = "dicta";
            }};            

            UpdateConnectionResponse res = sdk.databricks.updateConnection(req, new UpdateConnectionSecurity("nam") {{
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
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.shared.UpdateConnectionRequest](../../models/shared/UpdateConnectionRequest.md)           | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [ai.whylabs.WhyLabs.models.operations.UpdateConnectionSecurity](../../models/operations/UpdateConnectionSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateConnectionResponse](../../models/operations/UpdateConnectionResponse.md)**

