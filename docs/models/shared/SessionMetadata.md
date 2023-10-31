# SessionMetadata

Response for getting sessions.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `modelId`                                                         | *String*                                                          | :heavy_minus_sign:                                                | The model id of the session. There should only be a single model. |
| `orgId`                                                           | *String*                                                          | :heavy_minus_sign:                                                | The org id of the session                                         |
| `sessionId`                                                       | *String*                                                          | :heavy_minus_sign:                                                | The id of the session                                             |
| `userId`                                                          | *String*                                                          | :heavy_minus_sign:                                                | The generated user id for the session.                            |