# CreateModelRequest


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `modelId`                                                                        | *String*                                                                         | :heavy_minus_sign:                                                               | N/A                                                                              | model-123                                                                        |
| `modelName`                                                                      | *String*                                                                         | :heavy_check_mark:                                                               | The name of a model                                                              | Credit-Score-1                                                                   |
| `modelType`                                                                      | [ai.whylabs.WhyLabs.models.shared.ModelType](../../models/shared/ModelType.md)   | :heavy_minus_sign:                                                               | The [ModelType] of the dataset                                                   | CLASSIFICATION                                                                   |
| `orgId`                                                                          | *String*                                                                         | :heavy_check_mark:                                                               | The organization ID                                                              | org-123                                                                          |
| `timePeriod`                                                                     | [ai.whylabs.WhyLabs.models.shared.TimePeriod](../../models/shared/TimePeriod.md) | :heavy_check_mark:                                                               | The [TimePeriod] for data aggregation/alerting for a model                       | P1D                                                                              |