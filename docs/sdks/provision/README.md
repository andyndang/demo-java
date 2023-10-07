# Provision
(*provision*)

### Available Operations

* [provisionAWSMarketplaceNewUser](#provisionawsmarketplacenewuser) - Create resources for a new user coming from AWS Marketplace
* [provisionDatabricksConnection](#provisiondatabricksconnection) - Create resources for a new user coming from Databricks
* [provisionNewUser](#provisionnewuser) - Create the resources that a new user needs to use WhyLabs via the website.
* [registerDatabricksConnection](#registerdatabricksconnection) - Register databricks metadata, temporarily storing it against a UUID so that it can be used to provision a databricks connection after email authentication

## provisionAWSMarketplaceNewUser

Create resources for a new user coming from AWS Marketplace

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserResponse;
import ai.whylabs.WhyLabs.models.shared.ProvisionNewMarketplaceUserRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("Infrastructure"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.ProvisionNewMarketplaceUserRequest req = new ProvisionNewMarketplaceUserRequest("Barium", "Hill", "woman", "male"){{
                expectExisting = false;
            }};            

            ProvisionAWSMarketplaceNewUserResponse res = sdk.provision.provisionAWSMarketplaceNewUser(req);

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
| `request`                                                                                                                        | [ai.whylabs.WhyLabs.models.shared.ProvisionNewMarketplaceUserRequest](../../models/shared/ProvisionNewMarketplaceUserRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserResponse](../../models/operations/ProvisionAWSMarketplaceNewUserResponse.md)**


## provisionDatabricksConnection

Create resources for a new user coming from Databricks

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionResponse;
import ai.whylabs.WhyLabs.models.shared.ProvisionDatabricksConnectionRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("Androgynous"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.ProvisionDatabricksConnectionRequest req = new ProvisionDatabricksConnectionRequest("Sleek", false, "Regional");            

            ProvisionDatabricksConnectionResponse res = sdk.provision.provisionDatabricksConnection(req);

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
| `request`                                                                                                                            | [ai.whylabs.WhyLabs.models.shared.ProvisionDatabricksConnectionRequest](../../models/shared/ProvisionDatabricksConnectionRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionResponse](../../models/operations/ProvisionDatabricksConnectionResponse.md)**


## provisionNewUser

Create the resources that a new user needs to use WhyLabs via the website.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ProvisionNewUserResponse;
import ai.whylabs.WhyLabs.models.shared.ProvisionNewUserRequest;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("Beryllium"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.ProvisionNewUserRequest req = new ProvisionNewUserRequest("Future", "Savings", "Northwest", SubscriptionTier.PAID){{
                expectExisting = false;
            }};            

            ProvisionNewUserResponse res = sdk.provision.provisionNewUser(req);

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
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.shared.ProvisionNewUserRequest](../../models/shared/ProvisionNewUserRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.ProvisionNewUserResponse](../../models/operations/ProvisionNewUserResponse.md)**


## registerDatabricksConnection

Register databricks metadata, temporarily storing it against a UUID so that it can be used to provision a databricks connection after email authentication

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionResponse;
import ai.whylabs.WhyLabs.models.shared.RegisterDatabricksConnectionRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("logistical"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.RegisterDatabricksConnectionRequest req = new RegisterDatabricksConnectionRequest("Operations", "Carolina", "digital", false, "Electric", "Blues", 610134, "Account", "Oganesson"){{
                connectionEstablished = false;
                freeTrial = false;
            }};            

            RegisterDatabricksConnectionResponse res = sdk.provision.registerDatabricksConnection(req);

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
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.shared.RegisterDatabricksConnectionRequest](../../models/shared/RegisterDatabricksConnectionRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionResponse](../../models/operations/RegisterDatabricksConnectionResponse.md)**

