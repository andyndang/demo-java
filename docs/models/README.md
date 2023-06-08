# models

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
import ai.whylabs.WhyLabs.models.operations.CreateModelSecurity;
import ai.whylabs.WhyLabs.models.shared.ModelType;
import ai.whylabs.WhyLabs.models.shared.TimePeriod;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            CreateModelRequest req = new CreateModelRequest("Credit-Score-1", "org-123", TimePeriod.P1_D) {{
                modelId = "model-123";
                modelType = ModelType.CLASSIFICATION;
            }};            

            CreateModelResponse res = sdk.models.createModel(req, new CreateModelSecurity("cumque") {{
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

## deactivateModel

Mark a model as inactive

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeactivateModelRequest;
import ai.whylabs.WhyLabs.models.operations.DeactivateModelResponse;
import ai.whylabs.WhyLabs.models.operations.DeactivateModelSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeactivateModelRequest req = new DeactivateModelRequest("model-123", "org-123");            

            DeactivateModelResponse res = sdk.models.deactivateModel(req, new DeactivateModelSecurity("facere") {{
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

## deleteEntitySchema

Delete the entity schema config for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaResponse;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteEntitySchemaRequest req = new DeleteEntitySchemaRequest("model-123", "org-123");            

            DeleteEntitySchemaResponse res = sdk.models.deleteEntitySchema(req, new DeleteEntitySchemaSecurity("ea") {{
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

## deleteEntitySchemaColumn

Delete the entity schema of a single column for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaColumnRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaColumnResponse;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaColumnSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteEntitySchemaColumnRequest req = new DeleteEntitySchemaColumnRequest("feature-123", "model-123", "org-123");            

            DeleteEntitySchemaColumnResponse res = sdk.models.deleteEntitySchemaColumn(req, new DeleteEntitySchemaColumnSecurity("aliquid") {{
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

## deleteEntitySchemaMetric

Delete the schema of a single metric for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaMetricRequest;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaMetricResponse;
import ai.whylabs.WhyLabs.models.operations.DeleteEntitySchemaMetricSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            DeleteEntitySchemaMetricRequest req = new DeleteEntitySchemaMetricRequest("model-123", "feature-123", "org-123");            

            DeleteEntitySchemaMetricResponse res = sdk.models.deleteEntitySchemaMetric(req, new DeleteEntitySchemaMetricSecurity("laborum") {{
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

## getEntitySchema

Get the entity schema config for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetEntitySchemaRequest;
import ai.whylabs.WhyLabs.models.operations.GetEntitySchemaResponse;
import ai.whylabs.WhyLabs.models.operations.GetEntitySchemaSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetEntitySchemaRequest req = new GetEntitySchemaRequest("model-123", "org-123");            

            GetEntitySchemaResponse res = sdk.models.getEntitySchema(req, new GetEntitySchemaSecurity("accusamus") {{
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

## getEntitySchemaColumn

Get the entity schema of a single column for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetEntitySchemaColumnRequest;
import ai.whylabs.WhyLabs.models.operations.GetEntitySchemaColumnResponse;
import ai.whylabs.WhyLabs.models.operations.GetEntitySchemaColumnSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetEntitySchemaColumnRequest req = new GetEntitySchemaColumnRequest("feature-123", "model-123", "org-123");            

            GetEntitySchemaColumnResponse res = sdk.models.getEntitySchemaColumn(req, new GetEntitySchemaColumnSecurity("non") {{
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

## getModel

Returns various metadata about a model

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetModelRequest;
import ai.whylabs.WhyLabs.models.operations.GetModelResponse;
import ai.whylabs.WhyLabs.models.operations.GetModelSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            GetModelRequest req = new GetModelRequest("model-123", "org-123");            

            GetModelResponse res = sdk.models.getModel(req, new GetModelSecurity("occaecati") {{
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

## listModels

Get a list of all of the model ids for an organization.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.ListModelsRequest;
import ai.whylabs.WhyLabs.models.operations.ListModelsResponse;
import ai.whylabs.WhyLabs.models.operations.ListModelsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            ListModelsRequest req = new ListModelsRequest("org-123");            

            ListModelsResponse res = sdk.models.listModels(req, new ListModelsSecurity("enim") {{
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

## putEntitySchema

Save the entity schema config for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaRequest;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaResponse;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaSecurity;
import ai.whylabs.WhyLabs.models.shared.ColumnSchema;
import ai.whylabs.WhyLabs.models.shared.EntitySchema;
import ai.whylabs.WhyLabs.models.shared.MetricSchema;
import ai.whylabs.WhyLabs.models.shared.SchemaMetadata;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutEntitySchemaRequest req = new PutEntitySchemaRequest(                new EntitySchema(                new java.util.HashMap<String, ai.whylabs.WhyLabs.models.shared.ColumnSchema>() {{
                                                put("delectus", new ColumnSchema("input", "fractional", "discrete") {{
                                                    classifier = "input";
                                                    dataType = "fractional";
                                                    discreteness = "discrete";
                                                }});
                                                put("quidem", new ColumnSchema("input", "fractional", "discrete") {{
                                                    classifier = "input";
                                                    dataType = "fractional";
                                                    discreteness = "discrete";
                                                }});
                                                put("provident", new ColumnSchema("input", "fractional", "discrete") {{
                                                    classifier = "input";
                                                    dataType = "fractional";
                                                    discreteness = "discrete";
                                                }});
                                                put("nam", new ColumnSchema("input", "fractional", "discrete") {{
                                                    classifier = "input";
                                                    dataType = "fractional";
                                                    discreteness = "discrete";
                                                }});
                                            }}) {{
                                metadata = new SchemaMetadata() {{
                                    author = "id";
                                    updatedTimestamp = 501324L;
                                    version = 533206L;
                                }};;
                                metrics = new java.util.HashMap<String, ai.whylabs.WhyLabs.models.shared.MetricSchema>() {{
                                    put("amet", new MetricSchema("estimated_prediction", "median", "estimated_prediction.median") {{
                                        column = "estimated_prediction";
                                        defaultMetric = "median";
                                        label = "estimated_prediction.median";
                                    }});
                                    put("deserunt", new MetricSchema("estimated_prediction", "median", "estimated_prediction.median") {{
                                        column = "estimated_prediction";
                                        defaultMetric = "median";
                                        label = "estimated_prediction.median";
                                    }});
                                    put("nisi", new MetricSchema("estimated_prediction", "median", "estimated_prediction.median") {{
                                        column = "estimated_prediction";
                                        defaultMetric = "median";
                                        label = "estimated_prediction.median";
                                    }});
                                    put("vel", new MetricSchema("estimated_prediction", "median", "estimated_prediction.median") {{
                                        column = "estimated_prediction";
                                        defaultMetric = "median";
                                        label = "estimated_prediction.median";
                                    }});
                                }};
                            }};, "model-123", "org-123");            

            PutEntitySchemaResponse res = sdk.models.putEntitySchema(req, new PutEntitySchemaSecurity("natus") {{
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

## putEntitySchemaColumn

Save the entity schema of a single column for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaColumnRequest;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaColumnResponse;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaColumnSecurity;
import ai.whylabs.WhyLabs.models.shared.ColumnSchema;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutEntitySchemaColumnRequest req = new PutEntitySchemaColumnRequest(                new ColumnSchema("input", "fractional", "discrete");, "feature-123", "model-123", "org-123");            

            PutEntitySchemaColumnResponse res = sdk.models.putEntitySchemaColumn(req, new PutEntitySchemaColumnSecurity("omnis") {{
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

## putEntitySchemaMetric

Save the schema of a single metric for a given dataset.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaMetricRequest;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaMetricResponse;
import ai.whylabs.WhyLabs.models.operations.PutEntitySchemaMetricSecurity;
import ai.whylabs.WhyLabs.models.shared.MetricSchema;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            PutEntitySchemaMetricRequest req = new PutEntitySchemaMetricRequest(                new MetricSchema("estimated_prediction", "median", "estimated_prediction.median");, "model-123", "org-123");            

            PutEntitySchemaMetricResponse res = sdk.models.putEntitySchemaMetric(req, new PutEntitySchemaMetricSecurity("molestiae") {{
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

## updateModel

Update a model's metadata

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateModelRequest;
import ai.whylabs.WhyLabs.models.operations.UpdateModelResponse;
import ai.whylabs.WhyLabs.models.operations.UpdateModelSecurity;
import ai.whylabs.WhyLabs.models.shared.ModelType;
import ai.whylabs.WhyLabs.models.shared.TimePeriod;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .build();

            UpdateModelRequest req = new UpdateModelRequest("model-123", "Credit-Score-1", "org-123", TimePeriod.P1_D) {{
                modelType = ModelType.CLASSIFICATION;
            }};            

            UpdateModelResponse res = sdk.models.updateModel(req, new UpdateModelSecurity("perferendis") {{
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
