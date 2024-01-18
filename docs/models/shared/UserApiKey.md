# UserApiKey

Response when creating an API key successfully


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `alias`                                                        | *String*                                                       | :heavy_minus_sign:                                             | Human-readable alias for the key                               |
| `creationTime`                                                 | *String*                                                       | :heavy_check_mark:                                             | Creation time in human readable format                         |
| `expirationTime`                                               | *String*                                                       | :heavy_minus_sign:                                             | Expiration time in human readable format                       |
| `key`                                                          | *String*                                                       | :heavy_minus_sign:                                             | The full value of the key. This is not persisted in the system |
| `keyId`                                                        | *String*                                                       | :heavy_check_mark:                                             | The key id. Can be used to identify keys for a given user      |
| `orgId`                                                        | *String*                                                       | :heavy_check_mark:                                             | The organization that the key belongs to                       |
| `revoked`                                                      | *Boolean*                                                      | :heavy_minus_sign:                                             | Whether the key has been revoked                               |
| `scopes`                                                       | List<*String*>                                                 | :heavy_minus_sign:                                             | Scope of the key                                               |
| `userId`                                                       | *String*                                                       | :heavy_check_mark:                                             | The user that the key represents                               |