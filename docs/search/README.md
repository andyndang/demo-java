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

            WhyLabsSearchRequest req = new WhyLabsSearchRequest("perspiciatis");            

            WhyLabsSearchResponse res = sdk.search.whyLabsSearch(req, new WhyLabsSearchSecurity("voluptatem") {{
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
                orgId = "porro";
                type = SearchIndexType.MODELS;
            }};            

            WhyLabsSearchIndexingResponse res = sdk.search.whyLabsSearchIndexing(req, new WhyLabsSearchIndexingSecurity("blanditiis") {{
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
