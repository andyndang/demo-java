# sessions

### Available Operations

* [batchCreateReferenceProfileUpload](#batchcreatereferenceprofileupload) - Create multiple reference profile uploads for a given session.
* [claimGuestSession](#claimguestsession) - Claim a guest session, copying its model data into another org and expiring the session.
* [createDatasetProfileUpload](#createdatasetprofileupload) - Create an upload for a given session.
* [createReferenceProfileUpload](#createreferenceprofileupload) - Create a reference profile upload for a given session.
* [createSession](#createsession) - Create a new session that can be used to upload dataset profiles from whylogs for display in whylabs.
* [getSession](#getsession) - Get information about a session.

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
                                        alias = "dignissimos";
                                        datasetTimestamp = 970237L;
                                    }}),
                                    add(new LogReferenceRequest() {{
                                        alias = "amet";
                                        datasetTimestamp = 680545L;
                                    }}),
                                }};
                            }};, "numquam");            

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

            ClaimGuestSessionRequest req = new ClaimGuestSessionRequest("veritatis", "ipsa");            

            ClaimGuestSessionResponse res = sdk.sessions.claimGuestSession(req, new ClaimGuestSessionSecurity("ipsa") {{
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
                                datasetTimestamp = 434417L;
                                segmentTags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                                    add(new SegmentTag() {{
                                        key = "quaerat";
                                        value = "accusamus";
                                    }}),
                                    add(new SegmentTag() {{
                                        key = "quidem";
                                        value = "voluptatibus";
                                    }}),
                                }};
                            }};, "voluptas");            

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
                                alias = "natus";
                                datasetTimestamp = 179603L;
                            }};, "atque");            

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

            ai.whylabs.WhyLabs.models.shared.CreateSessionRequest req = new CreateSessionRequest("sit");            

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

            GetSessionRequest req = new GetSessionRequest("fugiat");            

            GetSessionResponse res = sdk.sessions.getSession(req, new GetSessionSecurity("ab") {{
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

