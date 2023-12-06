# Transactions
(*transactions*)

### Available Operations

* [commitTransaction](#committransaction) - Commit a log transaction
* [logTransaction](#logtransaction) - Add to a log transaction
* [startTransaction](#starttransaction) - Start a log transaction
* [transactionStatus](#transactionstatus) - Get the status of a log transaction

## commitTransaction

API to commit a log transaction

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.CommitTransactionRequest;
import ai.whylabs.WhyLabs.models.operations.CommitTransactionResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.TransactionCommitRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.CommitTransactionRequest req = new CommitTransactionRequest(
                new TransactionCommitRequest(
){{
                    verbose = false;

                }},
                "28541e19-72c2-4c43-bbce-84e4de362101");

            ai.whylabs.WhyLabs.models.operations.CommitTransactionResponse res = sdk.transactions.commitTransaction(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.operations.CommitTransactionRequest](../../models/operations/CommitTransactionRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.CommitTransactionResponse](../../models/operations/CommitTransactionResponse.md)**


## logTransaction

API to add to a log transaction

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.LogTransactionRequest;
import ai.whylabs.WhyLabs.models.operations.LogTransactionResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.SegmentTag;
import ai.whylabs.WhyLabs.models.shared.TransactionLogRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.LogTransactionRequest req = new LogTransactionRequest(
                new TransactionLogRequest(
){{
                    datasetTimestamp = 254316L;
                    region = "string";
                    segmentTags = new ai.whylabs.WhyLabs.models.shared.SegmentTag[]{{
                        add(new SegmentTag(
                        "string",
                        "string"){{
                            key = "<key>";
                            value = "string";
                        }}),
                    }};

                }},
                "28541e19-72c2-4c43-bbce-84e4de362101");

            ai.whylabs.WhyLabs.models.operations.LogTransactionResponse res = sdk.transactions.logTransaction(req);

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
| `request`                                                                                                      | [ai.whylabs.WhyLabs.models.operations.LogTransactionRequest](../../models/operations/LogTransactionRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[ai.whylabs.WhyLabs.models.operations.LogTransactionResponse](../../models/operations/LogTransactionResponse.md)**


## startTransaction

API to start a log transaction

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.StartTransactionResponse;
import ai.whylabs.WhyLabs.models.shared.Security;
import ai.whylabs.WhyLabs.models.shared.TransactionStartRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.shared.TransactionStartRequest req = new TransactionStartRequest(
){{
                datasetId = "string";

            }};

            ai.whylabs.WhyLabs.models.operations.StartTransactionResponse res = sdk.transactions.startTransaction(req);

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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [ai.whylabs.WhyLabs.models.shared.TransactionStartRequest](../../models/shared/TransactionStartRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[ai.whylabs.WhyLabs.models.operations.StartTransactionResponse](../../models/operations/StartTransactionResponse.md)**


## transactionStatus

API to get the status of a log transaction

### Example Usage

```java
package hello.world;

import ai.whylabs.WhyLabs.Songbird;
import ai.whylabs.WhyLabs.models.operations.TransactionStatusRequest;
import ai.whylabs.WhyLabs.models.operations.TransactionStatusResponse;
import ai.whylabs.WhyLabs.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Songbird sdk = Songbird.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKeyAuth = "";
                }})
                .build();

            ai.whylabs.WhyLabs.models.operations.TransactionStatusRequest req = new TransactionStatusRequest(
                "28541e19-72c2-4c43-bbce-84e4de362101");

            ai.whylabs.WhyLabs.models.operations.TransactionStatusResponse res = sdk.transactions.transactionStatus(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [ai.whylabs.WhyLabs.models.operations.TransactionStatusRequest](../../models/operations/TransactionStatusRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[ai.whylabs.WhyLabs.models.operations.TransactionStatusResponse](../../models/operations/TransactionStatusResponse.md)**

