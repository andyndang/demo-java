# membership

### Available Operations

* [createMembership](#createmembership) - Create a membership for a user, making them apart of an organization. Uses the user's current email address.
* [createOrganizationMembership](#createorganizationmembership) - Create a membership for a user, making them apart of an organization. Uses the user's current email address.
* [getDefaultMembershipForEmail](#getdefaultmembershipforemail) - Get the default membership for a user.
* [getMemberships](#getmemberships) - Get memberships for a user.
* [getMembershipsByEmail](#getmembershipsbyemail) - Get memberships for a user given that user's email address.
* [getMembershipsByOrg](#getmembershipsbyorg) - Get memberships for an org.
* [listOrganizationMemberships](#listorganizationmemberships) - List organization memberships
* [removeMembershipByEmail](#removemembershipbyemail) - Removes membership in a given org from a user, using the user's email address.
* [removeOrganizationMembership](#removeorganizationmembership) - Removes membership in a given org from a user, using the user's email address.
* [setDefaultMembership](#setdefaultmembership) - Sets the organization that should be used when logging a user in
* [updateMembershipByEmail](#updatemembershipbyemail) - Updates the role in an membership
* [updateOrganizationMembership](#updateorganizationmembership) - Updates the role in an membership

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

            ai.whylabs.WhyLabs.models.shared.AddMembershipRequest req = new AddMembershipRequest("enim", "accusamus", Role.VIEWER) {{
                createdBy = "quidem";
                default_ = false;
            }};            

            CreateMembershipResponse res = sdk.membership.createMembership(req, new CreateMembershipSecurity("provident") {{
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


## createOrganizationMembership

Create a membership for a user, making them apart of an organization. Uses the user's current email address.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateOrganizationMembershipRequest;
import ai.whylabs.WhyLabs.models.operations.CreateOrganizationMembershipResponse;
import ai.whylabs.WhyLabs.models.operations.CreateOrganizationMembershipSecurity;
import ai.whylabs.WhyLabs.models.shared.Role;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            CreateOrganizationMembershipRequest req = new CreateOrganizationMembershipRequest("user@whylabs.ai", "org-123", Role.VIEWER) {{
                setDefault = false;
            }};            

            CreateOrganizationMembershipResponse res = sdk.membership.createOrganizationMembership(req, new CreateOrganizationMembershipSecurity("id") {{
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
| `request`                                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.CreateOrganizationMembershipRequest](../../models/operations/CreateOrganizationMembershipRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [ai.whylabs.WhyLabs.models.operations.CreateOrganizationMembershipSecurity](../../models/operations/CreateOrganizationMembershipSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateOrganizationMembershipResponse](../../models/operations/CreateOrganizationMembershipResponse.md)**


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

            GetDefaultMembershipForEmailRequest req = new GetDefaultMembershipForEmailRequest("blanditiis");            

            GetDefaultMembershipForEmailResponse res = sdk.membership.getDefaultMembershipForEmail(req, new GetDefaultMembershipForEmailSecurity("deleniti") {{
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

            GetMembershipsRequest req = new GetMembershipsRequest("sapiente");            

            GetMembershipsResponse res = sdk.membership.getMemberships(req, new GetMembershipsSecurity("amet") {{
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

            GetMembershipsByEmailRequest req = new GetMembershipsByEmailRequest("deserunt");            

            GetMembershipsByEmailResponse res = sdk.membership.getMembershipsByEmail(req, new GetMembershipsByEmailSecurity("nisi") {{
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

            GetMembershipsByOrgRequest req = new GetMembershipsByOrgRequest("vel");            

            GetMembershipsByOrgResponse res = sdk.membership.getMembershipsByOrg(req, new GetMembershipsByOrgSecurity("natus") {{
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


## listOrganizationMemberships

list memberships for an organization

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListOrganizationMembershipsRequest;
import ai.whylabs.WhyLabs.models.operations.ListOrganizationMembershipsResponse;
import ai.whylabs.WhyLabs.models.operations.ListOrganizationMembershipsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListOrganizationMembershipsRequest req = new ListOrganizationMembershipsRequest("org-123");            

            ListOrganizationMembershipsResponse res = sdk.membership.listOrganizationMemberships(req, new ListOrganizationMembershipsSecurity("omnis") {{
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
| `request`                                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.ListOrganizationMembershipsRequest](../../models/operations/ListOrganizationMembershipsRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [ai.whylabs.WhyLabs.models.operations.ListOrganizationMembershipsSecurity](../../models/operations/ListOrganizationMembershipsSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListOrganizationMembershipsResponse](../../models/operations/ListOrganizationMembershipsResponse.md)**


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

            ai.whylabs.WhyLabs.models.shared.RemoveMembershipRequest req = new RemoveMembershipRequest("molestiae", "perferendis");            

            RemoveMembershipByEmailResponse res = sdk.membership.removeMembershipByEmail(req, new RemoveMembershipByEmailSecurity("nihil") {{
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


## removeOrganizationMembership

Removes membership in a given org from a user, using the user's email address.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.RemoveOrganizationMembershipRequest;
import ai.whylabs.WhyLabs.models.operations.RemoveOrganizationMembershipResponse;
import ai.whylabs.WhyLabs.models.operations.RemoveOrganizationMembershipSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            RemoveOrganizationMembershipRequest req = new RemoveOrganizationMembershipRequest("user@whylabs.ai", "org-123");            

            RemoveOrganizationMembershipResponse res = sdk.membership.removeOrganizationMembership(req, new RemoveOrganizationMembershipSecurity("magnam") {{
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
| `request`                                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.RemoveOrganizationMembershipRequest](../../models/operations/RemoveOrganizationMembershipRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [ai.whylabs.WhyLabs.models.operations.RemoveOrganizationMembershipSecurity](../../models/operations/RemoveOrganizationMembershipSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.RemoveOrganizationMembershipResponse](../../models/operations/RemoveOrganizationMembershipResponse.md)**


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

            ai.whylabs.WhyLabs.models.shared.SetDefaultMembershipRequest req = new SetDefaultMembershipRequest("distinctio", "id");            

            SetDefaultMembershipResponse res = sdk.membership.setDefaultMembership(req, new SetDefaultMembershipSecurity("labore") {{
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

            ai.whylabs.WhyLabs.models.shared.UpdateMembershipRequest req = new UpdateMembershipRequest("labore", "suscipit", Role.MEMBER);            

            UpdateMembershipByEmailResponse res = sdk.membership.updateMembershipByEmail(req, new UpdateMembershipByEmailSecurity("nobis") {{
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


## updateOrganizationMembership

Updates the role in an membership, given the organization and the user's email address.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateOrganizationMembershipRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateOrganizationMembershipResponse;
import ai.whylabs.WhyLabs.models.operations.UpdateOrganizationMembershipSecurity;
import ai.whylabs.WhyLabs.models.shared.Role;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            UpdateOrganizationMembershipRequest req = new UpdateOrganizationMembershipRequest("user@whylabs.ai", "org-123", Role.MEMBER);            

            UpdateOrganizationMembershipResponse res = sdk.membership.updateOrganizationMembership(req, new UpdateOrganizationMembershipSecurity("vero") {{
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
| `request`                                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.UpdateOrganizationMembershipRequest](../../models/operations/UpdateOrganizationMembershipRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [ai.whylabs.WhyLabs.models.operations.UpdateOrganizationMembershipSecurity](../../models/operations/UpdateOrganizationMembershipSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateOrganizationMembershipResponse](../../models/operations/UpdateOrganizationMembershipResponse.md)**

