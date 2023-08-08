# PatchAccountMembershipsRequest

Request for the PatchOrgRoleMemberships API


## Fields

| Field                                        | Type                                         | Required                                     | Description                                  |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `userIdsToAdd`                               | List<*String*>                               | :heavy_check_mark:                           | A list of userIds that should be members     |
| `userIdsToDelete`                            | List<*String*>                               | :heavy_check_mark:                           | A list of userIds that should not be members |