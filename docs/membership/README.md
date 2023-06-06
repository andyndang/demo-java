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

            ai.whylabs.WhyLabs.models.shared.AddMembershipRequest req = new AddMembershipRequest("alias", "fugit", Role.VIEWER) {{
                createdBy = "excepturi";
                default_ = false;
            }};            

            CreateMembershipResponse res = sdk.membership.createMembership(req, new CreateMembershipSecurity("tempora") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            CreateOrganizationMembershipResponse res = sdk.membership.createOrganizationMembership(req, new CreateOrganizationMembershipSecurity("tempore") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            GetDefaultMembershipForEmailRequest req = new GetDefaultMembershipForEmailRequest("labore");            

            GetDefaultMembershipForEmailResponse res = sdk.membership.getDefaultMembershipForEmail(req, new GetDefaultMembershipForEmailSecurity("delectus") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            GetMembershipsRequest req = new GetMembershipsRequest("eum");            

            GetMembershipsResponse res = sdk.membership.getMemberships(req, new GetMembershipsSecurity("non") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            GetMembershipsByEmailRequest req = new GetMembershipsByEmailRequest("eligendi");            

            GetMembershipsByEmailResponse res = sdk.membership.getMembershipsByEmail(req, new GetMembershipsByEmailSecurity("sint") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            GetMembershipsByOrgRequest req = new GetMembershipsByOrgRequest("aliquid");            

            GetMembershipsByOrgResponse res = sdk.membership.getMembershipsByOrg(req, new GetMembershipsByOrgSecurity("provident") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            ListOrganizationMembershipsResponse res = sdk.membership.listOrganizationMemberships(req, new ListOrganizationMembershipsSecurity("necessitatibus") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            ai.whylabs.WhyLabs.models.shared.RemoveMembershipRequest req = new RemoveMembershipRequest("sint", "officia");            

            RemoveMembershipByEmailResponse res = sdk.membership.removeMembershipByEmail(req, new RemoveMembershipByEmailSecurity("dolor") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            RemoveOrganizationMembershipResponse res = sdk.membership.removeOrganizationMembership(req, new RemoveOrganizationMembershipSecurity("debitis") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            ai.whylabs.WhyLabs.models.shared.SetDefaultMembershipRequest req = new SetDefaultMembershipRequest("a", "dolorum");            

            SetDefaultMembershipResponse res = sdk.membership.setDefaultMembership(req, new SetDefaultMembershipSecurity("in") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            ai.whylabs.WhyLabs.models.shared.UpdateMembershipRequest req = new UpdateMembershipRequest("in", "illum", Role.VIEWER);            

            UpdateMembershipByEmailResponse res = sdk.membership.updateMembershipByEmail(req, new UpdateMembershipByEmailSecurity("rerum") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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

            UpdateOrganizationMembershipRequest req = new UpdateOrganizationMembershipRequest("user@whylabs.ai", "org-123", Role.ADMIN);            

            UpdateOrganizationMembershipResponse res = sdk.membership.updateOrganizationMembership(req, new UpdateOrganizationMembershipSecurity("magnam") {{
                apiKeyAuth = "YOUR_API_KEY_HERE";
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
