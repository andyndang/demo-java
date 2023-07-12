# search

### Available Operations

* [whyLabsSearch](#whylabssearch) - WhyLabs Search
* [whyLabsSearchIndexing](#whylabssearchindexing) - WhyLabs Search Indexing

## whyLabsSearch

WhyLabs Search

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchRequest;
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchResponse;
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            WhyLabsSearchRequest req = new WhyLabsSearchRequest("qui");            

            WhyLabsSearchResponse res = sdk.search.whyLabsSearch(req, new WhyLabsSearchSecurity("ipsum") {{
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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.WhyLabsSearchRequest](../../models/operations/WhyLabsSearchRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [ai.whylabs.WhyLabs.models.operations.WhyLabsSearchSecurity](../../models/operations/WhyLabsSearchSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.WhyLabsSearchResponse](../../models/operations/WhyLabsSearchResponse.md)**


## whyLabsSearchIndexing

WhyLabs Search Indexing

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingResponse;
import ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingSecurity;
import ai.whylabs.WhyLabs.models.shared.SearchIndexRequest;
import ai.whylabs.WhyLabs.models.shared.SearchIndexType;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ai.whylabs.WhyLabs.models.shared.SearchIndexRequest req = new SearchIndexRequest() {{
                orgId = "hic";
                type = SearchIndexType.ENTITY_SCHEMA;
            }};            

            WhyLabsSearchIndexingResponse res = sdk.search.whyLabsSearchIndexing(req, new WhyLabsSearchIndexingSecurity("cum") {{
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
| `request`                                                                                                                      | [ai.whylabs.WhyLabs.models.shared.SearchIndexRequest](../../models/shared/SearchIndexRequest.md)                               | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingSecurity](../../models/operations/WhyLabsSearchIndexingSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[ai.whylabs.WhyLabs.models.operations.WhyLabsSearchIndexingResponse](../../models/operations/WhyLabsSearchIndexingResponse.md)**

