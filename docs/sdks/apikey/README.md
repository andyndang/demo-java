# apiKey

### Available Operations

* [createApiKey](#createapikey) - Generate an API key for a user.
* [getApiKey](#getapikey) - Get an api key by its id
* [listApiKeys](#listapikeys) - List API key metadata for a given organization and user
* [revokeApiKey](#revokeapikey) - Revoke the given API Key, removing its ability to access WhyLabs systems

## createApiKey

Generates an API key for a given user. Must be called either by system administrator or by the user themselves

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateApiKeyRequest;
import ai.whylabs.WhyLabs.models.operations.CreateApiKeyResponse;
import ai.whylabs.WhyLabs.models.operations.CreateApiKeySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            CreateApiKeyRequest req = new CreateApiKeyRequest("org-123", "user-123") {{
                alias = "MLApplicationName";
                expirationTime = 1577836800000L;
                scopes = new String[]{{
                    add(":user"),
                }};
            }};            

            CreateApiKeyResponse res = sdk.apiKey.createApiKey(req, new CreateApiKeySecurity("ipsam") {{
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
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.CreateApiKeyRequest](../../models/operations/CreateApiKeyRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [ai.whylabs.WhyLabs.models.operations.CreateApiKeySecurity](../../models/operations/CreateApiKeySecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateApiKeyResponse](../../models/operations/CreateApiKeyResponse.md)**


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

            GetApiKeyResponse res = sdk.apiKey.getApiKey(req, new GetApiKeySecurity("repellendus") {{
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

            ListApiKeysResponse res = sdk.apiKey.listApiKeys(req, new ListApiKeysSecurity("sapiente") {{
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


## revokeApiKey

Revokes the given API Key

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.RevokeApiKeyRequest;
import ai.whylabs.WhyLabs.models.operations.RevokeApiKeyResponse;
import ai.whylabs.WhyLabs.models.operations.RevokeApiKeySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            RevokeApiKeyRequest req = new RevokeApiKeyRequest("HMiFAgQeNb", "org-123", "user-123");            

            RevokeApiKeyResponse res = sdk.apiKey.revokeApiKey(req, new RevokeApiKeySecurity("quo") {{
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
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.RevokeApiKeyRequest](../../models/operations/RevokeApiKeyRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [ai.whylabs.WhyLabs.models.operations.RevokeApiKeySecurity](../../models/operations/RevokeApiKeySecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.RevokeApiKeyResponse](../../models/operations/RevokeApiKeyResponse.md)**

