# account

### Available Operations

* [createAccountUser](#createaccountuser) - Create an account user
* [deleteAccountUser](#deleteaccountuser) - Delete account user
* [getAccountMemberships](#getaccountmemberships) - Get memberships in an account
* [getAccountUserByEmail](#getaccountuserbyemail) - Get account user by email
* [getAccountUserById](#getaccountuserbyid) - Get account user by user_id
* [listAccountUsers](#listaccountusers) - List users in an account
* [listManagedOrganizations](#listmanagedorganizations) - List managed organizations for a parent organization
* [patchOrganizationMemberships](#patchorganizationmemberships) - Add or delete memberships in a specific role and managed organization
* [putOrganizationMemberships](#putorganizationmemberships) - Replace the memberships in a specific role and managed organization
* [updateAccountUser](#updateaccountuser) - Update account user

## createAccountUser

Create an account user

### Example Usage

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

            CreateAccountUserRequest req = new CreateAccountUserRequest(                new CreateAccountUserRequest("unde") {{
                                active = false;
                                externalId = "nulla";
                                userSchema = "corrupti";
                            }};, "org-123");            

            CreateAccountUserResponse res = sdk.account.createAccountUser(req, new CreateAccountUserSecurity("illum") {{
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

            DeleteAccountUserRequest req = new DeleteAccountUserRequest("org-123", "user-123");            

            DeleteAccountUserResponse res = sdk.account.deleteAccountUser(req, new DeleteAccountUserSecurity("vel") {{
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


## getAccountMemberships

Get memberships in the account organization and any managed organizations

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsResponse;
import ai.whylabs.WhyLabs.models.operations.GetAccountMembershipsSecurity;
import ai.whylabs.WhyLabs.models.shared.Role;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetAccountMembershipsRequest req = new GetAccountMembershipsRequest("org-123") {{
                managedOrgId = "org-123";
                role = Role.MEMBER;
                userId = "user-123";
            }};            

            GetAccountMembershipsResponse res = sdk.account.getAccountMemberships(req, new GetAccountMembershipsSecurity("deserunt") {{
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


## getAccountUserByEmail

Get account user by email

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailRequest;
import ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailResponse;
import ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetAccountUserByEmailRequest req = new GetAccountUserByEmailRequest("user@whylabs.ai", "org-123");            

            GetAccountUserByEmailResponse res = sdk.account.getAccountUserByEmail(req, new GetAccountUserByEmailSecurity("suscipit") {{
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
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailRequest](../../models/operations/GetAccountUserByEmailRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.GetAccountUserByEmailSecurity](../../models/operations/GetAccountUserByEmailSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


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
import ai.whylabs.WhyLabs.models.operations.GetAccountUserByIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetAccountUserByIdRequest req = new GetAccountUserByIdRequest("org-123", "user-123");            

            GetAccountUserByIdResponse res = sdk.account.getAccountUserById(req, new GetAccountUserByIdSecurity("iure") {{
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
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.GetAccountUserByIdRequest](../../models/operations/GetAccountUserByIdRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [ai.whylabs.WhyLabs.models.operations.GetAccountUserByIdSecurity](../../models/operations/GetAccountUserByIdSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetAccountUserByIdResponse](../../models/operations/GetAccountUserByIdResponse.md)**


## listAccountUsers

List users in the account organization and any managed organizations

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListAccountUsersRequest;
import ai.whylabs.WhyLabs.models.operations.ListAccountUsersResponse;
import ai.whylabs.WhyLabs.models.operations.ListAccountUsersSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListAccountUsersRequest req = new ListAccountUsersRequest("org-123");            

            ListAccountUsersResponse res = sdk.account.listAccountUsers(req, new ListAccountUsersSecurity("magnam") {{
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
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.operations.ListAccountUsersRequest](../../models/operations/ListAccountUsersRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [ai.whylabs.WhyLabs.models.operations.ListAccountUsersSecurity](../../models/operations/ListAccountUsersSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListAccountUsersResponse](../../models/operations/ListAccountUsersResponse.md)**


## listManagedOrganizations

List managed organizations for a parent organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsRequest;
import ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsResponse;
import ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListManagedOrganizationsRequest req = new ListManagedOrganizationsRequest("org-123");            

            ListManagedOrganizationsResponse res = sdk.account.listManagedOrganizations(req, new ListManagedOrganizationsSecurity("debitis") {{
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsRequest](../../models/operations/ListManagedOrganizationsRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsSecurity](../../models/operations/ListManagedOrganizationsSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListManagedOrganizationsResponse](../../models/operations/ListManagedOrganizationsResponse.md)**


## patchOrganizationMemberships

Add or delete all of the memberships in a specific role and managed organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsResponse;
import ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsSecurity;
import ai.whylabs.WhyLabs.models.shared.PatchAccountMembershipsRequest;
import ai.whylabs.WhyLabs.models.shared.Role;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PatchOrganizationMembershipsRequest req = new PatchOrganizationMembershipsRequest(                new PatchAccountMembershipsRequest(                new String[]{{
                                                add("delectus"),
                                            }},                 new String[]{{
                                                add("suscipit"),
                                                add("molestiae"),
                                            }});, "org-123", "org-123", Role.VIEWER);            

            PatchOrganizationMembershipsResponse res = sdk.account.patchOrganizationMemberships(req, new PatchOrganizationMembershipsSecurity("placeat") {{
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
| `request`                                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsRequest](../../models/operations/PatchOrganizationMembershipsRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsSecurity](../../models/operations/PatchOrganizationMembershipsSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.PatchOrganizationMembershipsResponse](../../models/operations/PatchOrganizationMembershipsResponse.md)**


## putOrganizationMemberships

Replace all of the memberships in a specific role and managed organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsResponse;
import ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsSecurity;
import ai.whylabs.WhyLabs.models.shared.PutAccountMembershipsRequest;
import ai.whylabs.WhyLabs.models.shared.Role;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutOrganizationMembershipsRequest req = new PutOrganizationMembershipsRequest(                new PutAccountMembershipsRequest(                new String[]{{
                                                add("iusto"),
                                                add("excepturi"),
                                                add("nisi"),
                                            }});, "org-123", "org-123", Role.VIEWER);            

            PutOrganizationMembershipsResponse res = sdk.account.putOrganizationMemberships(req, new PutOrganizationMembershipsSecurity("temporibus") {{
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
| `request`                                                                                                                                | [ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsRequest](../../models/operations/PutOrganizationMembershipsRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsSecurity](../../models/operations/PutOrganizationMembershipsSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutOrganizationMembershipsResponse](../../models/operations/PutOrganizationMembershipsResponse.md)**


## updateAccountUser

Update an account user's details

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserResponse;
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserSecurity;
import ai.whylabs.WhyLabs.models.shared.UpdateAccountUserRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            UpdateAccountUserRequest req = new UpdateAccountUserRequest(                new UpdateAccountUserRequest() {{
                                active = false;
                                externalId = "ab";
                                userSchema = "quis";
                            }};, "org-123", "user-123");            

            UpdateAccountUserResponse res = sdk.account.updateAccountUser(req, new UpdateAccountUserSecurity("veritatis") {{
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

