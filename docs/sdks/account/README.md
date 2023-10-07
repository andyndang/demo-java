# Account
(*account*)

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
import ai.whylabs.WhyLabs.models.shared.CreateAccountUserRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("homogeneous"){{
                    apiKeyAuth = "";
                }})
                .build();

            CreateAccountUserRequest req = new CreateAccountUserRequest(new CreateAccountUserRequest("Smart"){{
active = false;
externalId = "Mobility parsing Fresh";
userSchema = "nervous Aston aliquam";
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

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.operations.CreateAccountUserRequest](../../models/operations/CreateAccountUserRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("in"){{
                    apiKeyAuth = "";
                }})
                .build();

            DeleteAccountUserRequest req = new DeleteAccountUserRequest("org-123", "user-123");            

            DeleteAccountUserResponse res = sdk.account.deleteAccountUser(req);

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
                .setSecurity(new Security("Factors"){{
                    apiKeyAuth = "";
                }})
                .build();

            GetAccountMembershipsRequest req = new GetAccountMembershipsRequest("org-123"){{
                managedOrgId = "org-123";
                role = Role.MEMBER;
                userId = "user-123";
            }};            

            GetAccountMembershipsResponse res = sdk.account.getAccountMemberships(req);

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
                .setSecurity(new Security("Avon"){{
                    apiKeyAuth = "";
                }})
                .build();

            GetAccountUserByEmailRequest req = new GetAccountUserByEmailRequest("user@whylabs.ai", "org-123");            

            GetAccountUserByEmailResponse res = sdk.account.getAccountUserByEmail(req);

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
                .setSecurity(new Security("up"){{
                    apiKeyAuth = "";
                }})
                .build();

            GetAccountUserByIdRequest req = new GetAccountUserByIdRequest("org-123", "user-123");            

            GetAccountUserByIdResponse res = sdk.account.getAccountUserById(req);

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
                .setSecurity(new Security("farad"){{
                    apiKeyAuth = "";
                }})
                .build();

            ListAccountUsersRequest req = new ListAccountUsersRequest("org-123");            

            ListAccountUsersResponse res = sdk.account.listAccountUsers(req);

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
                .setSecurity(new Security("Arkansas"){{
                    apiKeyAuth = "";
                }})
                .build();

            ListManagedOrganizationsRequest req = new ListManagedOrganizationsRequest("org-123");            

            ListManagedOrganizationsResponse res = sdk.account.listManagedOrganizations(req);

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
                .setSecurity(new Security("revenge"){{
                    apiKeyAuth = "";
                }})
                .build();

            PatchOrganizationMembershipsRequest req = new PatchOrganizationMembershipsRequest(new PatchAccountMembershipsRequest(new String[]{{
    add("Fiat"),
}}, new String[]{{
    add("contributor"),
}}), "org-123", "org-123", Role.ADMIN);            

            PatchOrganizationMembershipsResponse res = sdk.account.patchOrganizationMemberships(req);

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
                .setSecurity(new Security("commitment"){{
                    apiKeyAuth = "";
                }})
                .build();

            PutOrganizationMembershipsRequest req = new PutOrganizationMembershipsRequest(new PutAccountMembershipsRequest(new String[]{{
    add("Grocery"),
}}), "org-123", "org-123", Role.MEMBER);            

            PutOrganizationMembershipsResponse res = sdk.account.putOrganizationMemberships(req);

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
                .setSecurity(new Security("radian"){{
                    apiKeyAuth = "";
                }})
                .build();

            UpdateAccountUserRequest req = new UpdateAccountUserRequest(new UpdateAccountUserRequest(){{
active = false;
externalId = "Shirt female bypassing";
userSchema = "Internal";
}}, "org-123", "user-123");            

            UpdateAccountUserResponse res = sdk.account.updateAccountUser(req);

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

