# monitor

### Available Operations

* [deleteAnalyzer](#deleteanalyzer) - Delete the analyzer config for a given dataset.
* [deleteMonitor](#deletemonitor) - Delete the monitor for a given dataset.
* [getAnalyzer](#getanalyzer) - Get the analyzer config for a given dataset.
* [getMonitor](#getmonitor) - Get the monitor config for a given dataset.
* [getMonitorConfigV3](#getmonitorconfigv3) - Get the monitor config document for a given dataset.
* [getMonitorConfigV3Version](#getmonitorconfigv3version) - Get the monitor config document version for a given dataset.
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

            DeleteAnalyzerResponse res = sdk.monitor.deleteAnalyzer(req, new DeleteAnalyzerSecurity("nihil") {{
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

            DeleteMonitorResponse res = sdk.monitor.deleteMonitor(req, new DeleteMonitorSecurity("magnam") {{
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

            GetAnalyzerResponse res = sdk.monitor.getAnalyzer(req, new GetAnalyzerSecurity("distinctio") {{
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

            GetMonitorResponse res = sdk.monitor.getMonitor(req, new GetMonitorSecurity("id") {{
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

            GetMonitorConfigV3Response res = sdk.monitor.getMonitorConfigV3(req, new GetMonitorConfigV3Security("labore") {{
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

            GetMonitorConfigV3VersionResponse res = sdk.monitor.getMonitorConfigV3Version(req, new GetMonitorConfigV3VersionSecurity("labore") {{
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

            ListMonitorConfigV3VersionsResponse res = sdk.monitor.listMonitorConfigV3Versions(req, new ListMonitorConfigV3VersionsSecurity("suscipit") {{
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

            PatchMonitorConfigV3Request req = new PatchMonitorConfigV3Request("natus", "model-123", "org-123");            

            PatchMonitorConfigV3Response res = sdk.monitor.patchMonitorConfigV3(req, new PatchMonitorConfigV3Security("nobis") {{
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

            PutAnalyzerRequest req = new PutAnalyzerRequest("eum", "drift-analyzer", "model-123", "org-123");            

            PutAnalyzerResponse res = sdk.monitor.putAnalyzer(req, new PutAnalyzerSecurity("vero") {{
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

            PutMonitorRequest req = new PutMonitorRequest("aspernatur", "model-123", "drift-monitor-123", "org-123");            

            PutMonitorResponse res = sdk.monitor.putMonitor(req, new PutMonitorSecurity("architecto") {{
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

            PutMonitorConfigV3Request req = new PutMonitorConfigV3Request("magnam", "model-123", "org-123");            

            PutMonitorConfigV3Response res = sdk.monitor.putMonitorConfigV3(req, new PutMonitorConfigV3Security("et") {{
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
                                    add("ullam"),
                                    add("provident"),
                                    add("quos"),
                                }};
                                endTimestamp = 1893456000000L;
                                overwrite = false;
                                startTimestamp = 1577836800000L;
                            }};, "model-123", "org-123");            

            PutRequestMonitorRunConfigResponse res = sdk.monitor.putRequestMonitorRunConfig(req, new PutRequestMonitorRunConfigSecurity("sint") {{
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

            ValidateMonitorConfigV3Request req = new ValidateMonitorConfigV3Request("accusantium", "model-123", "org-123") {{
                verbose = false;
            }};            

            ValidateMonitorConfigV3Response res = sdk.monitor.validateMonitorConfigV3(req, new ValidateMonitorConfigV3Security("mollitia") {{
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
