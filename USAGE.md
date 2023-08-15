<!-- Start SDK Example Usage -->


```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserSecurity;
import ai.whylabs.WhyLabs.models.shared.CreateAccountUserRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            CreateAccountUserRequest req = new CreateAccountUserRequest(                new CreateAccountUserRequest("corrupti") {{
                                active = false;
                                externalId = "provident";
                                userSchema = "distinctio";
                            }};, "org-123");            

            CreateAccountUserResponse res = sdk.account.createAccountUser(req, new CreateAccountUserSecurity("quibusdam") {{
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