# internal

### Available Operations

* [createAccountUser](#createaccountuser) - Create an account user
* [createMembership](#createmembership) - Create a membership for a user, making them apart of an organization. Uses the user's current email address.
* [createOrganization](#createorganization) - Create an organization
* [createUser](#createuser) - Create a user.
* [deleteAccountUser](#deleteaccountuser) - Delete account user
* [deleteOrganization](#deleteorganization) - Delete an org
* [generateReport](#generatereport) - Generate an admin report
* [getAWSMarketplaceMetadata](#getawsmarketplacemetadata) - Get marketplace metadata for an org if any exists.
* [getAccountMemberships](#getaccountmemberships) - Get memberships in an account
* [getAccountUsers](#getaccountusers) - Get users in an account
* [getApiKey](#getapikey) - Get an api key by its id
* [getConnection](#getconnection) - Get the connection metadata for a given org
* [getDefaultMembershipForEmail](#getdefaultmembershipforemail) - Get the default membership for a user.
* [getFeatureFlags](#getfeatureflags) - Get feature flags for the specified user/org
* [getMemberships](#getmemberships) - Get memberships for a user.
* [getMembershipsByEmail](#getmembershipsbyemail) - Get memberships for a user given that user's email address.
* [getMembershipsByOrg](#getmembershipsbyorg) - Get memberships for an org.
* [getMonitorConfigV3Version](#getmonitorconfigv3version) - Get the monitor config document version for a given dataset.
* [getNotificationSettings](#getnotificationsettings) - Get notification settings for an org
* [getOrgRoleMemberships](#getorgrolememberships) - Get memberships for a specific org and role
* [getOrganization](#getorganization) - Get the metadata about an organization.
* [getUser](#getuser) - Get a user by their id.
* [getUserByEmail](#getuserbyemail) - Get a user by their email.
* [hideSegments](#hidesegments) - Hides a list of segments
* [listApiKeys](#listapikeys) - List API key metadata for a given organization and user
* [listJobs](#listjobs) - List all of the jobs in a workspace.
* [listMonitorConfigV3Versions](#listmonitorconfigv3versions) - List the monitor config document versions for a given dataset.
* [listOrganizations](#listorganizations) - Get a list of all of the organization ids.
* [listSegments](#listsegments) - Returns a list of segments
* [~~partiallyUpdateOrg~~](#partiallyupdateorg) - Update some fields of an organization to non-null values :warning: **Deprecated**
* [partiallyUpdateOrganization](#partiallyupdateorganization) - Update some fields of an organization to non-null values
* [patchOrgRoleMemberships](#patchorgrolememberships) - Add or delete memberships in a specific role and managed organization
* [postMonitorConfigValidationJob](#postmonitorconfigvalidationjob) - Create a monitor config validation job for all configs
* [provisionAWSMarketplaceNewUser](#provisionawsmarketplacenewuser) - Create resources for a new user coming from AWS Marketplace
* [provisionDatabricksConnection](#provisiondatabricksconnection) - Create resources for a new user coming from Databricks
* [provisionNewUser](#provisionnewuser) - Create the resources that a new user needs to use WhyLabs via the website.
* [putOrgRoleMemberships](#putorgrolememberships) - Replace the memberships in a specific role and managed organization
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

## createAccountUser

Create an account user

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequestBody;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse;
import ai.whylabs.WhyLabs.models.operations.CreateAccountUserSecurity;
import ai.whylabs.WhyLabs.models.shared.AccountUser;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            CreateAccountUserRequest req = new CreateAccountUserRequest(                new CreateAccountUserRequestBody() {{
                                user = new AccountUser("laborum") {{
                                    active = false;
                                    externalId = "dolores";
                                    userId = "dolorem";
                                }};;
                            }};, "org-123");            

            CreateAccountUserResponse res = sdk.internal.createAccountUser(req, new CreateAccountUserSecurity("corporis") {{
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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest](../../models/operations/CreateAccountUserRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [ai.whylabs.WhyLabs.models.operations.CreateAccountUserSecurity](../../models/operations/CreateAccountUserSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateAccountUserResponse](../../models/operations/CreateAccountUserResponse.md)**


## createMembership

Create a membership for a user, making them apart of an organization. Uses the user's current email address.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateMembershipResponse;
import ai.whylabs.WhyLabs.models.operations.CreateMembershipSecurity;
import ai.whylabs.WhyLabs.models.shared.AddMembershipRequest;
import ai.whylabs.WhyLabs.models.shared.Role;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.AddMembershipRequest req = new AddMembershipRequest("explicabo", "nobis", Role.ADMIN) {{
                createdBy = "omnis";
                default_ = false;
            }};            

            CreateMembershipResponse res = sdk.internal.createMembership(req, new CreateMembershipSecurity("nemo") {{
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
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.shared.AddMembershipRequest](../../models/shared/AddMembershipRequest.md)                 | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [ai.whylabs.WhyLabs.models.operations.CreateMembershipSecurity](../../models/operations/CreateMembershipSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


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
import ai.whylabs.WhyLabs.models.operations.CreateOrganizationSecurity;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            CreateOrganizationRequest req = new CreateOrganizationRequest("ACME, Inc") {{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                overrideId = "org-123";
                pagerDutyKey = "abc-def-ghi-jkl";
                parentOrgId = "org-123";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.PAID;
            }};            

            CreateOrganizationResponse res = sdk.internal.createOrganization(req, new CreateOrganizationSecurity("excepturi") {{
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
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.CreateOrganizationRequest](../../models/operations/CreateOrganizationRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [ai.whylabs.WhyLabs.models.operations.CreateOrganizationSecurity](../../models/operations/CreateOrganizationSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateOrganizationResponse](../../models/operations/CreateOrganizationResponse.md)**


## createUser

Create a user.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateUserResponse;
import ai.whylabs.WhyLabs.models.operations.CreateUserSecurity;
import ai.whylabs.WhyLabs.models.shared.CreateUserRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.CreateUserRequest req = new CreateUserRequest("accusantium");            

            CreateUserResponse res = sdk.internal.createUser(req, new CreateUserSecurity("iure") {{
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
| `request`                                                                                                | [ai.whylabs.WhyLabs.models.shared.CreateUserRequest](../../models/shared/CreateUserRequest.md)           | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [ai.whylabs.WhyLabs.models.operations.CreateUserSecurity](../../models/operations/CreateUserSecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |


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
import ai.whylabs.WhyLabs.models.operations.DeleteAccountUserSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteAccountUserRequest req = new DeleteAccountUserRequest("org-123");            

            DeleteAccountUserResponse res = sdk.internal.deleteAccountUser(req, new DeleteAccountUserSecurity("culpa") {{
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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.DeleteAccountUserRequest](../../models/operations/DeleteAccountUserRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [ai.whylabs.WhyLabs.models.operations.DeleteAccountUserSecurity](../../models/operations/DeleteAccountUserSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


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
import ai.whylabs.WhyLabs.models.operations.DeleteOrganizationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteOrganizationRequest req = new DeleteOrganizationRequest("doloribus");            

            DeleteOrganizationResponse res = sdk.internal.deleteOrganization(req, new DeleteOrganizationSecurity("sapiente") {{
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
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.DeleteOrganizationRequest](../../models/operations/DeleteOrganizationRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [ai.whylabs.WhyLabs.models.operations.DeleteOrganizationSecurity](../../models/operations/DeleteOrganizationSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


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
import ai.whylabs.WhyLabs.models.operations.GenerateReportSecurity;
import ai.whylabs.WhyLabs.models.shared.AdminReportType;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GenerateReportRequest req = new GenerateReportRequest(AdminReportType.SESSIONS);            

            GenerateReportResponse res = sdk.internal.generateReport(req, new GenerateReportSecurity("architecto") {{
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
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.GenerateReportRequest](../../models/operations/GenerateReportRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [ai.whylabs.WhyLabs.models.operations.GenerateReportSecurity](../../models/operations/GenerateReportSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


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
import ai.whylabs.WhyLabs.models.operations.GetAWSMarketplaceMetadataSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetAWSMarketplaceMetadataRequest req = new GetAWSMarketplaceMetadataRequest("mollitia");            

            GetAWSMarketplaceMetadataResponse res = sdk.internal.getAWSMarketplaceMetadata(req, new GetAWSMarketplaceMetadataSecurity("dolorem") {{
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
| `request`                                                                                                                              | [ai.whylabs.WhyLabs.models.operations.GetAWSMarketplaceMetadataRequest](../../models/operations/GetAWSMarketplaceMetadataRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [ai.whylabs.WhyLabs.models.operations.GetAWSMarketplaceMetadataSecurity](../../models/operations/GetAWSMarketplaceMetadataSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetAccountMembershipsRequest req = new GetAccountMembershipsRequest("org-123") {{
                userId = "user-123";
            }};            

            GetAccountMembershipsResponse res = sdk.internal.getAccountMemberships(req, new GetAccountMembershipsSecurity("culpa") {{
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsRequest](../../models/operations/GetAccountMembershipsRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsSecurity](../../models/operations/GetAccountMembershipsSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsResponse](../../models/operations/GetAccountMembershipsResponse.md)**


## getAccountUsers

Get users in the account organization and any managed organizations

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetAccountUsersRequest;
import ai.whylabs.WhyLabs.models.operations.GetAccountUsersResponse;
import ai.whylabs.WhyLabs.models.operations.GetAccountUsersSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetAccountUsersRequest req = new GetAccountUsersRequest("org-123") {{
                email = "user@whylabs.ai";
                userId = "user-123";
            }};            

            GetAccountUsersResponse res = sdk.internal.getAccountUsers(req, new GetAccountUsersSecurity("consequuntur") {{
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
| `request`                                                                                                          | [ai.whylabs.WhyLabs.models.operations.GetAccountUsersRequest](../../models/operations/GetAccountUsersRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [ai.whylabs.WhyLabs.models.operations.GetAccountUsersSecurity](../../models/operations/GetAccountUsersSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetAccountUsersResponse](../../models/operations/GetAccountUsersResponse.md)**


## getApiKey

Get an api key by its id

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetApiKeyRequest;
import ai.whylabs.WhyLabs.models.operations.GetApiKeyResponse;
import ai.whylabs.WhyLabs.models.operations.GetApiKeySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetApiKeyRequest req = new GetApiKeyRequest("fh4dUNV3WQ", "org-123");            

            GetApiKeyResponse res = sdk.internal.getApiKey(req, new GetApiKeySecurity("repellat") {{
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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [ai.whylabs.WhyLabs.models.operations.GetApiKeyRequest](../../models/operations/GetApiKeyRequest.md)   | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `security`                                                                                             | [ai.whylabs.WhyLabs.models.operations.GetApiKeySecurity](../../models/operations/GetApiKeySecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetApiKeyResponse](../../models/operations/GetApiKeyResponse.md)**


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
                orgId = "mollitia";
                workspaceId = "occaecati";
            }};            

            GetConnectionResponse res = sdk.internal.getConnection(req, new GetConnectionSecurity("numquam") {{
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


## getDefaultMembershipForEmail

Get the default membership for a user.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailRequest;
import ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailResponse;
import ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetDefaultMembershipForEmailRequest req = new GetDefaultMembershipForEmailRequest("commodi");            

            GetDefaultMembershipForEmailResponse res = sdk.internal.getDefaultMembershipForEmail(req, new GetDefaultMembershipForEmailSecurity("quam") {{
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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailRequest](../../models/operations/GetDefaultMembershipForEmailRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [ai.whylabs.WhyLabs.models.operations.GetDefaultMembershipForEmailSecurity](../../models/operations/GetDefaultMembershipForEmailSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


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
import ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetFeatureFlagsRequest req = new GetFeatureFlagsRequest("molestiae", "velit");            

            GetFeatureFlagsResponse res = sdk.internal.getFeatureFlags(req, new GetFeatureFlagsSecurity("error") {{
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
| `request`                                                                                                          | [ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsRequest](../../models/operations/GetFeatureFlagsRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [ai.whylabs.WhyLabs.models.operations.GetFeatureFlagsSecurity](../../models/operations/GetFeatureFlagsSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


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
import ai.whylabs.WhyLabs.models.operations.GetMembershipsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetMembershipsRequest req = new GetMembershipsRequest("quia");            

            GetMembershipsResponse res = sdk.internal.getMemberships(req, new GetMembershipsSecurity("quis") {{
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
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.GetMembershipsRequest](../../models/operations/GetMembershipsRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [ai.whylabs.WhyLabs.models.operations.GetMembershipsSecurity](../../models/operations/GetMembershipsSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


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
import ai.whylabs.WhyLabs.models.operations.GetMembershipsByEmailSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetMembershipsByEmailRequest req = new GetMembershipsByEmailRequest("vitae");            

            GetMembershipsByEmailResponse res = sdk.internal.getMembershipsByEmail(req, new GetMembershipsByEmailSecurity("laborum") {{
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GetMembershipsByEmailRequest](../../models/operations/GetMembershipsByEmailRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.GetMembershipsByEmailSecurity](../../models/operations/GetMembershipsByEmailSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


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
import ai.whylabs.WhyLabs.models.operations.GetMembershipsByOrgSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetMembershipsByOrgRequest req = new GetMembershipsByOrgRequest("animi");            

            GetMembershipsByOrgResponse res = sdk.internal.getMembershipsByOrg(req, new GetMembershipsByOrgSecurity("enim") {{
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.GetMembershipsByOrgRequest](../../models/operations/GetMembershipsByOrgRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [ai.whylabs.WhyLabs.models.operations.GetMembershipsByOrgSecurity](../../models/operations/GetMembershipsByOrgSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


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
import ai.whylabs.WhyLabs.models.operations.GetMonitorConfigV3VersionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetMonitorConfigV3VersionRequest req = new GetMonitorConfigV3VersionRequest("model-123", "org-123", "4920545486e2a4cdf0f770c09748e663");            

            GetMonitorConfigV3VersionResponse res = sdk.internal.getMonitorConfigV3Version(req, new GetMonitorConfigV3VersionSecurity("odit") {{
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


## getNotificationSettings

Get notification settings for an org

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsRequest;
import ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsResponse;
import ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetNotificationSettingsRequest req = new GetNotificationSettingsRequest("quo");            

            GetNotificationSettingsResponse res = sdk.internal.getNotificationSettings(req, new GetNotificationSettingsSecurity("sequi") {{
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
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsRequest](../../models/operations/GetNotificationSettingsRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsSecurity](../../models/operations/GetNotificationSettingsSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetNotificationSettingsResponse](../../models/operations/GetNotificationSettingsResponse.md)**


## getOrgRoleMemberships

Get memberships in a specific organization and role within the account

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsResponse;
import ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetOrgRoleMembershipsRequest req = new GetOrgRoleMembershipsRequest("org-123", "org-123", "admin");            

            GetOrgRoleMembershipsResponse res = sdk.internal.getOrgRoleMemberships(req, new GetOrgRoleMembershipsSecurity("tenetur") {{
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsRequest](../../models/operations/GetOrgRoleMembershipsRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsSecurity](../../models/operations/GetOrgRoleMembershipsSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetOrgRoleMembershipsResponse](../../models/operations/GetOrgRoleMembershipsResponse.md)**


## getOrganization

Returns various metadata about an organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetOrganizationRequest;
import ai.whylabs.WhyLabs.models.operations.GetOrganizationResponse;
import ai.whylabs.WhyLabs.models.operations.GetOrganizationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetOrganizationRequest req = new GetOrganizationRequest("ipsam");            

            GetOrganizationResponse res = sdk.internal.getOrganization(req, new GetOrganizationSecurity("id") {{
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
| `request`                                                                                                          | [ai.whylabs.WhyLabs.models.operations.GetOrganizationRequest](../../models/operations/GetOrganizationRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [ai.whylabs.WhyLabs.models.operations.GetOrganizationSecurity](../../models/operations/GetOrganizationSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetOrganizationResponse](../../models/operations/GetOrganizationResponse.md)**


## getUser

Get a user by their id.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetUserRequest;
import ai.whylabs.WhyLabs.models.operations.GetUserResponse;
import ai.whylabs.WhyLabs.models.operations.GetUserSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetUserRequest req = new GetUserRequest("possimus");            

            GetUserResponse res = sdk.internal.getUser(req, new GetUserSecurity("aut") {{
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [ai.whylabs.WhyLabs.models.operations.GetUserRequest](../../models/operations/GetUserRequest.md)   | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |
| `security`                                                                                         | [ai.whylabs.WhyLabs.models.operations.GetUserSecurity](../../models/operations/GetUserSecurity.md) | :heavy_check_mark:                                                                                 | The security requirements to use for the request.                                                  |


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
import ai.whylabs.WhyLabs.models.operations.GetUserByEmailSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetUserByEmailRequest req = new GetUserByEmailRequest("quasi");            

            GetUserByEmailResponse res = sdk.internal.getUserByEmail(req, new GetUserByEmailSecurity("error") {{
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
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.GetUserByEmailRequest](../../models/operations/GetUserByEmailRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [ai.whylabs.WhyLabs.models.operations.GetUserByEmailSecurity](../../models/operations/GetUserByEmailSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


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
import ai.whylabs.WhyLabs.models.operations.HideSegmentsSecurity;
import ai.whylabs.WhyLabs.models.shared.SegmentsListRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            HideSegmentsRequest req = new HideSegmentsRequest(                new SegmentsListRequest() {{
                                segments = new String[]{{
                                    add("laborum"),
                                    add("quasi"),
                                    add("reiciendis"),
                                    add("voluptatibus"),
                                }};
                            }};, "model-123", "org-123");            

            HideSegmentsResponse res = sdk.internal.hideSegments(req, new HideSegmentsSecurity("vero") {{
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.HideSegmentsRequest](../../models/operations/HideSegmentsRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [ai.whylabs.WhyLabs.models.operations.HideSegmentsSecurity](../../models/operations/HideSegmentsSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.HideSegmentsResponse](../../models/operations/HideSegmentsResponse.md)**


## listApiKeys

Returns the API key metadata for a given organization and user

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListApiKeysRequest;
import ai.whylabs.WhyLabs.models.operations.ListApiKeysResponse;
import ai.whylabs.WhyLabs.models.operations.ListApiKeysSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListApiKeysRequest req = new ListApiKeysRequest("org-123") {{
                userId = "user-123";
            }};            

            ListApiKeysResponse res = sdk.internal.listApiKeys(req, new ListApiKeysSecurity("nihil") {{
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
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.operations.ListApiKeysRequest](../../models/operations/ListApiKeysRequest.md)   | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [ai.whylabs.WhyLabs.models.operations.ListApiKeysSecurity](../../models/operations/ListApiKeysSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListApiKeysResponse](../../models/operations/ListApiKeysResponse.md)**


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
                orgId = "praesentium";
                workspaceId = "voluptatibus";
            }};            

            ListJobsResponse res = sdk.internal.listJobs(req, new ListJobsSecurity("ipsa") {{
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

            ListMonitorConfigV3VersionsResponse res = sdk.internal.listMonitorConfigV3Versions(req, new ListMonitorConfigV3VersionsSecurity("omnis") {{
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


## listOrganizations

Get a list of all of the organization ids.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListOrganizationsResponse;
import ai.whylabs.WhyLabs.models.operations.ListOrganizationsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListOrganizationsResponse res = sdk.internal.listOrganizations(new ListOrganizationsSecurity("voluptate") {{
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
| `security`                                                                                                             | [ai.whylabs.WhyLabs.models.operations.ListOrganizationsSecurity](../../models/operations/ListOrganizationsSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListOrganizationsResponse](../../models/operations/ListOrganizationsResponse.md)**


## listSegments

Returns a list of segments for the dataset.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListSegmentsRequest;
import ai.whylabs.WhyLabs.models.operations.ListSegmentsResponse;
import ai.whylabs.WhyLabs.models.operations.ListSegmentsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListSegmentsRequest req = new ListSegmentsRequest("model-123", "org-123");            

            ListSegmentsResponse res = sdk.internal.listSegments(req, new ListSegmentsSecurity("cum") {{
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.ListSegmentsRequest](../../models/operations/ListSegmentsRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [ai.whylabs.WhyLabs.models.operations.ListSegmentsSecurity](../../models/operations/ListSegmentsSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListSegmentsResponse](../../models/operations/ListSegmentsResponse.md)**


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
import ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrgSecurity;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PartiallyUpdateOrgRequest req = new PartiallyUpdateOrgRequest(                new PartiallyUpdateOrgRequestBody() {{
                                orgId = "perferendis";
                            }};) {{
                domain = "acme.ai";
                name = "ACME, Inc";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.FREE;
            }};            

            PartiallyUpdateOrgResponse res = sdk.internal.partiallyUpdateOrg(req, new PartiallyUpdateOrgSecurity("reprehenderit") {{
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
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrgRequest](../../models/operations/PartiallyUpdateOrgRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrgSecurity](../../models/operations/PartiallyUpdateOrgSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


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
import ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrganizationSecurity;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PartiallyUpdateOrganizationRequest req = new PartiallyUpdateOrganizationRequest("ut") {{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                name = "ACME, Inc";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                pagerDutyKey = "abc-def-ghi-jkl";
                parentOrgId = "abc-def-ghi-jkl";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.SUBSCRIPTION;
            }};            

            PartiallyUpdateOrganizationResponse res = sdk.internal.partiallyUpdateOrganization(req, new PartiallyUpdateOrganizationSecurity("dicta") {{
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
| `request`                                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrganizationRequest](../../models/operations/PartiallyUpdateOrganizationRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrganizationSecurity](../../models/operations/PartiallyUpdateOrganizationSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[ai.whylabs.WhyLabs.models.operations.PartiallyUpdateOrganizationResponse](../../models/operations/PartiallyUpdateOrganizationResponse.md)**


## patchOrgRoleMemberships

Add or delete all of the memberships in a specific role and managed organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsRequestBody;
import ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsResponse;
import ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsSecurity;
import ai.whylabs.WhyLabs.models.shared.PatchAccountMembershipsRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PatchOrgRoleMembershipsRequest req = new PatchOrgRoleMembershipsRequest(                new PatchOrgRoleMembershipsRequestBody() {{
                                request = new PatchAccountMembershipsRequest(                new String[]{{
                                                    add("dolore"),
                                                    add("iusto"),
                                                }},                 new String[]{{
                                                    add("harum"),
                                                }});;
                            }};, "org-123", "org-123", "admin");            

            PatchOrgRoleMembershipsResponse res = sdk.internal.patchOrgRoleMemberships(req, new PatchOrgRoleMembershipsSecurity("enim") {{
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
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsRequest](../../models/operations/PatchOrgRoleMembershipsRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsSecurity](../../models/operations/PatchOrgRoleMembershipsSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[ai.whylabs.WhyLabs.models.operations.PatchOrgRoleMembershipsResponse](../../models/operations/PatchOrgRoleMembershipsResponse.md)**


## postMonitorConfigValidationJob

Create a monitor config validation job for all configs

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse;
import ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PostMonitorConfigValidationJobResponse res = sdk.internal.postMonitorConfigValidationJob(new PostMonitorConfigValidationJobSecurity("accusamus") {{
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `security`                                                                                                                                       | [ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobSecurity](../../models/operations/PostMonitorConfigValidationJobSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[ai.whylabs.WhyLabs.models.operations.PostMonitorConfigValidationJobResponse](../../models/operations/PostMonitorConfigValidationJobResponse.md)**


## provisionAWSMarketplaceNewUser

Create resources for a new user coming from AWS Marketplace

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserResponse;
import ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserSecurity;
import ai.whylabs.WhyLabs.models.shared.ProvisionNewMarketplaceUserRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.ProvisionNewMarketplaceUserRequest req = new ProvisionNewMarketplaceUserRequest("commodi", "repudiandae", "quae", "ipsum") {{
                expectExisting = false;
            }};            

            ProvisionAWSMarketplaceNewUserResponse res = sdk.internal.provisionAWSMarketplaceNewUser(req, new ProvisionAWSMarketplaceNewUserSecurity("quidem") {{
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [ai.whylabs.WhyLabs.models.shared.ProvisionNewMarketplaceUserRequest](../../models/shared/ProvisionNewMarketplaceUserRequest.md)                 | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserSecurity](../../models/operations/ProvisionAWSMarketplaceNewUserSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[ai.whylabs.WhyLabs.models.operations.ProvisionAWSMarketplaceNewUserResponse](../../models/operations/ProvisionAWSMarketplaceNewUserResponse.md)**


## provisionDatabricksConnection

Create resources for a new user coming from Databricks

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionResponse;
import ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionSecurity;
import ai.whylabs.WhyLabs.models.shared.ProvisionDatabricksConnectionRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.ProvisionDatabricksConnectionRequest req = new ProvisionDatabricksConnectionRequest("molestias", false, "excepturi");            

            ProvisionDatabricksConnectionResponse res = sdk.internal.provisionDatabricksConnection(req, new ProvisionDatabricksConnectionSecurity("pariatur") {{
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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [ai.whylabs.WhyLabs.models.shared.ProvisionDatabricksConnectionRequest](../../models/shared/ProvisionDatabricksConnectionRequest.md)           | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionSecurity](../../models/operations/ProvisionDatabricksConnectionSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.ProvisionDatabricksConnectionResponse](../../models/operations/ProvisionDatabricksConnectionResponse.md)**


## provisionNewUser

Create the resources that a new user needs to use WhyLabs via the website.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ProvisionNewUserResponse;
import ai.whylabs.WhyLabs.models.operations.ProvisionNewUserSecurity;
import ai.whylabs.WhyLabs.models.shared.ProvisionNewUserRequest;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.ProvisionNewUserRequest req = new ProvisionNewUserRequest("modi", "praesentium", "rem", SubscriptionTier.SUBSCRIPTION) {{
                expectExisting = false;
            }};            

            ProvisionNewUserResponse res = sdk.internal.provisionNewUser(req, new ProvisionNewUserSecurity("quasi") {{
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
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.shared.ProvisionNewUserRequest](../../models/shared/ProvisionNewUserRequest.md)           | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [ai.whylabs.WhyLabs.models.operations.ProvisionNewUserSecurity](../../models/operations/ProvisionNewUserSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.ProvisionNewUserResponse](../../models/operations/ProvisionNewUserResponse.md)**


## putOrgRoleMemberships

Replace all of the memberships in a specific role and managed organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsRequestBody;
import ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsResponse;
import ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsSecurity;
import ai.whylabs.WhyLabs.models.shared.PutAccountMembershipsRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutOrgRoleMembershipsRequest req = new PutOrgRoleMembershipsRequest(                new PutOrgRoleMembershipsRequestBody() {{
                                request = new PutAccountMembershipsRequest(                new String[]{{
                                                    add("sint"),
                                                    add("veritatis"),
                                                    add("itaque"),
                                                    add("incidunt"),
                                                }});;
                            }};, "org-123", "org-123", "admin");            

            PutOrgRoleMembershipsResponse res = sdk.internal.putOrgRoleMemberships(req, new PutOrgRoleMembershipsSecurity("enim") {{
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsRequest](../../models/operations/PutOrgRoleMembershipsRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsSecurity](../../models/operations/PutOrgRoleMembershipsSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutOrgRoleMembershipsResponse](../../models/operations/PutOrgRoleMembershipsResponse.md)**


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
                                    add("est"),
                                }};
                                endTimestamp = 1893456000000L;
                                overwrite = false;
                                startTimestamp = 1577836800000L;
                            }};, "model-123", "org-123");            

            PutRequestMonitorRunConfigResponse res = sdk.internal.putRequestMonitorRunConfig(req, new PutRequestMonitorRunConfigSecurity("quibusdam") {{
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
                orgId = "explicabo";
                workspaceId = "deserunt";
            }};            

            RefreshConnectionResponse res = sdk.internal.refreshConnection(req, new RefreshConnectionSecurity("distinctio") {{
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


## registerDatabricksConnection

Register databricks metadata, temporarily storing it against a UUID so that it can be used to provision a databricks connection after email authentication

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionResponse;
import ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionSecurity;
import ai.whylabs.WhyLabs.models.shared.RegisterDatabricksConnectionRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.RegisterDatabricksConnectionRequest req = new RegisterDatabricksConnectionRequest("quibusdam", "labore", "modi", false, "qui", "aliquid", 586513, "quos", "perferendis") {{
                connectionEstablished = false;
                freeTrial = false;
            }};            

            RegisterDatabricksConnectionResponse res = sdk.internal.registerDatabricksConnection(req, new RegisterDatabricksConnectionSecurity("magni") {{
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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [ai.whylabs.WhyLabs.models.shared.RegisterDatabricksConnectionRequest](../../models/shared/RegisterDatabricksConnectionRequest.md)           | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionSecurity](../../models/operations/RegisterDatabricksConnectionSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.RegisterDatabricksConnectionResponse](../../models/operations/RegisterDatabricksConnectionResponse.md)**


## removeMembershipByEmail

Removes membership in a given org from a user, using the user's email address.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.RemoveMembershipByEmailResponse;
import ai.whylabs.WhyLabs.models.operations.RemoveMembershipByEmailSecurity;
import ai.whylabs.WhyLabs.models.shared.RemoveMembershipRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.RemoveMembershipRequest req = new RemoveMembershipRequest("assumenda", "ipsam");            

            RemoveMembershipByEmailResponse res = sdk.internal.removeMembershipByEmail(req, new RemoveMembershipByEmailSecurity("alias") {{
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
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.shared.RemoveMembershipRequest](../../models/shared/RemoveMembershipRequest.md)                         | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [ai.whylabs.WhyLabs.models.operations.RemoveMembershipByEmailSecurity](../../models/operations/RemoveMembershipByEmailSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[ai.whylabs.WhyLabs.models.operations.RemoveMembershipByEmailResponse](../../models/operations/RemoveMembershipByEmailResponse.md)**


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

            ai.whylabs.WhyLabs.models.shared.RunJobRequest req = new RunJobRequest(146441L) {{
                orgId = "dolorum";
                workspaceId = "excepturi";
            }};            

            RunJobResponse res = sdk.internal.runJob(req, new RunJobSecurity("tempora") {{
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


## setDefaultMembership

Sets the organization that should be used when logging a user in

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.SetDefaultMembershipResponse;
import ai.whylabs.WhyLabs.models.operations.SetDefaultMembershipSecurity;
import ai.whylabs.WhyLabs.models.shared.SetDefaultMembershipRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.SetDefaultMembershipRequest req = new SetDefaultMembershipRequest("facilis", "tempore");            

            SetDefaultMembershipResponse res = sdk.internal.setDefaultMembership(req, new SetDefaultMembershipSecurity("labore") {{
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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.shared.SetDefaultMembershipRequest](../../models/shared/SetDefaultMembershipRequest.md)           | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [ai.whylabs.WhyLabs.models.operations.SetDefaultMembershipSecurity](../../models/operations/SetDefaultMembershipSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.SetDefaultMembershipResponse](../../models/operations/SetDefaultMembershipResponse.md)**


## stripePaymentEndpoint

Endpoint for Stripe payment webhooks

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.StripePaymentEndpointResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.. req = "delectus"            

            StripePaymentEndpointResponse res = sdk.internal.stripePaymentEndpoint(req);

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
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserRequestBody;
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserResponse;
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserSecurity;
import ai.whylabs.WhyLabs.models.shared.AccountUser;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            UpdateAccountUserRequest req = new UpdateAccountUserRequest(                new UpdateAccountUserRequestBody() {{
                                user = new AccountUser("eum") {{
                                    active = false;
                                    externalId = "non";
                                    userId = "eligendi";
                                }};;
                            }};, "org-123", "user-123");            

            UpdateAccountUserResponse res = sdk.internal.updateAccountUser(req, new UpdateAccountUserSecurity("sint") {{
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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.UpdateAccountUserRequest](../../models/operations/UpdateAccountUserRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [ai.whylabs.WhyLabs.models.operations.UpdateAccountUserSecurity](../../models/operations/UpdateAccountUserSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateAccountUserResponse](../../models/operations/UpdateAccountUserResponse.md)**


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
                    orgId = "aliquid";
                }};;
                orgId = "provident";
                workspaceId = "necessitatibus";
            }};            

            UpdateConnectionResponse res = sdk.internal.updateConnection(req, new UpdateConnectionSecurity("sint") {{
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


## updateMembershipByEmail

Updates the role in an membership, given the organization and the user's email address.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateMembershipByEmailResponse;
import ai.whylabs.WhyLabs.models.operations.UpdateMembershipByEmailSecurity;
import ai.whylabs.WhyLabs.models.shared.Role;
import ai.whylabs.WhyLabs.models.shared.UpdateMembershipRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.UpdateMembershipRequest req = new UpdateMembershipRequest("officia", "dolor", Role.VIEWER);            

            UpdateMembershipByEmailResponse res = sdk.internal.updateMembershipByEmail(req, new UpdateMembershipByEmailSecurity("a") {{
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
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.shared.UpdateMembershipRequest](../../models/shared/UpdateMembershipRequest.md)                         | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [ai.whylabs.WhyLabs.models.operations.UpdateMembershipByEmailSecurity](../../models/operations/UpdateMembershipByEmailSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


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
import ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsSecurity;
import ai.whylabs.WhyLabs.models.shared.NotificationSettings;
import ai.whylabs.WhyLabs.models.shared.NotificationSettingsDay;
import ai.whylabs.WhyLabs.models.shared.NotificationSqsMessageCadence;
import ai.whylabs.WhyLabs.models.shared.UberNotificationSchedule;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            UpdateNotificationSettingsRequest req = new UpdateNotificationSettingsRequest(                new NotificationSettings() {{
                                emailSettings = new UberNotificationSchedule(NotificationSqsMessageCadence.WEEKLY, false) {{
                                    dayOfWeek = NotificationSettingsDay.WEDNESDAY;
                                    local24HourOfDay = 449198;
                                    localMinuteOfHour = 846409;
                                    localTimezone = "maiores";
                                }};;
                                pagerDutySettings = new UberNotificationSchedule(NotificationSqsMessageCadence.WEEKLY, false) {{
                                    dayOfWeek = NotificationSettingsDay.SUNDAY;
                                    local24HourOfDay = 297437;
                                    localMinuteOfHour = 767024;
                                    localTimezone = "facere";
                                }};;
                                slackSettings = new UberNotificationSchedule(NotificationSqsMessageCadence.DAILY, false) {{
                                    dayOfWeek = NotificationSettingsDay.TUESDAY;
                                    local24HourOfDay = 675439;
                                    localMinuteOfHour = 881104;
                                    localTimezone = "non";
                                }};;
                            }};, "occaecati");            

            UpdateNotificationSettingsResponse res = sdk.internal.updateNotificationSettings(req, new UpdateNotificationSettingsSecurity("enim") {{
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
| `request`                                                                                                                                | [ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsRequest](../../models/operations/UpdateNotificationSettingsRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [ai.whylabs.WhyLabs.models.operations.UpdateNotificationSettingsSecurity](../../models/operations/UpdateNotificationSettingsSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import ai.whylabs.WhyLabs.models.operations.UpdateOrgSecurity;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            UpdateOrgRequest req = new UpdateOrgRequest(                new UpdateOrgRequestBody() {{
                                orgId = "accusamus";
                            }};, "ACME, Inc") {{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                pagerDutyKey = "abc-def-ghi-jkl";
                parentOrgId = "org-123";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.SUBSCRIPTION;
            }};            

            UpdateOrgResponse res = sdk.internal.updateOrg(req, new UpdateOrgSecurity("quidem") {{
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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [ai.whylabs.WhyLabs.models.operations.UpdateOrgRequest](../../models/operations/UpdateOrgRequest.md)   | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `security`                                                                                             | [ai.whylabs.WhyLabs.models.operations.UpdateOrgSecurity](../../models/operations/UpdateOrgSecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |


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
import ai.whylabs.WhyLabs.models.operations.UpdateOrganizationSecurity;
import ai.whylabs.WhyLabs.models.shared.SubscriptionTier;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            UpdateOrganizationRequest req = new UpdateOrganizationRequest("ACME, Inc", "provident") {{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                pagerDutyKey = "abc-def-ghi-jkl";
                parentOrgId = "org-123";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.AWS_MARKETPLACE;
            }};            

            UpdateOrganizationResponse res = sdk.internal.updateOrganization(req, new UpdateOrganizationSecurity("id") {{
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
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.UpdateOrganizationRequest](../../models/operations/UpdateOrganizationRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [ai.whylabs.WhyLabs.models.operations.UpdateOrganizationSecurity](../../models/operations/UpdateOrganizationSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateOrganizationResponse](../../models/operations/UpdateOrganizationResponse.md)**


## updateUser

Update a user.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateUserResponse;
import ai.whylabs.WhyLabs.models.operations.UpdateUserSecurity;
import ai.whylabs.WhyLabs.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.User req = new User("blanditiis", "deleniti") {{
                preferences = "sapiente";
            }};            

            UpdateUserResponse res = sdk.internal.updateUser(req, new UpdateUserSecurity("amet") {{
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
| `request`                                                                                                | [ai.whylabs.WhyLabs.models.shared.User](../../models/shared/User.md)                                     | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [ai.whylabs.WhyLabs.models.operations.UpdateUserSecurity](../../models/operations/UpdateUserSecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |


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
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            WhyLabsSearchRequest req = new WhyLabsSearchRequest("deserunt");            

            WhyLabsSearchResponse res = sdk.internal.whyLabsSearch(req, new WhyLabsSearchSecurity("nisi") {{
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
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.WhyLabsSearchRequest](../../models/operations/WhyLabsSearchRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [ai.whylabs.WhyLabs.models.operations.WhyLabsSearchSecurity](../../models/operations/WhyLabsSearchSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.WhyLabsSearchResponse](../../models/operations/WhyLabsSearchResponse.md)**


## whyLabsSearchIndexing

WhyLabs Search Indexing

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingResponse;
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingSecurity;
import ai.whylabs.WhyLabs.models.shared.SearchIndexRequest;
import ai.whylabs.WhyLabs.models.shared.SearchIndexType;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.SearchIndexRequest req = new SearchIndexRequest() {{
                orgId = "vel";
                type = SearchIndexType.ENTITY_SCHEMA;
            }};            

            WhyLabsSearchIndexingResponse res = sdk.internal.whyLabsSearchIndexing(req, new WhyLabsSearchIndexingSecurity("omnis") {{
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.shared.SearchIndexRequest](../../models/shared/SearchIndexRequest.md)                               | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingSecurity](../../models/operations/WhyLabsSearchIndexingSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingResponse](../../models/operations/WhyLabsSearchIndexingResponse.md)**

