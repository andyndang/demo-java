# Models
(*models*)

### Available Operations

* [createModel](#createmodel) - Create a model with a given name and a time period
* [deactivateModel](#deactivatemodel) - Mark a model as inactive
* [deleteEntitySchema](#deleteentityschema) - Delete the entity schema config for a given dataset.
* [deleteEntitySchemaColumn](#deleteentityschemacolumn) - Delete the entity schema of a single column for a given dataset.
* [deleteEntitySchemaMetric](#deleteentityschemametric) - Delete the schema of a single metric for a given dataset.
* [getEntitySchema](#getentityschema) - Get the entity schema config for a given dataset.
* [getEntitySchemaColumn](#getentityschemacolumn) - Get the entity schema of a single column for a given dataset.
* [getModel](#getmodel) - Get a model metadata
* [listModels](#listmodels) - Get a list of all of the model ids for an organization.
* [putEntitySchema](#putentityschema) - Save the entity schema config for a given dataset.
* [putEntitySchemaColumn](#putentityschemacolumn) - Save the entity schema of a single column for a given dataset.
* [putEntitySchemaMetric](#putentityschemametric) - Save the schema of a single metric for a given dataset.
* [updateModel](#updatemodel) - Update a model's metadata

## createModel

Create a model

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateModelRequest;
import ai.whylabs.WhyLabs.models.operations.CreateModelResponse;
import ai.whylabs.WhyLabs.models.shared.ModelType;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.TimePeriod;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            CreateModelRequest req = new CreateModelRequest("Credit-Score-1", "org-123", TimePeriod.P1_D){{
                modelId = "model-123";
                modelType = ModelType.CLASSIFICATION;
            }};            

            CreateModelResponse res = sdk.models.createModel(req);

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
| `request`                                                                                                | [ai.whylabs.WhyLabs.models.operations.CreateModelRequest](../../models/operations/CreateModelRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateModelResponse](../../models/operations/CreateModelResponse.md)**


## deactivateModel

Mark a model as inactive

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeactivateModelRequest;
import ai.whylabs.WhyLabs.models.operations.DeactivateModelResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            DeactivateModelRequest req = new DeactivateModelRequest("model-123", "org-123");            

            DeactivateModelResponse res = sdk.models.deactivateModel(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.DeactivateModelRequest](../../models/operations/DeactivateModelRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeactivateModelResponse](../../models/operations/DeactivateModelResponse.md)**


## deleteEntitySchema

Delete the entity schema config for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            DeleteEntitySchemaRequest req = new DeleteEntitySchemaRequest("model-123", "org-123");            

            DeleteEntitySchemaResponse res = sdk.models.deleteEntitySchema(req);

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
| `request`                                                                                                              | [ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaRequest](../../models/operations/DeleteEntitySchemaRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaResponse](../../models/operations/DeleteEntitySchemaResponse.md)**


## deleteEntitySchemaColumn

Delete the entity schema of a single column for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaColumnRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaColumnResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            DeleteEntitySchemaColumnRequest req = new DeleteEntitySchemaColumnRequest("feature-123", "model-123", "org-123");            

            DeleteEntitySchemaColumnResponse res = sdk.models.deleteEntitySchemaColumn(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaColumnRequest](../../models/operations/DeleteEntitySchemaColumnRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaColumnResponse](../../models/operations/DeleteEntitySchemaColumnResponse.md)**


## deleteEntitySchemaMetric

Delete the schema of a single metric for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaMetricRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaMetricResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            DeleteEntitySchemaMetricRequest req = new DeleteEntitySchemaMetricRequest("model-123", "feature-123", "org-123");            

            DeleteEntitySchemaMetricResponse res = sdk.models.deleteEntitySchemaMetric(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaMetricRequest](../../models/operations/DeleteEntitySchemaMetricRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaMetricResponse](../../models/operations/DeleteEntitySchemaMetricResponse.md)**


## getEntitySchema

Get the entity schema config for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetEntitySchemaRequest;
import ai.whylabs.WhyLabs.models.operations.GetEntitySchemaResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            GetEntitySchemaRequest req = new GetEntitySchemaRequest("model-123", "org-123");            

            GetEntitySchemaResponse res = sdk.models.getEntitySchema(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.GetEntitySchemaRequest](../../models/operations/GetEntitySchemaRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetEntitySchemaResponse](../../models/operations/GetEntitySchemaResponse.md)**


## getEntitySchemaColumn

Get the entity schema of a single column for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetEntitySchemaColumnRequest;
import ai.whylabs.WhyLabs.models.operations.GetEntitySchemaColumnResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            GetEntitySchemaColumnRequest req = new GetEntitySchemaColumnRequest("feature-123", "model-123", "org-123");            

            GetEntitySchemaColumnResponse res = sdk.models.getEntitySchemaColumn(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.GetEntitySchemaColumnRequest](../../models/operations/GetEntitySchemaColumnRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetEntitySchemaColumnResponse](../../models/operations/GetEntitySchemaColumnResponse.md)**


## getModel

Returns various metadata about a model

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetModelRequest;
import ai.whylabs.WhyLabs.models.operations.GetModelResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            GetModelRequest req = new GetModelRequest("model-123", "org-123");            

            GetModelResponse res = sdk.models.getModel(req);

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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [ai.whylabs.WhyLabs.models.operations.GetModelRequest](../../models/operations/GetModelRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetModelResponse](../../models/operations/GetModelResponse.md)**


## listModels

Get a list of all of the model ids for an organization.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListModelsRequest;
import ai.whylabs.WhyLabs.models.operations.ListModelsResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ListModelsRequest req = new ListModelsRequest("org-123");            

            ListModelsResponse res = sdk.models.listModels(req);

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
| `request`                                                                                              | [ai.whylabs.WhyLabs.models.operations.ListModelsRequest](../../models/operations/ListModelsRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[ai.whylabs.WhyLabs.models.operations.ListModelsResponse](../../models/operations/ListModelsResponse.md)**


## putEntitySchema

Save the entity schema config for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaRequest;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaResponse;
import ai.whylabs.WhyLabs.models.shared.ColumnSchema;
import ai.whylabs.WhyLabs.models.shared.EntitySchema;
import ai.whylabs.WhyLabs.models.shared.MetricSchema;
import ai.whylabs.WhyLabs.models.shared.SchemaMetadata;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            PutEntitySchemaRequest req = new PutEntitySchemaRequest(new EntitySchema(new java.util.HashMap<String, ai.whylabs.WhyLabs.models.shared.ColumnSchema>(){{
    put("key", new ColumnSchema("input", "fractional", "discrete"){{
        classifier = "input";
        dataType = "fractional";
        discreteness = "discrete";
        tags = new String[]{{
            add("string"),
        }};
    }});
}}){{
metadata = new SchemaMetadata(){{
    author = "string";
    updatedTimestamp = 399868L;
    version = 429298L;
}};
metrics = new java.util.HashMap<String, ai.whylabs.WhyLabs.models.shared.MetricSchema>(){{
    put("key", new MetricSchema("estimated_prediction", "median", "estimated_prediction.median"){{
        column = "estimated_prediction";
        defaultMetric = "median";
        label = "estimated_prediction.median";
    }});
}};
}}, "model-123", "org-123");            

            PutEntitySchemaResponse res = sdk.models.putEntitySchema(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [ai.whylabs.WhyLabs.models.operations.PutEntitySchemaRequest](../../models/operations/PutEntitySchemaRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutEntitySchemaResponse](../../models/operations/PutEntitySchemaResponse.md)**


## putEntitySchemaColumn

Save the entity schema of a single column for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaColumnRequest;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaColumnResponse;
import ai.whylabs.WhyLabs.models.shared.ColumnSchema;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            PutEntitySchemaColumnRequest req = new PutEntitySchemaColumnRequest(new ColumnSchema("input", "fractional", "discrete"){{
tags = new String[]{{
    add("string"),
}};
}}, "feature-123", "model-123", "org-123");            

            PutEntitySchemaColumnResponse res = sdk.models.putEntitySchemaColumn(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.PutEntitySchemaColumnRequest](../../models/operations/PutEntitySchemaColumnRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutEntitySchemaColumnResponse](../../models/operations/PutEntitySchemaColumnResponse.md)**


## putEntitySchemaMetric

Save the schema of a single metric for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaMetricRequest;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaMetricResponse;
import ai.whylabs.WhyLabs.models.shared.MetricSchema;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            PutEntitySchemaMetricRequest req = new PutEntitySchemaMetricRequest(new MetricSchema("estimated_prediction", "median", "estimated_prediction.median"), "model-123", "org-123");            

            PutEntitySchemaMetricResponse res = sdk.models.putEntitySchemaMetric(req);

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
| `request`                                                                                                                    | [ai.whylabs.WhyLabs.models.operations.PutEntitySchemaMetricRequest](../../models/operations/PutEntitySchemaMetricRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[ai.whylabs.WhyLabs.models.operations.PutEntitySchemaMetricResponse](../../models/operations/PutEntitySchemaMetricResponse.md)**


## updateModel

Update a model's metadata

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateModelRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateModelResponse;
import ai.whylabs.WhyLabs.models.shared.ModelType;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.TimePeriod;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("string"){{
                    apiKeyAuth = "";
                }})
                .build();

            UpdateModelRequest req = new UpdateModelRequest("model-123", "Credit-Score-1", "org-123", TimePeriod.P1_D){{
                modelType = ModelType.CLASSIFICATION;
            }};            

            UpdateModelResponse res = sdk.models.updateModel(req);

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
| `request`                                                                                                | [ai.whylabs.WhyLabs.models.operations.UpdateModelRequest](../../models/operations/UpdateModelRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateModelResponse](../../models/operations/UpdateModelResponse.md)**

