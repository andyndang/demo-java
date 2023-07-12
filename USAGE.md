<!-- Start SDK Example Usage -->
```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GenerateReportRequest;
import ai.whylabs.WhyLabs.models.operations.GenerateReportResponse;
import ai.whylabs.WhyLabs.models.operations.GenerateReportSecurity;
import ai.whylabs.WhyLabs.models.shared.AdminReportTimePeriod;
import ai.whylabs.WhyLabs.models.shared.AdminReportType;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GenerateReportRequest req = new GenerateReportRequest(AdminReportType.SESSIONS, AdminReportTimePeriod.MONTH);            

            GenerateReportResponse res = sdk.admin.generateReport(req, new GenerateReportSecurity("provident") {{
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
<!-- End SDK Example Usage -->