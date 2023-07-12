# organizations

### Available Operations

* [createOrganization](#createorganization) - Create an organization
* [deleteOrganization](#deleteorganization) - Delete an org
* [getAWSMarketplaceMetadata](#getawsmarketplacemetadata) - Get marketplace metadata for an org if any exists.
* [getOrganization](#getorganization) - Get the metadata about an organization.
* [listOrganizations](#listorganizations) - Get a list of all of the organization ids.
* [~~partiallyUpdateOrg~~](#partiallyupdateorg) - Update some fields of an organization to non-null values :warning: **Deprecated**
* [partiallyUpdateOrganization](#partiallyupdateorganization) - Update some fields of an organization to non-null values
* [~~updateOrg~~](#updateorg) - Update an existing organization :warning: **Deprecated**
* [updateOrganization](#updateorganization) - Update an existing organization

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
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.PAID;
            }};            

            CreateOrganizationResponse res = sdk.organizations.createOrganization(req, new CreateOrganizationSecurity("totam") {{
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

            DeleteOrganizationRequest req = new DeleteOrganizationRequest("dignissimos");            

            DeleteOrganizationResponse res = sdk.organizations.deleteOrganization(req, new DeleteOrganizationSecurity("eaque") {{
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

            GetAWSMarketplaceMetadataRequest req = new GetAWSMarketplaceMetadataRequest("quis");            

            GetAWSMarketplaceMetadataResponse res = sdk.organizations.getAWSMarketplaceMetadata(req, new GetAWSMarketplaceMetadataSecurity("nesciunt") {{
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

            GetOrganizationRequest req = new GetOrganizationRequest("eos");            

            GetOrganizationResponse res = sdk.organizations.getOrganization(req, new GetOrganizationSecurity("perferendis") {{
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

            ListOrganizationsResponse res = sdk.organizations.listOrganizations(new ListOrganizationsSecurity("dolores") {{
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


## ~~partiallyUpdateOrg~~

Update some fields of an organization to non-null values, leaving all other existing values the same

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

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
                                orgId = "minus";
                            }};) {{
                domain = "acme.ai";
                name = "ACME, Inc";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.PAID;
            }};            

            PartiallyUpdateOrgResponse res = sdk.organizations.partiallyUpdateOrg(req, new PartiallyUpdateOrgSecurity("dolor") {{
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

            PartiallyUpdateOrganizationRequest req = new PartiallyUpdateOrganizationRequest("vero") {{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                name = "ACME, Inc";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                pagerDutyKey = "abc-def-ghi-jkl";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.PAID;
            }};            

            PartiallyUpdateOrganizationResponse res = sdk.organizations.partiallyUpdateOrganization(req, new PartiallyUpdateOrganizationSecurity("hic") {{
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


## ~~updateOrg~~

Update all fields of an existing organization

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

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
                                orgId = "recusandae";
                            }};, "ACME, Inc") {{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                pagerDutyKey = "abc-def-ghi-jkl";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.AWS_MARKETPLACE;
            }};            

            UpdateOrgResponse res = sdk.organizations.updateOrg(req, new UpdateOrgSecurity("facilis") {{
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

            UpdateOrganizationRequest req = new UpdateOrganizationRequest("ACME, Inc", "perspiciatis") {{
                domain = "acme.ai";
                emailDomains = "acme.ai,acme.com";
                notificationEmailAddress = "notifications@acme.ai";
                observatoryUrl = "https://hub.whylabsapp.com";
                pagerDutyKey = "abc-def-ghi-jkl";
                slackWebhook = "https://hooks.slack.com/services/foo/bar";
                subscriptionTier = SubscriptionTier.FREE;
            }};            

            UpdateOrganizationResponse res = sdk.organizations.updateOrganization(req, new UpdateOrganizationSecurity("porro") {{
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

