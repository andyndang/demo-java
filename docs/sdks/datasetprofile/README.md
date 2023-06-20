# datasetProfile

### Available Operations

* [createReferenceProfile](#createreferenceprofile) - Returns data needed to uploading the reference profile
* [deleteAnalyzerResults](#deleteanalyzerresults) - Deletes a set of analyzer results
* [deleteDatasetProfiles](#deletedatasetprofiles) - Deletes a set of dataset profiles
* [deleteReferenceProfile](#deletereferenceprofile) - Delete a single reference profile
* [getReferenceProfile](#getreferenceprofile) - Returns a single reference profile
* [listReferenceProfiles](#listreferenceprofiles) - Returns a list for reference profiles
* [listSegments](#listsegments) - Returns a list of segments

## createReferenceProfile

Returns data needed to upload the reference profile. Supports uploading segmented reference profiles. 
            If segments are omitted, provides data needed to upload a single reference profile. 
            This replaces the deprecated LogReference operation.
        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileRequest;
import ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileResponse;
import ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileSecurity;
import ai.whylabs.WhyLabs.models.shared.CreateReferenceProfileRequest;
import ai.whylabs.WhyLabs.models.shared.Segment;
import ai.whylabs.WhyLabs.models.shared.SegmentTag;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            CreateReferenceProfileRequest req = new CreateReferenceProfileRequest(                new CreateReferenceProfileRequest() {{
                                alias = "ab";
                                datasetTimestamp = 337396L;
                                segments = new ai.whylabs.WhyLabs.models.shared.Segment[]{{
                                    add(new Segment() {{
                                        tags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                                            add(new SegmentTag() {{
                                                key = "perferendis";
                                                value = "ipsam";
                                            }}),
                                            add(new SegmentTag() {{
                                                key = "repellendus";
                                                value = "sapiente";
                                            }}),
                                            add(new SegmentTag() {{
                                                key = "quo";
                                                value = "odit";
                                            }}),
                                        }};
                                    }}),
                                }};
                                tags = new String[]{{
                                    add("at"),
                                    add("maiores"),
                                    add("molestiae"),
                                    add("quod"),
                                }};
                                version = "quod";
                            }};, "model-123", "org-123");            

            CreateReferenceProfileResponse res = sdk.datasetProfile.createReferenceProfile(req, new CreateReferenceProfileSecurity("esse") {{
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileRequest](../../models/operations/CreateReferenceProfileRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileSecurity](../../models/operations/CreateReferenceProfileSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileResponse](../../models/operations/CreateReferenceProfileResponse.md)**


## deleteAnalyzerResults

Deletes a set of analyzer results. Returns false if scheduling deletion encountered some error.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsResponse;
import ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteAnalyzerResultsRequest req = new DeleteAnalyzerResultsRequest("model-123", "org-123") {{
                endTimestamp = 1893456000000L;
                startTimestamp = 1577836800000L;
            }};            

            DeleteAnalyzerResultsResponse res = sdk.datasetProfile.deleteAnalyzerResults(req, new DeleteAnalyzerResultsSecurity("totam") {{
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
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsRequest](../../models/operations/DeleteAnalyzerResultsRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsSecurity](../../models/operations/DeleteAnalyzerResultsSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsResponse](../../models/operations/DeleteAnalyzerResultsResponse.md)**


## deleteDatasetProfiles

Deletes a set of dataset profiles. Returns false if scheduling deletion encountered some error.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesResponse;
import ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteDatasetProfilesRequest req = new DeleteDatasetProfilesRequest("model-123", "org-123") {{
                beforeUploadTimestamp = 1577836800000L;
                profileEndTimestamp = 1893456000000L;
                profileStartTimestamp = 1577836800000L;
            }};            

            DeleteDatasetProfilesResponse res = sdk.datasetProfile.deleteDatasetProfiles(req, new DeleteDatasetProfilesSecurity("porro") {{
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
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesRequest](../../models/operations/DeleteDatasetProfilesRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesSecurity](../../models/operations/DeleteDatasetProfilesSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesResponse](../../models/operations/DeleteDatasetProfilesResponse.md)**


## deleteReferenceProfile

Delete a a Reference Profile. Returns false if the deletion encountered some error.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileResponse;
import ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteReferenceProfileRequest req = new DeleteReferenceProfileRequest("model-123", "org-123", "ref-xxy");            

            DeleteReferenceProfileResponse res = sdk.datasetProfile.deleteReferenceProfile(req, new DeleteReferenceProfileSecurity("dolorum") {{
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileRequest](../../models/operations/DeleteReferenceProfileRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileSecurity](../../models/operations/DeleteReferenceProfileSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileResponse](../../models/operations/DeleteReferenceProfileResponse.md)**


## getReferenceProfile

Returns a Reference Profile.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetReferenceProfileRequest;
import ai.whylabs.WhyLabs.models.operations.GetReferenceProfileResponse;
import ai.whylabs.WhyLabs.models.operations.GetReferenceProfileSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetReferenceProfileRequest req = new GetReferenceProfileRequest("model-123", "org-123", "ref-xxy");            

            GetReferenceProfileResponse res = sdk.datasetProfile.getReferenceProfile(req, new GetReferenceProfileSecurity("dicta") {{
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
| `request`                                                                                                                  | [ai.whylabs.WhyLabs.models.operations.GetReferenceProfileRequest](../../models/operations/GetReferenceProfileRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [ai.whylabs.WhyLabs.models.operations.GetReferenceProfileSecurity](../../models/operations/GetReferenceProfileSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetReferenceProfileResponse](../../models/operations/GetReferenceProfileResponse.md)**


## listReferenceProfiles

Returns a list of Reference Profiles.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesRequest;
import ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesResponse;
import ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListReferenceProfilesRequest req = new ListReferenceProfilesRequest("model-123", "org-123") {{
                fromEpoch = 1577836800000L;
                toEpoch = 1893456000000L;
            }};            

            ListReferenceProfilesResponse res = sdk.datasetProfile.listReferenceProfiles(req, new ListReferenceProfilesSecurity("nam") {{
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
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesRequest](../../models/operations/ListReferenceProfilesRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesSecurity](../../models/operations/ListReferenceProfilesSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesResponse](../../models/operations/ListReferenceProfilesResponse.md)**


## listSegments

Returns a list of segments for the dataset.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListSegmentsRequest;
import ai.whylabs.WhyLabs.models.operations.ListSegmentsResponse;
import ai.whylabs.WhyLabs.models.operations.ListSegmentsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListSegmentsRequest req = new ListSegmentsRequest("model-123", "org-123");            

            ListSegmentsResponse res = sdk.datasetProfile.listSegments(req, new ListSegmentsSecurity("officia") {{
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
| `request`                                                                                                    | [ai.whylabs.WhyLabs.models.operations.ListSegmentsRequest](../../models/operations/ListSegmentsRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [ai.whylabs.WhyLabs.models.operations.ListSegmentsSecurity](../../models/operations/ListSegmentsSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListSegmentsResponse](../../models/operations/ListSegmentsResponse.md)**
