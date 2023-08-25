# sessions

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

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            BatchCreateReferenceProfileUploadRequest req = new BatchCreateReferenceProfileUploadRequest(                new BatchLogReferenceRequest() {{
                                references = new ai.whylabs.WhyLabs.models.shared.LogReferenceRequest[]{{
                                    add(new LogReferenceRequest() {{
                                        alias = "numquam";
                                        datasetTimestamp = 313692L;
                                    }}),
                                    add(new LogReferenceRequest() {{
                                        alias = "dolorem";
                                        datasetTimestamp = 957451L;
                                    }}),
                                    add(new LogReferenceRequest() {{
                                        alias = "totam";
                                        datasetTimestamp = 471752L;
                                    }}),
                                    add(new LogReferenceRequest() {{
                                        alias = "sit";
                                        datasetTimestamp = 711584L;
                                    }}),
                                }};
                            }};, "neque");            

            BatchCreateReferenceProfileUploadResponse res = sdk.sessions.batchCreateReferenceProfileUpload(req);

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
import ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ClaimGuestSessionRequest req = new ClaimGuestSessionRequest("sed", "vel");            

            ClaimGuestSessionResponse res = sdk.sessions.claimGuestSession(req, new ClaimGuestSessionSecurity("libero") {{
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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionRequest](../../models/operations/ClaimGuestSessionRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [ai.whylabs.WhyLabs.models.operations.ClaimGuestSessionSecurity](../../models/operations/ClaimGuestSessionSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


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
import ai.whylabs.WhyLabs.models.shared.SegmentTag;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            CreateDatasetProfileUploadRequest req = new CreateDatasetProfileUploadRequest(                new LogAsyncRequest() {{
                                datasetTimestamp = 374170L;
                                segmentTags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                                    add(new SegmentTag() {{
                                        key = "quam";
                                        value = "ipsum";
                                    }}),
                                    add(new SegmentTag() {{
                                        key = "incidunt";
                                        value = "qui";
                                    }}),
                                    add(new SegmentTag() {{
                                        key = "cupiditate";
                                        value = "maxime";
                                    }}),
                                }};
                            }};, "pariatur");            

            CreateDatasetProfileUploadResponse res = sdk.sessions.createDatasetProfileUpload(req);

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

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            CreateReferenceProfileUploadRequest req = new CreateReferenceProfileUploadRequest(                new LogReferenceRequest() {{
                                alias = "soluta";
                                datasetTimestamp = 117531L;
                            }};, "laborum");            

            CreateReferenceProfileUploadResponse res = sdk.sessions.createReferenceProfileUpload(req);

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

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.CreateSessionRequest req = new CreateSessionRequest("totam");            

            CreateSessionResponse res = sdk.sessions.createSession(req);

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
import ai.whylabs.WhyLabs.models.operations.GetSessionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetSessionRequest req = new GetSessionRequest("incidunt");            

            GetSessionResponse res = sdk.sessions.getSession(req, new GetSessionSecurity("aspernatur") {{
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
| `request`                                                                                                | [ai.whylabs.WhyLabs.models.operations.GetSessionRequest](../../models/operations/GetSessionRequest.md)   | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [ai.whylabs.WhyLabs.models.operations.GetSessionSecurity](../../models/operations/GetSessionSecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |


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

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetSessionProfileObservatoryLinkRequest req = new GetSessionProfileObservatoryLinkRequest(                new GetProfileObservatoryLinkRequest() {{
                                batchProfileTimestamps = new Long[]{{
                                    add(716860L),
                                }};
                                referenceProfileIds = new String[]{{
                                    add("aliquid"),
                                    add("quam"),
                                    add("molestias"),
                                }};
                            }};, "temporibus");            

            GetSessionProfileObservatoryLinkResponse res = sdk.sessions.getSessionProfileObservatoryLink(req);

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

