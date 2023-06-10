# EntitySchema

Entity schema for a dataset


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `columns`                                                                                 | Map<String, [ColumnSchema](../../models/shared/ColumnSchema.md)>                          | :heavy_check_mark:                                                                        | Column schema for a given column                                                          |
| `metadata`                                                                                | [SchemaMetadata](../../models/shared/SchemaMetadata.md)                                   | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `metrics`                                                                                 | Map<String, [MetricSchema](../../models/shared/MetricSchema.md)>                          | :heavy_minus_sign:                                                                        | Schema for user-defined metrics (map of unique custom metric labels to their definitions) |