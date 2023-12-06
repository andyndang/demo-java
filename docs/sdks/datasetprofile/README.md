# DatasetProfile
(*datasetProfile*)

### Available Operations

* [createReferenceProfile](#createreferenceprofile) - Returns data needed to uploading the reference profile
* [deleteAnalyzerResults](#deleteanalyzerresults) - Deletes a set of analyzer results
* [deleteDatasetProfiles](#deletedatasetprofiles) - Deletes a set of dataset profiles
* [deleteReferenceProfile](#deletereferenceprofile) - Delete a single reference profile
* [getProfileTraces](#getprofiletraces) - Returns a list for profile traces matching a trace id
* [getReferenceProfile](#getreferenceprofile) - Returns a single reference profile
* [hideSegments](#hidesegments) - Hides a list of segments
* [listDeleteAnalyzerResultsRequests](#listdeleteanalyzerresultsrequests) - List requests to delete analyzer results
* [listDeleteDatasetProfilesRequests](#listdeletedatasetprofilesrequests) - List requests to delete dataset profiles
* [listReferenceProfiles](#listreferenceprofiles) - Returns a list for reference profiles between the given time range filtered on the upload timestamp
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
import ai.whylabs.WhyLabs.models.shared.CreateReferenceProfileRequest;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.Segment;
import ai.whylabs.WhyLabs.models.shared.SegmentTag;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileRequest req = new CreateReferenceProfileRequest(
                new CreateReferenceProfileRequest(
){{
                    alias = "string";
                    datasetTimestamp = 129059L;
                    region = "string";
                    segments = new ai.whylabs.WhyLabs.models.shared.Segment[]{{
                        add(new Segment(
                        ){{
                            tags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                                add(new SegmentTag(
                                "string",
                                "string"){{
                                    key = "<key>";
                                    value = "string";
                                }}),
                            }};
                        }}),
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    version = "string";

                }},
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileResponse res = sdk.datasetProfile.createReferenceProfile(req);

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
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.CreateReferenceProfileRequest](../../models/operations/CreateReferenceProfileRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsRequest req = new DeleteAnalyzerResultsRequest(
                "model-123",
                "org-123"){{
                endTimestamp = 1893456000000L;
                startTimestamp = 1577836800000L;

            }};

            ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsResponse res = sdk.datasetProfile.deleteAnalyzerResults(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.DeleteAnalyzerResultsRequest](../../models/operations/DeleteAnalyzerResultsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesRequest req = new DeleteDatasetProfilesRequest(
                "model-123",
                "org-123"){{
                beforeUploadTimestamp = 1577836800000L;
                profileEndTimestamp = 1893456000000L;
                profileStartTimestamp = 1577836800000L;

            }};

            ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesResponse res = sdk.datasetProfile.deleteDatasetProfiles(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.DeleteDatasetProfilesRequest](../../models/operations/DeleteDatasetProfilesRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileRequest req = new DeleteReferenceProfileRequest(
                "model-123",
                "org-123",
                "ref-xxy");

            ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileResponse res = sdk.datasetProfile.deleteReferenceProfile(req);

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
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileRequest](../../models/operations/DeleteReferenceProfileRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteReferenceProfileResponse](../../models/operations/DeleteReferenceProfileResponse.md)**


## getProfileTraces

Returns a list of profile traces matching a trace id

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetProfileTracesRequest;
import ai.whylabs.WhyLabs.models.operations.GetProfileTracesResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetProfileTracesRequest req = new GetProfileTracesRequest(
                "model-123",
                "org-123",
                "a756f8bb-de30-48a2-be41-178ae6af7100"){{
                limit = 50;
                offset = 0;

            }};

            ai.whylabs.WhyLabs.models.operations.GetProfileTracesResponse res = sdk.datasetProfile.getProfileTraces(req);

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
| `request`                                                                                                          | [ai.whylabs.WhyLabs.models.operations.GetProfileTracesRequest](../../models/operations/GetProfileTracesRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetProfileTracesResponse](../../models/operations/GetProfileTracesResponse.md)**


## getReferenceProfile

Returns a Reference Profile.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetReferenceProfileRequest;
import ai.whylabs.WhyLabs.models.operations.GetReferenceProfileResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.GetReferenceProfileRequest req = new GetReferenceProfileRequest(
                "model-123",
                "org-123",
                "ref-xxy");

            ai.whylabs.WhyLabs.models.operations.GetReferenceProfileResponse res = sdk.datasetProfile.getReferenceProfile(req);

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
| `request`                                                                                                                | [ai.whylabs.WhyLabs.models.operations.GetReferenceProfileRequest](../../models/operations/GetReferenceProfileRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetReferenceProfileResponse](../../models/operations/GetReferenceProfileResponse.md)**


## hideSegments

Returns a list of segments that were hidden for a dataset.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.HideSegmentsRequest;
import ai.whylabs.WhyLabs.models.operations.HideSegmentsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SegmentsListRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.HideSegmentsRequest req = new HideSegmentsRequest(
                new SegmentsListRequest(
){{
                    segments = new String[]{{
                        add("string"),
                    }};

                }},
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.HideSegmentsResponse res = sdk.datasetProfile.hideSegments(req);

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
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.operations.HideSegmentsRequest](../../models/operations/HideSegmentsRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.HideSegmentsResponse](../../models/operations/HideSegmentsResponse.md)**


## listDeleteAnalyzerResultsRequests

List the requests to delete analyzer results.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListDeleteAnalyzerResultsRequestsRequest;
import ai.whylabs.WhyLabs.models.operations.ListDeleteAnalyzerResultsRequestsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListDeleteAnalyzerResultsRequestsRequest req = new ListDeleteAnalyzerResultsRequestsRequest(
                "org-123");

            ai.whylabs.WhyLabs.models.operations.ListDeleteAnalyzerResultsRequestsResponse res = sdk.datasetProfile.listDeleteAnalyzerResultsRequests(req);

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
| `request`                                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.ListDeleteAnalyzerResultsRequestsRequest](../../models/operations/ListDeleteAnalyzerResultsRequestsRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListDeleteAnalyzerResultsRequestsResponse](../../models/operations/ListDeleteAnalyzerResultsRequestsResponse.md)**


## listDeleteDatasetProfilesRequests

List the requests to delete dataset profiles.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListDeleteDatasetProfilesRequestsRequest;
import ai.whylabs.WhyLabs.models.operations.ListDeleteDatasetProfilesRequestsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListDeleteDatasetProfilesRequestsRequest req = new ListDeleteDatasetProfilesRequestsRequest(
                "org-123");

            ai.whylabs.WhyLabs.models.operations.ListDeleteDatasetProfilesRequestsResponse res = sdk.datasetProfile.listDeleteDatasetProfilesRequests(req);

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
| `request`                                                                                                                                            | [ai.whylabs.WhyLabs.models.operations.ListDeleteDatasetProfilesRequestsRequest](../../models/operations/ListDeleteDatasetProfilesRequestsRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListDeleteDatasetProfilesRequestsResponse](../../models/operations/ListDeleteDatasetProfilesRequestsResponse.md)**


## listReferenceProfiles

Returns a list of Reference Profiles between a given time range filtered on the upload timestamp.

        

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesRequest;
import ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesRequest req = new ListReferenceProfilesRequest(
                "model-123",
                "org-123"){{
                fromEpoch = 1577836800000L;
                toEpoch = 1893456000000L;

            }};

            ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesResponse res = sdk.datasetProfile.listReferenceProfiles(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.ListReferenceProfilesRequest](../../models/operations/ListReferenceProfilesRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.ListSegmentsRequest req = new ListSegmentsRequest(
                "model-123",
                "org-123");

            ai.whylabs.WhyLabs.models.operations.ListSegmentsResponse res = sdk.datasetProfile.listSegments(req);

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
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.operations.ListSegmentsRequest](../../models/operations/ListSegmentsRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListSegmentsResponse](../../models/operations/ListSegmentsResponse.md)**

