# User
(*user*)

### Available Operations

* [createUser](#createuser) - Create a user.
* [getUser](#getuser) - Get a user by their id.
* [getUserByEmail](#getuserbyemail) - Get a user by their email.
* [updateUser](#updateuser) - Update a user.

## createUser

Create a user.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CreateUserResponse;
import ai.whylabs.WhyLabs.models.shared.CreateUserRequest;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("accusamus") {{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.CreateUserRequest req = new CreateUserRequest("ad");            

            CreateUserResponse res = sdk.user.createUser(req);

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

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [ai.whylabs.WhyLabs.models.shared.CreateUserRequest](../../models/shared/CreateUserRequest.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.CreateUserResponse](../../models/operations/CreateUserResponse.md)**


## getUser

Get a user by their id.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetUserRequest;
import ai.whylabs.WhyLabs.models.operations.GetUserResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("saepe") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetUserRequest req = new GetUserRequest("suscipit");            

            GetUserResponse res = sdk.user.getUser(req);

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

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [ai.whylabs.WhyLabs.models.operations.GetUserRequest](../../models/operations/GetUserRequest.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetUserResponse](../../models/operations/GetUserResponse.md)**


## getUserByEmail

Get a user by their email.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.GetUserByEmailRequest;
import ai.whylabs.WhyLabs.models.operations.GetUserByEmailResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("deserunt") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetUserByEmailRequest req = new GetUserByEmailRequest("provident");            

            GetUserByEmailResponse res = sdk.user.getUserByEmail(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.GetUserByEmailRequest](../../models/operations/GetUserByEmailRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.GetUserByEmailResponse](../../models/operations/GetUserByEmailResponse.md)**


## updateUser

Update a user.

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.UpdateUserResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security("minima") {{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.User req = new User("repellendus", "totam") {{
                preferences = "similique";
            }};            

            UpdateUserResponse res = sdk.user.updateUser(req);

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

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [ai.whylabs.WhyLabs.models.shared.User](../../models/shared/User.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.UpdateUserResponse](../../models/operations/UpdateUserResponse.md)**

