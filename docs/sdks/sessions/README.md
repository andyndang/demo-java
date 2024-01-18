# Sessions
(*sessions*)

### Available Operations

* [batchCreateReferenceProfileUpload](#batchcreatereferenceprofileupload) - Create multiple reference profile uploads for a given session.
* [claimGuestSession](#claimguestsession) - Claim a guest session, copying its model data into another org and expiring the session.
* [createDatasetProfileUpload](#createdatasetprofileupload) - Create an upload for a given session.
* [createReferenceProfileUpload](#createreferenceprofileupload) - Create a reference profile upload for a given session.
* [createSession](#createsession) - Create a new session that can be used to upload dataset profiles from whylogs for display in whylabs.
* [getSession](#getsession) - Get information about a session.
* [getSessionProfileObservatoryLink](#getsessionprofileobservatorylink) - Get observatory links for profiles in a given session. A max of 3 profiles can be viewed a a time.

## batchCreateReferenceProfileUpload

Create multiple reference profile uploads for a given session.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadRequest;
import ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadResponse;
import ai.whylabs.WhyLabs.models.shared.BatchLogReferenceRequest;
import ai.whylabs.WhyLabs.models.shared.LogReferenceRequest;
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

            ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadRequest req = new BatchCreateReferenceProfileUploadRequest(
                new BatchLogReferenceRequest(
){{
                    references = new ai.whylabs.WhyLabs.models.shared.LogReferenceRequest[]{{
                        add(new LogReferenceRequest(
                        ){{}}),
                    }};

                }},
                "string");

            ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadResponse res = sdk.sessions.batchCreateReferenceProfileUpload(req);

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadRequest](../../models/operations/BatchCreateReferenceProfileUploadRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.BatchCreateReferenceProfileUploadResponse](../../models/operations/BatchCreateReferenceProfileUploadResponse.md)**


## claimGuestSession

Claim a guest session, copying its model data into another org and expiring the session.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionRequest;
import ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionResponse;
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

            ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionRequest req = new ClaimGuestSessionRequest(
                "string",
                "string");

            ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionResponse res = sdk.sessions.claimGuestSession(req);

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
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionRequest](../../models/operations/ClaimGuestSessionRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionResponse](../../models/operations/ClaimGuestSessionResponse.md)**


## createDatasetProfileUpload

Create an upload for a given session.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadRequest;
import ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadResponse;
import ai.whylabs.WhyLabs.models.shared.LogAsyncRequest;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SegmentTag;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadRequest req = new CreateDatasetProfileUploadRequest(
                new LogAsyncRequest(
){{
                    datasetTimestamp = 967561L;
                    region = "string";
                    segmentTags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                        add(new SegmentTag(
                        "string",
                        "string"){{
                            key = "<key>";
                            value = "string";
                        }}),
                    }};

                }},
                "string");

            ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadResponse res = sdk.sessions.createDatasetProfileUpload(req);

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
| `request`                                                                                                                              | [ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadRequest](../../models/operations/CreateDatasetProfileUploadRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateDatasetProfileUploadResponse](../../models/operations/CreateDatasetProfileUploadResponse.md)**


## createReferenceProfileUpload

Create a reference profile upload for a given session.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadRequest;
import ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadResponse;
import ai.whylabs.WhyLabs.models.shared.LogReferenceRequest;
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

            ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadRequest req = new CreateReferenceProfileUploadRequest(
                new LogReferenceRequest(
){{
                    alias = "string";
                    datasetTimestamp = 590824L;
                    region = "string";

                }},
                "string");

            ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadResponse res = sdk.sessions.createReferenceProfileUpload(req);

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
| `request`                                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadRequest](../../models/operations/CreateReferenceProfileUploadRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileUploadResponse](../../models/operations/CreateReferenceProfileUploadResponse.md)**


## createSession

Create a new session that can be used to upload dataset profiles from whylogs for display in whylabs.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateSessionResponse;
import ai.whylabs.WhyLabs.models.shared.CreateSessionRequest;
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

            ai.whylabs.WhyLabs.models.shared.CreateSessionRequest req = new CreateSessionRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.CreateSessionResponse res = sdk.sessions.createSession(req);

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
| `request`                                                                                            | [ai.whylabs.WhyLabs.models.shared.CreateSessionRequest](../../models/shared/CreateSessionRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateSessionResponse](../../models/operations/CreateSessionResponse.md)**


## getSession

Get information about a session.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetSessionRequest;
import ai.whylabs.WhyLabs.models.operations.GetSessionResponse;
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

            ai.whylabs.WhyLabs.models.operations.GetSessionRequest req = new GetSessionRequest(
                "string");

            ai.whylabs.WhyLabs.models.operations.GetSessionResponse res = sdk.sessions.getSession(req);

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
| `request`                                                                                              | [ai.whylabs.WhyLabs.models.operations.GetSessionRequest](../../models/operations/GetSessionRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetSessionResponse](../../models/operations/GetSessionResponse.md)**


## getSessionProfileObservatoryLink

Get observatory links for profiles in a given session. A max of 3 profiles can be viewed a a time.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkRequest;
import ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkResponse;
import ai.whylabs.WhyLabs.models.shared.GetProfileObservatoryLinkRequest;
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

            ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkRequest req = new GetSessionProfileObservatoryLinkRequest(
                new GetProfileObservatoryLinkRequest(
){{
                    batchProfileTimestamps = new Long[]{{
                        add(495187L),
                    }};
                    referenceProfileIds = new String[]{{
                        add("string"),
                    }};

                }},
                "string");

            ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkResponse res = sdk.sessions.getSessionProfileObservatoryLink(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkRequest](../../models/operations/GetSessionProfileObservatoryLinkRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetSessionProfileObservatoryLinkResponse](../../models/operations/GetSessionProfileObservatoryLinkResponse.md)**

