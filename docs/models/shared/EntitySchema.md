# EntitySchema

Entity schema for a dataset


## Fields

| Field                                                                                             | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `columns`                                                                                         | Map<String, [ai.whylabs.WhyLabs.models.shared.ColumnSchema](../../models/shared/ColumnSchema.md)> | :heavy_check_mark:                                                                                | Column schema for a given column                                                                  |
| `metadata`                                                                                        | [ai.whylabs.WhyLabs.models.shared.SchemaMetadata](../../models/shared/SchemaMetadata.md)          | :heavy_minus_sign:                                                                                | N/A                                                                                               |
| `metrics`                                                                                         | Map<String, [ai.whylabs.WhyLabs.models.shared.MetricSchema](../../models/shared/MetricSchema.md)> | :heavy_minus_sign:                                                                                | Schema for user-defined metrics (map of unique custom metric labels to their definitions)         |