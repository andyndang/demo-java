<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse;
import ai.whylabs.WhyLabs.models.shared.CreateAccountUserRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            CreateAccountUserRequest req = new CreateAccountUserRequest(new CreateAccountUserRequest("string"){{
active = false;
externalId = "string";
userSchema = "string";
}}, "org-123");            

            CreateAccountUserResponse res = sdk.account.createAccountUser(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->