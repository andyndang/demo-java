# Monitor
(*monitor*)

### Available Operations

* [deleteAnalyzer](#deleteanalyzer) - Delete the analyzer config for a given dataset.
* [deleteMonitor](#deletemonitor) - Delete the monitor for a given dataset.
* [getAnalyzer](#getanalyzer) - Get the analyzer config for a given dataset.
* [getMonitor](#getmonitor) - Get the monitor config for a given dataset.
* [getMonitorConfigV3](#getmonitorconfigv3) - Get the monitor config document for a given dataset.
* [getMonitorConfigV3Version](#getmonitorconfigv3version) - Get the monitor config document version for a given dataset.
* [listConstraints](#listconstraints) - List the constraints for a given dataset.
* [listMonitorConfigV3Versions](#listmonitorconfigv3versions) - List the monitor config document versions for a given dataset.
* [patchMonitorConfigV3](#patchmonitorconfigv3) - Patch an updated monitor config document for a given dataset.
* [putAnalyzer](#putanalyzer) - Save the analyzer config for a given dataset.
* [putMonitor](#putmonitor) - Save the monitor for a given dataset.
* [putMonitorConfigV3](#putmonitorconfigv3) - Save the monitor config document for a given dataset.
* [putRequestMonitorRunConfig](#putrequestmonitorrunconfig) - Put the RequestMonitorRun config into S3.
* [validateMonitorConfigV3](#validatemonitorconfigv3) - Validate the monitor config document for a given dataset.

## deleteAnalyzer

Delete the analyzer config for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResponse;
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

            ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerRequest req = new DeleteAnalyzerRequest(
                "drift-analyzer",
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResponse res = sdk.monitor.deleteAnalyzer(req);

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
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerRequest](../../models/operations/DeleteAnalyzerRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResponse](../../models/operations/DeleteAnalyzerResponse.md)**


## deleteMonitor

Delete the monitor for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteMonitorRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteMonitorResponse;
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

            ai.whylabs.WhyLabs.models.operations.DeleteMonitorRequest req = new DeleteMonitorRequest(
                "model-123",
                "drift-monitor-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.DeleteMonitorResponse res = sdk.monitor.deleteMonitor(req);

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
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.DeleteMonitorRequest](../../models/operations/DeleteMonitorRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteMonitorResponse](../../models/operations/DeleteMonitorResponse.md)**


## getAnalyzer

Get the analyzer config for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetAnalyzerRequest;
import ai.whylabs.WhyLabs.models.operations.GetAnalyzerResponse;
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

            ai.whylabs.WhyLabs.models.operations.GetAnalyzerRequest req = new GetAnalyzerRequest(
                "drift-analyzer",
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.GetAnalyzerResponse res = sdk.monitor.getAnalyzer(req);

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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [ai.whylabs.WhyLabs.models.operations.GetAnalyzerRequest](../../models/operations/GetAnalyzerRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetAnalyzerResponse](../../models/operations/GetAnalyzerResponse.md)**


## getMonitor

Get the monitor config for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetMonitorRequest;
import ai.whylabs.WhyLabs.models.operations.GetMonitorResponse;
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

            ai.whylabs.WhyLabs.models.operations.GetMonitorRequest req = new GetMonitorRequest(
                "model-123",
                "drift-monitor-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.GetMonitorResponse res = sdk.monitor.getMonitor(req);

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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [ai.whylabs.WhyLabs.models.operations.GetMonitorRequest](../../models/operations/GetMonitorRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetMonitorResponse](../../models/operations/GetMonitorResponse.md)**


## getMonitorConfigV3

Get the monitor config document for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3Request;
import ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3Response;
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

            ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3Request req = new GetMonitorConfigV3Request(
                "model-123",
                "org-123"){{
                includeEntitySchema = false;
                includeEntityWeights = false;

            }};

            ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3Response res = sdk.monitor.getMonitorConfigV3(req);

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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3Request](../../models/operations/GetMonitorConfigV3Request.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3Response](../../models/operations/GetMonitorConfigV3Response.md)**


## getMonitorConfigV3Version

Get the monitor config document version for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionRequest;
import ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionResponse;
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

            ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionRequest req = new GetMonitorConfigV3VersionRequest(
                "model-123",
                "org-123",
                "4920545486e2a4cdf0f770c09748e663");

            ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionResponse res = sdk.monitor.getMonitorConfigV3Version(req);

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
| `request`                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionRequest](../../models/operations/GetMonitorConfigV3VersionRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionResponse](../../models/operations/GetMonitorConfigV3VersionResponse.md)**


## listConstraints

List the constraints for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListConstraintsRequest;
import ai.whylabs.WhyLabs.models.operations.ListConstraintsResponse;
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

            ai.whylabs.WhyLabs.models.operations.ListConstraintsRequest req = new ListConstraintsRequest(
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.ListConstraintsResponse res = sdk.monitor.listConstraints(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.ListConstraintsRequest](../../models/operations/ListConstraintsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListConstraintsResponse](../../models/operations/ListConstraintsResponse.md)**


## listMonitorConfigV3Versions

List the monitor config document versions for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsRequest;
import ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsResponse;
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

            ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsRequest req = new ListMonitorConfigV3VersionsRequest(
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsResponse res = sdk.monitor.listMonitorConfigV3Versions(req);

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsRequest](../../models/operations/ListMonitorConfigV3VersionsRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsResponse](../../models/operations/ListMonitorConfigV3VersionsResponse.md)**


## patchMonitorConfigV3

Save an updated monitor config document for a given dataset.  Monitors and analyzers matching an existing ID are replaced.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PatchMonitorConfigV3Request;
import ai.whylabs.WhyLabs.models.operations.PatchMonitorConfigV3Response;
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

            ai.whylabs.WhyLabs.models.operations.PatchMonitorConfigV3Request req = new PatchMonitorConfigV3Request(
                "string",
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.PatchMonitorConfigV3Response res = sdk.monitor.patchMonitorConfigV3(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.PatchMonitorConfigV3Request](../../models/operations/PatchMonitorConfigV3Request.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.PatchMonitorConfigV3Response](../../models/operations/PatchMonitorConfigV3Response.md)**


## putAnalyzer

Save the analyzer config for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutAnalyzerRequest;
import ai.whylabs.WhyLabs.models.operations.PutAnalyzerResponse;
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

            ai.whylabs.WhyLabs.models.operations.PutAnalyzerRequest req = new PutAnalyzerRequest(
                "string",
                "drift-analyzer",
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.PutAnalyzerResponse res = sdk.monitor.putAnalyzer(req);

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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [ai.whylabs.WhyLabs.models.operations.PutAnalyzerRequest](../../models/operations/PutAnalyzerRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutAnalyzerResponse](../../models/operations/PutAnalyzerResponse.md)**


## putMonitor

Save the monitor for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutMonitorRequest;
import ai.whylabs.WhyLabs.models.operations.PutMonitorResponse;
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

            ai.whylabs.WhyLabs.models.operations.PutMonitorRequest req = new PutMonitorRequest(
                "string",
                "model-123",
                "drift-monitor-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.PutMonitorResponse res = sdk.monitor.putMonitor(req);

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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [ai.whylabs.WhyLabs.models.operations.PutMonitorRequest](../../models/operations/PutMonitorRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutMonitorResponse](../../models/operations/PutMonitorResponse.md)**


## putMonitorConfigV3

Save the monitor config document for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutMonitorConfigV3Request;
import ai.whylabs.WhyLabs.models.operations.PutMonitorConfigV3Response;
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

            ai.whylabs.WhyLabs.models.operations.PutMonitorConfigV3Request req = new PutMonitorConfigV3Request(
                "string",
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.PutMonitorConfigV3Response res = sdk.monitor.putMonitorConfigV3(req);

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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.PutMonitorConfigV3Request](../../models/operations/PutMonitorConfigV3Request.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutMonitorConfigV3Response](../../models/operations/PutMonitorConfigV3Response.md)**


## putRequestMonitorRunConfig

Put the RequestMonitorRun config into S3.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigRequest;
import ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigRequestBody;
import ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigResponse;
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

            ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigRequest req = new PutRequestMonitorRunConfigRequest(
                new PutRequestMonitorRunConfigRequestBody(
){{
                    analyzerIds = new String[]{{
                        add("d"),
                        add("r"),
                        add("i"),
                        add("f"),
                        add("t"),
                        add("-"),
                        add("a"),
                        add("n"),
                        add("a"),
                        add("l"),
                        add("y"),
                        add("z"),
                        add("e"),
                        add("r"),
                    }};
                    endTimestamp = 1893456000000L;
                    overwrite = false;
                    startTimestamp = 1577836800000L;

                }},
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigResponse res = sdk.monitor.putRequestMonitorRunConfig(req);

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
| `request`                                                                                                                              | [ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigRequest](../../models/operations/PutRequestMonitorRunConfigRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigResponse](../../models/operations/PutRequestMonitorRunConfigResponse.md)**


## validateMonitorConfigV3

Validate the monitor config document for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ValidateMonitorConfigV3Request;
import ai.whylabs.WhyLabs.models.operations.ValidateMonitorConfigV3Response;
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

            ai.whylabs.WhyLabs.models.operations.ValidateMonitorConfigV3Request req = new ValidateMonitorConfigV3Request(
                "string",
                "model-123",
                "org-123"){{
                verbose = false;

            }};

            ai.whylabs.WhyLabs.models.operations.ValidateMonitorConfigV3Response res = sdk.monitor.validateMonitorConfigV3(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [ai.whylabs.WhyLabs.models.operations.ValidateMonitorConfigV3Request](../../models/operations/ValidateMonitorConfigV3Request.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.ValidateMonitorConfigV3Response](../../models/operations/ValidateMonitorConfigV3Response.md)**

