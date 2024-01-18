# Internal
(*internal*)

### Available Operations

* [activateAzureSubscription](#activateazuresubscription) - Endpoint to activate Azure Marketplace subscriptions
* [activateMarketplaceSubscriptionInternal](#activatemarketplacesubscriptioninternal) - Activate Azure Marketplace subscription to an existing organization.
* [azureMarketplaceWebhook](#azuremarketplacewebhook) - Endpoint for Azure Marketplace webhooks
* [createAccountUser](#createaccountuser) - Create an account user
* [createMembership](#createmembership) - Create a membership for a user, making them apart of an organization. Uses the user's current email address.
* [createOrganization](#createorganization) - Create an organization
* [createUser](#createuser) - Create a user.
* [deleteAccountUser](#deleteaccountuser) - Delete account user
* [deleteOrganization](#deleteorganization) - Delete an org
* [generateReport](#generatereport) - Generate an admin report
* [getAWSMarketplaceMetadata](#getawsmarketplacemetadata) - Get marketplace metadata for an org if any exists.
* [getAccountMemberships](#getaccountmemberships) - Get memberships in an account
* [getAccountUserByEmail](#getaccountuserbyemail) - Get account user by email
* [getAccountUserById](#getaccountuserbyid) - Get account user by user_id
* [getApiKey](#getapikey) - Get an api key by its id
* [getConnection](#getconnection) - Get the connection metadata for a given org
* [getDefaultMembershipForEmail](#getdefaultmembershipforemail) - Get the default membership for a user.
* [getFeatureFlags](#getfeatureflags) - Get feature flags for the specified user/org
* [getMemberships](#getmemberships) - Get memberships for a user.
* [getMembershipsByEmail](#getmembershipsbyemail) - Get memberships for a user given that user's email address.
* [getMembershipsByOrg](#getmembershipsbyorg) - Get memberships for an org.
* [getMonitorConfigV3Version](#getmonitorconfigv3version) - Get the monitor config document version for a given dataset.
* [getNotificationSettings](#getnotificationsettings) - Get notification settings for an org
* [getOrganization](#getorganization) - Get the metadata about an organization.
* [getOrganizationSubscriptions](#getorganizationsubscriptions) - Get organization subscription details
* [getUser](#getuser) - Get a user by their id.
* [getUserByEmail](#getuserbyemail) - Get a user by their email.
* [hideSegments](#hidesegments) - Hides a list of segments
* [listAccountUsers](#listaccountusers) - List users in an account
* [listApiKeys](#listapikeys) - List API key metadata for a given organization and user
* [listAzureMarketplaceSubscriptions](#listazuremarketplacesubscriptions) - List Azure Marketplace subscriptions
* [listJobs](#listjobs) - List all of the jobs in a workspace.
* [listManagedOrganizations](#listmanagedorganizations) - List managed organizations for a parent organization
* [listMonitorConfigV3Versions](#listmonitorconfigv3versions) - List the monitor config document versions for a given dataset.
* [listOrganizations](#listorganizations) - Get a list of all of the organization ids.
* [~~partiallyUpdateOrg~~](#partiallyupdateorg) - Update some fields of an organization to non-null values :warning: **Deprecated**
* [partiallyUpdateOrganization](#partiallyupdateorganization) - Update some fields of an organization to non-null values
* [patchOrganizationMemberships](#patchorganizationmemberships) - Add or delete memberships in a specific role and managed organization
* [postMonitorConfigValidationJob](#postmonitorconfigvalidationjob) - Create a monitor config validation job for all configs
* [provisionAWSMarketplaceNewUser](#provisionawsmarketplacenewuser) - Create resources for a new user coming from AWS Marketplace
* [provisionDatabricksConnection](#provisiondatabricksconnection) - Create resources for a new user coming from Databricks
* [provisionNewUser](#provisionnewuser) - Create the resources that a new user needs to use WhyLabs via the website.
* [putOrganizationMemberships](#putorganizationmemberships) - Replace the memberships in a specific role and managed organization
* [putRequestMonitorRunConfig](#putrequestmonitorrunconfig) - Put the RequestMonitorRun config into S3.
* [refreshConnection](#refreshconnection) - Refresh metadata for a workspace connection.
* [registerDatabricksConnection](#registerdatabricksconnection) - Register databricks metadata, temporarily storing it against a UUID so that it can be used to provision a databricks connection after email authentication
* [removeMembershipByEmail](#removemembershipbyemail) - Removes membership in a given org from a user, using the user's email address.
* [runJob](#runjob) - Run an existing job in a given databricks workspace.
* [setDefaultMembership](#setdefaultmembership) - Sets the organization that should be used when logging a user in
* [stripePaymentEndpoint](#stripepaymentendpoint) - Endpoint for Stripe payment webhooks
* [updateAccountUser](#updateaccountuser) - Update account user
* [updateConnection](#updateconnection) - Update the connection metadata for a given org
* [updateMembershipByEmail](#updatemembershipbyemail) - Updates the role in an membership
* [updateNotificationSettings](#updatenotificationsettings) - Update notification settings for an org
* [~~updateOrg~~](#updateorg) - Update an existing organization :warning: **Deprecated**
* [updateOrganization](#updateorganization) - Update an existing organization
* [updateUser](#updateuser) - Update a user.
* [whyLabsSearch](#whylabssearch) - WhyLabs Search
* [whyLabsSearchIndexing](#whylabssearchindexing) - WhyLabs Search Indexing

## activateAzureSubscription

Endpoint to activate Azure Marketplace subscriptions

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ActivateAzureSubscriptionResponse;
import ai.whylabs.WhyLabs.models.shared.ActivateAzureSubscriptionRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.ActivateAzureSubscriptionRequest req = new ActivateAzureSubscriptionRequest(
                "string",
                "string",
                "string"){{
                expectExisting = false;
                modelName = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.ActivateAzureSubscriptionResponse res = sdk.internal.activateAzureSubscription(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.shared.ActivateAzureSubscriptionRequest](../../models/shared/ActivateAzureSubscriptionRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.ActivateAzureSubscriptionResponse](../../models/operations/ActivateAzureSubscriptionResponse.md)**


## activateMarketplaceSubscriptionInternal

Activate Azure Marketplace subscription to an existing organization.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalRequest;
import ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalRequest req = new ActivateMarketplaceSubscriptionInternalRequest(
                "string",
                "string");

            ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalResponse res = sdk.internal.activateMarketplaceSubscriptionInternal(req);

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalRequest](../../models/operations/ActivateMarketplaceSubscriptionInternalRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.ActivateMarketplaceSubscriptionInternalResponse](../../models/operations/ActivateMarketplaceSubscriptionInternalResponse.md)**


## azureMarketplaceWebhook

Endpoint for Azure Marketplace webhooks

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.AzureMarketplaceWebhookResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            String req = "string";

            ai.whylabs.WhyLabs.models.operations.AzureMarketplaceWebhookResponse res = sdk.internal.azureMarketplaceWebhook(req);

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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[ai.whylabs.WhyLabs.models.operations.AzureMarketplaceWebhookResponse](../../models/operations/AzureMarketplaceWebhookResponse.md)**


## createAccountUser

Create an account user

### Example Usage

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest req = new CreateAccountUserRequest(
                new CreateAccountUserRequest(
                    "string"){{
                    active = false;
                    externalId = "string";
                    userSchema = "string";

                }},
                "org-123");

            ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse res = sdk.internal.createAccountUser(req);

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
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest](../../models/operations/CreateAccountUserRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse](../../models/operations/CreateAccountUserResponse.md)**


## createMembership

Create a membership for a user, making them apart of an organization. Uses the user's current email address.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateMembershipResponse;
import ai.whylabs.WhyLabs.models.shared.AddMembershipRequest;
import ai.whylabs.WhyLabs.models.shared.Role;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.AddMembershipRequest req = new AddMembershipRequest(
                "string",
                "string",
                Role.ADMIN){{
                createdBy = "string";
                default_ = false;

            }};

            ai.whylabs.WhyLabs.models.operations.CreateMembershipResponse res = sdk.internal.createMembership(req);

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
| `request`                                                                                            | [ai.whylabs.WhyLabs.models.shared.AddMembershipRequest](../../models/shared/AddMembershipRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateMembershipResponse](../../models/operations/CreateMembershipResponse.md)**


## createOrganization

Create an organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateOrganizationRequest;
import ai.whylabs.WhyLabs.models.operations.CreateOrganizationResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.CreateOrganizationRequest req = new CreateOrganizationRequest(
                "ACME, Inc"){{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                overrideId = "org-123";
                pagerDutyKey = "abc-def-ghi-jkl";
                parentOrgId = "org-123";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                storageBucketOverride = "https://s3.us-west-2.amazonaws.com/whylabs-public/";
                subscriptionTier = SubscriptionTier.FREE;

            }};

            ai.whylabs.WhyLabs.models.operations.CreateOrganizationResponse res = sdk.internal.createOrganization(req);

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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.CreateOrganizationRequest](../../models/operations/CreateOrganizationRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateOrganizationResponse](../../models/operations/CreateOrganizationResponse.md)**


## createUser

Create a user.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateUserResponse;
import ai.whylabs.WhyLabs.models.shared.CreateUserRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.CreateUserRequest req = new CreateUserRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.CreateUserResponse res = sdk.internal.createUser(req);

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

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [ai.whylabs.WhyLabs.models.shared.CreateUserRequest](../../models/shared/CreateUserRequest.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateUserResponse](../../models/operations/CreateUserResponse.md)**


## deleteAccountUser

Delete an account user's details

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteAccountUserRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteAccountUserResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.DeleteAccountUserRequest req = new DeleteAccountUserRequest(
                "org-123",
                "user-123");

            ai.whylabs.WhyLabs.models.operations.DeleteAccountUserResponse res = sdk.internal.deleteAccountUser(req);

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
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.operations.DeleteAccountUserRequest](../../models/operations/DeleteAccountUserRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteAccountUserResponse](../../models/operations/DeleteAccountUserResponse.md)**


## deleteOrganization

Delete an org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteOrganizationRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteOrganizationResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.DeleteOrganizationRequest req = new DeleteOrganizationRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.DeleteOrganizationResponse res = sdk.internal.deleteOrganization(req);

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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.DeleteOrganizationRequest](../../models/operations/DeleteOrganizationRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteOrganizationResponse](../../models/operations/DeleteOrganizationResponse.md)**


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
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GenerateReportRequest req = new GenerateReportRequest(
                AdminReportType.SESSIONS);

            ai.whylabs.WhyLabs.models.operations.GenerateReportResponse res = sdk.internal.generateReport(req);

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


## getAWSMarketplaceMetadata

Get marketplace metadata for an org if any exists.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetAWSMarketplaceMetadataRequest;
import ai.whylabs.WhyLabs.models.operations.GetAWSMarketplaceMetadataResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetAWSMarketplaceMetadataRequest req = new GetAWSMarketplaceMetadataRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetAWSMarketplaceMetadataResponse res = sdk.internal.getAWSMarketplaceMetadata(req);

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
| `request`                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.GetAWSMarketplaceMetadataRequest](../../models/operations/GetAWSMarketplaceMetadataRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetAWSMarketplaceMetadataResponse](../../models/operations/GetAWSMarketplaceMetadataResponse.md)**


## getAccountMemberships

Get memberships in the account organization and any managed organizations

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsResponse;
import ai.whylabs.WhyLabs.models.shared.Role;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsRequest req = new GetAccountMembershipsRequest(
                "org-123"){{
                managedOrgId = "org-123";
                role = Role.VIEWER;
                userId = "user-123";

            }};

            ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsResponse res = sdk.internal.getAccountMemberships(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsRequest](../../models/operations/GetAccountMembershipsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsResponse](../../models/operations/GetAccountMembershipsResponse.md)**


## getAccountUserByEmail

Get account user by email

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailRequest;
import ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailRequest req = new GetAccountUserByEmailRequest(
                "user@whylabs.ai",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailResponse res = sdk.internal.getAccountUserByEmail(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailRequest](../../models/operations/GetAccountUserByEmailRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailResponse](../../models/operations/GetAccountUserByEmailResponse.md)**


## getAccountUserById

Get account user by user_id

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetAccountUserByIdRequest;
import ai.whylabs.WhyLabs.models.operations.GetAccountUserByIdResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetAccountUserByIdRequest req = new GetAccountUserByIdRequest(
                "org-123",
                "user-123");

            ai.whylabs.WhyLabs.models.operations.GetAccountUserByIdResponse res = sdk.internal.getAccountUserById(req);

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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.GetAccountUserByIdRequest](../../models/operations/GetAccountUserByIdRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetAccountUserByIdResponse](../../models/operations/GetAccountUserByIdResponse.md)**


## getApiKey

Get an api key by its id

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetApiKeyRequest;
import ai.whylabs.WhyLabs.models.operations.GetApiKeyResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetApiKeyRequest req = new GetApiKeyRequest(
                "fh4dUNV3WQ",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.GetApiKeyResponse res = sdk.internal.getApiKey(req);

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
| `request`                                                                                            | [ai.whylabs.WhyLabs.models.operations.GetApiKeyRequest](../../models/operations/GetApiKeyRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetApiKeyResponse](../../models/operations/GetApiKeyResponse.md)**


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
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.GetConnectionRequest req = new GetConnectionRequest(
){{
                orgId = "string";
                workspaceId = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.GetConnectionResponse res = sdk.internal.getConnection(req);

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


## getDefaultMembershipForEmail

Get the default membership for a user.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailRequest;
import ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailRequest req = new GetDefaultMembershipForEmailRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailResponse res = sdk.internal.getDefaultMembershipForEmail(req);

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
| `request`                                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailRequest](../../models/operations/GetDefaultMembershipForEmailRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailResponse](../../models/operations/GetDefaultMembershipForEmailResponse.md)**


## getFeatureFlags

Get feature flags for the specified user/org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsRequest;
import ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsRequest req = new GetFeatureFlagsRequest(
                "string",
                "string");

            ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsResponse res = sdk.internal.getFeatureFlags(req);

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
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsRequest](../../models/operations/GetFeatureFlagsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsResponse](../../models/operations/GetFeatureFlagsResponse.md)**


## getMemberships

Get memberships for a user.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.GetMembershipsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetMembershipsRequest req = new GetMembershipsRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetMembershipsResponse res = sdk.internal.getMemberships(req);

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
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GetMembershipsRequest](../../models/operations/GetMembershipsRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetMembershipsResponse](../../models/operations/GetMembershipsResponse.md)**


## getMembershipsByEmail

Get memberships for a user given that user's email address.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetMembershipsByEmailRequest;
import ai.whylabs.WhyLabs.models.operations.GetMembershipsByEmailResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetMembershipsByEmailRequest req = new GetMembershipsByEmailRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetMembershipsByEmailResponse res = sdk.internal.getMembershipsByEmail(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.GetMembershipsByEmailRequest](../../models/operations/GetMembershipsByEmailRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetMembershipsByEmailResponse](../../models/operations/GetMembershipsByEmailResponse.md)**


## getMembershipsByOrg

Get memberships for an org.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetMembershipsByOrgRequest;
import ai.whylabs.WhyLabs.models.operations.GetMembershipsByOrgResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetMembershipsByOrgRequest req = new GetMembershipsByOrgRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetMembershipsByOrgResponse res = sdk.internal.getMembershipsByOrg(req);

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
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.GetMembershipsByOrgRequest](../../models/operations/GetMembershipsByOrgRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetMembershipsByOrgResponse](../../models/operations/GetMembershipsByOrgResponse.md)**


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
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionRequest req = new GetMonitorConfigV3VersionRequest(
                "model-123",
                "org-123",
                "4920545486e2a4cdf0f770c09748e663");

            ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionResponse res = sdk.internal.getMonitorConfigV3Version(req);

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


## getNotificationSettings

Get notification settings for an org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsRequest;
import ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsRequest req = new GetNotificationSettingsRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsResponse res = sdk.internal.getNotificationSettings(req);

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
| `request`                                                                                                                        | [ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsRequest](../../models/operations/GetNotificationSettingsRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsResponse](../../models/operations/GetNotificationSettingsResponse.md)**


## getOrganization

Returns various metadata about an organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetOrganizationRequest;
import ai.whylabs.WhyLabs.models.operations.GetOrganizationResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetOrganizationRequest req = new GetOrganizationRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetOrganizationResponse res = sdk.internal.getOrganization(req);

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
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.GetOrganizationRequest](../../models/operations/GetOrganizationRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetOrganizationResponse](../../models/operations/GetOrganizationResponse.md)**


## getOrganizationSubscriptions

Get organization subscription details

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetOrganizationSubscriptionsRequest;
import ai.whylabs.WhyLabs.models.operations.GetOrganizationSubscriptionsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetOrganizationSubscriptionsRequest req = new GetOrganizationSubscriptionsRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetOrganizationSubscriptionsResponse res = sdk.internal.getOrganizationSubscriptions(req);

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
| `request`                                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.GetOrganizationSubscriptionsRequest](../../models/operations/GetOrganizationSubscriptionsRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetOrganizationSubscriptionsResponse](../../models/operations/GetOrganizationSubscriptionsResponse.md)**


## getUser

Get a user by their id.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetUserRequest;
import ai.whylabs.WhyLabs.models.operations.GetUserResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetUserRequest req = new GetUserRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetUserResponse res = sdk.internal.getUser(req);

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
| `request`                                                                                        | [ai.whylabs.WhyLabs.models.operations.GetUserRequest](../../models/operations/GetUserRequest.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetUserResponse](../../models/operations/GetUserResponse.md)**


## getUserByEmail

Get a user by their email.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetUserByEmailRequest;
import ai.whylabs.WhyLabs.models.operations.GetUserByEmailResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetUserByEmailRequest req = new GetUserByEmailRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetUserByEmailResponse res = sdk.internal.getUserByEmail(req);

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
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GetUserByEmailRequest](../../models/operations/GetUserByEmailRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetUserByEmailResponse](../../models/operations/GetUserByEmailResponse.md)**


## hideSegments

Returns a list of segments that were hidden for a dataset.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.HideSegmentsRequest;
import ai.whylabs.WhyLabs.models.operations.HideSegmentsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SegmentsListRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.HideSegmentsRequest req = new HideSegmentsRequest(
                new SegmentsListRequest(
){{
                    segments = new String[]{{
                        add("string"),
                    }};

                }},
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.HideSegmentsResponse res = sdk.internal.hideSegments(req);

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
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.operations.HideSegmentsRequest](../../models/operations/HideSegmentsRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.HideSegmentsResponse](../../models/operations/HideSegmentsResponse.md)**


## listAccountUsers

List users in the account organization and any managed organizations

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListAccountUsersRequest;
import ai.whylabs.WhyLabs.models.operations.ListAccountUsersResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListAccountUsersRequest req = new ListAccountUsersRequest(
                "org-123");

            ai.whylabs.WhyLabs.models.operations.ListAccountUsersResponse res = sdk.internal.listAccountUsers(req);

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
| `request`                                                                                                          | [ai.whylabs.WhyLabs.models.operations.ListAccountUsersRequest](../../models/operations/ListAccountUsersRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListAccountUsersResponse](../../models/operations/ListAccountUsersResponse.md)**


## listApiKeys

Returns the API key metadata for a given organization and user

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListApiKeysRequest;
import ai.whylabs.WhyLabs.models.operations.ListApiKeysResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListApiKeysRequest req = new ListApiKeysRequest(
                "org-123"){{
                userId = "user-123";

            }};

            ai.whylabs.WhyLabs.models.operations.ListApiKeysResponse res = sdk.internal.listApiKeys(req);

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
| `request`                                                                                                | [ai.whylabs.WhyLabs.models.operations.ListApiKeysRequest](../../models/operations/ListApiKeysRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListApiKeysResponse](../../models/operations/ListApiKeysResponse.md)**


## listAzureMarketplaceSubscriptions

List Azure Marketplace subscriptions

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListAzureMarketplaceSubscriptionsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListAzureMarketplaceSubscriptionsResponse res = sdk.internal.listAzureMarketplaceSubscriptions();

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

**[ai.whylabs.WhyLabs.models.operations.ListAzureMarketplaceSubscriptionsResponse](../../models/operations/ListAzureMarketplaceSubscriptionsResponse.md)**


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
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.ListJobsRequest req = new ListJobsRequest(
){{
                orgId = "string";
                workspaceId = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.ListJobsResponse res = sdk.internal.listJobs(req);

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


## listManagedOrganizations

List managed organizations for a parent organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsRequest;
import ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsRequest req = new ListManagedOrganizationsRequest(
                "org-123");

            ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsResponse res = sdk.internal.listManagedOrganizations(req);

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
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsRequest](../../models/operations/ListManagedOrganizationsRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsResponse](../../models/operations/ListManagedOrganizationsResponse.md)**


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
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsRequest req = new ListMonitorConfigV3VersionsRequest(
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.ListMonitorConfigV3VersionsResponse res = sdk.internal.listMonitorConfigV3Versions(req);

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


## listOrganizations

Get a list of all of the organization ids.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListOrganizationsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListOrganizationsResponse res = sdk.internal.listOrganizations();

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

**[ai.whylabs.WhyLabs.models.operations.ListOrganizationsResponse](../../models/operations/ListOrganizationsResponse.md)**


## ~~partiallyUpdateOrg~~

Update some fields of an organization to non-null values, leaving all other existing values the same

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrgRequest;
import ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrgRequestBody;
import ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrgResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrgRequest req = new PartiallyUpdateOrgRequest(
                new PartiallyUpdateOrgRequestBody(
){{
                    orgId = "string";

                }}){{
                domain = "acme.ai";
                name = "ACME, Inc";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.PAID;

            }};

            ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrgResponse res = sdk.internal.partiallyUpdateOrg(req);

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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrgRequest](../../models/operations/PartiallyUpdateOrgRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrgResponse](../../models/operations/PartiallyUpdateOrgResponse.md)**


## partiallyUpdateOrganization

Update some fields of an organization to non-null values, leaving all other existing values the same

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrganizationRequest;
import ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrganizationResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrganizationRequest req = new PartiallyUpdateOrganizationRequest(
                "string"){{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                name = "ACME, Inc";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                pagerDutyKey = "abc-def-ghi-jkl";
                parentOrgId = "abc-def-ghi-jkl";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                storageBucketOverride = "https://s3.us-west-2.amazonaws.com/whylabs-public/";
                subscriptionTier = SubscriptionTier.PAID;

            }};

            ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrganizationResponse res = sdk.internal.partiallyUpdateOrganization(req);

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
| `request`                                                                                                                                | [ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrganizationRequest](../../models/operations/PartiallyUpdateOrganizationRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrganizationResponse](../../models/operations/PartiallyUpdateOrganizationResponse.md)**


## patchOrganizationMemberships

Add or delete all of the memberships in a specific role and managed organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsResponse;
import ai.whylabs.WhyLabs.models.shared.PatchAccountMembershipsRequest;
import ai.whylabs.WhyLabs.models.shared.Role;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsRequest req = new PatchOrganizationMembershipsRequest(
                new PatchAccountMembershipsRequest(
                    new String[]{{
                        add("string"),
                    }},
                    new String[]{{
                        add("string"),
                    }}),
                "org-123",
                "org-123",
                Role.VIEWER);

            ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsResponse res = sdk.internal.patchOrganizationMemberships(req);

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
| `request`                                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsRequest](../../models/operations/PatchOrganizationMembershipsRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsResponse](../../models/operations/PatchOrganizationMembershipsResponse.md)**


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
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse res = sdk.internal.postMonitorConfigValidationJob();

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.ProvisionNewMarketplaceUserRequest req = new ProvisionNewMarketplaceUserRequest(
                "string",
                "string",
                "string",
                "string"){{
                expectExisting = false;

            }};

            ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserResponse res = sdk.internal.provisionAWSMarketplaceNewUser(req);

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.ProvisionDatabricksConnectionRequest req = new ProvisionDatabricksConnectionRequest(
                "string",
                false,
                "string");

            ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionResponse res = sdk.internal.provisionDatabricksConnection(req);

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.ProvisionNewUserRequest req = new ProvisionNewUserRequest(
                "string",
                "string",
                "string",
                SubscriptionTier.AWS_MARKETPLACE){{
                expectExisting = false;

            }};

            ai.whylabs.WhyLabs.models.operations.ProvisionNewUserResponse res = sdk.internal.provisionNewUser(req);

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


## putOrganizationMemberships

Replace all of the memberships in a specific role and managed organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsResponse;
import ai.whylabs.WhyLabs.models.shared.PutAccountMembershipsRequest;
import ai.whylabs.WhyLabs.models.shared.Role;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsRequest req = new PutOrganizationMembershipsRequest(
                new PutAccountMembershipsRequest(
                    new String[]{{
                        add("string"),
                    }}),
                "org-123",
                "org-123",
                Role.VIEWER);

            ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsResponse res = sdk.internal.putOrganizationMemberships(req);

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
| `request`                                                                                                                              | [ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsRequest](../../models/operations/PutOrganizationMembershipsRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsResponse](../../models/operations/PutOrganizationMembershipsResponse.md)**


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
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
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

            ai.whylabs.WhyLabs.models.operations.PutRequestMonitorRunConfigResponse res = sdk.internal.putRequestMonitorRunConfig(req);

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
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.RefreshConnectionRequest req = new RefreshConnectionRequest(
){{
                orgId = "string";
                workspaceId = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.RefreshConnectionResponse res = sdk.internal.refreshConnection(req);

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.RegisterDatabricksConnectionRequest req = new RegisterDatabricksConnectionRequest(
                "string",
                "string",
                "string",
                false,
                "string",
                "string",
                369919,
                "string",
                "string"){{
                connectionEstablished = false;
                freeTrial = false;

            }};

            ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionResponse res = sdk.internal.registerDatabricksConnection(req);

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


## removeMembershipByEmail

Removes membership in a given org from a user, using the user's email address.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.RemoveMembershipByEmailResponse;
import ai.whylabs.WhyLabs.models.shared.RemoveMembershipRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.RemoveMembershipRequest req = new RemoveMembershipRequest(
                "string",
                "string");

            ai.whylabs.WhyLabs.models.operations.RemoveMembershipByEmailResponse res = sdk.internal.removeMembershipByEmail(req);

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
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.shared.RemoveMembershipRequest](../../models/shared/RemoveMembershipRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.RemoveMembershipByEmailResponse](../../models/operations/RemoveMembershipByEmailResponse.md)**


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
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.RunJobRequest req = new RunJobRequest(
                353621L){{
                orgId = "string";
                workspaceId = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.RunJobResponse res = sdk.internal.runJob(req);

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


## setDefaultMembership

Sets the organization that should be used when logging a user in

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.SetDefaultMembershipResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SetDefaultMembershipRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.SetDefaultMembershipRequest req = new SetDefaultMembershipRequest(
                "string",
                "string");

            ai.whylabs.WhyLabs.models.operations.SetDefaultMembershipResponse res = sdk.internal.setDefaultMembership(req);

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
| `request`                                                                                                          | [ai.whylabs.WhyLabs.models.shared.SetDefaultMembershipRequest](../../models/shared/SetDefaultMembershipRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[ai.whylabs.WhyLabs.models.operations.SetDefaultMembershipResponse](../../models/operations/SetDefaultMembershipResponse.md)**


## stripePaymentEndpoint

Endpoint for Stripe payment webhooks

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.StripePaymentEndpointResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            String req = "string";

            ai.whylabs.WhyLabs.models.operations.StripePaymentEndpointResponse res = sdk.internal.stripePaymentEndpoint(req);

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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[ai.whylabs.WhyLabs.models.operations.StripePaymentEndpointResponse](../../models/operations/StripePaymentEndpointResponse.md)**


## updateAccountUser

Update an account user's details

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.UpdateAccountUserRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.UpdateAccountUserRequest req = new UpdateAccountUserRequest(
                new UpdateAccountUserRequest(
){{
                    active = false;
                    externalId = "string";
                    userSchema = "string";

                }},
                "org-123",
                "user-123");

            ai.whylabs.WhyLabs.models.operations.UpdateAccountUserResponse res = sdk.internal.updateAccountUser(req);

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
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.operations.UpdateAccountUserRequest](../../models/operations/UpdateAccountUserRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateAccountUserResponse](../../models/operations/UpdateAccountUserResponse.md)**


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
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
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

            ai.whylabs.WhyLabs.models.operations.UpdateConnectionResponse res = sdk.internal.updateConnection(req);

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


## updateMembershipByEmail

Updates the role in an membership, given the organization and the user's email address.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateMembershipByEmailResponse;
import ai.whylabs.WhyLabs.models.shared.Role;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.UpdateMembershipRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.UpdateMembershipRequest req = new UpdateMembershipRequest(
                "string",
                "string",
                Role.VIEWER);

            ai.whylabs.WhyLabs.models.operations.UpdateMembershipByEmailResponse res = sdk.internal.updateMembershipByEmail(req);

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
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.shared.UpdateMembershipRequest](../../models/shared/UpdateMembershipRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateMembershipByEmailResponse](../../models/operations/UpdateMembershipByEmailResponse.md)**


## updateNotificationSettings

Update notification settings for an org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsResponse;
import ai.whylabs.WhyLabs.models.shared.NotificationSettings;
import ai.whylabs.WhyLabs.models.shared.NotificationSettingsDay;
import ai.whylabs.WhyLabs.models.shared.NotificationSqsMessageCadence;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.UberNotificationSchedule;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsRequest req = new UpdateNotificationSettingsRequest(
                new NotificationSettings(
){{
                    emailSettings = new UberNotificationSchedule(
                        NotificationSqsMessageCadence.HOURLY,
                        false){{
                        dayOfWeek = NotificationSettingsDay.MONDAY;
                        local24HourOfDay = 809295;
                        localMinuteOfHour = 562664;
                        localTimezone = "string";

                    }};
                    pagerDutySettings = new UberNotificationSchedule(
                        NotificationSqsMessageCadence.DAILY,
                        false){{
                        dayOfWeek = NotificationSettingsDay.SUNDAY;
                        local24HourOfDay = 410267;
                        localMinuteOfHour = 406102;
                        localTimezone = "string";

                    }};
                    slackSettings = new UberNotificationSchedule(
                        NotificationSqsMessageCadence.INDIVIDUAL,
                        false){{
                        dayOfWeek = NotificationSettingsDay.THURSDAY;
                        local24HourOfDay = 259105;
                        localMinuteOfHour = 749170;
                        localTimezone = "string";

                    }};

                }},
                "string");

            ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsResponse res = sdk.internal.updateNotificationSettings(req);

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
| `request`                                                                                                                              | [ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsRequest](../../models/operations/UpdateNotificationSettingsRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsResponse](../../models/operations/UpdateNotificationSettingsResponse.md)**


## ~~updateOrg~~

Update all fields of an existing organization

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateOrgRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateOrgRequestBody;
import ai.whylabs.WhyLabs.models.operations.UpdateOrgResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.UpdateOrgRequest req = new UpdateOrgRequest(
                new UpdateOrgRequestBody(
){{
                    orgId = "string";

                }},
                "ACME, Inc"){{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                pagerDutyKey = "abc-def-ghi-jkl";
                parentOrgId = "org-123";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.AWS_MARKETPLACE;

            }};

            ai.whylabs.WhyLabs.models.operations.UpdateOrgResponse res = sdk.internal.updateOrg(req);

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
| `request`                                                                                            | [ai.whylabs.WhyLabs.models.operations.UpdateOrgRequest](../../models/operations/UpdateOrgRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateOrgResponse](../../models/operations/UpdateOrgResponse.md)**


## updateOrganization

Update all fields of an existing organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateOrganizationRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateOrganizationResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.UpdateOrganizationRequest req = new UpdateOrganizationRequest(
                "ACME, Inc",
                "string"){{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                pagerDutyKey = "abc-def-ghi-jkl";
                parentOrgId = "org-123";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                storageBucketOverride = "https://s3.us-west-2.amazonaws.com/whylabs-public/";
                subscriptionTier = SubscriptionTier.AWS_MARKETPLACE;

            }};

            ai.whylabs.WhyLabs.models.operations.UpdateOrganizationResponse res = sdk.internal.updateOrganization(req);

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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.UpdateOrganizationRequest](../../models/operations/UpdateOrganizationRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateOrganizationResponse](../../models/operations/UpdateOrganizationResponse.md)**


## updateUser

Update a user.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateUserResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.User req = new User(
                "string",
                "string"){{
                preferences = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.UpdateUserResponse res = sdk.internal.updateUser(req);

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

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [ai.whylabs.WhyLabs.models.shared.User](../../models/shared/User.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateUserResponse](../../models/operations/UpdateUserResponse.md)**


## whyLabsSearch

WhyLabs Search

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchRequest;
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.WhyLabsSearchRequest req = new WhyLabsSearchRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.WhyLabsSearchResponse res = sdk.internal.whyLabsSearch(req);

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
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.WhyLabsSearchRequest](../../models/operations/WhyLabsSearchRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.WhyLabsSearchResponse](../../models/operations/WhyLabsSearchResponse.md)**


## whyLabsSearchIndexing

WhyLabs Search Indexing

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingResponse;
import ai.whylabs.WhyLabs.models.shared.SearchIndexRequest;
import ai.whylabs.WhyLabs.models.shared.SearchIndexType;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.SearchIndexRequest req = new SearchIndexRequest(
){{
                orgId = "string";
                type = SearchIndexType.MODELS;

            }};

            ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingResponse res = sdk.internal.whyLabsSearchIndexing(req);

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
| `request`                                                                                        | [ai.whylabs.WhyLabs.models.shared.SearchIndexRequest](../../models/shared/SearchIndexRequest.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingResponse](../../models/operations/WhyLabsSearchIndexingResponse.md)**

