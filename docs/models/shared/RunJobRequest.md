# RunJobRequest


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `jobId`                                                         | *Long*                                                          | :heavy_check_mark:                                              | The id of the job to run in the connected Databricks workspace. |
| `orgId`                                                         | *String*                                                        | :heavy_minus_sign:                                              | Look up a connection by the org that is connected to.           |
| `workspaceId`                                                   | *String*                                                        | :heavy_minus_sign:                                              | Look up a connection by the workspace that it originates from.  |