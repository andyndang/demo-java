# Monitor

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
import ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteAnalyzerRequest req = new DeleteAnalyzerRequest("drift-analyzer", "model-123", "org-123");            

            DeleteAnalyzerResponse res = sdk.monitor.deleteAnalyzer(req, new DeleteAnalyzerSecurity("repudiandae") {{
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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerRequest](../../models/operations/DeleteAnalyzerRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerSecurity](../../models/operations/DeleteAnalyzerSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


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
import ai.whylabs.WhyLabs.models.operations.DeleteMonitorSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteMonitorRequest req = new DeleteMonitorRequest("model-123", "drift-monitor-123", "org-123");            

            DeleteMonitorResponse res = sdk.monitor.deleteMonitor(req, new DeleteMonitorSecurity("ullam") {{
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
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.DeleteMonitorRequest](../../models/operations/DeleteMonitorRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [ai.whylabs.WhyLabs.models.operations.DeleteMonitorSecurity](../../models/operations/DeleteMonitorSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


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
import ai.whylabs.WhyLabs.models.operations.GetAnalyzerSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetAnalyzerRequest req = new GetAnalyzerRequest("drift-analyzer", "model-123", "org-123");            

            GetAnalyzerResponse res = sdk.monitor.getAnalyzer(req, new GetAnalyzerSecurity("expedita") {{
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.operations.GetAnalyzerRequest](../../models/operations/GetAnalyzerRequest.md)   | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [ai.whylabs.WhyLabs.models.operations.GetAnalyzerSecurity](../../models/operations/GetAnalyzerSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


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
import ai.whylabs.WhyLabs.models.operations.GetMonitorSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetMonitorRequest req = new GetMonitorRequest("model-123", "drift-monitor-123", "org-123");            

            GetMonitorResponse res = sdk.monitor.getMonitor(req, new GetMonitorSecurity("nihil") {{
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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [ai.whylabs.WhyLabs.models.operations.GetMonitorRequest](../../models/operations/GetMonitorRequest.md)   | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [ai.whylabs.WhyLabs.models.operations.GetMonitorSecurity](../../models/operations/GetMonitorSecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |


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
import ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetMonitorConfigV3Request req = new GetMonitorConfigV3Request("model-123", "org-123") {{
                includeEntitySchema = false;
                includeEntityWeights = false;
            }};            

            GetMonitorConfigV3Response res = sdk.monitor.getMonitorConfigV3(req, new GetMonitorConfigV3Security("repellat") {{
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
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3Request](../../models/operations/GetMonitorConfigV3Request.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3Security](../../models/operations/GetMonitorConfigV3Security.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


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
import ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetMonitorConfigV3VersionRequest req = new GetMonitorConfigV3VersionRequest("model-123", "org-123", "4920545486e2a4cdf0f770c09748e663");            

            GetMonitorConfigV3VersionResponse res = sdk.monitor.getMonitorConfigV3Version(req, new GetMonitorConfigV3VersionSecurity("quibusdam") {{
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
| `request`                                                                                                                              | [ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionRequest](../../models/operations/GetMonitorConfigV3VersionRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionSecurity](../../models/operations/GetMonitorConfigV3VersionSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import ai.whylabs.WhyLabs.models.operations.ListConstraintsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListConstraintsRequest req = new ListConstraintsRequest("model-123", "org-123");            

            ListConstraintsResponse res = sdk.monitor.listConstraints(req, new ListConstraintsSecurity("sed") {{
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [ai.whylabs.WhyLabs.models.operations.ListConstraintsRequest](../../models/operations/ListConstraintsRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [ai.whylabs.WhyLabs.models.operations.ListConstraintsSecurity](../../models/operations/ListConstraintsSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


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
import ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListMonitorConfigV3VersionsRequest req = new ListMonitorConfigV3VersionsRequest("model-123", "org-123");            

            ListMonitorConfigV3VersionsResponse res = sdk.monitor.listMonitorConfigV3Versions(req, new ListMonitorConfigV3VersionsSecurity("saepe") {{
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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsRequest](../../models/operations/ListMonitorConfigV3VersionsRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsSecurity](../../models/operations/ListMonitorConfigV3VersionsSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import ai.whylabs.WhyLabs.models.operations.PatchMonitorConfigV3Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PatchMonitorConfigV3Request req = new PatchMonitorConfigV3Request("pariatur", "model-123", "org-123");            

            PatchMonitorConfigV3Response res = sdk.monitor.patchMonitorConfigV3(req, new PatchMonitorConfigV3Security("accusantium") {{
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.PatchMonitorConfigV3Request](../../models/operations/PatchMonitorConfigV3Request.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [ai.whylabs.WhyLabs.models.operations.PatchMonitorConfigV3Security](../../models/operations/PatchMonitorConfigV3Security.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


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
import ai.whylabs.WhyLabs.models.operations.PutAnalyzerSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutAnalyzerRequest req = new PutAnalyzerRequest("consequuntur", "drift-analyzer", "model-123", "org-123");            

            PutAnalyzerResponse res = sdk.monitor.putAnalyzer(req, new PutAnalyzerSecurity("praesentium") {{
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.operations.PutAnalyzerRequest](../../models/operations/PutAnalyzerRequest.md)   | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [ai.whylabs.WhyLabs.models.operations.PutAnalyzerSecurity](../../models/operations/PutAnalyzerSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


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
import ai.whylabs.WhyLabs.models.operations.PutMonitorSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutMonitorRequest req = new PutMonitorRequest("natus", "model-123", "drift-monitor-123", "org-123");            

            PutMonitorResponse res = sdk.monitor.putMonitor(req, new PutMonitorSecurity("magni") {{
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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [ai.whylabs.WhyLabs.models.operations.PutMonitorRequest](../../models/operations/PutMonitorRequest.md)   | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [ai.whylabs.WhyLabs.models.operations.PutMonitorSecurity](../../models/operations/PutMonitorSecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |


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
import ai.whylabs.WhyLabs.models.operations.PutMonitorConfigV3Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutMonitorConfigV3Request req = new PutMonitorConfigV3Request("sunt", "model-123", "org-123");            

            PutMonitorConfigV3Response res = sdk.monitor.putMonitorConfigV3(req, new PutMonitorConfigV3Security("quo") {{
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
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.PutMonitorConfigV3Request](../../models/operations/PutMonitorConfigV3Request.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [ai.whylabs.WhyLabs.models.operations.PutMonitorConfigV3Security](../../models/operations/PutMonitorConfigV3Security.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


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
import ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutRequestMonitorRunConfigRequest req = new PutRequestMonitorRunConfigRequest(                new PutRequestMonitorRunConfigRequestBody() {{
                                analyzerIds = new String[]{{
                                    add("illum"),
                                }};
                                endTimestamp = 1893456000000L;
                                overwrite = false;
                                startTimestamp = 1577836800000L;
                            }};, "model-123", "org-123");            

            PutRequestMonitorRunConfigResponse res = sdk.monitor.putRequestMonitorRunConfig(req, new PutRequestMonitorRunConfigSecurity("pariatur") {{
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigRequest](../../models/operations/PutRequestMonitorRunConfigRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigSecurity](../../models/operations/PutRequestMonitorRunConfigSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import ai.whylabs.WhyLabs.models.operations.ValidateMonitorConfigV3Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ValidateMonitorConfigV3Request req = new ValidateMonitorConfigV3Request("maxime", "model-123", "org-123") {{
                verbose = false;
            }};            

            ValidateMonitorConfigV3Response res = sdk.monitor.validateMonitorConfigV3(req, new ValidateMonitorConfigV3Security("ea") {{
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.ValidateMonitorConfigV3Request](../../models/operations/ValidateMonitorConfigV3Request.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [ai.whylabs.WhyLabs.models.operations.ValidateMonitorConfigV3Security](../../models/operations/ValidateMonitorConfigV3Security.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[ai.whylabs.WhyLabs.models.operations.ValidateMonitorConfigV3Response](../../models/operations/ValidateMonitorConfigV3Response.md)**

