# account

### Available Operations

* [createAccountUser](#createaccountuser) - Create an account user
* [deleteAccountUser](#deleteaccountuser) - Delete account user
* [getAccountMemberships](#getaccountmemberships) - Get memberships in an account
* [getAccountUserByEmail](#getaccountuserbyemail) - Get account user by email
* [getAccountUserById](#getaccountuserbyid) - Get account user by user_id
* [getOrgRoleMemberships](#getorgrolememberships) - Get memberships for a specific org and role
* [listAccountUsers](#listaccountusers) - List users in an account
* [patchOrgRoleMemberships](#patchorgrolememberships) - Add or delete memberships in a specific role and managed organization
* [putOrgRoleMemberships](#putorgrolememberships) - Replace the memberships in a specific role and managed organization
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
import ai.whylabs.WhyLabs.models.shared.AccountUserRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            CreateAccountUserRequest req = new CreateAccountUserRequest(                new AccountUserRequest("unde") {{
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

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetAccountMembershipsRequest req = new GetAccountMembershipsRequest("org-123") {{
                userId = "user-123";
            }};            

            GetAccountMembershipsResponse res = sdk.account.getAccountMemberships(req, new GetAccountMembershipsSecurity("error") {{
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

            GetAccountUserByEmailResponse res = sdk.account.getAccountUserByEmail(req, new GetAccountUserByEmailSecurity("deserunt") {{
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

            GetAccountUserByIdResponse res = sdk.account.getAccountUserById(req, new GetAccountUserByIdSecurity("suscipit") {{
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

            GetOrgRoleMembershipsResponse res = sdk.account.getOrgRoleMemberships(req, new GetOrgRoleMembershipsSecurity("iure") {{
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
                                                    add("ipsa"),
                                                    add("delectus"),
                                                    add("tempora"),
                                                    add("suscipit"),
                                                }},                 new String[]{{
                                                    add("minus"),
                                                    add("placeat"),
                                                }});;
                            }};, "org-123", "org-123", "admin");            

            PatchOrgRoleMembershipsResponse res = sdk.account.patchOrgRoleMemberships(req, new PatchOrgRoleMembershipsSecurity("voluptatum") {{
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
                                                    add("excepturi"),
                                                    add("nisi"),
                                                }});;
                            }};, "org-123", "org-123", "admin");            

            PutOrgRoleMembershipsResponse res = sdk.account.putOrgRoleMemberships(req, new PutOrgRoleMembershipsSecurity("recusandae") {{
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


## updateAccountUser

Update an account user's details

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserResponse;
import ai.whylabs.WhyLabs.models.operations.UpdateAccountUserSecurity;
import ai.whylabs.WhyLabs.models.shared.AccountUserRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            UpdateAccountUserRequest req = new UpdateAccountUserRequest(                new AccountUserRequest("temporibus") {{
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

