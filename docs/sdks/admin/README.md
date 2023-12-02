# Admin
(*admin*)

### Available Operations

* [generateReport](#generatereport) - Generate an admin report
* [postMonitorConfigValidationJob](#postmonitorconfigvalidationjob) - Create a monitor config validation job for all configs

## generateReport

Generate an admin report

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GenerateReportRequest;
import ai.whylabs.WhyLabs.models.operations.GenerateReportResponse;
import ai.whylabs.WhyLabs.models.shared.AdminReportType;
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

            ai.whylabs.WhyLabs.models.operations.GenerateReportRequest req = new GenerateReportRequest(
                AdminReportType.SESSIONS);

            ai.whylabs.WhyLabs.models.operations.GenerateReportResponse res = sdk.admin.generateReport(req);

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
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GenerateReportRequest](../../models/operations/GenerateReportRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.GenerateReportResponse](../../models/operations/GenerateReportResponse.md)**


## postMonitorConfigValidationJob

Create a monitor config validation job for all configs

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse;
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

            ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse res = sdk.admin.postMonitorConfigValidationJob();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse](../../models/operations/PostMonitorConfigValidationJobResponse.md)**

