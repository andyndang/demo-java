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
                                        alias = "eaque";
                                        datasetTimestamp = 577229L;
                                    }}),
                                    add(new LogReferenceRequest() {{
                                        alias = "rerum";
                                        datasetTimestamp = 237893L;
                                    }}),
                                    add(new LogReferenceRequest() {{
                                        alias = "asperiores";
                                        datasetTimestamp = 934214L;
                                    }}),
                                }};
                            }};, "modi");            

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

            ClaimGuestSessionRequest req = new ClaimGuestSessionRequest("iste", "dolorum");            

            ClaimGuestSessionResponse res = sdk.sessions.claimGuestSession(req, new ClaimGuestSessionSecurity("deleniti") {{
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
                                datasetTimestamp = 864282L;
                                segmentTags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                                    add(new SegmentTag() {{
                                        key = "nobis";
                                        value = "libero";
                                    }}),
                                    add(new SegmentTag() {{
                                        key = "delectus";
                                        value = "quaerat";
                                    }}),
                                    add(new SegmentTag() {{
                                        key = "quos";
                                        value = "aliquid";
                                    }}),
                                }};
                            }};, "dolorem");            

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
                                alias = "dolorem";
                                datasetTimestamp = 222443L;
                            }};, "qui");            

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

            ai.whylabs.WhyLabs.models.shared.CreateSessionRequest req = new CreateSessionRequest("ipsum");            

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

            GetSessionRequest req = new GetSessionRequest("hic");            

            GetSessionResponse res = sdk.sessions.getSession(req, new GetSessionSecurity("excepturi") {{
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
